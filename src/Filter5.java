import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 *
 * @author Rafa Esparza
 */
public class Filter5 {

    /**
     * Removes one white space chars from a file.
     */


    
    public static void main(String[] args) {

        try{
            BufferedReader reader;
            reader = new BufferedReader(new InputStreamReader(System.in));
            
            String line = "";
            String newLine = "";
            while(true){
                if((line = reader.readLine()) != null){
                    newLine = line.replaceAll(" ","")+"\n";
                    System.out.println(newLine);
                }else{
                    break;
                }
            }
        }catch(Exception e){
            System.err.println(e);
        }
    }
}
