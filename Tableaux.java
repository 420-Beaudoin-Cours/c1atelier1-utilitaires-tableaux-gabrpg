/**
 * @author France Beaudoin
 */
public class Tableaux {
    private static void permute(int[] tab, int i1, int i2) {
        int transit = tab[i1];
        tab[i1] = tab[i2];
        tab[i2] = transit;
    }

    private static void permute(String[] tab, int i1, int i2) {
        String transit = tab[i1];
        tab[i1] = tab[i2];
        tab[i2] = transit;
    }

    public static void trierCroissantSSS(int[] tab) {
        int imin;
        for (int i = 0; i < tab.length - 1; i++) {
            imin = i;
            for (int j = i + 1; j < tab.length; j++) {
                if (tab[j] < tab[imin])
                    imin = j;
            }
            if (imin != i)
                permute(tab, i, imin);
        }
    }

    public static void trierCroissantSSS(String[] tab) {
        int imin;
        for (int i = 0; i < tab.length - 1; i++) {
            imin = i;
            for (int j = i + 1; j < tab.length; j++) {
                if (Integer.parseInt(tab[j]) < Integer.parseInt(tab[imin]))
                    imin = j;
            }
            if (imin != i)
                permute(tab, i, imin);
        }
    }

    /**
     * @author Gabriel Raymond-Plourde
     */

    public static void trierDecroissantSSS(int[] tab) {
        int imin;
        for (int i = 0; i < tab.length - 1; i++) {
            imin = i;
            for (int j = i + 1; j < tab.length; j++) {
                if (tab[j] > tab[imin])
                    imin = j;
            }
            if (imin != i)
                permute(tab, i, imin);
        }
    }

    public static void print (int[] tab){
        for (int elem : tab){
            System.out.print(elem + ", ");
        }
    }

    public static int Maximum (int[] tab) {

        int max = tab[0];

        for (int i = 1; i < tab.length; i++){
            if (tab[i] > max){
                max = tab[i];
            }
        }
        return max;
    }


    public static int Minimum (int[] tab){

        int min = tab[0];

        for (int i = 1; i < tab.length; i++){
            if (tab[i] < min){
                min = tab[i];
            }
        }
        return min;
    }

    public static double Moyenne (int[] tab){

        double moyenne = 0;
        int somme = 0;

        for (int i = 0; i < tab.length; i++){
            somme = somme + tab[i];
           moyenne = somme / tab.length;
        }
        return moyenne;
    }

    public static int FouilleSeq (int[] tab, int recherche){

        int i = 0;
        boolean trouve = false;

        while(i < tab.length && !trouve){
            if (tab[i] == recherche){
                trouve = true;
            }
            else{
                i++;
            }
        }
        if (trouve){
            return i;
        }
        else{
            return -1;
        }
    }

    public static void trierDécroissantSSS(String[] tab) {
        int imin;
        for (int i = 0; i < tab.length - 1; i++) {
            imin = i;
            for (int j = i + 1; j < tab.length; j++) {
                if (Integer.parseInt(tab[j]) > Integer.parseInt(tab[imin]))
                    imin = j;
            }
            if (imin != i)
                permute(tab, i, imin);
        }
    }

    public static void print (String[] tab){
        for (String elem : tab){
            System.out.print(elem + ", ");
        }
    }

    public static String Maximum (String[] tab) {

        String max = tab[0];

        for (int i = 1; i < tab.length; i++){
            if (Integer.parseInt(tab[i]) > Integer.parseInt(max)){
                max = tab[i];
            }
        }
        return max;
    }

    public static String Minimum (String[] tab){

        String min = tab[0];

        for (int i = 1; i < tab.length; i++){
            if (Integer.parseInt(tab[i]) < Integer.parseInt(min)){
                min = tab[i];
            }
        }
        return min;
    }

    public static double Moyenne (String[] tab){

        double moyenne = 0;
        int somme = 0;

        for (int i = 0; i < tab.length; i++){
            somme = somme + Integer.parseInt(tab[i]);
            moyenne = somme / tab.length;
        }
        return moyenne;
    }

    public static int FouilleSeq (String[] tab, String recherche){

        int i = 0;
        boolean trouve = false;

        while(i < tab.length && !trouve){
            if (Integer.parseInt(tab[i]) == Integer.parseInt(recherche)){
                trouve = true;
            }
            else{
                i++;
            }
        }
        if (trouve){
            return i;
        }
        else{
            return -1;
        }
    }
}
