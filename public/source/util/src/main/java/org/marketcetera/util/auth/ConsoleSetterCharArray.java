package org.marketcetera.util.auth;

import java.io.Console;
import org.marketcetera.util.log.I18NBoundMessage;
import org.marketcetera.util.misc.ClassVersion;

/**
 * A setter for a character array holder that obtains the data via the
 * console. This setter does not echo the characters typed by the
 * user.
 *
 * @author tlerios@marketcetera.com
 * @since 0.5.0
 * @version $Id: ConsoleSetterCharArray.java 10376 2009-03-06 14:54:52Z tlerios $
 */

/* $License$ */

@ClassVersion("$Id: ConsoleSetterCharArray.java 10376 2009-03-06 14:54:52Z tlerios $")
public class ConsoleSetterCharArray
    extends ConsoleSetter<Holder<char[]>>
{

    // CONSTRUCTORS.

    /**
     * Constructor mirroring superclass constructor.
     *
     * @see ConsoleSetter#ConsoleSetter(Holder,I18NBoundMessage,I18NBoundMessage)
     */

    public ConsoleSetterCharArray
        (Holder<char[]> holder,
         I18NBoundMessage usage,
         I18NBoundMessage prompt)
    {
        super(holder,usage,prompt);
    }


    // ConsoleSetter.

    @Override
    public void setValue
        (Console console)
    {
        char[] value=console.readPassword
            ("%s",getPrompt().getText()); //$NON-NLS-1$
        if ((value!=null) && (value.length!=0)) {
            getHolder().setValue(value);
        }
    }
}
