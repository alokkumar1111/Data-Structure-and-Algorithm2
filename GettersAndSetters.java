class BankAccount{
    private String AccountNumber;
    private double balance;
    private String pin;
    
    
    public BankAccount(String AccountNumber, double initialBalance, String pin){
        this.AccountNumber=AccountNumber;
        this.balance=initialBalance;
        this.pin=pin;
    }
    
    
    public String getAccountNumber(){
        return AccountNumber;
    }
    
    public double getBalance(String enteredPin){
        if(enteredPin.equals(pin)){
            return balance;
        }
        else{
            System.out.println("Incorrect Pin entered");
            return -1;
        }
    }
    
    
    public void setBalance(double amount, String enteredPin){
        if(!enteredPin.equals(pin)){
            System.out.println("Wrong Pin. Deposit Failed");
            return;
        }
        
        if(amount>0){
            balance+=amount;
            System.out.println("Amount Deposited");
        }else{
            System.out.println("Invalid Deposit AMount");
        }
    }
    
    
    public void setPin(String oldPin, String newPin){
        if(oldPin.equals(pin)){
            pin=newPin;
            System.out.println("Pin Updated");
        }else{
            System.out.println("Pin entered is Incorrect!");
        }
    }
}


class Main{
    public static void main(String ar[]){
        BankAccount myAccount=new BankAccount("SBI12345", 53000, "7909");
    
    
        System.out.println("Account Number: "+myAccount.getAccountNumber());
    
        System.out.println("Current Account Balance: "+myAccount.getBalance("7909"));
        System.out.println("Current Account Balance: "+myAccount.getBalance("7908"));
    
        myAccount.setBalance(50000, "1234");
        myAccount.setBalance(50000, "7909");
    
        myAccount.setPin("7909", "8907");
    
        System.out.println("Balance: "+myAccount.getBalance("8907"));
    }
}
