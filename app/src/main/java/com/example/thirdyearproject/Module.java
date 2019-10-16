package com.example.thirdyearproject;

public class Module {

    private String name;
    private String[] subModules;

    public Module(String name, String[] subModules) {
        this.name = name;
        this.subModules = subModules;
    }
    public Module(String name) {
        this.name = name;
        this.subModules = new String[0];
    }

    private static final String[] numberModules = {"Structure and Calculation", "Fractions, Decimals and Percentages", "Measures and Accuracy"};
    private static final String[] algebraModules = {"Notation, Vocabulary and Manipulation", "Graphs", "Solving Equations and Inequalities", "Sequences"};
    private static final String[] geometryModules = {"Properties and Constructions", "Mensuration and Calculation", "Vectors"};

    public static final Module[] moduleList = {
            new Module("Number", numberModules),
            new Module("Algebra", algebraModules),
            new Module("Ratio, Proportion and Rates of Change"),
            new Module("Geometry and Measures", geometryModules),
            new Module("Probability"),
            new Module("Statistics")
    };

    public String getName() { return name; }
    public String[] getSubModules() { return subModules; }

}
