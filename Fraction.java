public class Fraction {
    int nummerator;
    int denominator;
    public Fraction(int nummerator, int denominator){
        this.nummerator = nummerator;
        if (denominator==0) {
            throw new IllegalArgumentException("Denominator cannot be zero.");
        }
        this.denominator = denominator;
    }
    public int getNummerator(){
        return nummerator;
    }
    public int getDenominator(){
        return denominator;
    }
    private int findGCD(int a, int b) {
        if (b == 0) {
            return a;
        }
        return findGCD(b, a % b);
    }

    public void simplify() {
        //Tìm ước chung lớn nhất
        int gcd = findGCD(nummerator, denominator);
        // Rút gọn
        nummerator /= gcd;
        denominator /= gcd;
    }
    //Cộng phân số
    public Fraction add(Fraction other) {
        int newNumerator = this.nummerator * other.denominator + other.nummerator * this.denominator;
        int newDenominator = this.denominator * other.denominator;
        return new Fraction(newNumerator, newDenominator);
    }

    //Trừ phân số
    public Fraction subtract(Fraction other) {
        int newNumerator = this.nummerator * other.denominator - other.nummerator * this.denominator;
        int newDenominator = this.denominator * other.denominator;
        return new Fraction(newNumerator, newDenominator);
    }
    //Nhân phân số
    public Fraction multiply(Fraction other) {
        int newNumerator = this.nummerator * other.nummerator;
        int newDenominator = this.denominator * other.denominator;
        return new Fraction(newNumerator, newDenominator);
    }
    // Chia phân số
    public Fraction divide(Fraction other) {
        int newNumerator = this.nummerator * other.denominator;
        int newDenominator = this.denominator * other.nummerator;
        return new Fraction(newNumerator, newDenominator);
    }
}
