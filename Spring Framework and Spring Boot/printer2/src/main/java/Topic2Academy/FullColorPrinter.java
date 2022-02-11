package Topic2Academy;

public class FullColorPrinter implements Printer {
    private String name = "Epson 2500";

    private Printer printer;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void print() {
        System.out.println(name + "is printing full color");
    }
}
