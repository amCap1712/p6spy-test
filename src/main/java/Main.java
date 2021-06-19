import java.sql.DriverManager;
import java.sql.SQLException;

public class Main {

    public static void main(String[] args) throws SQLException {
        var connection = DriverManager.getConnection("jdbc:p6spy:sqlite::memory:");
        var statement = connection.createStatement();
        var result = statement.executeQuery("SELECT date('now') as first;");
        System.out.println(result.getString("first"));
    }
}
