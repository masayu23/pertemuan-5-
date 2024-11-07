public class Penerima {
    private String nama;
    private String kategori; // misalnya fakir, miskin, amil, dll.

    public Penerima(String nama, String kategori) {
        this.nama = nama;
        this.kategori = kategori;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getNama() {
        return nama;
    }

    public void setKategori(String kategori) {
        this.kategori = kategori;
    }

    public String getKategori() {
        return kategori;
    }
}
