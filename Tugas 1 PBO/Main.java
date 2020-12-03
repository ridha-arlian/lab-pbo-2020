import java.util.Scanner;

public class Main{
    
    public static void main(String[] args){
        
        Bus bus = new Bus();
        int pilihan, umur;
        String nama, hamil;
        boolean kondisi;

        Scanner user = new Scanner(System.in);
        
        while(true){

            System.out.println("\n\nMenu: ");
            System.out.println("1. Naikkan Penumpang");
            System.out.println("2. Turunkan Penumpang");
            System.out.println("3. Lihat Daftar Penumpang");
            System.out.println("4. Keluar Dari Program\n");
            System.out.print("Pilihan Anda: ");
            
            pilihan = user.nextInt();
            user.nextLine();

            if(pilihan == 1){
                System.out.print("Nama: ");
                nama = user.nextLine();
                System.out.print("Umur: ");
                umur = user.nextInt();
                user.nextLine();
                System.out.print("Apakah Penumpang Hamil? (ya/tidak): ");
                hamil = user.nextLine();

                if(hamil.equalsIgnoreCase("ya")){
                    kondisi = true;

                }else{
                    kondisi = false;
                }
                Penumpang pnmpg = new Penumpang(nama, umur, kondisi);
                System.out.println(bus.NaikPenumpang(pnmpg) ? "Penumpang Bus Berhasil Ditambahkan" : "Penumpang Bus Tidak Berhasil Ditambahkan");

            }else if(pilihan == 2){
                System.out.print("Nama: ");
                nama = user.nextLine();
                System.out.println(bus.turunkanPenumpang(nama) ? "Penumpang Bus Berhasil Diturunkan" : "Penumpang Bus Tidak Dapat Ditemukan");

            }else if (pilihan == 3){
                System.out.println(bus.toString());

            }else if (pilihan == 4){
                break;
            }
        }
    }
}