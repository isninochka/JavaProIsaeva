package de.telran.homeWorks.homeWork20_12_23.task4;

import lombok.*;


@AllArgsConstructor
@Getter
@Setter
@ToString
@EqualsAndHashCode
public class Employee {
    private String  surname, name, patronymic;
    private String position;
    private String department;
    private double salary;
}
