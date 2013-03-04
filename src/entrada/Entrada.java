/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package entrada;
import java.io.*; 
import java.util.Scanner;
/**
 *
 * @author 64131
 */
public class Entrada {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)throws IOException {
        // TODO code application logic here
Scanner s = null; 
try { 
    s = new Scanner(new BufferedReader(new FileReader("entrada.txt")));
    s.useDelimiter(":");
    while (s.hasNext() ) { 
        
        System.out.println(s.next());

} 
} finally { if (s != null) { s.close(); } } } }