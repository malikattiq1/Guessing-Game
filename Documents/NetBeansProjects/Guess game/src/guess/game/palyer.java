
package guess.game;
import java.util.Random;
public class palyer {
    public int guess(){
        Random rando=new Random();
        int number;
        number=rando.nextInt(10);
        return number;
        
    }
    
}
