public class App {
    public static void main(String[] args) throws Exception {
        // Variables: A container that stores data values.
        int x = 10; //int is data type, with range -2^31 to 2^31-1 (4 bytes)
        byte y = 10; //byte is data type, with range -128 to 127 (1 byte)
        short z = 10; //short is data type, with range -2^15 to 2^15-1 (2 bytes)
        long a = 10; //long is data type, with range -2^63 to 2^63-1 (8 bytes)
        double b = 10.5; //double is data type, with range 4.9e-324 to 1.8e+308 (8 bytes)
        float c = 10.5f; //float is data type, with range 1.4e-045 to 3.4e+038 (4 bytes)
        char d = 'A'; //char is data type, with range 0 to 65535 (2 bytes)
        boolean e = true; //boolean is data type, with range true or false (1 bit)
        System.out.println("yo " + x + ", " + y + ", " + z + ", " + a + ", " + b + ", " + c + ", " + d + ", " + e);

        // Modulus Operator: Returns the division remainder.
        System.out.println(10 % 3); // 10 divided by 3 = 3, 3*3=9, 10-9=1

        // Operator Precedence: PEMDAS (Parentheses, Exponents, Multiplication and Division, Addition and Subtraction)
        System.out.println(6 + 8 / 2 * 2);

        // Real Numbers: float and double
        System.out.println(10.5 / 3);

        //Increment and Decrement Operators
        int f = 1;
        f++; // f = f + 1
        f--; // f = f - 1
        System.out.println(f);

        // Type Casting: Converting a value from one data type to another.
        double result = (double) 10 / 3; //output is 3.3333333333333335
        int truncated = (int) 10.5; //output is 10
        System.out.println(result + ", " + truncated);

        // String concatenation
        String firstName = "John";
        String lastName = "Doe";
        System.out.println(firstName + " " + lastName);

    }
}
