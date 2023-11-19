package model;

public enum Regime {
    COMPENSATORY("Compensatory", "Extra hours are not paid, but are compensated within the ordinary schedule."),
    EXTRAS("Extras", "Extra hours are paid, without compensation in the ordinary schedule."),
    ACCUMULATIVE("Accumulative", "Compensatory time is discounted first, and then any additional time is counted as extra hours."),
    EXCLUDE("Exclude", "Neither extra hours nor compensatory time are counted.");


    private final String name;
    private final String description;


    Regime(String name, String description) {
        this.name = name;
        this.description = name;
    }
    // Methods to get the name and description
    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

}
