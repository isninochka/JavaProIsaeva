package de.telran.module_3.lesson_2.practice;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
public class SimpleHTTPStatus {
    public static void main(String[] args) {
        //void findCode(int code, HTTPCodes codes)
        HTTPCodes.findValueByCode(101);
        HTTPCodes.findValueByCode(250);
        HTTPCodes.findValueByCode(333);
        HTTPCodes.findValueByCode(404);
        HTTPCodes.findValueByCode(599);

        List<HTTPCodes> codes = new ArrayList<>();
        codes.stream();







//        Function<Integer,String> function = (errorNumber) -> {
//            return System.out.println((errorNumber > 100 && errorNumber < 199) ?
//                    " принадлежит INFORMATIONAL группе в перечислении HttpCodes." :
//                    (errorNumber > 200 && errorNumber < 299) ?
//                            " принадлежит SUCCESS группе в перечислении HttpCodes." :
//                            (errorNumber > 300 && errorNumber < 399) ?
//                                    " принадлежит REDIRECTION группе в перечислении HttpCodes." :
//                                    (errorNumber > 400 && errorNumber < 499) ?
//                                            " принадлежит CLIENT_ERROR группе в перечислении HttpCodes." :
//                                            (errorNumber > 500 && errorNumber < 599) ?
//                                                    " принадлежит SERVER_ERROR группе в перечислении HttpCodes."
//            );
//        };
//        function.apply(101);

    }
}
