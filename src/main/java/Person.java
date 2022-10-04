public abstract class Person {
    private String name;
    public String person;

    public Person(String name, String person) {
        this.name = name;
        this.person = person;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", person='" + person + '\'' +
                '}';
    }
}
