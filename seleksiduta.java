import java.util.Scanner;
public class seleksiduta {
    public static void main(String[] args) {
        String nama,kelas,perilaku;
        int nilai;

        Scanner s = new Scanner(System.in);
        System.out.println("Masukkan Nama: ");
        nama = s.nextLine();
        System.out.println("Masukkan Kelas:(X/XI) ");
        kelas = s.next();

        if(kelas.equalsIgnoreCase("X") ||kelas.equalsIgnoreCase("XII")){
            System.out.println("perilaku siswa: (Baik/cukup)");
            perilaku= s.next();
            if(perilaku.equalsIgnoreCase("Baik")){
                System.out.println("Masukkan rata rata Nilai siswa: ");
                nilai = s.nextInt();
                if(nilai >=90){
                    System.out.println("Anda dinyatakan lolos seleksi");
                }else{
                    System.out.println("Anda gagal karena nilai");
                }

            }else{
                System.out.println("Anda tidak lolos karena perilaku");
            }
        }else{
            System.out.println("Anda tidak lolos karena kelas XII");
        }
    }
    
}
