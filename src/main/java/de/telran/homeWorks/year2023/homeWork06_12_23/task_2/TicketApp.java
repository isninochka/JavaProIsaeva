package de.telran.homeWorks.year2023.homeWork06_12_23.task_2;



import java.util.*;


public class TicketApp {


    public static void main(String[] args) {

        // сортировка с помощью логики по умолчанию
        TreeSet<Ticket> tickets = new TreeSet<>();
        tickets.add(new Ticket("Ivanov", "Ivan", BankOperation.CONSULTATION, 1980, 2));
        tickets.add(new Ticket("Petrov", "Petr", BankOperation.DEPOSIT_OPEN, 1977, 3));
        tickets.add(new Ticket("Sidorov", "Sidr", BankOperation.UTILITY_BILLS, 1956, 1));
        tickets.add(new Ticket("Alexandrova", "Alexandra", BankOperation.DEPOSIT_CLOSED, 1955, 5));
        tickets.add(new Ticket("Vasilieva", "Vasilisa", BankOperation.INVESTING_MONEY, 1985, 7));
        System.out.println(tickets);

        List<Ticket>priority = new ArrayList<>();
        // приоритет по операциям и сортировка по номеру билета
        for (Ticket ticket:tickets) {
            if(ticket.getBankOperation().equals(BankOperation.DEPOSIT_OPEN) ||
                    ticket.getBankOperation().equals(BankOperation.INVESTING_MONEY)){
                priority.add(ticket);
            }
        }


        priority.sort(Comparator.comparing(Ticket::getTicketNumber));
        System.out.println(priority);
        // приоритет по возрасту в период с 10 до 12 и сортировка по номеру билета

        for (Ticket ticket:tickets) {
            if(ticket.timeIsPriority() && ticket.agePerson()){
                priority.add(ticket);
            }
        }

        priority.sort(Comparator.comparing(Ticket::getTicketNumber));
        System.out.println(priority);




    }
}
