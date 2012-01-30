package org.marketcetera.photon.internal.marketdata.ui;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import javax.management.MBeanAttributeInfo;

import org.eclipse.jface.preference.IPreferenceNode;
import org.eclipse.jface.preference.PreferenceManager;
import org.eclipse.jface.preference.PreferenceNode;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.ui.IStartup;
import org.eclipse.ui.PlatformUI;
import org.marketcetera.module.ModuleURN;
import org.marketcetera.photon.marketdata.IMarketDataFeed;
import org.marketcetera.photon.module.ModuleSupport;
import org.marketcetera.photon.module.ui.ModuleAttributePreferencePage;
import org.marketcetera.util.misc.ClassVersion;

/* $License$ */

/**
 * This class uses some heuristics to build a preference page for market data
 * providers with writable attributes.
 * 
 * @author <a href="mailto:will@marketcetera.com">Will Horn</a>
 * @version $Id: FeedPreferencePageInitializer.java 10577 2009-05-18 22:55:59Z will $
 * @since 1.1.0
 */
@ClassVersion("$Id: FeedPreferencePageInitializer.java 10577 2009-05-18 22:55:59Z will $")
public class FeedPreferencePageInitializer implements IStartup {

	private static final String ROOT_NODE = "org.marketcetera.photon.marketdata.ui.MarketDataPreferencePage"; //$NON-NLS-1$

	@Override
	public void earlyStartup() {
		List<IMarketDataFeed> providers = new ArrayList<IMarketDataFeed>(
				Activator.getMarketDataManager().getProviders());
		Collections.sort(providers, new Comparator<IMarketDataFeed>() {
			@Override
			public int compare(IMarketDataFeed o1, IMarketDataFeed o2) {
				return o1.getName().compareTo(o2.getName());
			}
		});
		PreferenceManager preferenceManager = PlatformUI.getWorkbench()
				.getPreferenceManager();
		IPreferenceNode rootNode = preferenceManager.find(ROOT_NODE);
		for (IMarketDataFeed provider : providers) {
			final ModuleURN urn = provider.getURN();
			try {
				MBeanAttributeInfo[] attributes = ModuleSupport
						.getMBeanServerConnection().getMBeanInfo(
								urn.toObjectName()).getAttributes();
				final List<MBeanAttributeInfo> writableAttributes = new ArrayList<MBeanAttributeInfo>();
				for (MBeanAttributeInfo attribute : attributes) {
					if (attribute.isWritable()) {
						writableAttributes.add(attribute);
					}
				}
				if (writableAttributes.size() > 0) {
					final String label = provider.getName();
					rootNode.add(new PreferenceNode(
							"org.marketcetera.photon.marketdata.ui." //$NON-NLS-1$
									+ provider.getId(), label, null, null) {
						@Override
						public void createPage() {
							setPage(new GenericAttributePreferencePage(
									urn,
									writableAttributes
											.toArray(new MBeanAttributeInfo[writableAttributes
													.size()]), label));
						}
					});
				}
			} catch (Exception e) {
				Messages.FEED_PREFERENCE_PAGE_INITIALIZER_MODULE_ERROR.error(
						this, e);
			}

		}
	}

	/**
	 * Internal class for a generic module attribute preference page. 
	 *
	 * @author <a href="mailto:will@marketcetera.com">Will Horn</a>
	 * @version $Id: FeedPreferencePageInitializer.java 10577 2009-05-18 22:55:59Z will $
	 * @since 1.1.0
	 */
	@ClassVersion("$Id: FeedPreferencePageInitializer.java 10577 2009-05-18 22:55:59Z will $")
	private class GenericAttributePreferencePage extends
			ModuleAttributePreferencePage {

		private static final String URL = "URL"; //$NON-NLS-1$
		private static final String USERNAME = "Username"; //$NON-NLS-1$
		private static final String PASSWORD = "Password"; //$NON-NLS-1$
		private final MBeanAttributeInfo[] mAttributes;

		public GenericAttributePreferencePage(ModuleURN urn,
				MBeanAttributeInfo[] attributes, String title) {
			super(urn);
			setTitle(title);
			mAttributes = process(attributes);
		}

		private MBeanAttributeInfo[] process(MBeanAttributeInfo[] attributes) {
			MBeanAttributeInfo url = null;
			MBeanAttributeInfo username = null;
			MBeanAttributeInfo password = null;
			List<MBeanAttributeInfo> others = new ArrayList<MBeanAttributeInfo>();
			for (MBeanAttributeInfo attribute : attributes) {
				if (attribute.getName().equals(URL)) {
					url = attribute;
				} else if (attribute.getName().equals(USERNAME)) {
					username = attribute;
				} else if (attribute.getName().equals(PASSWORD)) {
					password = attribute;
				} else {
					others.add(attribute);
				}
			}
			Collections.sort(others, new Comparator<MBeanAttributeInfo>() {

				@Override
				public int compare(MBeanAttributeInfo o1, MBeanAttributeInfo o2) {
					return o1.getName().compareTo(o2.getName());
				}
			});
			List<MBeanAttributeInfo> processed = new ArrayList<MBeanAttributeInfo>();
			if (url != null) {
				processed.add(url);
			}
			processed.addAll(others);
			if (username != null) {
				processed.add(username);
			}
			if (password != null) {
				processed.add(password);
			}
			return processed.toArray(new MBeanAttributeInfo[processed.size()]);
		}

		@Override
		protected void createFields(Composite parent) {
			for (MBeanAttributeInfo attribute : mAttributes) {
				createTextField(parent, attribute.getName(), attribute
						.getName(), !attribute.isReadable());
			}

		}
	}
}
