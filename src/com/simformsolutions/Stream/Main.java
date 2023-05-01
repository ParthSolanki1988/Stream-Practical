package com.simformsolutions.Stream;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Map;
import java.util.stream.Collectors;

public class Main{
  public static void main(String[] args) {
    ArrayList<Employee> employeeArrayList = new ArrayList<>();

    employeeArrayList.add(new Employee(111, "Fenny", 32, "Female", "HR", 2011, 25000.0));
    employeeArrayList.add(new Employee(122, "Jay", 25, "Male", "Developer", 2015, 13500.0));
    employeeArrayList.add(new Employee(133, "Martin", 29, "Male", "Infrastructure", 2012, 18000.0));
    employeeArrayList.add(new Employee(144, "Mihir", 28, "Male", "Product Development", 2014, 32500.0));
    employeeArrayList.add(new Employee(155, "Nima", 27, "Female", "HR", 2013, 22700.0));
    employeeArrayList.add(new Employee(266, "Sanvi", 26, "Female", "Product Development", 2015, 28900.0));
    employeeArrayList.add(new Employee(211, "Shruti", 27, "Female", "Infrastructure", 2014, 15700.0));
    employeeArrayList.add(new Employee(177, "Parth", 35, "Male", "Developer", 2010, 27000.0));
    employeeArrayList.add(new Employee(188, "Arpit", 31, "Male", "Product Development", 2015, 34500.0));
    employeeArrayList.add(new Employee(199, "Yash", 24, "Male", "Sales And Marketing", 2016, 11500.0));

    /**
     * count :  male and female
     */
    Map<String, Long> noOfFemalAndMaleEmployee = employeeArrayList.stream().collect(Collectors.groupingBy(Employee::getGender, Collectors.counting()));
    System.out.println(noOfFemalAndMaleEmployee);


    Map<Integer, Long> sortId = employeeArrayList.stream().collect(Collectors.groupingBy(Employee::getId, Collectors.counting()));
    System.out.println(sortId);

    /**
     * getDepartment name with distinct value (not repeat same value)
     */
    employeeArrayList.stream()
            .map(Employee::getDepartment)
            .distinct()
            .forEach(System.out::println);

    /**
     * salary will be double
     *
     */
    employeeArrayList.stream()
            .map(Employee::getSalary)
            .map(i -> i * 2)
            .forEach(System.out::println);

    /**
     * sort by Employee Id
     */
    employeeArrayList.stream()
            .sorted()   //when call sorted() method , automatically call compareTo() method
            .forEach(System.out::println);


    /**
     * filter by age
     */
    System.out.println("Print Age which 30 above : ");
    employeeArrayList.stream()
            .filter(age -> age.getAge() > 30) // filtering data (age)
            .map(Employee::getAge) // fetching age
            .collect(Collectors.toList()) //collect as list
            .forEach(System.out::println);

  }
}