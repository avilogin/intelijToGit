package src.May22;

public class Students {

    //Constructor Overloading

    private String name;
    private Integer age;


    //Default Constructor
    public Students()
    {
    name = "Avijeet";
    age = 27;
    }

    //Parameterized Constructor
    public Students(String stdName)
    {
        name = stdName;
        age = 30;
    }

    //Parameterized Constructor
    public Students(String stdName, Integer stdAge)
    {
        name = stdName;
        age = stdAge;
    }


    public String getName() {
        return name;
    }

    public Integer getAge() {
        return age;
    }

    public static void main(String[] args) {
        Students s1 = new Students();
        Students s2 = new Students("Rahul");
        Students s3 = new Students("Lirics", 55);

        System.out.println(s1.getName() + " - " + s1.getAge());
        System.out.println(s2.getName() + " - " + s2.getAge());
        System.out.println(s3.getName() + " - " + s3.getAge());

    }
}
