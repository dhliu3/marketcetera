/*
 * QuickFixSession.java
 *
 * Created on May 6, 2005, 5:08 PM
 */

package org.marketcetera.quickfix;

import org.marketcetera.core.ClassVersion;
import quickfix.*;

/**
 * Simple no-op implementation of a Quickfix session adapter
 * @author gmiller
 */
@ClassVersion("$Id: QuickFIXSessionAdapterStub.java 9456 2008-07-31 22:28:30Z klim $") //$NON-NLS-1$
public class QuickFIXSessionAdapterStub implements QuickFIXSessionAdapter
{

    /// Notification of a session succefully logging on
    public void onLogon() {}

    /// Notification of a session logging off or disconnecting
    public void onLogout() {}

    /// Notification of admin message being sent to target
    public void toAdmin(Message message) {}

    /// Notification of app message being sent to target
    public void toApp(Message message)
    throws DoNotSend {}

    /// Notification of admin message being received from target
    public void fromAdmin(Message message)
    throws FieldNotFound, IncorrectDataFormat, IncorrectTagValue, RejectLogon {}

    /// Notification of app message being received from target
    public void fromApp(Message message)
    throws FieldNotFound, IncorrectDataFormat, IncorrectTagValue, UnsupportedMessageType {}

}
