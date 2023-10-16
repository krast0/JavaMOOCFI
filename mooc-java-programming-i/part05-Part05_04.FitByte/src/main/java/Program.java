
public class Program {

    public static void main(String[] args) {
        // This is an empty main method where you can experiment
        // with your Fitbyte class

//        Fitbyte fitbyte = new Fitbyte(30, 60);
//
//        double percentage = 0.5;
//
//        while (percentage < 1.0) {
//            double target = fitbyte.targetHeartRate(percentage);
//            System.out.println("Target " + (percentage * 100) + "% of maximum: " + target);
//            percentage += 0.1;
//        }
        Person person = new Person("Martin",12);

        person = null;

        person.getAge();
    }
}
class Person{
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}
