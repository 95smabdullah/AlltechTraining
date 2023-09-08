package Day3.problem3;

public class BankAccount {
    int accNo;
    String custName;
    String accType;
    float balance;


    public BankAccount(int accNo, String custName, String accType, float balance) {
        this.accNo = accNo;
        this.custName = custName;
        this.accType = accType;
        try {
            if ((this.accType.equalsIgnoreCase("Savings") & balance < 1000) | (this.accType.equalsIgnoreCase("Current") & balance < 5000)) {
                throw new CustomExceptions.LowBalanceException("The Balance: " + balance + " is below the required minimum balance");

            } else {
                this.balance = balance;

            }
        }
        catch(CustomExceptions e){
                System.out.println(e);
            }
        }




    public  void deposit(float amt){
        try{
            if(amt<0){
                System.out.println("Deposit Failed");
                throw new CustomExceptions.NegativeAmount("The deposit amount has to be positive");
            }
            else{
                this.balance+=amt;
                System.out.println("New balance = "+this.balance);
            }
        } catch (CustomExceptions e) {
            System.out.println(e);
        }


    }
    public void withdraw(float amt) {
        try{
            if(amt<0){
                System.out.println("Withdrawal Failed");
                throw new CustomExceptions.NegativeAmount("The withdrawal amount has to be positive");
            } else if ((this.accType.equalsIgnoreCase("Savings") & this.balance-amt <1000) | (this.accType.equalsIgnoreCase("Current") & this.balance-amt <5000)){
                System.out.println("Withdrawal Failed");
                throw new CustomExceptions.InsufficientFunds("Insufficient funds in account");
            } else {
                this.balance-=amt;
                System.out.println("Withdrawal Successful\n New Balance is: "+ this.balance);
            }
        } catch (CustomExceptions e) {
            System.out.println(e);
        }

    }
    public float getBalance(){
        try{
            if ((this.accType.equalsIgnoreCase("Savings") & this.balance <1000) | (this.accType.equalsIgnoreCase("Current") & this.balance <5000)){
                throw new CustomExceptions.LowBalanceException("Current Balance: "+this.balance+" is below the required minimum balance please deposit required amt to avoid charges");
                
            }
        } catch (CustomExceptions.LowBalanceException e) {
            System.out.println(e);
        }

        return balance;
    }
}
