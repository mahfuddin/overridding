
package inheritance;


public class Main {
       public static void main(String[] args) {
        
        // membuat objek bangun datar
        BangunDatar bangunDatar = new BangunDatar();
        
        // membuat objek persegi dan mengisi nilai properti
        Persegi Persegi = new Persegi();
        Persegi.sisi = 2;
        
        // membuat objek Lingkaran dan mengisi nilai properti
        Lingkaran lingkaran = new Lingkaran();
        lingkaran.r = 22;
        
        // membuat objek Persegi Panjang dan mengisi nilai properti
        PersegiPanjang PersegiPanjang = new PersegiPanjang();
        PersegiPanjang.panjang = 8;
        PersegiPanjang.lebar = 4;
        
        // membuat objek Segitiga dan mengisi nilai properti
        Segitiga mSegitiga = new Segitiga();
        mSegitiga.alas = 12;
        mSegitiga.tinggi = 8;
        
        
        // memanggil method luas dan keliling
        bangunDatar.luas();
        bangunDatar.keliling();
        
        Persegi.luas();
        Persegi.keliling();
        
        lingkaran.luas();
        lingkaran.keliling();
        
        PersegiPanjang.luas();
        PersegiPanjang.keliling();
        
        mSegitiga.luas();
        mSegitiga.keliling();
    }
}
    

