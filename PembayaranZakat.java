import java.util.ArrayList;
import java.util.List;

public class PembayaranZakat {
    private List<Donatur> daftarDonatur;
    private List<Penerima> daftarPenerima;

    // Konstruktor
    public PembayaranZakat() {
        daftarDonatur = new ArrayList<>();
        daftarPenerima = new ArrayList<>();
    }

    public void tambahDonatur(Donatur donatur) {
        daftarDonatur.add(donatur);
    }

    public void tambahPenerima(Penerima penerima) {
        daftarPenerima.add(penerima);
    }

    public void tampilkanDonatur() {
        System.out.println("Daftar Donatur dan Jumlah Zakat:");
        for (Donatur donatur : daftarDonatur) {
            System.out.println("Nama Donatur: " + donatur.getNama());
            System.out.println("Jumlah Zakat: " + donatur.getJumlahZakat());
            System.out.println();
        }
    }

    public void tampilkanPenerima() {
        System.out.println("Daftar Penerima dan Kategori:");
        for (Penerima penerima : daftarPenerima) {
            System.out.println("Nama Penerima: " + penerima.getNama());
            System.out.println("Kategori: " + penerima.getKategori());
            System.out.println();
        }
    }
}
