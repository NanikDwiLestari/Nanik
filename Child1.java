
import java.util.*;

public class Child1 {

    int sizearray;
    Scanner inputUser = new Scanner(System.in);
    Parent data[];
    Child1(int size) {
        this.sizearray = size;
        data = new Parent[sizearray];
    }

    void InputData() {
        String kategori = null;
        int seleksi;
        for (int i = 0; i < sizearray; i++) {
            System.out.print("Masukkan Judul VCD : ");
            String judul = inputUser.nextLine();
            System.out.print("Masukkan Nama Aktor : ");
            String aktor = inputUser.nextLine();
            System.out.print("Masukkan Nama Sutradara : ");
            String sutradara = inputUser.nextLine();
            System.out.print("Masukkan Nama Publisher : ");
            String publisher = inputUser.nextLine();
            System.out.println("1.SU = Semua Umur     2.D = Dewasa");
            System.out.println("3.R = Remaja          4.A = Anak-anak");
            do {
                System.out.print("Masukkan Kategori Film : ");
                seleksi = inputUser.nextInt();
            } while (seleksi < 1 || seleksi > 4);
            switch (seleksi) {
                case 1:
                    kategori = "Semua Umur";
                    break;
                case 2:
                    kategori = "Dewasa";
                    break;
                case 3:
                    kategori = "Remaja";
                    break;
                case 4:
                    kategori = "Anak-Anak";
                    break;
                default:
                    break;
            }
            inputUser.nextLine();
            System.out.print("Masukkan Stok VCD : ");
            int stok = inputUser.nextInt();
            inputUser.nextLine();
            data[i] = new Parent(judul, aktor, sutradara, publisher, kategori, stok);
        }
    }

    void tampilkanData() {
        for (int i = 0; i < sizearray; i++) {
            System.out.println("======DATA VCD======");
            System.out.println("Judul\t\t:" + data[i].judul);
            System.out.println("Aktor\t\t:" + data[i].aktor);
            System.out.println("Sutradara\t:" + data[i].sutradara);
            System.out.println("Publisher\t:" + data[i].publisher);
            System.out.println("Kategori\t:" + data[i].kategori);
            System.out.println("Stok\t\t:" + data[i].stok);
        }
    }

}
