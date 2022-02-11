package FactoryPrinter;

public abstract class Printer {
    private String name;
    private String fullColor;
    private String blackWhiteColor;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFullColor() {
        return fullColor;
    }

    public void setFullColor(String fullColor) {
        this.fullColor = fullColor;
    }

    public String getBlackWhiteColor() {
        return blackWhiteColor;
    }

    public void setBlackWhiteColor(String blackWhiteColor) {
        this.blackWhiteColor = blackWhiteColor;
    }

    public Printer(String name, String fullColor, String blackWhiteColor) {
        setName(name);
        setFullColor(fullColor);
        setBlackWhiteColor(blackWhiteColor);
    }

}
