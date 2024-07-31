package src.May22;

public class MethodWithParameters {

    public Integer age;
    public String name;

    public void addValue(Integer newAge, String newName)
    {
        age = newAge;
        name = newName;
        System.out.println("age is " + age );
        System.out.println("Name is " + name);
    }

    public static void main(String[] args) {
        MethodWithParameters m = new MethodWithParameters();

        m.addValue(10, "Avijeet");
    }
}
