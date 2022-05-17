package Practice;


import java.sql.*;
import java.util.HashMap;

public class DBTest {
  private static String dbURL="jdbc:mysql://localhost/testone";
  private static String dbUser="root";
  private static String dbPassword="India@12354";
  public static HashMap<String, String> hash_map = new HashMap<String , String>();
  private static String pass;
  private static         String email;


  public static void main(String args[])
  {



      Connection con=null;
      try{
        try {
          Class.forName("com.mysql.jdbc.Driver");
        }
        catch(ClassNotFoundException ex) {

        }
        con = DriverManager.getConnection(dbURL,dbUser,dbPassword);
        Statement stmt=con.createStatement();
        int count=0;
        ResultSet record=stmt.executeQuery("select * from pocuser1");
        while(record.next())
          if(record!=null) {
            count++;
            email = record.getString(DBDetails.EMAIL_COL);
            pass = record.getString(DBDetails.PASSWORD);
            hash_map.put(email, pass);
            System.out.println(email);
            System.out.println(pass);
          }


{

}


      }
      catch(SQLException sqe){
        sqe.printStackTrace();}
    }



}
