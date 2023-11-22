package hengerek;

public class Cso extends TomorHenger{
    private double falvastagsag;

 
    public Cso( double sugar, double magassag, double falvastagsag) {
        this(sugar, magassag, 1, falvastagsag);
        this.falvastagsag = falvastagsag;
    }

    public Cso(double sugar, double magassag, double fajsuly, double falvastagsag) {
        super(sugar, magassag, fajsuly);
        this.falvastagsag = falvastagsag;
    }
    
    @Override
    public double terfogat(){
        return 0;
    }

    public double getFalvastagsag() {
        return falvastagsag;
    }

    @Override
    public String toString() {
        return "Cso{" + "falvastagsag=" + falvastagsag + '}';
    }
    
}
