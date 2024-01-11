package de.telran.homeWorks.year2023.homeWork06_12_23.task_2;


import lombok.*;

import java.time.LocalDateTime;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
@EqualsAndHashCode

public class Ticket implements Comparable<Ticket>{
    private String lastName;
    private String firstName;

    private BankOperation bankOperation;
    static LocalDateTime time;
     private int bithYear;

     private int ticketNumber;

    public boolean agePerson() {
        if ( timeIsPriority() || 2023 - bithYear >= 65) {
            return true;
        } return false;
    }

    public boolean timeIsPriority() {
        return 10 <= LocalDateTime.now().getHour() && LocalDateTime.now().getHour() <= 12;
    }



    @Override
    public int compareTo(Ticket o) {
        if(this.ticketNumber>o.ticketNumber)
        return 1;
        if (this.ticketNumber<o.ticketNumber)
            return -1;
        return 0;

    }
}
enum BankOperation{
    CONSULTATION,
    RESEIVING_MONEY,
    INVESTING_MONEY,
    DEPOSIT_OPEN,
    DEPOSIT_CLOSED,
    CREDIT,
    UTILITY_BILLS

}






