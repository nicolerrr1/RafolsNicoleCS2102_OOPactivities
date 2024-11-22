enum DanceStyle {
    BALLET,
    HIPHOP,
    JAZZ,
    CONTEMPORARY;
}

public class Dancer extends Artist {
    private DanceStyle style;

    // Constructor
    public Dancer(String name, String nationality, int age, String specialty, DanceStyle style) {
        super(name, nationality, age, specialty);
        this.style = style;
    }

    // Accessor
    public DanceStyle getStyle() {
        return style;
    }

    // Mutator
    public void setStyle(DanceStyle style) {
        this.style = style;
    }

    // Overriding displayInfo method
    @Override
    public void displayInfo() {
        System.out.println("== Dancer Info ==");
        super.displayInfo();
        System.out.println("Dance Style: " + style);
    }
}