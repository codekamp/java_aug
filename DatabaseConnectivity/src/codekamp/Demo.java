package codekamp;

import java.sql.*;

/**
 * Created by cerebro on 09/10/17.
 */


public class Demo {

    public static void main(String[] args) {

        try {
            Class.forName("org.sqlite.JDBC");
            System.out.println("Class imported successfully");
        } catch (ClassNotFoundException e) {
            System.out.println("Class you were looking for not found");
        }

        try {
            Connection c = DriverManager.getConnection("jdbc:sqlite:src/codekamp/my_database.sqlite");
            Statement s = c.createStatement();
//            s.execute("INSERT INTO `todo` (`title`,`due_date`,`completed`) VALUES ('Complete game',99887766,0);");


            ResultSet r = s.executeQuery("SELECT * FROM `todo`");

//            System.out.println(r.next());
//            System.out.println(r.getString("title"));
//            System.out.println(r.getInt("due_date"));
//
//            System.out.println(r.next());
//            System.out.println(r.getString("title"));
//            System.out.println(r.getInt("due_date"));
//
//            System.out.println(r.next());


            while (r.next()) {
                System.out.println(r.getString("title"));
                System.out.println(r.getInt("due_date"));
            }
        } catch (SQLException e) {
            System.out.println("unable to connect to database");
            e.printStackTrace();
        }


    }
}
