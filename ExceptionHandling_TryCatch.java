/**
 * Exception are errors in a program which occur on running the program(i.e runtime errors)
 * Example: 1. ArithmeticException- occurs when you divide number by 0
 *           2. NumberFormatException- occurs when expected input datatype
 *                                     and input entered by user does not match.  
 * Java provides following keywords to handle those exceptions:
 * 1. try- used to monitor a block of code to check if exception occurs
 * 2. catch- used to display appropriate message if exception occurs
 * 3. finally- used to write critical code which executes even if program 
 *             stops abruptly on encountering exception.
 *             Example: In the program for a bank , the account needs to be
 *             logged off even if error occurs. The code for closing the
 *             account comes in finally block.
 */
package ExceptionHandling;
import java.io.*;
public class ExceptionHandling_TryCatch
{
    InputStreamReader read= new InputStreamReader(System.in);
    BufferedReader in=new BufferedReader(read);
    void main()throws IOException
    {
        int a=0,b=0;
        System.out.println("Enter a");
        try
        {
            a=Integer.parseInt(in.readLine());
        }
        catch(NumberFormatException E)
        {
            System.out.println("Integer should be entered");
        }
        System.out.println("Enter b");
        try
        {
            b=Integer.parseInt(in.readLine());
        }
        catch(NumberFormatException E)
        {
            System.out.println("Integer should be entered");
        }
        int c=0;
        try
        {
            c=a/b;
        }
        catch(ArithmeticException E)
        {
            System.out.println("Division by 0 not allowed");
        }
        System.out.println(c);
    }
}