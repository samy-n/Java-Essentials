/**
 * Recursion is infinite method call. 
 * It simply means calling the function from within itself.
 * 
 * This is a simple recursion program to convert decimal to binary.
 * 
 * Datamembers: String bin, int dec
 * Member functions :
 *      DecBin(int n): to assign n to dec
 *      void dectobin(int ):to convert dec to bin
 *      void display(): to display dec and bin
 */
package Recursion;
import java.io.*;
class Recursion_DectoBin
{
    String bin="";
    int dec;
    Recursion_DectoBin(int n)
    {
        dec=n;
    }

    void dectobinconv(int x)
    {
        int s;
        if(x==1)
        {
            bin=1+bin;
            return;
        }
        else
        {
            s=x%2;
            bin=s+bin;
            dectobinconv(x/2);
        }
    }

    void display()
    {
        System.out.println("Decimal number= "+dec+"\nConverted binary number= "+bin);
    }

    static void main()throws IOException
    {
        InputStreamReader read=new InputStreamReader(System.in);
        BufferedReader in=new BufferedReader(read);
        System.out.println("Enter decimal number");
        Recursion_DectoBin ob=new Recursion_DectoBin(Integer.parseInt(in.readLine()));
        ob.dectobinconv(ob.dec);
        ob.display();
    }

}

