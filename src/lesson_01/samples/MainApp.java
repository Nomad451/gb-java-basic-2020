package lesson_01.samples;

public class MainApp {
    public static void main(String[] args) {
//        int a = 5;
//        int b = 7;
//        int sum = a + b;
//
//        System.out.println(a + " + " + b + " = " + sum);
//        System.out.printf("%d + %d = %d\n", a, b, sum);
//
//        String s = "java";
//        System.out.printf("%s %d", s, 45);


        // byte 8 bit -128..127

//        byte b = 100 ;
//        b+=10;
//        System.out.println(b);

        //short 16 bit -128..127
//        System.out.println(Short.MAX_VALUE);

//        int  32 bit
//        int a = b;
        //long 64 bit
//        long t =  3123123123123123L;

//        float f = 6.12134456456456F;
//        double d = 8.12354653453252;
//
//        System.out.println(f);
//        System.out.println(d);

//        char c ='a';
//        c= 65;
//        c= '\u34FE';
//        System.out.println(c);

//        boolean b = false;


//        int x = (int) 5.5345;
//        double d =  4545;
//        byte b = (byte) 130;
//        System.out.println(b);


//        int a = 100;
//        int m = 30;
//        int kol = a / m;
//        int z = a % m;
//        System.out.println(kol);
//        System.out.println(z);


//        printWord("java");
//        printWord("hello");

//        printSum(4, 7);

//        double d = sum(2, 3);
//        System.out.println(d);


//        int t = 30;
//        if (t > 50) {
//            System.out.println("trevoga!");
//        } else {
//            System.out.println("all ok");
//        }


//        int a = 10;
//        int b = 20;
//        int x = 7;
//
//        if (a < x && x < b) {
//            System.out.println("gool");
//        } else {
//            System.out.println("milk");
//        }

//        int x = 3;
//        if (x < 2 || x > 5) {
//            System.out.println("no");
//        } else {
//            System.out.println("yes");
//        }

        //  >  >=  <  <=  ==  !=


    }

    static void printHello() {
        System.out.println("=====");
        System.out.println("Hello");
        System.out.println("=====");
    }

    static void printWord(String s) {
        System.out.println("=====");
        System.out.println(s);
        System.out.println("=====");
    }

    static void printSum(double a, double b) {
        System.out.printf("%.2f + %.2f = %.2f\n", a, b, a + b);
    }

    static double sum(double a, double b) {
        return a + b;
    }

    static double disk(double a, double b, double c) {
        return b * b - 4 * a * c;
    }

    static boolean even(int a) {
        return a % 2 == 0;
    }
}
