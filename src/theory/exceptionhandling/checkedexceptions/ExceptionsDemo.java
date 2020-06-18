package theory.exceptionhandling.checkedexceptions;

import java.sql.SQLException;

/***
 * try cannot be written without either catch or finally
 *      try-catch
 *      try-finally
 * catch needs a try
 * finally always executes
 */
public class ExceptionsDemo {
    public static void main(String[] args) {
    Account acc = new Account();
        try {
            acc.withdraw(100);
        } catch (SQLException e) {
            e.printStackTrace();
            System.out.println("This is executed when an exception is caught");
        }finally{
            System.out.println("This block is always executed");
        }
    }
}
