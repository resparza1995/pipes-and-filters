import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 *
 * @author Rafa Esparza
 */
public class Filter6 {

    /**
     * Removes line comments: after the double slash chars (//) all the chars 
     * til the end of the line is removed (including the // chars).
     */

    public static void main(String[] args) {
        
        try{
            BufferedReader reader;
            reader = new BufferedReader(new InputStreamReader(System.in));
            
            String line = "";
            while(true){
                if((line = reader.readLine()) != null){
                    if(!line.trim().startsWith("//")){
                        System.out.println(line);
                    }
                }else{
                    break;
                }
            }
        }catch(Exception e){
            System.err.println(e);
        }
    }
}
