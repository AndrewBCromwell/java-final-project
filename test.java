import java.math.BigInteger;




public class test {
    public static void main(String[] args) {
        // primative / non-class
        // have limits
        
        int i = Integer.MAX_VALUE;
        i++; // wrap-around

        byte b = Byte.MAX_VALUE;
        byte bb = Byte.MIN_VALUE;
        System.out.println(b + " " + bb + " " + bb-- );

        float f = Float.MAX_VALUE;
        float ff = Float.MIN_VALUE;
        double d = Double.MAX_VALUE;
        double dd = Double.MIN_VALUE;

        long l = 1200000000000000000L; // L shows that this is a long

        // class data type
        // + - * / only work on primative data. must use method
        String s = "Hello";

        BigInteger bi = new BigInteger("999999999999999999");
        BigInteger bi2 = new BigInteger("999999999999999999");
        System.out.println(bi.multiply(bi2)); // can't use normal ints

        // Math class

        System.out.println(Math.PI);
        System.out.println(Math.abs(-8));
        Math.ceil(5.69); // round up
        Math.floor(5.69); // round dow
        Math.round(5.69); //rounds normaly
        Math.max(5, 7); // returns the greater of 2 ints
        Math.sqrt(16);
        Math.pow(16, 0.5);
        
    }
    
}
