package codekamp;

public class Demo {

    public static void main(String[] args) {

        Student s1 = new Student();

        s1.name = "Dharmesh";
        s1.email = "Dharmesh@gmail.com";
        s1.age = 20;
        s1.hometown = "Ghaziabad";

        s1.saveToDatabase();
        s1.sendEmail();

        Ship ship1 = new Ship();
        ship1.name = "Vikrant";


        ship1.fire(10, 20);
    }

    public static void saveStudentToDatabase(String name, String email, int age, String hometown) {
        System.out.println(name);
        System.out.println(email);
        System.out.println(age);
        System.out.println(hometown);
    }

    public static void sendEmail(String email, String name) {
        System.out.println("sending email to " + name + " at " + email);
    }
}