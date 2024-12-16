import static jdk.internal.org.jline.utils.Colors.s;

public  class Main {
    public static void main(String[] args) {
//        int x = -10;
//        System.out.println(Math.abs(x));
//        double x =1.6;
//        double y =1.6;
//        System.out.println("Gia tri ca x sau khi lam ton la: " + Math.ceil(x));
//        System.out.println("Gia tri ca x sau khi lam ton la: " + Math.floor(y));
//        System.out.println("2^3 = " + Math.pow(2,3));
//        int a = 10;
//        int b = 20;
//        int pe = (a+b) * 2;
//        System.out.println("Chu vi hinh chu nhat la: " + pe);
//       Cau 2
//        int r = 113;
//        double circle = r*r*3.14;
//        System.out.println("Dien tich hinh tron la: " + circle);
//        double preCircle = 2*r*3.14;
//        System.out.println("Chu vi hinh chu nhat la: " + preCircle);
//            int a = 5;
//            int b = 3;
//            int c = (a - b > 0 ) ? a : b;
//            System.out.println("So lon nhat la: " + c);
//        int a = 8;
//        boolean c =  (a % 2 == 0) ? true: false;
//        System.out.println("Vay a co phai la so chan khong? " + c);
//        int b = 100;
//        boolean d = (b >=0 || b <=100) ? true : false;
//        System.out.println("Vay b co hop le khong: " + d);
//        final double PI = 3.14;
//        double r = Math.sqrt(113 /PI);
//        double d = r * 2;
//        System.out.println("Duong kinh hinh tron la: " + d);


        double h = 2 + ((double) 15 /60);
        double s = (54+38) * h;
        System.out.println("Quang duong la: " + s);


        double h1 = 2 +((double) 30/60);
        double s1 = h1 * 4.2;
        System.out.println("Quang duong di duoc voi van toc 4.2 la: " + s1 + " Km");
        double v = ((double) 5 /2) * 4.2;
        double h2 = s1 / v;
       System.out.println("Thoi gian de di het quang duong voi van toc bang 5/2 van toc di bo la: " + h2 + " Gio");
    }

}