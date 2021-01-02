
/**
 * Code ini dibuat untuk mencoba tipe data enum.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
class EnumExample1{
     public enum Season { WINTER, SPRING, SUMMER, FALL}
     
     public static void main(String[] args) {
         for (Season s : Season.values())
            System.out.println(s); 
     }
} 