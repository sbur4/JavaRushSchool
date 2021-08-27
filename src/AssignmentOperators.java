
public class AssignmentOperators {

    public static void main(String[] args) {
        move2TimesRight();
        move2TimesLeft();

    }

    public static void move2TimesRight() {
        int x = 5;
        String value = Integer.toBinaryString(x);
        System.out.println(value);
        x <<= 3; // => 0101 => 0010 1000
        System.out.println(x);// 40
        String value2 = Integer.toBinaryString(x);
        System.out.println(value2);
        System.out.println("-----");
    }

    public static void move2TimesLeft() {
        int x = 5;
        String value = Integer.toBinaryString(x);
        System.out.println(value);
        x >>= 3; // => 0101 => 0000
        System.out.println(x);// 0
        String value2 = Integer.toBinaryString(x);
        System.out.println(value2);
        System.out.println("-----");
    }

}