package FactoryPrinter;

public class Main {
    public static void main(String[] args) {
        PrinterFactoryMethod factory = new PrinterFactory();
        Printer printer = factory.createPrinter("Canon_5000","empty", "blackWhiteColor");


        System.out.println(printer.getBlackWhiteColor());




    }
}
