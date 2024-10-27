package src.SeptPractice.Sept25;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.SQLException;

public class exceptionExample {
    public static void main(String[] args) {
        int a = 1, b;
        try
        {
            b = a / 0;

        }

        catch (NullPointerException n)
        {
            System.out.println("Null pointer");
        }
        catch ( ArithmeticException ar)
        {
            System.out.println(ar.getMessage());
            System.exit(0);
        }
        finally
        {
            System.out.println("Finally block");
        }

    }
}
