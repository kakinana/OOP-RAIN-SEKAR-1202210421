public class Perangkat {
   protected String drive; int ram; float processor;
   
   public Perangkat (String drive, int ram, float processor){
        this.drive = drive;
        this.ram = ram;
        this.processor = processor;
    }
    public void informasi(){
        System.out.println("Perangkat ini memiliki drive jenis " + drive + " dengan RAM sebesar " + ram + " GB dan processor dengan kecepatan " + processor + " GHz.");
    }
} 
