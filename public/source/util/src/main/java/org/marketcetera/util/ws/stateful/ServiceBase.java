package org.marketcetera.util.ws.stateful;

import javax.jws.WebService;
import org.marketcetera.util.misc.ClassVersion;
import org.marketcetera.util.ws.stateless.StatelessServiceBase;

/**
 * The base interface for all stateful web services. It is a tagging
 * interface.
 * 
 * @author tlerios@marketcetera.com
 * @since 1.0.0
 * @version $Id: ServiceBase.java 10388 2009-03-07 00:29:58Z tlerios $
 */

/* $License$ */

@WebService
@ClassVersion("$Id: ServiceBase.java 10388 2009-03-07 00:29:58Z tlerios $")
public interface ServiceBase
    extends StatelessServiceBase {}
