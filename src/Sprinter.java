import java.util.ArrayList;
import java.util.Scanner;

public class Sprinter extends Trains{
    public Sprinter(int dhour, int dminute, int ahour, int aminute) {
        super(dhour, dminute, ahour, aminute);
    }
    public void addSrinter(String name) {
        boolean type=true;
        s.add(new Stations(name,type));
    }
    public static Sprinter readSprinter(String input){
        Scanner in=new Scanner(input);
        String line;
        line=in.nextLine();
        Scanner in1=new Scanner(line).useDelimiter(": ");
        in1.next();
        String departure=in1.next();
        line=in.nextLine();
        Scanner in2=new Scanner(line).useDelimiter(": ");
        in2.next();
        String arrival=in2.next();
        Scanner time1=new Scanner(departure).useDelimiter("\\.");
        Scanner time2=new Scanner(arrival).useDelimiter("\\.");

        int a,b,c,e;
        a= Integer.parseInt(time1.next());
        b= Integer.parseInt(time1.next());
        c=Integer.parseInt(time2.next());
        e=Integer.parseInt(time2.next());
        Sprinter train=new Sprinter(a,b,c,e);
        while (in.hasNextLine()){
            String l=in.nextLine();
            Scanner stations=new Scanner(l).useDelimiter(": ");
            stations.next();
            train.addSrinter(stations.next());
    }
        return train;
    }
    public String travel(){
        return " SPrinter from"+s.get(0).toString()+
                "to "+ s.get(s.size()-1).toString();
    }
    public String toString() {
        return "Srinter{" +
                "dhour=" + dhour +
                ", dminute=" + dminute +
                ", ahour=" + ahour +
                ", aminute=" + aminute +
                ", s=" + s.toString() +
                '}';
    }
}
