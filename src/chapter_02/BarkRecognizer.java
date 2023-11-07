package chapter_02;

import java.util.Iterator;
import java.util.List;

public class BarkRecognizer {
    private DogDoor door;

    public BarkRecognizer(DogDoor door) {
        this.door = door;
    }

    public void recognize(String bark){
        System.out.println("BarkRecognizer: Heard a '" + bark + "'");
        List allowedBarks = door.getAllowedBarks();
        for(Iterator i = allowedBarks.iterator(); i.hasNext();)
        {
            Bark allowedBark = (Bark)i.next();
            if(bark.equals(allowedBark)){
                door.open();
                return;
            }

        }
        System.out.println("This dog is not allowed.");
    }
}
