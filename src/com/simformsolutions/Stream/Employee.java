package com.simformsolutions.Stream;


import java.util.TreeSet;

public class Employee implements Comparable<Employee>{

  int id;

  String name;

  int age;

  String gender;

  String department;

  int yearOfJoining;

  double salary;

  String number;


  public Employee(int id, String name, int age, String gender, String department, int yearOfJoining, double salary , String number) {
    this.id = id;
    this.name = name;
    this.age = age;
    this.gender = gender;
    this.department = department;
    this.yearOfJoining = yearOfJoining;
    this.salary = salary;
    this.number = number;
  }



  public int getId() {
    return id;
  }

  public void setId(int id) {
    this.id = id;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public int getAge() {
    return age;
  }

  public void setAge(int age) {
    this.age = age;
  }

  public String getGender() {
    return gender;
  }

  public void setGender(String gender) {
    this.gender = gender;
  }

  public String getDepartment() {
    return department;
  }

  public void setDepartment(String department) {
    this.department = department;
  }

  public int getYearOfJoining() {
    return yearOfJoining;
  }

  public void setYearOfJoining(int yearOfJoining) {
    this.yearOfJoining = yearOfJoining;
  }

  public double getSalary() {
    return salary;
  }

  public void setSalary(double salary) {
    this.salary = salary;
  }

  public String getNumber() {
    return number;
  }

  public void setNumber(String number) {
    this.number = number;
  }

  @Override
  public String toString() {
    return "Employee{" +
            "id=" + id +
            ", name='" + name + '\'' +
            ", age=" + age +
            ", gender='" + gender + '\'' +
            ", department='" + department + '\'' +
            ", yearOfJoining=" + yearOfJoining +
            ", salary=" + salary +
        ", NUmber=" + number +
            '}';
  }

  @Override
  public int compareTo(Employee employeeCompare) {
    if (this.getId() == employeeCompare.getId()){
      return 1;
    } else if (this.getId() > employeeCompare.getId()) {
      return 0;
    }
    else
      return -1;
  }
}
