package ist242;

import java.sql.*;
import java.util.*;

public class Cust_Data {
    public static void main(String[] args) {
        Customer cus = new Customer(1,"Roman","Sam","smr5401@psu.edu","267-855-3321","30");
        readAllSQL();
        //readByIdSQL(1);
        //createSQL(4, cus);
        //updateSQL(4, cus);
        //deleteSql(4);
    }

    public void readAllCustomer(){
        readAllSQL();
    }

    // Read All SQL
    private static void readAllSQL() {
        ArrayList<Customer> cust = new ArrayList<Customer>();

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/StoreFront_UsedCloth", "root", "Vakayar@1");
            Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery("select * from tblCustomer");

            while (rs.next()) {
                Customer cus = new Customer(rs.getInt("CustomerId"),rs.getString("First_Name"), rs.getString("Last_Name"),
                        rs.getString("Email"), rs.getString("Phone_Number"), rs.getString("Payment"));

                cust.add(cus);
            }

            for (Customer cus : cust) {

                System.out.println(cus.getfName() + "   " + cus.getlName() + "   " + cus.getEmail() + "     " + cus.getpNumber());
            }

        } catch (Exception e) {
            System.out.println(e);
        }
    }

    // Read by ID
    private static void readByIdSQL(int id){
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/StoreFront_UsedCloth", "root", "Vakayar@1");
            PreparedStatement ps = con.prepareStatement("SELECT * FROM customers WHERE id = ?");
            ps.setInt(1,id);
            ResultSet rs = ps.executeQuery();
            Customer cus = null;
            while (rs.next()) {
                 cus = new Customer(rs.getInt("CustomerId"),rs.getString("First_Name"), rs.getString("Last_Name"),
                        rs.getString("Email"), rs.getString("Phone_Number"), rs.getString("Payment"));
            }
            System.out.println(cus.getId() + ", " + cus.getfName() + ", " + cus.getlName() + ", " +
                    cus.getEmail() + ", " + cus.getpNumber() + ", " + cus.getPayment());

        } catch (Exception e) {
            System.out.println(e);
        }
    }

    private static void createSQL(int id, Customer cus){
        try {
            // Here, "Bike Store" is the database name, "root" is the username and "password" is the password
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/StoreFront_UsedCloth", "root", "Vakayar@1");
            PreparedStatement ps = con.prepareStatement("INSERT INTO customers (CustomerId, first_Name, last_Name, Email, phone_Number, Payment) " +
                    "VALUES (?, ?, ?, ?, ?, ?)");
            ps.setInt(1, id);
            ps.setString(2, cus.getfName());
            ps.setString(3, cus.getlName());
            ps.setString(4, cus.getEmail());
            ps.setString(5, cus.getpNumber());
            ps.setString(6, cus.getPayment());
            ps.executeUpdate();
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    private static void updateSQL(int id, Customer cus) {
        try {
            // Here, "Bike Store" is the database name, "root" is the username and "password" is the password
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/StoreFront_UsedCloth", "root", "Vakayar@1");
            PreparedStatement ps = con.prepareStatement("UPDATE customers SET first_Name = ?, last_Name = ?, Email = ?, " +
                    "phone_Number = ?, Payment = ? WHERE id = ?");
            ps.setString(1, cus.getfName());
            ps.setString(2, cus.getlName());
            ps.setString(3, cus.getEmail());
            ps.setString(4, cus.getpNumber());
            ps.setString(5, cus.getPayment());
            ps.setInt(6, id);
            ps.executeUpdate();
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    private static void deleteSql(int id){
        try {
            // Here, "Bike Store" is the database name, "root" is the username and "password" is the password
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/StoreFront_UsedCloth", "root", "Vakayar@1");
            PreparedStatement ps = con.prepareStatement("DELETE FROM customers WHERE id = ?");
            ps.setInt(1, id);
            ps.executeUpdate();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
