import java.util.ArrayList;

public abstract class Trains {
    protected int dhour;
    protected int dminute;
    protected int ahour;
    protected int aminute;
    protected ArrayList<Stations> s;


    public Trains(int dhour, int dminute, int ahour, int aminute) {
        this.dhour = dhour;
        this.dminute = dminute;
        this.ahour = ahour;
        this.aminute = aminute;
        this.s = new ArrayList<Stations>();

    }

    public int getDhour() {
        return dhour;
    }

    public int getDminute() {
        return dminute;
    }

    public int getAhour() {
        return ahour;
    }

    public int getAminute() {
        return aminute;
    }

    public ArrayList<Stations> getS() {
        return s;
    }

    public int getDurationh() {
        return ahour-dhour;
    }
    public int gettraveltime(){
        return (ahour-dhour)*60+aminute-dminute;
    }
    public int getDurationm() {
        return aminute - dminute;

    }   public abstract String travel() ;
}
