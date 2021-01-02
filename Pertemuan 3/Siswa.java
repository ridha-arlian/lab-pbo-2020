
/**
 * Write a description of class Siswa here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Siswa
{
    private int nrp;
    private String nama;
    
    /* Method constructor yang digunakan untuk menciptakan suatu objek */
    public Siswa(int nrpx, String namax)
    {
        nrp = nrpx;
        nama = namax;
    }

    /* Method mutator yang digunakan untuk mengubah suatu nilai dari keadaan suatu objek tetapi 
     * memiliki parameter*/
    public void setNrp(int nrpx)
    {
        nrp = nrpx;
    }
    
    /* Method accessor yang digunakan untuk mengembalikan nilai dari nrp*/
    public int getNrp()
    {
        return nrp;
    }
    
    /* Method mutator yang digunakan untuk mengubah suatu nilai dari keadaan suatu objek tetapi 
     * memiliki parameter*/
    public void setNama(String namax)
    {
        nama = namax;
    }
    
    /* Method accessor yang digunakan untuk mengembalikan string nama*/
    public String getNama()
    {
        return nama;
    }
}
