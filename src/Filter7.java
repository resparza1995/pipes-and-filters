import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 *
 * @author Rafa Esparza
 */
public class Filter7 {

    /**
     * removes c style block comments from a file. This means that a block that
     * starts with a character pair /* and ends with a *\/ is removed from a
     * file.
     */
    public static void main(String[] args) {
        try {
            BufferedReader reader;
            reader = new BufferedReader(new InputStreamReader(System.in));

            String line = "";
            String newline = "";
            Boolean isComment = false;

            while (true) {

                if ((line = reader.readLine()) != null) {
                    if(line.trim().startsWith("/*")){
                    //if (line.matches("/*")) {
                        isComment = true;
                    }
                    if (line.trim().startsWith("*/")) {
                        isComment = false;
                        continue;
                    }
                    if (!isComment) {
                        System.out.println(line + "\n");
                    }
                } else {
                    break;
                }
            }

        } catch (Exception e) {
            System.err.println(e);
        }
    }
}
