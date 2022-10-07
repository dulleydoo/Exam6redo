import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;

public class FlightApp {
    public static void printEachFlightCrewJob(ArrayList<FlightCrewJob> flightCrewJobs){
        for(FlightCrewJob c: flightCrewJobs){
            System.out.println(c);
        }
    }
    public static void printAmountForEachThingThatIsPayable(PayAble[] payAblesPeople){
        for (int x = 0; x < payAblesPeople.length; x++){
            payAblesPeople[x].printPaymentAmount();
        }


    }
    public static void sortAndPrintCrewMemberByJob(ArrayList<FlightCrewJob> flightCrewJobs){
        //sort the list
        Collections.sort(flightCrewJobs, new SortByJobComparater());
        //loop through the list
        for(FlightCrewJob job : flightCrewJobs){
            System.out.println(job);
        }

    }
    public static void printAllFlightCrewJobsExceptThisCrewMemberJob(ArrayList<FlightCrewJob> flightCrewJobs, CrewMember crewMember){
        Iterator<FlightCrewJob> flightCrewJobIterator = flightCrewJobs.iterator();
        while(flightCrewJobIterator.hasNext()){
           FlightCrewJob result = flightCrewJobIterator.next();
           if (result != crewMember.getJob()){
               System.out.println(result);

           }
        }

    }

}
