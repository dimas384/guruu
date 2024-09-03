import java.util.Scanner;
public class seleksikelasss {
    public static void main(String[] args) {
        int pilihan;
        String kelas;

        Scanner in = new Scanner(System.in);
        System.out.println("Masukkan pilihan kelas");
        System.out.println("1. XRPL1\n2. XRPL2\n3. XRPL3\n4. XRPL4\n5. XRPL5");
        pilihan = in.nextInt();

        switch(pilihan){
            case 1:
            kelas= "XRPL 1";
            break;
            case 2:
            kelas= "XRPL 2";
            break;
            case 3:
            kelas= "XRPL 3";
            break;
            case 4:
            kelas= "XRPL 4";
            break;
            case 5:
            kelas= "XRPL 5";
            break;
        }
    }
    
}
