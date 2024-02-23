package de.telran.homeWorks.year2024.HWPractice14_02_24.library.service.cashService;

import de.telran.homeWorks.year2024.HWPractice14_02_24.library.data.dto.Book;
import de.telran.homeWorks.year2024.HWPractice14_02_24.library.data.dto.User;

import java.util.HashMap;
import java.util.Map;


public class UsersMap implements UsersCash {

     public static Map<Integer,User> USERS_MAP = new HashMap<>();
    private User user;
    private static int COUNTER_ID =1;

    public UsersMap(User user) {
        this.user = user;
    }


    @Override
    public void addUser(User user) {
        USERS_MAP.put(COUNTER_ID++,user);
    }
}
