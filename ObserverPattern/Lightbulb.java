package ObserverPattern;

import java.util.Observable;
import java.util.Observer;

@SuppressWarnings("deprecation")
public class Lightbulb implements Observer {
    private boolean turnedOn = false;

    @Override
    public void update(Observable o, Object arg) {
        turnedOn = !turnedOn;
    }
}