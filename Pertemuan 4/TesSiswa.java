
/**
 * Class ini di buat untuk mencoba class dari siswa dan
 * sebagai tempat jalannya program
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class TesSiswa
{
     public static void main(String[] ar)
     {
         Siswa s = new Siswa();
         Siswa ss = new Siswa(8030001, "Upin");
        
         //ini akan menimbulkan error
         //Siswa sss = new Siswa(8030002);
         
         System.out.println(s.getNrp() + " " + s.getNama());
         System.out.println(ss.getNrp() + " " + ss.getNama());
     }
}