import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class BufferedR {
   public static void main (String args[]) {
     
	String dato;
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

      try {
         System.out.print("Introduce texto: ");
         dato = br.readLine();
         System.out.print("El texto fue: " + dato);
      
	  } catch (IOException e) {
          System.out.println(e);
     				  }
   }
}
