import java.util.Scanner;

public class AuctionTest {
    public static void main(String[] args) {
        AuctionSystem auction = new AuctionSystem();
        Scanner scanner = new Scanner(System.in);

        // Adding items to the auction system
        auction.addItem(new Item("Laptop", 500));
        auction.addItem(new Item("Smartphone", 200));
        auction.addItem(new Item("Watch", 100));

        // Displaying available items
        auction.displayItems();

        // Displaying current time
        auction.displayCurrentTime();

        // Placing bids
        System.out.print("Enter your name: ");
        String bidderName = scanner.nextLine();
        System.out.print("Enter item name to bid on: ");
        String itemName = scanner.nextLine();
        System.out.print("Enter your bid amount: ");
        double bidAmount = scanner.nextDouble();

        Bid bid = new Bid(bidderName, bidAmount);
        auction.placeBid(itemName, bid);

        // Display updated items
        auction.displayItems();
    }
}
