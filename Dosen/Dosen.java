
package Dosen;


public class Dosen 
{
    private String nip;
    private String nama;
    private String alamat;
    private String jenisKelamin;
    private String tglalhir;
    
    public Dosen()
    { 
    }

    public Dosen(String nip, String nama, String alamat, String jenisKelamin, String tglalhir) 
    {
        this.nip = nip;
        this.nama = nama;
        this.alamat = alamat;
        this.jenisKelamin = jenisKelamin;
        this.tglalhir = tglalhir;
    }

    

    public String getNip() {
        return nip;
    }

    public void setNip(String nip) {
        this.nip = nip;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getAlamat() {
        return alamat;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    public String getJenisKelamin() {
        return jenisKelamin;
    }

    public void setJenisKelamin(String jenisKelamin) {
        this.jenisKelamin = jenisKelamin;
    }

    public String getTglalhir() {
        return tglalhir;
    }

    public void setTglalhir(String tglalhir) {
        this.tglalhir = tglalhir;
    }
}
