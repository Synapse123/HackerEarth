import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

/**
 * Created by jasmin on 23.06.14.
 */
public class GottaCatchEmAll {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int pokemon = Integer.parseInt(br.readLine());

        String[] line2split = br.readLine().split(" ");
        int[] evolutions = new int[pokemon];

        for(int i = 0; i < line2split.length; i++){
            evolutions[i] = Integer.parseInt(line2split[i]);
        }

        Arrays.sort(evolutions);

        int max = 0;
        for(int i = pokemon; i > 0; i--){
                max = Math.max(max, evolutions[i - 1] + (pokemon - i));
        }

        System.out.println(max + 2);

    }

}
