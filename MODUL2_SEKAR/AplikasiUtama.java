package MODUL2_SEKAR;

public class AplikasiUtama {
    public static void main (String[] args) throws Exception{

    TransportasiAir new_transport = new TransportasiAir (4, 20000);
    new_transport.informasi();
    System.out.println("");
    }

    Kapal new_kapal = new Kapal (50, 100000, "Mesin Diesel");
    new_kapal.informasi();
    new_kapal.berlayar();
    new_kapal.berlayar(20);
    new_kapal.berlabuh();
    System.out.println("");

    Sampan new_sampan = new Sampan (20, 50000, 2);
    new_sampan.informasi();
    new_sampan.berlayar();
    new_sampan.berlabuh();
    new_sampan.berlabuh(2);
    System.out.println("");
}
