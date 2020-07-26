package exception;

import java.util.Scanner;

public class CustomException {
    public static void main(String[] args) throws InvalidForVoteException{
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your age: ");
        int age = scanner.nextInt();
        if (age<18) {
            throw new InvalidForVoteException("not valid age for voting");

        } else {
            System.out.println("you are eligible to vote");
        }
    }
}

class InvalidForVoteException extends Exception {
    InvalidForVoteException(String s) {
        super(s);
    }
}
