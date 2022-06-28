package com.techelevator.auctions;

import com.techelevator.auctions.model.Auction;
import com.techelevator.auctions.services.AuctionService;
import com.techelevator.auctions.services.ConsoleService;

public class App {
    private final ConsoleService consoleService = new ConsoleService();
    private final AuctionService auctionService = new AuctionService();

    public static void main(String[] args) {
        App app = new App();
        app.run();
    }

    private void run() {
        int menuSelection = -1;
        while (menuSelection != 0) {
            consoleService.printMainMenu();
            menuSelection = consoleService.promptForMenuSelection();
            if (menuSelection == 1) {
                Auction[] auctions = auctionService.getAllAuctions();
                consoleService.printAuctions(auctions);
            } else if (menuSelection == 2) {
                Auction auction = auctionService.getAuction(1);
                consoleService.printAuction(auction);
            } else if (menuSelection == 3) {
                Auction[] auctions = auctionService.getAuctionsMatchingTitle("watch");
                consoleService.printAuctions(auctions);
            } else if (menuSelection == 4) {
                Auction[] auctions = auctionService.getAuctionsAtOrBelowPrice(150);
                consoleService.printAuctions(auctions);
            } else if (menuSelection != 0) {
                System.out.println("Invalid Selection");
            }
        }
    }

    private void handleListAllAuctions() {
        Auction[] auctions = auctionService.getAllAuctions();
        consoleService.printAuctions(auctions);
    }

    private void handleShowAuctionDetails() {
        Auction[] auctions = auctionService.getAllAuctions();
        consoleService.printAuctionMenu(auctions);
        int auctionId = consoleService.promptForMenuSelection();
        if (auctionId > 0) {
            Auction auction = auctionService.getAuction(auctionId);
            consoleService.printAuction(auction);
        }
    }

    private void handleFindAuctionsByTitle() {
        String title = consoleService.promptForAuctionTitle();
        if (title != null) {
            Auction[] auctions = auctionService.getAuctionsMatchingTitle(title);
            consoleService.printAuctions(auctions);
        }
    }

    private void handleFindAuctionsByPrice() {
        double price = consoleService.promptForAuctionPrice();
        if (price > 0) {
            Auction[] auctions = auctionService.getAuctionsAtOrBelowPrice(price);
            consoleService.printAuctions(auctions);
        }
    }

}
