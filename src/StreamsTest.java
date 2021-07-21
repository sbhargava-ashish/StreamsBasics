import model.EmpFac;
import model.Employee;

import java.util.List;
import java.util.stream.Collectors;

public class StreamsTest {

    public static void main(String[] args) {
        List<Employee> employees = EmpFac.dummyData();
        mapToList(employees);
        filter(employees);
        filterFlatMap(employees);
        findAny(employees);
        parallelStream(employees);
    }

    private static void parallelStream(List<Employee> employees) {
        System.out.println("--------------- parallelStream ------------");
        employees
                .parallelStream()
                .forEach(System.out::println);
    }

    private static void findAny(List<Employee> employees) {
        System.out.println("--------------- findAny ------------");
        System.out.println(employees
                .stream()
                .filter(e -> e.getId() > 2)
                .findAny()
                .get());
    }

    private static void filterFlatMap(List<Employee> employees) {
        System.out.println("--------------- filterFlatMap ------------");
        employees
                .stream()
                .filter(e -> e.getName().equals("Ashish"))
                .flatMap(e -> e.getQualifications().stream())
                .collect(Collectors.toList())
                .forEach(System.out::println);
    }

    private static void filter(List<Employee> employees) {
        System.out.println("--------------- filter ------------");
        employees
                .stream()
                .filter(e -> e.getId() > 3)
                .collect(Collectors.toList())
                .forEach(System.out::println);
    }

    private static void mapToList(List<Employee> employees) {
        System.out.println("--------------- mapToList ------------");
        employees
                .stream()
                .map(e -> e.getId())
                .collect(Collectors.toList())
                .forEach(System.out::println);
    }
}
