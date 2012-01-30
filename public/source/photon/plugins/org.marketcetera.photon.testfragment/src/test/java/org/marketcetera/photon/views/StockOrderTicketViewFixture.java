package org.marketcetera.photon.views;

/* $License$ */

/**
 * Helps test {@link StockOrderTicketView}.
 *
 * @author <a href="mailto:will@marketcetera.com">Will Horn</a>
 * @version $Id: StockOrderTicketViewFixture.java 10886 2009-11-17 19:31:49Z klim $
 * @since 2.0.0
 */
public class StockOrderTicketViewFixture extends
        OrderTicketViewFixture<IStockOrderTicket> {

    public StockOrderTicketViewFixture() throws Exception {
        super(StockOrderTicketView.ID);
    }
}
