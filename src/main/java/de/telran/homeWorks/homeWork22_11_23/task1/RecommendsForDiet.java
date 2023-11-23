package de.telran.homeWorks.homeWork22_11_23.task1;




public class RecommendsForDiet {

    public void getMonth(Months months){

        switch (months) {
            case DECEMBER:
            case JANUARY:
            case FEBRUARY:
                winter();
                break;
            case MART:
            case APRIL:
            case MAY:
                spring();
                break;
            case JUNE:
            case JULY:
            case AUGUST:
                summer();
                break;
            case SEPTEMBER:
            case OCTOBER:
            case NOVEMBER:
                autumn();
                break;


        }
    }
    private void autumn(){
        System.out.println("Осенью рекомендуется обратить внимание на сезонные овощи и " +
                " корнеплоды, так как в них находится много витаминов для укрепления иммунитета");
    }
    private void summer(){
        System.out.println("Летом рекомендуется употреблять в пищу легкие блюда и пить " +
                " больше воды, так как организм теряет много жидкости");

    }
    private void spring() {
        System.out.println("Весной рекомендуется есть больше ягод и фруктов, чтобы восстановить" +
                " иммунитет после зимы ");
    }

    private void winter() {
        System.out.println("Зимой рекомендуется есть более калорийную пищу," +
                "так как на согрев тела организму требуется больше энергии");
    }

}
