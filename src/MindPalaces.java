import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by jasmin on 23.06.14.
 */
public class MindPalaces {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] matrixSize = br.readLine().split(" ");
        int lines = Integer.parseInt(matrixSize[0]);
        int columns = Integer.parseInt(matrixSize[1]);

        int[][] matrix = new int[lines][columns];

        for(int i = 0; i < lines; i++){
            String[] line = br.readLine().split(" ");
            for(int j = 0; j < columns; j++){
                matrix[i][j] = Integer.parseInt(line[j]);
            }
        }

        int queries = Integer.parseInt(br.readLine());

        for(int i = 0; i < queries; i++){
            int query = Integer.parseInt(br.readLine());
            int x = lines - 1;
            int y = 0;
            boolean found = false;
            while(x >= 0 && y < columns){
                if(query == matrix[x][y]) {
                    found = true;
                    break;
                }else if(query < matrix[x][y]){
                    x--;
                }else if(query > matrix[x][y]){
                    y++;
                }
            }
            if(found){
                System.out.println(x + " " + y);
            }else{
                System.out.println("-1 -1");
            }
        }

    }

}
