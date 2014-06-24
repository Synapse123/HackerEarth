import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by jasmin on 23.06.14.
 */
public class SmallFactorials {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int testcases = Integer.parseInt(br.readLine());

        for(int i = 0; i < testcases; i++){

            int num = Integer.parseInt(br.readLine());

            factorial(num);

            System.out.println();

        }

    }

    private static void factorial(int n){

        int[] res = new int[200];
        res[0] = 1;
        int size = 1;

        for(int i = 2; i <= n; i++){

            int rest = 0;

            for(int j = 0; j < size; j++){
                int x = res[j] * i + rest;
                res[j] = x % 10;
                rest = x / 10;
            }

            while(rest != 0){
                res[size] = rest % 10;
                rest = rest / 10;
                size++;
            }

        }

        for(int i = size - 1; i >= 0; i--){
            System.out.print(res[i]);
        }

    }

}
