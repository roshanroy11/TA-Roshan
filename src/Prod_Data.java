package ist242;
import java.sql.*;
import java.util.*;
public class Prod_Data {
    public static void main(String[] args) {
        //Product_Data prod = new Product_Data(01,"Shirt","Nike","Black","L","PA");
        //readAllSQL();
        //readByIdSQL(1);
        //createSQL(4, cus);
        //updateSQL(4, cus);
        //deleteSql(4);
    }


    // Used for UsedCloth_Databse:
    public void readAllProducts(){
        readAllSQL();
    }

    // Read All SQL
    private static void readAllSQL() {
        ArrayList<Product_Data> product = new ArrayList<Product_Data>();

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/UsedCloth_ST", "root", "Vakayar@1");
            Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery("select * from tblProduct");

            while (rs.next()) {
                Product_Data prod = new Product_Data(rs.getInt("Product_Id"),rs.getString("Product_Type"), rs.getString("Product_Name"),
                        rs.getString("Product_Color"), rs.getString("Product_Size"), rs.getString("State_Name"));

                product.add(prod);
            }

            for (Product_Data prod : product) {

                System.out.println(prod.getProductID() + "\t" + prod.getProductType() + "\t" + prod.getProductName() + "\t" + prod.getProductName()+ "\t" + prod.getProductColor()+ "\t" +  prod.getProductSize()+ "\t" + prod.getStateName());
            }

        } catch (Exception e) {
            System.out.println(e);
        }
    }

    // Read by ID
    public static Product readByIdSQL(int id){
        Product prod = null;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/UsedCloth_ST", "root", "Vakayar@1");
            Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT * FROM tblProduct WHERE Product_Id=" + id);

            while (rs.next()) {
                prod = new Product(rs.getInt("Product_Id"),rs.getString("Product_Type"), rs.getString("Product_Name"),
                        rs.getString("Product_Color"), rs.getString("Product_Size"), rs.getString("State_Name"));
            }
//            System.out.println(prod.getProductID() + " " + prod.getProductType() + " " + prod.getProductName() + " " + prod.getProductName()+ " " + prod.getProductColor()+ " " +  prod.getProductSize()+ " " + prod.getStateName());

        } catch (Exception e) {
            System.out.println(e);
        }
        return prod;
    }

    private static void createSQL(int id, Product prod){
        try {
            // Here, "Bike Store" is the database name, "root" is the username and "password" is the password
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/UsedCloth_ST", "root", "Vakayar@1");
            PreparedStatement ps = con.prepareStatement("INSERT INTO customers (Product_Id, Product_Type, Product_Name, Product_Color, Product_Size, State_Name) " +
                    "VALUES (?, ?, ?, ?, ?, ?)");
            ps.setInt(1, prod.getProductID());
            ps.setString(2, prod.getProductType());
            ps.setString(3, prod.getProductName());
            ps.setString(4, prod.getProductColor());
            ps.setString(5, prod.getProductSize());
            ps.setString(6, prod.getStateName());
            ps.executeUpdate();
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    private static void updateSQL(int id, Product_Data prod) {
        try {
            // Here, "Bike Store" is the database name, "root" is the username and "password" is the password
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/UsedCloth_ST", "root", "Vakayar@1");
            PreparedStatement ps = con.prepareStatement("UPDATE products SET Product_Type = ?, Product_Name = ?, Product_Color = ?, " +
                    "Product_Size = ?, State_Name = ? WHERE Product_Id = ?");
            ps.setString(1, prod.getProductType());
            ps.setString(2, prod.getProductName());
            ps.setString(3, prod.getProductColor());
            ps.setString(4, prod.getProductSize());
            ps.setString(5, prod.getStateName());
            ps.setInt(6, prod.getProductID());
            ps.executeUpdate();
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    private static void deleteSql(int id){
        try {
            // Here, "Bike Store" is the database name, "root" is the username and "password" is the password
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/UsedCloth-ST", "root", "Vakayar@1");
            PreparedStatement ps = con.prepareStatement("DELETE FROM products WHERE id = ?");
            ps.setInt(1, id);
            ps.executeUpdate();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}




