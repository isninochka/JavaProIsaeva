package de.telran.homeWorks.homeWork08_12_23.task_1_2;

public class StoreEmployees implements Loader, Storekepper{

        @Override
        public void loadsProducts() {
            System.out.println("Грузчик - Загружаю продукцию");
        }

        @Override
        public void unloadsProducts() {
            System.out.println("Грузчик - Разгружаю продукцию");
        }

        @Override
        public void placesProducts() {
            System.out.println("Грузчик - Размещаю продукцию на складе");
        }

        @Override
        public void releasesProducts() {
            System.out.println("Кладовщик - Оформляю накладную и отпускаю товар");

        }

        @Override
        public void acceptsProducts() {
            System.out.println("Кладовщик - принимаю товар и сверяю с накладной");
        }

        @Override
        public void recordsProducts() {
            System.out.println("Кладовщик - веду учет товара");
        }
    }

