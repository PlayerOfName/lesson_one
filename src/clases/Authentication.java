package clases;

import java.util.Scanner;
import java.util.regex.Pattern;

public class Authentication {

    public static boolean authenticate(String login, String password, String confirmPassword) throws WrongLoginException, WrongPasswordException {
        try {
            if (login.isEmpty() || login.length() >= 20 || !isValid(login)){
                throw new WrongLoginException("No correct login!");
            }
            if (password.isEmpty() || password.length() >= 20 || !isValid(password) || !password.equals(confirmPassword)){
                throw new WrongPasswordException("No correct password!");
            }
        }catch (WrongLoginException e){
            e.printStackTrace();
            return false;
        }catch (WrongPasswordException e){
            e.printStackTrace();
            return false;
        }
        return true;
    }

    public static boolean isValid(String str) {
        String regex = "^[a-zA-Z0-9_]+$";

        Pattern pattern = Pattern.compile(regex);

        return pattern.matcher(str).matches();
    }


    public static void main(String[] args) throws WrongLoginException, WrongPasswordException {
        Scanner scanner = new Scanner(System.in);
        String log = scanner.nextLine();
        String pass = scanner.nextLine();
        String confPass = scanner.nextLine();
        System.out.println(authenticate(log, pass, confPass));
    }
}
