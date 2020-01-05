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
    private static final String[] ratioModules = {"Ratio, Proportion and Rates of Change"};
    private static final String[] geometryModules = {"Properties and Constructions", "Mensuration and Calculation", "Vectors"};
    private static final String[] probabilityModules = {"Probability"};
    private static final String[] statisticsModules = {"Statistics"};

    public static final Module[] moduleList = {
            new Module("Number", numberModules),
            new Module("Algebra", algebraModules),
            new Module("Ratio, Proportion and Rates of Change", ratioModules),
            new Module("Geometry and Measures", geometryModules),
            new Module("Probability", probabilityModules),
            new Module("Statistics", statisticsModules)
    };

    public String getName() { return name; }

    public static String getModuleName( int moduleID ) {
        return moduleList[ moduleID ].getName();
    }

    public static String[] getSubModules( int id ) {
        switch ( id ){
            case 0: return numberModules;
            case 1: return algebraModules;
            case 2: return ratioModules;
            case 3: return geometryModules;
            case 4: return probabilityModules;
            case 5: return statisticsModules;
            default: return null;
        }
    }

}
