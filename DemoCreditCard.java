public class DemoCreditCard{
    public static void main(String[] args) {
        CreditCard myCreditCard = new CreditCard("Bui_Minh_Duc", "VietComBank","9999999999" , 5000000, 1000000);
        // In ra thông tin tóm tắt của thẻ ghi nợ
        System.out.println("Credit Card Summary:");
        CreditCard.printSummary(myCreditCard);
        // Thực hiện một số giao dịch
        myCreditCard.charge(200000.0); // Nạp tiền vào thẻ lần 1
        myCreditCard.charge(800000.0); // Nạp tiền vào thẻ lần 2
        // In ra thông tin tóm tắt của thẻ sau các giao dịch
        System.out.println("Credit Card Summary after transactions:");
        CreditCard.printSummary(myCreditCard);
        // Thực hiện thanh toán nợ ngân hàng từ thẻ ghi nợ
        double paymentAmount = 500000.0;
        myCreditCard.makePayment(paymentAmount);
        // In ra thông tin tóm tắt của thẻ sau khi thanh toán
        System.out.println("Credit Card Summary after payment:");
        CreditCard.printSummary(myCreditCard);
    }
}