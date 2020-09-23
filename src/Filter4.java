import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 *
 * @author Rafa Esparza
 */
public class Filter4 {

/**
     * Removes consecutive white spaces (=more than one white space in a row)
     * from a file, so that e.g. original 3 spaces are replaced with just one
     * space.
     */


    
    public static void main(String[] args) {

        try{
            BufferedReader reader;
            reader = new BufferedReader(new InputStreamReader(System.in));
            
            String line = "";
            String newLine = "";
            while(true){
                if((line = reader.readLine()) != null){
                    newLine = line.replaceAll(" +"," ")+"\n";
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
