package org.marketcetera.core;

@ClassVersion("$Id: Clock.java 9456 2008-07-31 22:28:30Z klim $") //$NON-NLS-1$
public interface Clock {

	public abstract long getTime();

	public abstract long getApproximateTime();

}
