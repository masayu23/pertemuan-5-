public class Donatur {
    private String nama;
    private double jumlahZakat;

    public Donatur(String nama, double jumlahZakat) {
        this.nama = nama;
        this.jumlahZakat = jumlahZakat;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getNama() {
        return nama;
    }

    public void setJumlahZakat(double jumlahZakat) {
        this.jumlahZakat = jumlahZakat;
    }

    public double getJumlahZakat() {
        return jumlahZakat;
    }
}