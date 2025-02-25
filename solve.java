
import java.util.Scanner;
class ictu{
    public static int Ictu(int x ){
       int res = 0;
       for(int i = 1 ; i <= x ; i++){
        String temp = String.valueOf(i);
        temp = temp + temp;
        int num = Integer.parseInt(temp);
        res += num;
       }
       return res;
    }
}
public class solve {

public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Nhap so N");
    int x  = scanner.nextInt();
    System.out.println("S = " + ictu.Ictu(x));
    scanner.close();
}
}
