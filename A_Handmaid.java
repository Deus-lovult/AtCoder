import java.util.Scanner;

public class A_Handmaid {
    private static final String HAND_MAID = "Of";
    public static void main(String[] args){


        Scanner sc = new Scanner(System.in);

        String s = sc.nextLine();

        String s0 = s.substring(0,1).toLowerCase();
        String s1 = s.substring(1);

        System.out.println(HAND_MAID + s0 + s1);

    }
}