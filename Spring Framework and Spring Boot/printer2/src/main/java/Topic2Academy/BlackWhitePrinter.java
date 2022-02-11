package Topic2Academy;

import org.springframework.beans.factory.annotation.Value;

public class BlackWhitePrinter implements Printer {
    private String name = "Cannon5000";

    private Printer printer;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void print() {

        System.out.println( name + " is printing  in black and white color");
    }


}
