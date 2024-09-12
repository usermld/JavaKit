

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


public class Main {
    public static void main(String[] args) {
        

            List<Employee> employees = createEmployee();
            System.out.println(findEmployeesByPhoneNumber(employees,"Mariya"));
    
    
        }
    
        public static List<Employee> createEmployee() {
            Employee employee1 = new Employee(1, "111111", "Petr", 1);
            Employee employee2 = new Employee(2, "222222", "Aleksandr", 9);
            Employee employee3 = new Employee(3, "3333333", "Vasiliyi", 5);
            Employee employee4 = new Employee(8, "444444", "Nikolayi", 2);
            Employee employee5 = new Employee(10, "5555555", "Mariya", 5);
            Employee employee6 = new Employee(10, "66666666", "Mihail", 5);
    
            List<Employee> employees = new ArrayList<>();
    
            Collections.addAll(employees, employee1, employee2, employee3, employee4, employee5,employee6);
    
            return employees;
        }
    
        public static List<Employee> findEmployeesByExp(List<Employee> employees, int exp) {
            List<Employee> employeeList = new ArrayList<>();
            for (Employee employee : employees) {
                if (employee.getExperience() == exp) {
                    employeeList.add(employee);
                }
            }
            return employeeList;
        }
    
        public static List<String> findEmployeesByPhoneNumber(List<Employee> employees, String Name) {
            List<String> list = new ArrayList<>();
            for (Employee employee : employees) {
                if (employee.getName().equals(Name)) {
                    list.add(employee.getPhoneNumber());
                }
            }
            return list;
        }
    
    
        public static List<Employee> findEmployeesByPersonnelNumber(List<Employee> employees, int personnelNumber) {
            List<Employee> employeeList = new ArrayList<>();
            for (Employee employee : employees) {
                if (employee.getPersonnelNumber() == personnelNumber) {
                    employeeList.add(employee);
                }
            }
            return employeeList;
        }
    
        public static List<Employee> addEmployee(List<Employee> employees, Employee employee) {
            employees.add(employee);
            return employees;
        }
    
    }

