import java.util.Comparator;

public class SortByJobComparater implements Comparator<FlightCrewJob> {
    @Override
    public int compare(FlightCrewJob job1, FlightCrewJob job2) {
        return job1.compareTo(job2);

    }
}
