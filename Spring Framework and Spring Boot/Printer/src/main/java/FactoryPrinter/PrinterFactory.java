package FactoryPrinter;

public class PrinterFactory implements PrinterFactoryMethod{

    public Printer createPrinter(String name, String fullColor, String blackWhiteColor){
        if(name.equals("Canon_5000")){
            return new BlackWhitePrinter(name, fullColor, blackWhiteColor);
        }

        else if(name.equals("Epson_2500")){
            return new FullColorPrinter(name, fullColor, blackWhiteColor);
        }

        else{
            return null;
        }


    }

}
