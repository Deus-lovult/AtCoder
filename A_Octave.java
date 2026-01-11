import java.util.Scanner;

public class A_Octave {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        // 1行にスペース区切りで入力される場合も、next系メソッドで取得可能
        // 入力例: 5 3
        if (!sc.hasNextInt()) return; // 入力がない場合の安全策
        int x = sc.nextInt();
        
        if (!sc.hasNextInt()) return;
        int y = sc.nextInt();
        
        int anser = x * (int)Math.pow(2, y);

        System.out.println(anser);
    }
}
