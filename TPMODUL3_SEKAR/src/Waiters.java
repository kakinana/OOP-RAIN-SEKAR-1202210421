public class Waiters implements Runnable {

    private final int orderQty;
    private final int customerID;
    static int foodPrice = 35261;
    
    public Waiters (int orderQty, int customerID){
        this.orderQty = orderQty;
        this.customerID = customerID;
    }
    
    @Override
    public void run(){
        while (true){
            getFood();
            try {
                Thread.sleep(4000);
            }
            catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
    
    public void orderInfo(){
        System.out.println("Customer ID: " + customerID);
        System.out.println("Number of Food: " + orderQty);
        System.out.println("Total Price: " + orderQty*foodPrice);
    }
    
    public void getFood(){
        synchronized(Restaurant.getLock()){
            System.out.println("Waiters: Makanan siap untuk diantarkan");
            Restaurant makanan = new Restaurant();
            makanan.setWaitingForPickup(false);
            
            if (Restaurant.getFoodNumber() == this.orderQty + 1) {
                orderInfo();
                System.exit(0);
            }
            Restaurant.getLock().notifyAll();
            System.out.println("Waiters: Beritahukan kepada restoran untuk membuat makanan lain");
        }
    }  
}
