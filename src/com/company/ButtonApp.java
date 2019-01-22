package javaAlgorthims;
import java.awt.*;
import java.applet.Applet;
/**
 * Created by jonny1846 on 12/3/2016.
 */
public class ButtonApp extends Applet {

    Button b1 = new Button();
    Button b2 = new Button("Middle Button");
    Button b3 = new Button("Enable middle Button");
    Button b4 = new Button("Reset all");

    public void init() {

        b1.setLabel("Disable Middle Button");
        b3.disable();

        add(b1);
        add(b2);
        add(b3);
        add(b4);

        validate();

    }

    @SuppressWarnings("deprecation")
    public boolean action(Event e, Object arg) {

        Object target = e.target;

        if(target == b1) { // they clicked to disable the middle button
            b1.disable();
            b2.disable();
            b3.enable();
            return true;
        }
        if(target == b2) { // they clicked the middle button, disable all
            b1.disable();
            b2.disable();
            b3.disable();
            return true;
        }
        if(target == b3) { // they clicked to enable the middle button
            b1.enable();
            b2.enable();
            b3.disable();
            return true;
        }
        if(target == b4) {
            b1.enable();
            b2.enable();
            b3.enable();
            return true;
        }
        return false;
    }
}
