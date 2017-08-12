package codekamp;

public class Demo {

    public static void main(String[] args) {

        Student s1 = new Student();
        Student s2 = new Student();
        Student s3 = s1;

        s1.name = "Suresh";
        s1.email = "suresh@gmail.com";
        s1.age = 20;
        s1.averageAge = 20;

        s2.name = "Ramesh";
        s2.email = "ramesh@gmail.com";
        s2.age = 25;
        s2.averageAge = 25;

        s3.name = "Jignesh";
        s3.email = "jignesh@gmail.com";
        s3.age = 99;
        s3.averageAge = 99;


        System.out.println(s1.age);
        System.out.println(s2.age);
        System.out.println(s3.age);
        System.out.println(s1.name);
        System.out.println(s2.name);
        System.out.println(s3.name);
        System.out.println(s1.averageAge);
        System.out.println(s2.averageAge);
        System.out.println(s3.averageAge);

    }
}