package codekamp;

/**
 * Created by cerebro on 13/08/17.
 */
public class Student {
    public String name;
    public String email;
    public int age;
    public String hometown;

    public static int averageAge;
    public static String profession;

    // this is local variable which is added to every non static methods automatically
    // data type of this is Class inside which methods is defined
    // this stores the object on which the methods was invoked
    // this can't be used inside static methods

    public void introduceYourself() {
        System.out.println("My name is " + this.name);
    }

    public static void printProfession() {
        System.out.println("Studying");
    }

    public void saveToDatabase() {
        System.out.println(this.name);
        System.out.println(this.email);
        System.out.println(this.age);
        System.out.println(this.hometown);
    }


    public void sendEmail() {
        System.out.println("sending email to " + this.name + " at " + this.email);
    }


}
