public class kelasGuru {

    public static void main(String[] args) {
        guru rehan = new guru(2021, "rehan","part-time" , "aktif");

        rehan.setMapel("jawa");
        rehan.setNama("rehan");
        rehan.setNip(2021);
        rehan.setStatus("gak aktif");

        rehan.print();
    }

    // public static void main(String[] args) {
    //     Scanner input = new Scanner(System.in);

    //     System.out.print("Masukkan Nama : ");
    //     String nama = input.nextLine();
    //     System.out.print("Masukkan Mapel : ");
    //     String Mapel = input.nextLine();
    //     System.out.print("Masukkan Status : ");
    //     String Status = input.nextLine();
    //     System.out.print("Masukkan NIP : ");
    //     int nip = input.nextInt();


    //     guru guru = new guru(nip, nama, Mapel, Status);
    //     guru pakMasyis = new guru(1122, "Masyis", "Agama", "Tetap");
    //     guru buPasha = new guru(2232, "Pasha", "Produktif", "Tetap");
    //     guru pakIlham = new guru(3329, "Ilham", "Produktif", "Full-Time");
    //     guru pakFirdaus = new guru(4427, "Firdaus", "Produktif", "Full-time");
    //     guru pakThoriq = new guru(5813, "Thoriq", "Olahraga", "Full-time");
    //     System.out.println("-----------");
    //     guru.print();
    //     System.out.println("-----------");

  
    }


