public class Main {
    public static void main(String[] args) {
        FlightCrewJob flightCrewJob1 = FlightCrewJob.PILOT;
        FlightCrewJob flightCrewJob2 = FlightCrewJob.CO_PILOT;
        FlightCrewJob flightCrewJob3 = FlightCrewJob.FLIGHT_ATTENDANT;

        CrewMember crewMember1 = new CrewMember("Karem", "", flightCrewJob1, 150000.f);
        CrewMember crewMember2 = new CrewMember("Chris", "", flightCrewJob2, 100000.f);
        CrewMember crewMember3 = new CrewMember("Ammy", "", flightCrewJob3, 70000.f);

        Ticket busTicket = new BusTicket(111, "10th Street", "1st street", "23A", 19.99);
        Ticket planeTicket = new PlaneTicket(222, "Philly", "Chicago", "1C", 213.00, true);

        String[] passenger57Luggage = {"luggage1", "luggage2", "luggage3" };
        String[] passenger07Luggage = {"luggage1", "luggage2"};

        Passenger passenger57 = new Passenger("Liam", "", busTicket,20, passenger57Luggage);
        Passenger passenger07 = new Passenger("Sam", "", planeTicket,500, passenger07Luggage);


    }
}
