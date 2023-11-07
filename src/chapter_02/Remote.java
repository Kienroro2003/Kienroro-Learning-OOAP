package chapter_02;

import java.sql.Time;
import java.util.Timer;
import java.util.TimerTask;

public class Remote {
    private DogDoor door;

    public Remote(DogDoor door) {
        this.door = door;
    }

    public void pressButton(){
        if(this.door.isOpen())
        {
            door.close();
        }
        else
        {
            door.open();
        }
    }
}
