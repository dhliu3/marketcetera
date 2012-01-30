package org.marketcetera.photon.internal.module;

import org.marketcetera.module.ModuleConfigurationProvider;
import org.marketcetera.module.ModuleException;
import org.marketcetera.module.ModuleURN;
import org.marketcetera.photon.module.IModuleAttributeDefaults;
import org.marketcetera.util.log.SLF4JLoggerProxy;
import org.marketcetera.util.misc.ClassVersion;

/* $License$ */

/**
 * A {@link ModuleConfigurationProvider} that adapts
 * {@link IModuleAttributeDefaults}.
 * 
 * @author <a href="mailto:will@marketcetera.com">Will Horn</a>
 * @version $Id: EclipseModuleConfigurationProvider.java 10319 2009-02-13 22:35:32Z klim $
 * @since 1.1.0
 */
@ClassVersion("$Id: EclipseModuleConfigurationProvider.java 10319 2009-02-13 22:35:32Z klim $")
public final class EclipseModuleConfigurationProvider implements
		ModuleConfigurationProvider {

	private final IModuleAttributeDefaults mSupport;

	/**
	 * Constructor.
	 * 
	 * @param support
	 *            IModuleAttributeDefaults providing the module attribute
	 *            defaults
	 */
	public EclipseModuleConfigurationProvider(IModuleAttributeDefaults support) {
		mSupport = support;
	}

	@Override
	public String getDefaultFor(ModuleURN inURN, String inAttribute)
			throws ModuleException {
		return mSupport.getDefaultFor(inURN, inAttribute);
	}

	@Override
	public void refresh() throws ModuleException {
		SLF4JLoggerProxy.debug(this, "Ignoring refresh"); //$NON-NLS-1$
	}
}