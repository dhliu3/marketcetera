package org.marketcetera.quickfix;

import org.marketcetera.core.ClassVersion;
import quickfix.*;

/**
 * Dymmy quickfix app that does nothing
 * @author toli
 * @version $Id: DummyQuickFIXApp.java 9456 2008-07-31 22:28:30Z klim $
 */

@ClassVersion("$Id: DummyQuickFIXApp.java 9456 2008-07-31 22:28:30Z klim $") //$NON-NLS-1$
public class DummyQuickFIXApp implements Application {
    public DummyQuickFIXApp() {
    }

    public void onCreate(SessionID sessionId) {

    }

    public void onLogon(SessionID sessionId) {

    }

    public void onLogout(SessionID sessionId) {

    }

    public void toAdmin(Message message, SessionID sessionId) {

    }

    public void fromAdmin(Message message, SessionID sessionId) throws FieldNotFound, IncorrectDataFormat, IncorrectTagValue, RejectLogon {

    }

    public void toApp(Message message, SessionID sessionId) throws DoNotSend {

    }

    public void fromApp(Message message, SessionID sessionId) throws FieldNotFound, IncorrectDataFormat, IncorrectTagValue, UnsupportedMessageType {

    }
}
