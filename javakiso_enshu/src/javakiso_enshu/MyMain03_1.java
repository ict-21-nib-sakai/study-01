package javakiso_enshu;

public class MyMain03_1 {
    public static void main(String[] args) {
        int num = 10;
        double dnum = 3.14;
        char moji = 'B';
        boolean flag = false;
        String str = "Programming";

       System.out.println(
           String.format("番号:%s", num)
       );

       System.out.println(
           String.format("円周率:%s", dnum)
       );

       System.out.println(
           String.format("アルファベット:%c", moji)
       );

       System.out.println(
           String.format("真偽値:%s", flag)
       );

       System.out.println(
           String.format("文字列:%s", str)
       );
    }
}