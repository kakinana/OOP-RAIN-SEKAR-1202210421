public class Handphone extends Perangkat {
    protected boolean fingerprint;

    public Handphone (String drive, int ram, float processor, boolean fingerprint) {
        super (drive, ram, processor);
        this.fingerprint = fingerprint;
    }

    public void informasi () {
        System.out.println ("Handphone ini memiliki drive tipe " + drive + " dengan RAM sebesar " + ram + " GB dan processor dengan kecepatan " + processor + " GHz. Selain itu, handphone ini " + fingerprint + " fingerprint.");
    }

    public void telfon (int no_hp) {
        System.out.println ("Handphone berhasil menyambungkan telepon ke nomor " + no_hp);
    }

    public void kirimSMS (int no_hp) {
        System.out.println ("Handphone berhasil mengirim SMS ke nomor " + no_hp);
    }

    public void kirimSMS (int no_hp1, int no_hp2) {
        System.out.println ("Handphone berhasil mengirim SMS ke nomor " + no_hp1 + " dan ke nomor " + no_hp2);
    }
}
