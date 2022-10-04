import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class FlightApp {
    public static void printEachFlightCrewJob(ArrayList<CrewMember> job){
        for(CrewMember c: job){
            System.out.println(c.getJob());
        }
    }
    public static void printAmountForEachThingThatIsPayable(PayAble[] payAbles){



    }
    public static void sortAndPrintCrewMemberByJob(ArrayList<FlightCrewJob> sortedJobs){
        Comparator myComparator = new SortingComparator();
        for(FlightCrewJob c: sortedJobs){
            System.out.println(c);
        }

    }
    public static void printAllFlightCrewJobsExceptThisCrewMemberJob(ArrayList<FlightCrewJob> arrayList, CrewMember crewMember){

    }

}
