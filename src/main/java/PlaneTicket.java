public class PlaneTicket extends Ticket{
    protected boolean isFrequentFlyer;


    public PlaneTicket(int id, String origin, String destination, String seatNumber, double price, boolean isFrequentFlyer) {
        super(id, origin, destination, seatNumber, price);
        this.isFrequentFlyer = isFrequentFlyer;
    }

    public boolean isFrequentFlyer() {
        return isFrequentFlyer;
    }

    public void setFrequentFlyer(boolean frequentFlyer) {
        isFrequentFlyer = frequentFlyer;
    }
}
