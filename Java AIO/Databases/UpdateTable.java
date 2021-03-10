import java.util.*;
import java.sql.*;

public class UpdateTable
{
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args)
    {
        System.out.println("Enter ID: ");
        int id = sc.nextInt();
        System.out.println("Enter Friend's last name: ");
        String lastName = sc.nextLine();
        System.out.println("Enter Friend's first name: ");
        String firstName = sc.nextLine();
        loanMovie(id, lastName,firstName);
    }
    private static void loanMovie(int id, String lastName,
                                  String firstName)
    {
        Connection con = getConnection();
        try
        {
            Statement stmt = con.createStatement();
            String insert = "insert into friend "
                    + "(lastname, firstname, movieid) "
                    + "values ("
                    + "\"" + lastName + "\", \""
                    + firstName + "\", " +
                    + id + ")";
            int i = stmt.executeUpdate(insert);
            System.out.println(insert);
            if (i == 1)
                System.out.println("Loan recorded.");
            else
                System.out.println("Loan not recorded.");
        }
        catch (SQLException e)
        {
            System.out.println(e.getMessage());
            System.exit(0);
        }
    }

    private static Connection getConnection()
    {
        Connection con = null;
        try
        {
            Class.forName("com.mysql.jdbc.Driver");
            String url = "jdbc:mysql://localhost/Movies";
            String user = "root";
            String pw = "";
            con = DriverManager.getConnection(url, user, pw);
        }
        catch (ClassNotFoundException e)
        {
            System.out.println(e.getMessage());
            System.exit(0);
        }
        catch (SQLException e)
        {
            System.out.println(e.getMessage());
            System.exit(0);
        }
        return con;
    }
}