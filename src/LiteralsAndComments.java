
// By this program you can test and look on different literals on Java
public class LiteralsAndComments {
    public static void main(String[] args) {
        boolean bool1 = true;
        System.out.println("Логический литерал - " + bool1);
        String str1 = "Новая строка";
        System.out.println("Строковый литерал - " + str1);
        char symb1 = '&';
        System.out.println("Символьный литерал - " + symb1);
        int num2 = 0b1000;
        /* Uncomment this block to check how numbers are printed and initialized

        System.out.println("Число в 2-й системе счисления - 0b1000 = " + num2);
        int num8 = 075;
        System.out.println("Число в 8-й системе счисления - 075 = " + num8);
        int num10 = 229;
        System.out.println("Число в 10-й системе счисления - 229 = " + num10);
        int num16 = 0xA15;
        System.out.println("Число в 16-й системк числения - 0xA15 = " + num16);
        float fnum = 164.99f;
        System.out.println("Литерал типа float (с плавающей точкой) - 164.99f = " + fnum);

         */
        double dnum = 78.9999d;
        System.out.println("Литерал типа double - 78.9999d = " + dnum);
    }
}