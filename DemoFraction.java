public class DemoFraction {
    public static void main(String[] args) {
        // Tạo hai đối tượng phân số
        Fraction fraction1 = new Fraction(6, 4);
        Fraction fraction2 = new Fraction(2, 5);
        // Rút gọn
        fraction1.simplify();
        fraction2.simplify();
        // In ra tử số và mẫu số của hai phân số 
        System.out.println("Fraction 1: " + fraction1.getNummerator() + "/" + fraction1.getDenominator());
        System.out.println("Fraction 2: " + fraction2.getNummerator() + "/" + fraction2.getDenominator());

        // Thực hiện phép cộng hai phân số
        Fraction sum = fraction1.add(fraction2);
        sum.simplify();
        System.out.println("Sum: " + sum.getNummerator() + "/" + sum.getDenominator());

        // Thực hiện phép trừ hai phân số
        Fraction difference = fraction1.subtract(fraction2);
        difference.simplify();
        System.out.println("Difference: " + difference.getNummerator() + "/" + difference.getDenominator());

        // Thực hiện phép nhân hai phân số
        Fraction product = fraction1.multiply(fraction2);
        product.simplify();
        System.out.println("Product: " + product.getNummerator() + "/" + product.getDenominator());

        // Thực hiện phép chia hai phân số
        Fraction quotient = fraction1.divide(fraction2);
        quotient.simplify();
        System.out.println("Quotient: " + quotient.getNummerator() + "/" + quotient.getDenominator());

        System.out.println("End program");
        System.out.println("byeeeeeeeeeeeeeeeeeeeeeee!!");
    }
}