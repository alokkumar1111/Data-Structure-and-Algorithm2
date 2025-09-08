import java.util.*;
class BankAccount{
    
    private double balance;
    private String pin;
    BankAccount(double balance, String pin){
        this.balance=balance;
        this.pin=pin;
    }
    
    
    public void deposit(double amount){
        if(amount>0){
            balance+=amount;
            System.out.println("Deposited: "+amount);
        }
        else{
            System.out.println("Inavalid deposit amount");
        }
    }
    
    
    public void withdraw(double amount, String enteredPin){
        if(pin.equals(enteredPin)){
            balance-=amount;
            System.out.println("Amount Withdrawn: "+amount);
        }
        else{
            System.out.println("Wrong Pin entered.");
        }
    }
    
    
    public void changePin(String oldPin, String newPin){
        if(pin.equals(oldPin)){
            pin=newPin;
            System.out.println("Pin Updated Successfully!");
        }
        else{
            System.out.println("Wrong Pin entered");
        }
    }
    
    public void checkBalance(String enteredPin){
        if(pin.equals(enteredPin)){
            System.out.println("Current Balance is: "+balance);
        }
        else{
            System.out.println("Wrong pin entered.");
        }
    }
}


class Main{
    public static void main(String[] ar){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your pin: ");
        String pin=sc.nextLine();
        BankAccount account=new BankAccount(359075.88,"763887");
        account.checkBalance(pin);
        
        
        account.deposit(5000);
        account.checkBalance(pin);
        
        account.withdraw(200, "979897");
        account.withdraw(200, "763887");
        
        account.changePin("763886","947008");
        account.changePin("763887","947008");
        account.checkBalance("947008");
    }
}
