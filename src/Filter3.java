import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 *
 * @author Rafa Esparza
 */
public class Filter3 {

    /**
     * Removes white spaces from the end of the lines (trifling white spaces) 
     * in a file.
     */

    
    public static void main(String[] args) {

        try{
            BufferedReader reader;
            reader = new BufferedReader(new InputStreamReader(System.in));
            
            String line = "";
            while(true){
                if((line = reader.readLine()) != null){
                    System.out.println(line.trim()+"\n");
                }else{
                    break;
                }
            }
        }catch(Exception e){
            System.err.println(e);
        }
    }
}
