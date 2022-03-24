package com.company.funtionalinterface.function;



import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FunctionalExamples2 {
    public static void main(String[] args){
        Function <Employee, String>  employeeToStringFunc = Employee::name;

        List<Employee> employeeList= List.of(
                        new Employee("Sebahattin Ali", 45),
                        new Employee("Peyami Safa ", 25),
                        new Employee("Rifat Ilgaz", 65),
                        new Employee("Orhan Kemal", 15));

        List<String> empNameList= convertEmployeeListToNamesList(employeeList, employeeToStringFunc);
        empNameList.forEach(System.out::println);

    }

    private static List<String> convertEmployeeListToNamesList (List<Employee> employeeList, Function<Employee, String> employeeToStringFunc) {
       return   employeeList.stream()
               .map(employeeToStringFunc)
               .collect(Collectors.toList());
    }


}
record  Employee(String name, int age) {}
