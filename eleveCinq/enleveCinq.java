public class enleveCinq {
    public static void main(String[] argv){
        int[] T = {1, 2, 3, 4, 5, 6, 7, 8, 5, 10};
        for(int l = 0; l < T.length; l++){
            System.out.println(T[l]);
        }
        for(int j = 0; j < T.length; j++){
            if(T[j] == 5){
                for(int k = j; k < T.length-1; k++){
                    T[k] = T[k+1];
                }
                T[T.length-1] = 0;
            }
        }
        System.out.println("-------------------------------------");
        for(int i = 0; i < T.length; i++){
            System.out.println(T[i]);
        }
    }
}