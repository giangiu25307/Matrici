/*
 * Esempi di gestione delle matrici di interi.
 */
package matrici;

/**
 *
 * @author Sandro Gallo
 */
public class Matrici {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Matrice m = new Matrice(4, 6);
        //Matrice m3=new Matrice("data/matrice3.txt");
        m.fillRandom();
        System.out.println(m);

        m.toFile("data/matrice.txt");

    }

}
