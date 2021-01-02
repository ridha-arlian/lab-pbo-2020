
/**
 * Write a description of class Manajer here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Manajer extends Pegawai {
    private String departemen;
    
    /* Method constructor yang digunakan untuk menciptakan suatu objek dengan parameter*/
    public Manajer(String nama, double gaji, String departemen)
    {
        super(nama, gaji);
        this.departemen = departemen;
    }
    
    /* Method mutator yang digunakan untuk mengubah suatu nilai dari keadaan suatu objek tetapi 
     * memiliki parameter*/
    public void setDepartemen(String departemen)
    {
        this.departemen = departemen;
    }
    
    /* Method accessor yang digunakan untuk mengembalikan nilai dari departemen*/
    public String getDepartemen()
    {
        return departemen;
    }
}
