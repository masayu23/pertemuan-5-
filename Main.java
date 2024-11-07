public class Main {
    public static void main(String[] args) {
        PembayaranZakat pembayaranZakat = new PembayaranZakat();

        Donatur donatur1 = new Donatur("masayu", 500000);
        Donatur donatur2 = new Donatur("berliana", 300000);
        pembayaranZakat.tambahDonatur(donatur1);
        pembayaranZakat.tambahDonatur(donatur2);

        Penerima penerima1 = new Penerima("citra", "Fakir");
        Penerima penerima2 = new Penerima("salsa", "Miskin");
        pembayaranZakat.tambahPenerima(penerima1);
        pembayaranZakat.tambahPenerima(penerima2);

         pembayaranZakat.tampilkanDonatur();
        pembayaranZakat.tampilkanPenerima();
    }
}
