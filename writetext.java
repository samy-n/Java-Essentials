/**
 * This is a simple program to write name, height and weight in text file named a.txt.
 */

package file_handling;
import java.io.*;
public class writetext
{
    static void main () throws IOException
    {
        FileWriter fw = new FileWriter("a.txt");
        BufferedWriter bw= new BufferedWriter (fw);
        PrintWriter pw= new PrintWriter (bw);
        BufferedReader in= new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter your name");
        String name= in.readLine();
        System.out.println("Enter your height");
        String ht= in.readLine();
        System.out.println("Enter your weight");
        String wt= in.readLine();
        pw.println(name);
        pw.println(ht);
        pw.println(wt);
        pw.close();
        bw.close();
        fw.close();
    }
}
