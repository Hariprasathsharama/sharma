package projectblueprint;
import java.sql.BatchUpdateException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Scanner;

public class Main {
    private static final String sql="INSERT INTO Candidates" +"(name,number,email) values " +"(?,?,?);";
    private static void printSQLException(SQLException ex) {
        for(Throwable e:ex){
            if(e instanceof SQLException){
                e.printStackTrace(System.err);
                System.err.println("Sqlstate" + ((SQLException) e).getSQLState());
                System.err.println("Error code "+((SQLException) e).getErrorCode());
                System.err.println("Message"+ e.getMessage());
                Throwable t=ex.getCause();
                while (t!=null) {
                    System.out.println("Cause" + t);
                    t=t.getCause();
                }
            }
        }
    }
    public static void printBatchupdateException(BatchUpdateException b){
        System.err.println("sqlstate"+ b.getSQLState() ); 
        System.err.println("Message"+b.getMessage());
        System.err.println("Vendor"+ b.getErrorCode());
        System.err.println("Update counts: ");
        int[] count=b.getUpdateCounts();
        for (int i = 0; i < count.length; i++) {
            System.err.println(count[i]+" ");
        }
    
       
    }
    public static void  main(String[] args) {
        
       ArrayList<CandidateInfo>arr=new ArrayList<>();
       String name;long number;String email;
       Scanner s=new Scanner(System.in);
       System.out.println("Enter the number of students to update in list");
       System.out.println("-----------------------------------------------");
       int n=s.nextInt();
       for (int i = 0; i < n; i++) {
            System.out.print("Enter the name  ");
            name=s.next();
            System.out.print("Enter the number  ");
            number=s.nextLong();
            System.out.println("Enter the email  ");
            email=s.next();
            arr.add(new CandidateInfo(name, number, (email)));
       }
  
       try (
        // Class.forName("com.mysql.cj.jdbc.Driver");
        Connection connection=DriverManager.getConnection("jdbc:mysql://localhost/project", "root", "Chrisevans@2309");
        PreparedStatement preparedstatement=connection.prepareStatement(sql)){
            connection.setAutoCommit(false);
        for(Iterator<CandidateInfo> iterator=arr.iterator(); iterator.hasNext();){
            CandidateInfo candidate=(CandidateInfo)iterator.next();
            preparedstatement.setString(1,candidate.getName() );
            preparedstatement.setLong(2, candidate.getNumber());
            preparedstatement.setString(3, candidate.getEmail());
            preparedstatement.addBatch();
        }
        int[] count=preparedstatement.executeBatch();
        System.out.println(Arrays.toString(count));
        connection.commit();
        connection.setAutoCommit(true);
        
    //Display the list
    // for (CandidateInfo i : arr) {
    //     System.out.println(i.toString());
    // }
    }
    catch(BatchUpdateException batchUpdateException){
            printBatchupdateException(batchUpdateException);
        }
        catch(SQLException e){
            printSQLException(e);
        }
       
    s.close();
    }
    

}
