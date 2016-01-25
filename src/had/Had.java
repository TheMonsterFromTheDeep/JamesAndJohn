package had;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 *
 * @author TheMonsterFromTheDeep
 */
public class Had {

    static String getSingleHad(int level, boolean flip) {
        if(level == 0) {
            return "had";
        }
        char quote = flip ? '\'' : '\"';
        String two = quote + getDoubleHad(level - 1, !flip) + quote;
        return "had " + quote + getSingleHad(level - 1, !flip) + "," + quote + " had " + two + "; " + two + " had";
    }
    
    static String getDoubleHad(int level, boolean flip) {
        if(level == 0) {
            return "had had";
        }
        char quote = flip ? '\'' : '\"';
        String two = quote + getDoubleHad(level - 1, !flip) + quote;
        return "had had " + quote + getSingleHad(level - 1, !flip) + "," + quote + " had had " + two + "; " + two + " had had";
    }
    
    static String getHad(int level) {
        return "James, while John " + getDoubleHad(level, false) + " a better effect on the teacher.";
    }
    
    public static void main(String[] args) {
        int i = 14;
        String hads = getHad(i);
        //System.out.println(hads);
        try {
            FileOutputStream file = new FileOutputStream("had.txt");
            file.write(hads.getBytes());
        }
        catch(IOException e) {
            
        }
    }
    
}
