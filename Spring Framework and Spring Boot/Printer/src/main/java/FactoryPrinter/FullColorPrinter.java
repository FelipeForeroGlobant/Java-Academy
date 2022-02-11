package FactoryPrinter;

public class FullColorPrinter extends Printer {

    public FullColorPrinter(String name, String fullColor, String blackWhiteColor){
        super(name,fullColor,blackWhiteColor);
    }

    public String getName(){
        return "Epson_2500";
    }

    public String getFullColor(){
        return "fullColor";
    }

    public String getBlackWhiteColor(){
        return "blackWhiteColor";
    }
}
