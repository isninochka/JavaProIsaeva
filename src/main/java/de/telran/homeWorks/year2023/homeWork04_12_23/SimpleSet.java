package de.telran.homeWorks.year2023.homeWork04_12_23;

import java.util.*;

public class SimpleSet {
    public static void main(String[] args) {

        Set<Account> accountSet = new HashSet<>();
        accountSet.add(new Account(1,12,"Credit Account",
                03, 065,12500.00,1234));
        accountSet.add(new Account(2,28,"Credit Account",
                03, 065,5000.00,1234));
        accountSet.add(new Account(3,126,"Credit Account",
                03, 065,126000.00,1234));

        for (Account account : accountSet) {
            System.out.println(account);
        }


    }
}
