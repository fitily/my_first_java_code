public class surface {
    public static void main (String[] argv) {
        for (int i = 1; i <= 5; i++){
            for (int j = i; j <= 5; j++){
                int surf = i*j;
                System.out.println("la surface de rectangle dont la largeur est" + " " + i + "et la longeur" + " " + j +"est" + " "  + surf);
            }
        }
    }
}