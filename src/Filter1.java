import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 *
 * @author Rafa Esparza
 */
public class Filter1 {

    /**
     *  calculates the number of chars, white spaces, 
     *  words and lines ‘from a file’. 
     */
    
    public static void main(String[] args) {
        int lineCnt = 0;
        int charCnt = 0;
        int whiteCnt = 0;
        
        try{
            BufferedReader reader;
            reader = new BufferedReader(new InputStreamReader(System.in));

            String line = null;
            while(true){
                if((line = reader.readLine()) != null){
                    lineCnt +=1;
                    charCnt += line.length();
                    
                    for (int i=0; i<line.length(); i++){
                        if(line.charAt(i) == ' '){
                            whiteCnt +=1;
                        }
                    }
                }else{
                    break;
                }
            }
        }catch(Exception e){
            System.err.println(e);
        }
        System.out.println("Lines:"+lineCnt+" chars: "+charCnt+" White Spaces: "+whiteCnt);
    }
}
