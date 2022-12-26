package modul3_sekar;
public class Calculation implements Runnable {
    double radius, side, area;
    double phi = 3.14;
    double a, b, t;
    
    Calculation hitung = new Calculation();
   
    public void setSquare(double side){
        this.side = side;
    }
    
    if (this.side > 1) {
        try {
            System.out.println(side);
        }
        catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    public double getSquare() {
        return this.side;
    }
    
    public void setCircle(double radius, double phi) {
        this.radius = radius;
        this.phi = phi;
    }
    
    if (this.radius > 1) {
        try {
            System.out.println(radius*phi);
        }
        catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    public double getCircle() {
        return this.radius, this.phi;
    }
    
    public void setTrapezoid(double a, double b, double t) {
        this.a = a;
        this.b = b;
        this.t = t;
    }
    
    if (this.a, this.b, this.t > 1) {
        try {
            System.out.println(1/2 * this.t * (this.a+this.b));
        }
        catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    public double getTrapezoid() {
        return this.a, this.b; this.t;
    }
    
    @Override
    public void run(){
        for i in range (4){
            System.out.println (i-1) {
            }
        }
    }
}
