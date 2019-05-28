import java.sql.*;

public class CreateTable {
   static final String DB_URL = "jdbc:mysql://localhost:3306/movies?serverTimezone=UTC";

   static final String USER = "root";
   static final String PASS = "";

   public static void main(String[] args) {
   Connection conn = null;
   Statement stmt = null;

   try{
      System.out.println("Connecting to database...");
      conn = DriverManager.getConnection(DB_URL, USER,PASS);
      System.out.println("Creating statement...");
      stmt = conn.createStatement();
      String sql;
      sql = "SELECT * FROM movies";
      ResultSet rs = stmt.executeQuery(sql);
      while(rs.next()){
         int id  = rs.getInt("id");
         String name = rs.getString("name");
         String genre = rs.getString("genre");
         String year = rs.getString("year");
         String imdb_rating = rs.getString("imdb_rating");

         System.out.print("ID: " + id);
         System.out.print(", Name: " + name);
         System.out.print(", Genre: " + genre);
         System.out.print(", Year: " + year);
         System.out.print(", IMDB_Rating: " + imdb_rating);
      }
      rs.close();
      stmt.close();
      conn.close();
   }catch(SQLException se){
      se.printStackTrace();
   }catch(Exception e){
      e.printStackTrace();
   }finally{
      try{
         if(stmt!=null)
            stmt.close();
      }catch(SQLException se2){
      }// nothing we can do
      try{
         if(conn!=null)
            conn.close();
      }catch(SQLException se){
         se.printStackTrace();
      }//end finally try
   }//end try
}
}