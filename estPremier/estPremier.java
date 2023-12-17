public class estPremier {
    public static boolean isPremier(int n ){
        boolean leNombreEstPremier = true;
        int compteurResteDivision = 0;
        for(int i = 0; i <= n; i++){
            if(n%i == 0){
                compteurResteDivision++;
            }
        }
        if(compteurResteDivision == 2){
            leNombreEstPremier = true;
        }
        else {
            leNombreEstPremier = false;
        }
        return leNombreEstPremier;
    }
    public static void main (String[] argv){
        int n = 17;
        boolean number = isPremier(n);
        System.out.println(number);
    }
}
