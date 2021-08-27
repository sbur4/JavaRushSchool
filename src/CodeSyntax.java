
public class CodeSyntax {

    public static void main(String[] args) {
        syntax2();
        syntax8();
        syntax10();
        syntax16();
    }

    public static void syntax2() {
        // 0 1
        int x = 0b1111; // => 1x2^4+1x2^2+1x2^1+1=8+4+2+1=15
        int y = 0b11111001; // => 1x2^7+1x2^6+1x2^5+1x2^4+1x2^3+0x2^2+0x2^1+1=128+64+32+16+8+0+0+1=249
        System.out.println(x);
        System.out.println(y);
        System.out.println("-----");
    }

    public static void syntax8() {
        // 0 1 2 3 4 5 6 7
        int x = 05; // => 0x8^1+5x8^0=0+5=5
        int y = 015; // => 0x8^2+1x8^1+5x8^0=0+8+5=13
        System.out.println(x);
        System.out.println(y);
        System.out.println("-----");
    }

    public static void syntax10() {
        int x = 5;
        int y = 15;
        System.out.println(x);
        System.out.println(y);
        System.out.println("-----");
    }

    public static void syntax16() {
        // 0 1 2 3 4 5 6 7 8 9 A=10 B=11 C=12 D=13 E=14 F=15
        String hex = "0f";
        int value = Integer.parseInt(hex, 16); //  15
        System.out.println(value);
        System.out.println("-----");
    }
}