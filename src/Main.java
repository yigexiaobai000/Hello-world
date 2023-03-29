import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);
        System.out.println("请输入被除数");
        String a= in.nextLine();
        System.out.println("请输入除数");
        String b = in.nextLine();
        System.out.println("请输入需要几个符合条件的结果");
        String c = in.nextLine();

        int a1 = Integer.parseInt(a);
        int b1 = Integer.parseInt(b);
        int c1 = Integer.parseInt(c);

        int divided = a1;
        int divisor = b1;
        int found = c1;
        int d = 0;
        for (int i = 0;i<100 && d<found;i++){
        if (divided % divisor == 0){
            System.out.println(divided+"可以整除"+divisor+",的商是"+(divided/divisor));
            d++;
        }
        divided++;
        }
    }
}