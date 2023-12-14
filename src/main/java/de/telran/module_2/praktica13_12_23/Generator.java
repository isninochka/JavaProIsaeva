package de.telran.module_2.praktica13_12_23;


import java.util.Random;

public class Generator {

    private static final Random RANDOM = new Random();

    public static Currency getRandomCurrency() {
        Currency[] currencies = Currency.values();
        return currencies[RANDOM.nextInt(currencies.length)];
    }

    public static Country getRandomCountry() {
        Country[] countries = Country.values();
        return countries[RANDOM.nextInt(countries.length)];
    }

    public static Citizenship getRandomCitizenship() {
        Citizenship[] citezenships = Citizenship.values();
        return citezenships[RANDOM.nextInt(citezenships.length)];

    }


    public double sumBalances(Account[] accounts) {
        double sum = 0;
        for (Account value : accounts) {
            sum += value.getBalance();
        }
        return sum;
    }


}
