package de.telran.homeWorks.year2024.homeWork17_01_24;

public class HomeWork17_01_24 {
    public static void main(String[] args)  {

        String login = "Nina_0919";
        String password = "ninochKa_0919";
        String confirmPassword = "ninochKa_0919";

        try {
            boolean isRight = checkLoginAndPassword(login,password,confirmPassword);
            System.out.println(isRight);
        } catch (WrongLoginException | WrongPasswordException e){
            System.out.println(e.getMessage());
        }




    }

    private static boolean checkLoginAndPassword(String login, String password, String confirmPassword)
            throws WrongLoginException, WrongPasswordException{
        try {
            if(!login.matches("[A-Za-z0-9_]+") || login.length() >= 20){
                throw  new WrongLoginException();

            }
            if (!password.matches("[A-Za-z0-9_]+") || password.length() >= 20 || !password.equals(confirmPassword)){
                throw new WrongPasswordException();
            }

        } catch (WrongLoginException | WrongPasswordException e){
            return false;
        }
        return true;
    }


}

class WrongLoginException extends Exception{

        public WrongLoginException(){
        super("Wrong login");
    }
    public WrongLoginException(String message){
        super(message);
    }
}

class WrongPasswordException extends Exception{

    public WrongPasswordException(){
        super("Wrong password");
    }
    public WrongPasswordException(String message){
        super(message);
    }
}
