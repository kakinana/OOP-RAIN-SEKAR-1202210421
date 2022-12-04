public class Aplikasi {
    public static void main (String[] args) throws Exception {
        
        System.out.println ("Class Perangkat");
        
        Perangkat new_perangkat = new Perangkat ("tidak diketahui", 2, (float) 1.80);
        new_perangkat.informasi();
        System.out.println("");

        System.out.println ("Class Handphone");

        Handphone new_handphone = new Handphone ("Sanddisk", 3, (float) 2.20, true);
        new_handphone.informasi();
        new_handphone.telfon(621234567);
        new_handphone.kirimSMS(621234567);
        new_handphone.kirimSMS(622345678, 622884782);
        System.out.println("");

        System.out.println("Class Laptop");

        Laptop new_laptop = new Laptop ("Seagate", 8, (float) 2.40, true);
        new_laptop.informasi();
        new_laptop.bukaGame("Diner Dash");
        new_laptop.kirimEmail("hansatyaji.93@gmail.com");
        new_laptop.kirimEmail("hansatyaji.93@gmail.com", "kinanata.satya@gmail.com");

        System.out.println("");
    }
}
