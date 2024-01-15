package de.telran.module_5.lesson_1;

import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class SimpleRegular {
    public static void main(String[] args) {
        String regex = ".*www.*";
        String actualString ="www.telran.detel";
        Pattern pattern = Pattern.compile(regex);
        Matcher matches = pattern.matcher(actualString);
        System.out.println(matches);
        System.out.println(Pattern.matches(regex,actualString));

        Pattern pattern1 = Pattern.compile("tel");
        Matcher matches2 = pattern1.matcher(actualString);
        while (matches2.find()){
            System.out.println("Starting Pattern -> "+ matches2.start()+ " finishing "+matches2.end());
        }
        String regexError ="([a-z])";
        Pattern patternError = Pattern.compile(regexError);


        Pattern patternInsens =Pattern.compile("и",Pattern.CASE_INSENSITIVE);
        Matcher matcherInsens = patternInsens.matcher("Ирина искала ириску");
        while (matcherInsens.find()){
            System.out.println("Starting Pattern -> "+ matcherInsens.start()+ " finishing "+matcherInsens.end());
        }

        String text = "JLhkhhn3lnkg3jlj5jh1khs807ljjkjg";
        String delimeter ="\\d";
        Pattern splitPattern = Pattern.compile(delimeter);
        String[] arrStr = splitPattern.split(text);
        System.out.println(Arrays.toString(arrStr));

        text = "Егор Алла Александр";
        pattern = Pattern.compile("A.+a");
        matches = pattern.matcher(text);
        while (matches.find()){
            System.out.println(text.substring(matches.start(), matches.end()));
        }
    }
}
