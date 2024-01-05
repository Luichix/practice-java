package model;

public enum ContractType {
    INDEFINITE("Indefinite", "An open-ended employment contract with no specific end date."),
    FIXED("Fixed Term", "A contract with a specific duration agreed upon in advance."),
    PROJECT_BASED("Project Based", "A contract for the duration of a specific project or task."),
    APPRENTICESHIP("Apprenticeship", "A contract aimed at training and educating, typically used for internships or technical training."),
    PART_TIME("Part Time", "A contract where the employee works fewer hours than a full-time employee."),
    TEMPORARY("Temporary", "A contract used to substitute employees entitled to job reservation, like maternity or extended illness leaves."),
    SEASONAL("Seasonal", "A contract for work that is only performed during certain seasons or periods of the year."),
    INTERNSHIP("Internship", "A contract designed for recent graduates or individuals with new qualifications, seeking practical experience in their field of study.");

    private final String name;
    private final String description;

    ContractType(String name, String description) {
        this.name = name;
        this.description = description;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

}
