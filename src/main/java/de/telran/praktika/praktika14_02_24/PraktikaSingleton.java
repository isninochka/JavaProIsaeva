package de.telran.praktika.praktika14_02_24;

public class PraktikaSingleton {
        private static final PraktikaSingleton INSTANCE = new PraktikaSingleton();

        protected PraktikaSingleton() {}

        public static PraktikaSingleton getStringVonSingleton(String string) {
            System.out.println(string);
        return INSTANCE;
        }

    public static void main(String[] args) {
        getStringVonSingleton("This String");

    }

    }

