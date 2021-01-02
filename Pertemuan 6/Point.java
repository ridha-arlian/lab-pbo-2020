
/**
 * Write a description of class Point here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Point
{
     private int x;
     private int y;
    
     /* Method constructor yang digunakan untuk menciptakan suatu objek*/
     public Point()
     {
         x = 0;
         y = 0;
     }
    
     /* Method constructor yang digunakan untuk menciptakan suatu objek dengan parameter*/
     public Point(int x, int y)
     {
         this.x = x;
         this.y = y;
     }
    
     /* Method accessor yang digunakan untuk mengembalikan nilai dari x */
     public int getX()
     {
         return this.x;
     }
    
     /* Method mutator yang digunakan untuk mengubah suatu nilai dari keadaan suatu objek 
      * tetapi memiliki parameter*/
     public void setX(int x)
     {
         this.x = x;
     }
    
     /* Method accessor yang digunakan untuk mengembalikan nilai dari y*/
     public int getY()
     {
         return this.y;
     }
    
     /* Method mutator yang digunakan untuk mengubah suatu nilai dari keadaan suatu objek tetapi 
      * memiliki parameter*/
     public void sety(int y)
     {
         this.y = y;
     }
    
     /* Method yang digunakan untuk menampilkan titik x dan y*/
     public String toString()
     {
         return "Titik dengan x=" +x+ " y=" +y ;
     }
}
