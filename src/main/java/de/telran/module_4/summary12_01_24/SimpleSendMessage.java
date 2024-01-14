package de.telran.module_4.summary12_01_24;

public class SimpleSendMessage {
    public static void main(String[] args) {
        SendMessage message = new EMail();
        PrepareDate prepareDate = new PrepareDate();
        String data = prepareDate.prepareData(EMail.class);
        String report = message.generateReport(data);
        message.sendReport(report);

        data = prepareDate.prepareData(Viber.class);
        message = new Viber();
        report = message.generateReport(data);
        message.sendReport(report);


    }
}
class EMail implements SendMessage{

    @Override
    public String generateReport(String data) {
        return "Report is generate HTML for "
                + this.getClass().getName() + " -> " +data;
    }

    @Override
    public boolean sendReport(String report) {
        System.out.println("Report send to E-Mail -> " + report);
        return true;
    }
}
abstract class ReportText implements SendMessage{
    public String generateReport(String data) {
        return "Report is generate for "
                + this.getClass().getName() + " -> " +data;
    }
    public abstract boolean sendReport(String report);
}
class Telegram extends ReportText{

    @Override
    public boolean sendReport(String report) {
        System.out.println("Send Report to Telegram -> "+report);
        return true;
    }
}
class WhatsApp extends ReportText{

    @Override
    public boolean sendReport(String report) {
        System.out.println("Send Report to WhatsApp -> "+report);
        return true;
    }
}
class Viber extends ReportText{

    @Override
    public boolean sendReport(String report) {
        System.out.println("Send Report to Viber -> "+report);
        return true;
    }
}
interface SendMessage{
   String generateReport(String data);

   boolean sendReport(String report);
}
class PrepareDate{
    public <T> String prepareData (T canal){
        return "Cannel data "+ canal.toString();
    }
}