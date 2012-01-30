package org.marketcetera.photon.internal.product;

import org.marketcetera.photon.UserNameService;
import org.marketcetera.photon.positions.ui.IPositionLabelProvider;
import org.marketcetera.util.misc.ClassVersion;

/* $License$ */

/**
 * Provides labels for the Positions view.
 *
 * @author <a href="mailto:will@marketcetera.com">Will Horn</a>
 * @version $Id: PhotonPositionLabelProvider.java 10492 2009-04-14 00:11:35Z klim $
 * @since 1.5.0
 */
@ClassVersion("$Id: PhotonPositionLabelProvider.java 10492 2009-04-14 00:11:35Z klim $")
public class PhotonPositionLabelProvider implements IPositionLabelProvider {

	@Override
	public String getTraderName(String traderId) {
		return UserNameService.getUserName(traderId);
	}

}
