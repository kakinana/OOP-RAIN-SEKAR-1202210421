public class Restaurant implements Runnable{
    private boolean waitingForPickup = false;
    private static final Object lock = new Object();
    private static int foodNumber = 1;
    
    @Override
    public void run(){
        while (true) {
            makeFood();
            try {
                Thread.sleep(3000);
            }
            catch (InterruptedException e){
                System.out.println("Wait a minute");
            }
        }
    }
    public void setWaitingForPickup(boolean waitingForPickup){
        this.waitingForPickup = waitingForPickup;
    }
    public int getFoodNumber(){
        return foodNumber;
    }
    
    public void makeFood(){
        synchronized(Restaurant.lock){
            if (this.waitingForPickup){
                try {
                    System.out.println("Restaurant: Menunggu pramusaji untuk mengantarkan makanan.");
                    Restaurant.lock.wait();
                }
                catch (InterruptedException e){
                    e.printStackTrace();
                }
            }
            waitingForPickup = true;
            System.out.println("Restaurant: Membuat makanan nomor" + foodNumber);
            Restaurant.lock.notifyAll();
            System.out.println("Restaurant: Memberitahukan kepada pramusaji untuk mengambil makanan.");
        }
    }
    public Object getLock(){
        return lock;   
    }
}
