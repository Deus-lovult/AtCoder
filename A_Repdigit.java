import java.util.Scanner;

public class A_Repdigit {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        if(!sc.hasNextInt()) return;
        int x = sc.nextInt();

        int d1 = x % 10;
        int d10 = (x / 10) % 10;
        int d100 = x / 100;

        String answer = "";

        if(d1 == d10 && d10 == d100 && d1 == d100){
            answer = "Yes";
        } else {
            answer = "No";
        }

        System.out.println(answer);

    }
    
}
