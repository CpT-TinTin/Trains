import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        ArrayList<Trains> allTrains=new ArrayList<Trains>();
        System.out.println("Please write the file");
        Scanner file=new Scanner(System.in);
        String filename= file.next();
        try{
        Scanner trains=new Scanner(new File("/Users/tintin/Downloads/Trains/src/"+filename)).useDelimiter("END");
        while (trains.hasNextLine()) {
            String train = trains.nextLine();
            Scanner type = new Scanner(train).useDelimiter(": ");
            type.next();
            String r= type.next();
            if (r.equals("INTERCITY"))
            {
            String rest = trains.next();
            allTrains.add(ICSrinter.readICSPRINTer(rest));
            }
            else if (r.equals("SPRINTER")){
                String rest1=trains.next();
                allTrains.add(Sprinter.readSprinter(rest1));
            }
            trains.nextLine();
        }
        }catch (FileNotFoundException e){
            System.out.println("File not found");
        }
        int choice;
        do{
            System.out.println("1.");
            System.out.println("2.");
            System.out.println("3.");
            choice= file.nextInt();
            switch (choice){
                case 1:for (int i=0;i< allTrains.size();i++)
                    System.out.println(allTrains.get(i).toString());
                break;
                case 2:
                    for (int i=0;i<allTrains.size();i++)
                    {
                        System.out.println(allTrains.get(i).travel()+allTrains.get(i).gettraveltime());
                    }

                        break;
            case 3:
                String line12 =file.next();
                for (int i=0;i< allTrains.size();i++){
                    for (int j=0;j<allTrains.get(i).getS().size();j++){
                        if (allTrains.get(i).getS().get(j).getName().equals(line12)&&allTrains.get(i).getS().get(j).isType()==true)
                        { System.out.println(allTrains.get(i).travel());
                            break;
                        }
                    }

                }
                break;
            }
        }while(choice<4);
    }

}
