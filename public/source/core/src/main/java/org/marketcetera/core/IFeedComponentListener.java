package org.marketcetera.core;

import org.marketcetera.marketdata.IFeedComponent;

/**
 * @author Toli Kuznets
 * @version $Id: IFeedComponentListener.java 1797 2008-04-24 01:34:08Z tlerios $
 */
public interface IFeedComponentListener {
    public void feedComponentChanged(IFeedComponent component);
}
