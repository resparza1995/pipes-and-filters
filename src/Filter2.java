import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 *
 * @author Rafa Esparza
 */
public class Filter2 {

    /**
     *  Do a program, which removes empty lines from a file e.g. 
     *  lines which have only the new line character
     */
    
    public static void main(String[] args) {
        String newString = "";

        try{
            BufferedReader reader;
            reader = new BufferedReader(new InputStreamReader(System.in));

            String line = "";
            while(true){
                if((line = reader.readLine()) != null){
                    if(line.replaceAll(" ", "").length() != 0){
                        newString += line+"\n";
                    }

                }else{
                    break;
                }
            }
            System.out.println(newString);
        }catch(Exception e){
            System.err.println(e);
        }
    }
}
