package enums;

public enum Level {
    TOP("Top Four"),
    MIDDLE("Under Top Four But Not Relagated"),
    BOTTOM("Relagation Zone"),
    NA("Not Available");

    private String name;
    Level(String name) {
        this.name = name;
    }
}
