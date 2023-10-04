package ejercicio1;



import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;




public class Ejercicio1 {
   public static void main(String[] args) {
       String so = System.getProperty("os.name");
       String comando;
// Determinar comando Windows o Linux
       if (so.contains("Windows")) {
           // Some code here
           comando="ipconfig";
       } else {
           // Some other code here
           comando="ifconfig";
       }
       try {
           Process process = Runtime.getRuntime().exec(comando);
           BufferedReader reader = new BufferedReader(new InputStreamReader(process.getInputStream()));
           String line = "";
           while ((line = reader.readLine()) != null) {
               System.out.println(line);
           }
       }catch (IOException e){
           System.out.println("Error: "+e);
       }




   }
}
