import java.util.Scanner;

public class Main {
    static void main(String[] args) {
        Scanner masuk = new Scanner(System.in);
        Restaurant makanan = new Restaurant();
        int orderQty, customerID;
        try{
            System.out.println("Masukkan Customer ID: ");
            customerID = masuk.nextInt();
            System.out.println("Masukkan banyak makanan yang harus dibuat: ");
            orderQty = masuk.nextInt();
            
            Thread t1 = new Thread (makanan);
            Waiters pramu = new Waiters (orderQty, customerID);
            Thread t2 = new Thread (pramu);
            
            t1.start();
            t2.start();
            t1.join();
            t2.join();
        }
        catch (Exception e){
            System.out.println("Inputan harus bentuk Integer!");
        }
    }
    
}
