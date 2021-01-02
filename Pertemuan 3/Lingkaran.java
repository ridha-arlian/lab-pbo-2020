
/**
 * Write a description of class Lingkaran here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Lingkaran
{
    private double jari_jari;

    /* Method constructor yang digunakan untuk menciptakan suatu objek */
    public Lingkaran(double jari)
    {
        this.jari_jari = jari; 
    }
    
    /* Method mutator yang digunakan untuk mengubah suatu nilai dari keadaan suatu objek tetapi 
     * memiliki parameter*/
    public void setJariJari(double jari)
    {
        this.jari_jari = jari;
    }
    
    /* Method accessor yang digunakan untuk mengembalikan nilai dari jari jari*/
    public double getJariJari()
    {
        return jari_jari;
    }
}
