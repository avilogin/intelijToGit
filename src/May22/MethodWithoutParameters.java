package src.May22;

public class MethodWithoutParameters {

    public Integer age;
    public String name;

    public void addValue()
    {
        age = 20;
        name = "Avijeet";
        System.out.println("age is " + age );
        System.out.println("Name is " + name);
    }

    public static void main(String[] args) {
        MethodWithoutParameters m = new MethodWithoutParameters();
        m.addValue();
    }
}
