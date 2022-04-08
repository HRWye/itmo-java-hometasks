package ru.itmo.hometasks.hwlesson14;

import java.util.Comparator;
import java.util.List;
import java.util.TreeSet;

public class EmployeeApp {
    public static void main(String[] args) {
        Comparator<Employee> employeeNameComparator = new NameComparator();
        Comparator<Employee> employeeNameAndSalaryComparator = new NameComparator().thenComparing(new SalaryComparator());
        Comparator<Employee> employeeNameAndSalaryAndAgeAndCompanyComparator = new NameComparator().thenComparing(new SalaryComparator()).thenComparing(new AgeComparator()).thenComparing(new CompanyComparator());

        List<Employee> employeesForSorting = Employee.employeeGenerator(10);
        System.out.println(employeesForSorting);

        System.out.println("Сортировка по имени:");
        TreeSet<Employee>employeeTreeSet1=new TreeSet<>(employeeNameComparator);
        employeeTreeSet1.addAll(employeesForSorting);
        System.out.println(employeeTreeSet1);

        System.out.println("Сортировка по имени и зарплате:");
        TreeSet<Employee>employeeTreeSet2=new TreeSet<>(employeeNameAndSalaryComparator);
        employeeTreeSet2.addAll(employeesForSorting);
        System.out.println(employeeTreeSet2);

        System.out.println("Сортировка по имени, зарплате, возрасту и компании:");
        TreeSet<Employee>employeeTreeSet3=new TreeSet<>(employeeNameAndSalaryAndAgeAndCompanyComparator);
        employeeTreeSet3.addAll(employeesForSorting);
        System.out.println(employeeTreeSet3);
    }
}
