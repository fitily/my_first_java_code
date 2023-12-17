import java.util.Scanner;
public class matrice {
    public static void main (String[] args){
        Scanner myObj = new Scanner(System.in);
        int[][] tab = {};
        for(int i = 0; i < tab.length; i++){
            for (int j = 0; j < tab[i].length; j++){
                System.out.println("la valeur dans le tableau");
                tab[i][j] = myObj.nextInt();
            }
        }
    }
}
