import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
       // FlightApp flightApp = new FlightApp();
        FlightCrewJob flightCrewJob1 = FlightCrewJob.PILOT;
        FlightCrewJob flightCrewJob2 = FlightCrewJob.CO_PILOT;
        FlightCrewJob flightCrewJob3 = FlightCrewJob.FLIGHT_ATTENDANT;

        CrewMember crewMember1 = new CrewMember("Karem", flightCrewJob1, 100000.f);
        CrewMember crewMember2 = new CrewMember("Chris", flightCrewJob2, 90000.f);
        CrewMember crewMember3 = new CrewMember("Ammy", flightCrewJob3, 70000.f);

        Ticket busTicket = new BusTicket(111, "10th Street", "1st street", "23A", 50.00);
        Ticket planeTicket = new PlaneTicket(222, "Philly", "Chicago", "1C", 100.00, true);

        String[] passenger57Luggage = {"luggage1", "luggage2", "luggage3" };
        String[] passenger07Luggage = {"luggage1", "luggage2"};

        Passenger passenger57 = new Passenger("Liam", busTicket,1000.00, passenger57Luggage);
        Passenger passenger07 = new Passenger("Sam", planeTicket,500, passenger07Luggage);

        System.out.println(passenger57.getAmountOfLuggage());
        System.out.println("====================");
        passenger07.printTicket();
        System.out.println("====================");
        crewMember3.serve(passenger57);

        System.out.println("=====Before Sorting=====");
        PayAble[] things = {crewMember1, crewMember2, crewMember3, planeTicket, busTicket};
        FlightApp.printAmountForEachThingThatIsPayable(things);

        System.out.println("=====Before Sorting=====");
        ArrayList<FlightCrewJob> flightCrewJobs = new ArrayList<>();
        flightCrewJobs.add(flightCrewJob3);
        flightCrewJobs.add(flightCrewJob1);
        flightCrewJobs.add(flightCrewJob2);
        FlightApp.printEachFlightCrewJob(flightCrewJobs);
        System.out.println("======After Sorting====");
        FlightApp.sortAndPrintCrewMemberByJob(flightCrewJobs);
        System.out.println("====================");
        FlightApp.printAllFlightCrewJobsExceptThisCrewMemberJob(flightCrewJobs, crewMember1);




    }
}
