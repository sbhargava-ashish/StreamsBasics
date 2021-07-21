package model;

import java.util.Arrays;
import java.util.List;

public class EmpFac {

    public static List<Employee> dummyData() {

        return Arrays.asList(new Employee(1, "Ashish",
                        Arrays.asList(new Qualification("BE", 2011),
                                new Qualification("MBA", 2015)))
                , new Employee(2, "Sashi",
                        Arrays.asList(new Qualification("BE", 2007),
                                new Qualification("MBA", 2011)))
                , new Employee(3, "Vishnu",
                        Arrays.asList(new Qualification("BE", 2014),
                                new Qualification("MBA", 2019)))
                , new Employee(4, "Den",
                        Arrays.asList(new Qualification("BE", 2011),
                                new Qualification("MBA", 2015)))
                , new Employee(5, "Meddy",
                        Arrays.asList(new Qualification("BE", 2011),
                                new Qualification("MBA", 2015)))
        );
    }
}
