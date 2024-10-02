import java.util.ArrayList;
import java.util.Date;
import java.text.SimpleDateFormat;

class AuctionSystem {
    private ArrayList<Item> items;

    public AuctionSystem() {
        items = new ArrayList<Item>();
    }

    public void addItem(Item item) {
        items.add(item);
    }

    public void displayItems() {
        System.out.println("List of Items Available:");
        for (Item item : items) {
            item.displayDetails();
        }
    }

    public void placeBid(String itemName, Bid bid) {
        for (Item item : items) {
            if (item.getName().equalsIgnoreCase(itemName)) {
                item.addBid(bid);
                return;
            }
        }
        System.out.println("Item not found!");
    }

    public void displayCurrentTime() {
        SimpleDateFormat formatter = new SimpleDateFormat("dd-MM-yyyy HH:mm:ss");
        Date date = new Date();
        System.out.println("Current Time: " + formatter.format(date));
    }
}
