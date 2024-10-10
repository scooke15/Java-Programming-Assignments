package M03.Assignment2;
import java.math.BigInteger;

public class Rational extends Number implements Comparable<Rational> {
    // Data fields for numerator and denominator
    private BigInteger numerator = BigInteger.ZERO;
    private BigInteger denominator = BigInteger.ONE;
  
    /** Construct a rational with default properties */
    public Rational() {
      this(BigInteger.ZERO, BigInteger.ONE);
    }
  
    /** Construct a rational with specified numerator and denominator */
    public Rational(BigInteger numerator, BigInteger denominator) {
      BigInteger gcd = numerator.gcd(denominator);
      this.numerator = (denominator.compareTo(BigInteger.ZERO) > 0 ? BigInteger.ONE : new BigInteger("-1")).multiply(numerator).divide(gcd);
      this.denominator = denominator.abs().divide(gcd);
    }
  
    /** Find GCD of two numbers */
    @SuppressWarnings("unused")
    private static BigInteger gcd(BigInteger n, BigInteger d) {
      // BigInteger n1 = n.abs();
      // BigInteger n2 = d.abs();
      // int gcd = 1;
  
      // for (int k = 1; k <= n1 && k <= n2; k++) {
      //   if (n1 % k == 0 && n2 % k == 0)
      //     gcd = k;
      // }
  
      // return gcd;

      return n.gcd(d);
    }
  
    /** Return numerator */
    public BigInteger getNumerator() {
      return numerator;
    }
  
    /** Return denominator */
    public BigInteger getDenominator() {
      return denominator;
    }
  
    /** Add a rational number to this rational */
    public Rational add(Rational secondRational) {
      BigInteger n = numerator.multiply(secondRational.getDenominator()).add(denominator.multiply(secondRational.getNumerator()));

      BigInteger d = denominator.multiply(secondRational.getDenominator());
      return new Rational(n, d);
    }
  
    /** Subtract a rational number from this rational */
    public Rational subtract(Rational secondRational) {
      BigInteger n = numerator.multiply(secondRational.getDenominator()).subtract(denominator.multiply(secondRational.getNumerator()));

      BigInteger d = denominator.multiply(secondRational.getDenominator());
      return new Rational(n, d);
    }
  
    /** Multiply a rational number by this rational */
    public Rational multiply(Rational secondRational) {
      BigInteger n = numerator.multiply(secondRational.getNumerator());
      BigInteger d = denominator.multiply(secondRational.getDenominator());
      return new Rational(n, d);
    }
  
    /** Divide a rational number by this rational */
    public Rational divide(Rational secondRational) {
      BigInteger n = numerator.multiply(secondRational.getDenominator());
      BigInteger d = denominator.multiply(secondRational.numerator);
      return new Rational(n, d);
    }
  
    @Override
    public String toString() {
      if (denominator.equals(BigInteger.valueOf(1)))
        return numerator + "";
      else
        return numerator + "/" + denominator;
    }
  
    @Override // Override the equals method in the Object class
    public boolean equals(Object other) {
      if ((this.subtract((Rational)(other))).getNumerator().equals(BigInteger.valueOf(0)))
        return true;
      else
        return false;
    }
  
    @Override // Implement the abstract intValue method in Number
    public int intValue() {
      return (int)doubleValue();
    }
  
    @Override // Implement the abstract floatValue method in Number
    public float floatValue() {
      return (float)doubleValue();
    }
  
    @Override // Implement the doubleValue method in Number
    public double doubleValue() {
      return numerator.doubleValue() / denominator.doubleValue();
    }
  
    @Override // Implement the abstract longValue method in Number
    public long longValue() {
      return (long)doubleValue();
    }
  
    @Override // Implement the compareTo method in Comparable
    public int compareTo(Rational o) {
      if ((this.subtract(o).getNumerator()).compareTo(BigInteger.ZERO) > 0)
        return 1;
      else if ((this.subtract(o).getNumerator()).compareTo(BigInteger.ZERO) < 0)
        return -1;
      else
        return 0;
    }
  }
