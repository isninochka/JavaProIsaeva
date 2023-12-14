package de.telran.module_2.praktica13_12_23;

import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode
@Setter
@Getter
@ToString
public class Account {
private String accountNumber;
private Country country;
private Currency currency;
private boolean isDebit;
private double balance;
        }
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode
@Setter
@Getter
@ToString
class Bank {
    private Branch[] branches;
}
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode
@Setter
@Getter
@ToString
class Branch {
    private String branchName;
    private Empl[] employees;
}
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode
@Setter
@Getter
@ToString
class Empl {
    private String name;
    private String surName;
    private Account[] account;

    private Citizenship citizenship;
}

enum Country {
    GERMANY,
    RUSSIA,
    USA

}

enum Currency {
    EUR,
    RUR,
    USD

}

enum Citizenship {
    DE,
    RU,
    USA

}