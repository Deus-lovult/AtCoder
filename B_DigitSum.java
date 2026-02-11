import java.util.Scanner;

public class B_DigitSum {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        if(!sc.hasNextLine()) return;
        int a = sc.nextInt();

        if(!sc.hasNextLine()) return;
        int b = sc.nextInt();

        int count = 0;
        
        for(int i = 1; i <= a; i++){
            int temp = i;
            int sum = 0;

            while(temp > 0){
                sum += temp % 10;
                temp /= 10;
            }

            if (sum == b) {
                count++;
            }

        }

        System.out.println(count);

    }
}
