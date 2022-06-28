package com.techelevator.auctions.services;

import org.springframework.web.client.RestTemplate;

import com.techelevator.auctions.model.Auction;

public class AuctionService {

    public static final String API_BASE_URL = "http://localhost:3000/auctions/";
    private RestTemplate restTemplate = new RestTemplate();


    public Auction[] getAllAuctions() {
        String auctionUrl = API_BASE_URL;
        Auction[] auctions = restTemplate.getForObject(auctionUrl, Auction[].class);
        return auctions;
    }

    public Auction getAuction(int id) {
        String auctionUrl = API_BASE_URL + id;
        return restTemplate.getForObject(auctionUrl, Auction.class);
    }

    public Auction[] getAuctionsMatchingTitle(String title) {
        String auctionUrl = API_BASE_URL + "?title_like=" + title;
        return restTemplate.getForObject(auctionUrl, Auction[].class);
    }

    public Auction[] getAuctionsAtOrBelowPrice(double price) {
        String auctionUrl = API_BASE_URL + "?currentBid_lte=" + price;
        return restTemplate.getForObject(auctionUrl, Auction[].class);
    }

}
