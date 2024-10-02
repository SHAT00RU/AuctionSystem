import java.util.ArrayList;

class Item {
    private String name;
    private double startingPrice;
    private ArrayList<Bid> bids;

    public Item(String name, double startingPrice) {
        this.name = name;
        this.startingPrice = startingPrice;
        bids = new ArrayList<Bid>();
    }

    public String getName() {
        return name;
    }

    public double getStartingPrice() {
        return startingPrice;
    }

    public void addBid(Bid bid) {
        bids.add(bid);
        System.out.println("Bid placed successfully on " + name);
    }

    // Overriding to display item details with current bids
    public void displayDetails() {
        System.out.println("Item: " + name + ", Starting Price: " + startingPrice);
        if (bids.size() > 0) {
            System.out.println("Current Bids:");
            for (Bid bid : bids) {
                bid.displayBid();
            }
        } else {
            System.out.println("No bids placed yet.");
        }
    }
}
