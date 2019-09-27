public class Eagle extends Bird implements Fly {

    private boolean flying;
    private int altitude;

    public Eagle(String name) {
        super(name);
        this.flying = false;
        this.altitude = 0;
    }

    public int getAltitude() {
        return altitude;
    }

    public boolean isFlying() {
        return flying;
    }

    @Override
    public String sing() {
        return "Screech!";
    }
    
    @Override
    public void takeOff() {
    	if (this.altitude == 0 && !this.flying) {
    		this.flying = true;
            System.out.println(this.getName() + " attention au décollage ! ");//  
            /*if (this.flying) {
            	System.out.println("flying = true");
            }*/
            
    	}
    }
    @Override
    public int ascend(int meters) {
    	 if (this.flying) {
             this.altitude = Math.max(this.altitude + meters, 0);
             System.out.println(this.getName() + " on monte à : " + this.altitude);
         }
         return this.altitude;
    }
    @Override
    public int descend(int meters) {
    	if (this.flying) {
            this.altitude = Math.max(this.altitude - meters, 0);
            System.out.println(this.getName() + " on chuuuuute à :" + this.altitude);
        }
        return this.altitude;
    }
    
    @Override
    public void land() {
    	if (this.altitude < 10) {
            System.out.println( this.getName() +" tranquille posé au sol ");
    	} else {
    	System.out.println(this.getName() + "toujours en l'air, on ne peut pas se poser");	
    	}
    }
    @Override
    public void glide() {
    	if (this.altitude != 0 && this.flying) {
            System.out.println(this.getName()+" je vooooole ! ");
    	}
    }
}
