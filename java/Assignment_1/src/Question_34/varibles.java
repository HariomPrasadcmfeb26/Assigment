package Question_34;

public class varibles {
    public static void main(String [] args){
        byte bMin = Byte.MIN_VALUE, bMax = Byte.MAX_VALUE;
        short sMin = Short.MIN_VALUE, sMax = Short.MAX_VALUE;
        int iMin = Integer.MIN_VALUE, iMax = Integer.MAX_VALUE;
        long lMin = Long.MIN_VALUE, lMax = Long.MAX_VALUE;

        float fMin = Float.MIN_VALUE, fMax = Float.MAX_VALUE;
        double dMin = Double.MIN_VALUE, dMax = Double.MAX_VALUE;

        char cMin = Character.MIN_VALUE, cMax = Character.MAX_VALUE;

        boolean bool1 = true, bool2 = false;

        // Printing values
        System.out.println("Byte range: " + bMin + " to " + bMax);
        System.out.println("Short range: " + sMin + " to " + sMax);
        System.out.println("Int range: " + iMin + " to " + iMax);
        System.out.println("Long range: " + lMin + " to " + lMax);

        System.out.println("Float range: " + fMin + " to " + fMax);
        System.out.println("Double range: " + dMin + " to " + dMax);

        System.out.println("Char range: " + (int)cMin + " to " + (int)cMax);

        System.out.println("Boolean values: " + bool1 + " or " + bool2);
    }
}