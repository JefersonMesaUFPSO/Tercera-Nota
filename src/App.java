public class App {
    public static class BankAccount {
        //Atributos
        String accountNumber;
        String owner;
        double balance;

        //Métodos
        public void deposit(double amount) {
            if (amount > 0) {
                balance += amount;
                System.out.println("Deposited $" + amount + ". New balance is $" + balance);
            } else {
                System.out.println("Deposit amount must be positive.");
            }
        }

        public void withdraw(double amount) {
            if (amount > 0 && amount <= balance) {
                balance -= amount;
                System.out.println("Withdrew $" + amount + ". New balance is $" + balance);
            } else if (amount > balance) {
                System.out.println("Insufficient funds for withdrawal.");
            } else {
                System.out.println("Withdrawal amount must be positive.");
            }
        }

        public void showBalance () {
            System.out.println("Current balance: $" + balance);
        }
    }
    public static void main(String[] args) throws Exception {
        BankAccount account1 = new BankAccount();
        account1.owner = "yisus";
        account1.accountNumber = "123456789";
        account1.balance = 1500000;

        account1.deposit(5000000);

        System.out.println(account1.owner + " has an account with number " + account1.accountNumber + " and a balance of $" + account1.balance);
    }
}




