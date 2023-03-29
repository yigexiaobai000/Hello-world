import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("请输入数字1-9之间的任意数字，获得其所对应的中文大写汉字");
        String a = in.nextLine();
        int a1 = Integer.parseInt(a);

        int n = a1;
        String srt = n + "对应的中文数字是：";
        switch (n) {
            case 1:
                srt += "壹";
                break;
            case 2:
                srt += "贰";
                break;
            case 3:
                srt += "叁";
                break;
            case 4:
                srt += "肆";
                break;
            case 5:
                srt += "伍";
                break;
            case 6:
                srt += "陆";
                break;
            case 7:
                srt += "柒";
                break;
            case 8:
                srt += "捌";
                break;
            case 9:
                srt += "玖";
                break;
            default:
                System.out.println("错误的值" + n + ".值需要大于等于1，小于等于9。");
        }
        System.out.println(srt);
    }
}