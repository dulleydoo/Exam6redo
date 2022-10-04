public class CrewMember extends Person implements PayAble, ServAble{
    private FlightCrewJob job;
    private float salary;


    public CrewMember(String name, String person, FlightCrewJob job, float salary) {
        super(name, person);
        this.salary = salary;
        this.job = job;
    }


    public FlightCrewJob getJob() {
        return job;
    }

    public void setJob(FlightCrewJob job) {
        this.job = job;
    }

    public float getSalary() {
        return salary;
    }

    public void setSalary(float salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "CrewMember{" +
                "job=" + job +
                ", salary=" + salary +
                ", person='" + person + '\'' +
                '}';
    }

    @Override
    public double printPaymentAmount() {
        return 1.1;
    }

    @Override
    public String serve(Person person) {
        return "";
    }
}
