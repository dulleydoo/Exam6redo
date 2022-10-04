public class Passenger extends Person{
    private Ticket ticket;
    private double creditCardLimit;
    private String[] luggage;

    public Passenger(String name, String person, Ticket ticket, double creditCardLimit, String[] luggage) {
        super(name, person);
        this.ticket = ticket;
        this.creditCardLimit = creditCardLimit;
        this.luggage = luggage;
    }

    public Ticket getTicket() {
        return ticket;
    }

    public void setTicket(Ticket ticket) {
        this.ticket = ticket;
    }

    public double getCreditCardLimit() {
        return creditCardLimit;
    }

    public void setCreditCardLimit(double creditCardLimit) {
        this.creditCardLimit = creditCardLimit;
    }

    public String[] getLuggage() {
        return luggage;
    }

    public void setLuggage(String[] luggage) {
        this.luggage = luggage;
    }

    public int getAmountOfLuggage(){
        return luggage.length;
    }
    public void printTicket(){
        System.out.println(ticket);
    }


}
