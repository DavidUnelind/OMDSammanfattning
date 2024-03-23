package ObserverPattern;

import java.util.Observable;

@SuppressWarnings("deprecation")
public class Button extends Observable {

    public void buttonPressed() {
        setChanged();
        notifyObservers();
    }
}