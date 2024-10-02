class Bid {
    private String bidderName;
    private double bidAmount;

    // Constructor Overloading
    public Bid(String bidderName) {
        this.bidderName = bidderName;
        this.bidAmount = 0.0;
    }

    public Bid(String bidderName, double bidAmount) {
        this.bidderName = bidderName;
        this.bidAmount = bidAmount;
    }

    public void setBidAmount(double bidAmount) {
        this.bidAmount = bidAmount;
    }

    // Overriding to display bid details
    public void displayBid() {
        System.out.println("Bidder: " + bidderName + ", Bid Amount: " + bidAmount);
    }
}
