package de.telran.homeWorks.year2023.homeWork20_12_23.task4;

import java.util.*;
import java.util.stream.Collectors;

public class Office {
    public static void main(String[] args) {
        List<Employee> employeeList = new ArrayList<>();
        employeeList.add(new Employee("Ivanov","Ivan","Ivanovich",
                "Soft engineer","IT Department",7700));
        employeeList.add(new Employee("Smirnova","Elena","Vladimirovna",
                "Accountant","Finance Department",3500));
        employeeList.add(new Employee("Kusnetzov","Andrey","Sergeevich",
                "Programmer","IT Department",6500));
        employeeList.add(new Employee("Popova","Anastasia","Viktorovna",
                "Financial analyst","Finance Department",4300));
        employeeList.add(new Employee("Petrova","Olga","Ivanovna",
                "HR Manager","HR Department",5000));
        employeeList.add(new Employee("Vasiliev","Dmitriy","Sergeevich",
                "Finance Manager","Management",7500));
        employeeList.add(new Employee("Sokolov","Sergey","Vladimirovich",
                "Programmer","IT Department",5300));
        employeeList.add(new Employee("Mihailova","Alexandra","Olegovna",
                "Web Designer","IT Department",3000));
        employeeList.add(new Employee("Novikov","Kirill","Andreevich",
                "Managing Director ","Management",9900));
        employeeList.add(new Employee("Fedorova","Ekaterina","Vasilievna",
                "Accountant","Finance Department",4000));

        System.out.println("Задание1. Вычислить среднюю зарплату всех сотрудников");
        double averageSalary = employeeList.stream()
                .mapToDouble(Employee::getSalary)
                .average()
                .orElse(0);
        System.out.println("Средняя заработная плата всех сотрудников -> "+averageSalary+" евро");

        System.out.println("Задание2. Получить список сотрудников с зп > 1000 (выведу список выше 4000)");

        List<Employee> employeesWithSalaryMore4000 = employeeList.stream()
                .filter(e-> e.getSalary() >4000)
                .toList();
        System.out.println("Список сотрудников с заработной платой более 4000 евро: ");
        employeesWithSalaryMore4000.stream()
                .forEach(System.out::println);

        System.out.println("Задание3. Получить список сотрудников из отдела маркетинг (меняю на фин.отдел) " +
                " и увеличить зп на 15%");

        List<Employee> employeesFromFinance = employeeList.stream()
                .filter(e -> e.getDepartment().equals("Finance Department"))
                .peek(e -> e.setSalary((e.getSalary()) * 1.15))
                .toList();
        System.out.println("Список сотридников фин.отдела с увеличенной заработной платой:");
        employeesFromFinance.stream()
                .forEach(System.out::println);


        System.out.println("Задание4. Получить сотрудника с самой низкой зп ");

        Optional<Employee> minSalary = employeeList.stream()
                .min(Comparator.comparingDouble(Employee::getSalary));
        System.out.println("Сотрудник с самой маленькой заработной платой -> "+ minSalary);

        System.out.println("Задание5. Получить сотрудника с самой высокой зп ");
        Optional<Employee> maxSalary = employeeList.stream()
                .max(Comparator.comparingDouble(Employee::getSalary));
        System.out.println("Сотрудник с самой высокой заработной платой -> "+ maxSalary);

        System.out.println("Задание6. Получите сотрудников из всех отделов с максимальной зп ");
        List<Optional<Employee>> bigestSalaries = new ArrayList<>();

        Optional<Employee> bigestSalaryFromIT = employeeList.stream()
                .filter(e -> e.getDepartment().equals("IT Department") )
                .max(Comparator.comparingDouble(Employee::getSalary));
        bigestSalaries.add(bigestSalaryFromIT);

        Optional<Employee> bigestSalaryFromFinance = employeeList.stream()
                .filter(e -> e.getDepartment().equals("Finance Department") )
                .max(Comparator.comparingDouble(Employee::getSalary));
        bigestSalaries.add(bigestSalaryFromFinance);

        Optional<Employee> bigestSalaryFromHR = employeeList.stream()
                .filter(e -> e.getDepartment().equals("HR Department") )
                .max(Comparator.comparingDouble(Employee::getSalary));
        bigestSalaries.add(bigestSalaryFromHR);

        Optional<Employee> bigestSalaryFromManagement = employeeList.stream()
                .filter(e -> e.getDepartment().equals("Management") )
                .max(Comparator.comparingDouble(Employee::getSalary));
        bigestSalaries.add(bigestSalaryFromManagement);

        System.out.println("Список сотрудников с самой большой заработной платой из каждого отдела :");
        bigestSalaries.stream()
                .forEach(System.out::println);

        System.out.println("Задание7. Сгруппировать сотрудников по должности ");
        Map<String, List<Employee>> grupping = employeeList.stream()
                .collect(Collectors.groupingBy(Employee::getPosition));

        System.out.println("Сотрудники, сгруппированные по должности: ");
       grupping.forEach((department, employee)->System.out.println(department+" "+employee));


        }









    }

