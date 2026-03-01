import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class B_GreedyDraft {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        //希望リスト一覧
        List<List<Integer>> x = new ArrayList<>();

        //回答表示用
        List<Integer> ansArray = new ArrayList<>();

        //客の人数
        int n = sc.nextInt();

        //缶ジュースの総数
        int m = sc.nextInt();

        //ジュース取得状況把握用
        Map<Integer,Boolean> JuiceList = new HashMap<>();
        for(int k = 1; k <= m; k++){
            JuiceList.put(k,false);
        }

        //各客のリスト取得
        for (int i = 0; i < n; i++){
            int l = sc.nextInt();

            List<Integer> x_sub = new ArrayList<>();
            for(int j = 0;j < l;j++){
                x_sub.add(sc.nextInt());
            }
            x.add(x_sub);
        }

        for(List<Integer> array : x){
            Boolean juiceFlg = false;
            for(int lx:array){
                Boolean flg = JuiceList.get(lx);
                if(!flg){
                    ansArray.add(lx);
                    juiceFlg = true;
                    JuiceList.put(lx,true);
                    break;
                }
            }

            if(!juiceFlg){
                ansArray.add(0);
            }
        }
        
        for(int ans :ansArray){
            System.out.println(ans+" ");
        }

    }
}
