public class Laptop extends Perangkat{
    protected boolean webcam;

    public Laptop (String drive, int ram, float processor, boolean webcam) {
        super(drive, ram, processor);
        this.webcam = webcam;
    }

    public void informasi () {
        System.out.println ("Laptop ini memiliki drive tipe " + drive + " dengan RAM sebesar " + ram + " GB dan processor dengan kecepatan " + processor + " GHz. Selain itu, laptop ini juga " + webcam + " webcam.");
    }

    public void bukaGame (String nama_game) {
        System.out.println ("Laptop berhasil membuka game " + nama_game);
    }

    public void kirimEmail (String email) {
        System.out.println ("Laptop berhasil mengirim email ke " + email);
    }

    public void kirimEmail (String email1, String email2) {
        System.out.println ("Laptop berhasil mengirim email ke " + email1 + " dan ke " + email2);
    }
}
