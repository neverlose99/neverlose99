/**
 * CreditCard
 */
public class CreditCard {

    private String customer;
    private String bank;
    private String account;
    int limit;
    double balance;

    public CreditCard(String customer, String bank, String account, int limit, double balance){
        this.customer = customer;
        this.bank = bank;
        this.account = account;
        this.limit = limit;
        this.balance = balance;
    }
    public CreditCard(String customer, String bank, String account){
        this.customer = customer;
        this.bank = bank;
        this.account = account;
    }
    //Sử dụng phương thức get để lấy dữ liệu truy xuất vào biến tham chiếu private.
    //Từ bên ngoài lớp thì không thể tuy xuất vào private nên phải dùng phương thức để truy xuất
    public String getCustomer() {
        return customer;
    }

    public String getBank() {
        return bank;
    }

    public String getAccount() {
        return account;
    }

    public int getLimit() {
        return limit;
    }

    public double getBalance() {
        return balance;
    }
    public CreditCard(CreditCard creditCard){
        this.customer = creditCard.getCustomer();
        this.bank = creditCard.getBank();
        this.account = creditCard.getAccount();
        this.limit = creditCard.getLimit();
        this.balance = creditCard.getBalance();
    }
    public static void printSummary(CreditCard creditCard) {
        System.out.println("Customer: " + creditCard.getCustomer());
        System.out.println("Bank: " + creditCard.getBank());
        System.out.println("Account: " + creditCard.getAccount());
        System.out.println("Limit: " + creditCard.getLimit());
        System.out.println("Balance: " + creditCard.getBalance());
    }
    public boolean charge(double price) {
        if (price + balance > limit) {
            System.out.println("Transaction failed. Charge amount exceeds credit limit.");
            return false;
        } else {
            balance += price;
            System.out.println("Transaction successful. Charged " + price + " to the card.");
            return true;
        }
    }
    public void makePayment(double amount) {
        balance -= amount;
        System.out.println("Payment of " + amount + " successfully made.");
    }
}
    