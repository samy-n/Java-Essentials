/**
 * This is a simple program to read the file a.txt.
 */

package file_handling;
import java.io.*;
public class readtext
{
    static void main () throws IOException
    {
        FileReader fw = new FileReader("a.txt");
        BufferedReader bw= new BufferedReader (fw);

        String s="";
        while ((s=bw.readLine())!=null)
        {
            System.out.println( s +" ");
            

        }
        bw.close();
        fw.close();
    }
}

