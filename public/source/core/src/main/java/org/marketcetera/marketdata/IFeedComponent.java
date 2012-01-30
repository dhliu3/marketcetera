package org.marketcetera.marketdata;

import org.marketcetera.core.ClassVersion;
import org.marketcetera.core.IFeedComponentListener;

@ClassVersion("$Id: IFeedComponent.java 9456 2008-07-31 22:28:30Z klim $") //$NON-NLS-1$
public interface IFeedComponent {

	public enum FeedType {
		LIVE, DELAYED, SIMULATED, UNKNOWN
	}

    public FeedType getFeedType();

    public FeedStatus getFeedStatus();

    public String getID();

    public void addFeedComponentListener(IFeedComponentListener listener);

    public void removeFeedComponentListener(IFeedComponentListener listener);

}
