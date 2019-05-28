import java.sql.*;

public class QueryResults8 {
   static final String DB_URL = "jdbc:mysql://localhost/movies?serverTimezone=UTC";

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
      sql = "SELECT name, year FROM movies ORDER BY name";
	  ResultSet rs = stmt.executeQuery(sql);

     System.out.println("Querying Database...");
     String format = "| %1$-5s| %2$-5s|\n\n";
     System.out.format(format, "Name", "Year");

      while(rs.next()){
         String name = rs.getString("name");
         String year = rs.getString("year");

         System.out.format(format, name, year);
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