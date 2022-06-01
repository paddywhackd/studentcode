package com.techelevator;

public class silentAuction extends ReserveAuction {

    boolean isOpen

    public silentAuction(String itemForSale, int reservePrice) {
        super(itemForSale, reservePrice);


    }

    @Override
    public boolean placeBid(Bid bid) {
        super.placeBid(bid);
        return false;
    }

    @Override
    public Bid getHighBid() {
        return super.getHighBid();
    }
}
