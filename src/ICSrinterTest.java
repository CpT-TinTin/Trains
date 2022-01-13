import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Scanner;

import static org.junit.jupiter.api.Assertions.*;

class ICSrinterTest {

    @Test
    void addICSrinter() {
        ICSrinter a=new ICSrinter(14,12,15,34);
        a.addICSrinter("DEn haag ",true );
        a.addICSrinter("Delft ",false );
        ArrayList<Trains> ab=new ArrayList<Trains>();
        ab.add(a);
        Sprinter b=new Sprinter(14,12,15,34);
        b.addSrinter("DEn haag ");
        b.addSrinter("Delft45 " );
        ab.add(b);
        Scanner time1=new Scanner("14.24:32").useDelimiter("\\.|:");
        System.out.println(time1.next());
        System.out.println(time1.next());
        System.out.println(time1.next());


    }

    @Test
    void testToString() {
    }
}