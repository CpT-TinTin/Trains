import java.util.ArrayList;
import java.util.Scanner;

public class ICSrinter extends Trains{
    public ICSrinter(int dhour, int dminute, int ahour, int aminute) {
        super(dhour, dminute, ahour, aminute);

    }
    public void addICSrinter(String name, boolean tyoe) {
        s.add(new Stations(name,tyoe));
    }
    public static ICSrinter readICSPRINTer(String input){
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
      ICSrinter train=new ICSrinter(a,b,c,e);
      while (in.hasNextLine()){
          String l=in.nextLine();
          Scanner stations=new Scanner(l).useDelimiter(": ");
                  if (stations.next().equals("IC-STATION")){
                      train.addICSrinter(stations.next(), true);

                  }
      else
          train.addICSrinter(stations.next(), false);
      }

return train;
    }
    public String travel(){
        return " ICsPrinter from"+s.get(0).toString()+
                "to "+ s.get(s.size()-1).toString();
    }
    @Override
    public String toString() {
        return "ICSrinter{" +
                "Leaves at " + dhour +
                ":" + dminute +
                ", Arrives at " + ahour +
                " :" + aminute +

                "Stations=" + s.toString() +
                '}';
    }
}
