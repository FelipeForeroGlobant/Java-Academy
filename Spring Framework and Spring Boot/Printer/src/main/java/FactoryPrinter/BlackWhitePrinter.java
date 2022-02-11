package FactoryPrinter;

public class BlackWhitePrinter extends Printer {

    public BlackWhitePrinter(String name, String fullColor, String blackWhiteColor){
        super(name,fullColor,blackWhiteColor);
    }

    public String getName() {
        return "Canon_5000";
    }

    public String getFullColor() {
        return "empty";
    }

    public String getBlackWhiteColor() {
        return "blackWhiteColor";
    }

}
