import java.io.*;
import java.util.*;
 class Ld{
    public static void ld1() throws InterruptedException {
        char l[]=new char[17];
        l[0]='L';
        l[1]='o';
        l[2]='a';
        l[3]='d';
        l[4]='i';
        l[5]='n';
        l[6]='g';
        for(int i=7;i<17;i++){
          //  l[i]='|';
            l[i]='.';
        }// System.out.print("                      ");
        for(int j=0;j<16;j++){
            System.out.print(l[j]);
            Thread.sleep(100); 
        }
        //System.tem.out.println("Loding");        
    }
}

class Vc implements Serializable{
    Scanner sc3=new Scanner(System.in);
    int d2;
    int cap=10;
    int vs[]=new int [10000];
    ArrayList  checkvid =new ArrayList<>();
    public void castvote(){
        for(int i=0;i<cap;i++){
            System.out.println("Voter ID");
            String vid=sc3.next();
            if(checkvid.isEmpty()){
                checkvid.add(vid);
                System.out.println(" ELEIGIABLE FOR CASTING THE VOTE");
            }
            else{
                int f=-1;
                f=checkvid.indexOf(vid);
                if(f!=-1){
                    System.out.println("You already casted your vote");
                    continue;
                }
                else{
                    System.out.println("YOU ARE ELEIGIABLE FOR CASTING THE VOTE");
                }
            }
            System.out.println(" ______________________________________________________________________________________");
            System.out.println("|                               Candidate 1                                            |");
            System.out.println("|                               NAME:Sai                                               |");
            System.out.println("|                               Party:XYZ                                              |");
            System.out.println("|______________________________________________________________________________________|");
            System.out.println(" ______________________________________________________________________________________");
            System.out.println("|                               Candidate 2                                            |");
            System.out.println("|                               NAME:Vijay                                             |");
            System.out.println("|                               Party:ZYX                                              |");
            System.out.println("|______________________________________________________________________________________|");
            System.out.println("                                                                                      ");
            System.out.println(" ______________________________________________________________________________________");
            System.out.println("|                               Candidate 3                                            |");
            System.out.println("|                               NAME:Kumar                                             |");
            System.out.println("|                               Party:YXZ                                              |");
            System.out.println("|______________________________________________________________________________________|");
            System.out.println("|                           Enter Zero for NOTA                                        |");
            System.out.println("|______________________________________________________________________________________|");

            System.out.println("Enter the candidate number");
            d2=sc3.nextInt();


            if(d2>0){
                vs[d2-1]++;
                System.out.println("Your vote is recorded");
            }
            else{
                System.out.println("YOUR CASTED YOUR VOTE UNDER NOTA");
            }
            System.out.println("");
        }
    }
    public void countvote(){
        int sum=0,max=vs[0],can=0;
        for(int i=0;i<10000;i++){
            sum=sum+vs[i];
        }
        System.out.println("The total number of votes are "+ sum +".");
        for(int i=1;i<10000;i++){
            if(max<vs[i]){
                max=vs[i];
                can=i;
            }
        }
        System.out.println("THe Winner is Candiddate "+(can+1)+".");
    }
}

class Pm implements Serializable{
        Scanner sc2=new Scanner(System.in);
        ArrayList  na =new ArrayList<>();
        ArrayList pn =new  ArrayList<>();
        ArrayList an=new ArrayList<>();
        public void reg(){
            // ArrayList  na =new ArrayList<>();
            na.add("Sai");
            na.add("Vijay");
            na.add("Kumar");
            //  ArrayList pn =new  ArrayList<>();
            pn.add("XYZ");
            pn.add("ZYX ");
            pn.add("YXZ");
            //  ArrayList an=new ArrayList<>();
            int age[]=new int[100];
            System.out.println("Number of  candidates are to register ");
            int n;
            n=sc2.nextInt();
            for(int i=0;i<n;i++){
                System.out.print("Enter the Your name: ");
                String name=sc2.next();
                na.add(name);
                System.out.println("Enter  your age");
                age[i]=sc2.nextInt();
                System.out.println("Enter your adhar number");
                long adhnum=sc2.nextLong();
                an.add(adhnum);
                System.out.println("Enter your party name");
                String party=sc2.next();
                pn.add(party);
                System.out.println("Your data is recorded and you will be notified by post once your enrollment is cofirmed");
                if(age[i]>18 ){
                    System.out.println("Your enrollement is confirmed ");
                }
                else{
                    System.out.println("Sorry you are not elegeble for the election participation");
                }
            }        
        }
        public  void display(){
            for(int i=0;i<na.size() & i<pn.size();i++)  {
                System.out.println(" ______________________________________________________________________________________");
                System.out.println("                                 Candidate"+(i+1)+"                                      ");
                System.out.println("                                 NAME:"+na.get(i)+"                                      ");
                System.out.println("                                 Party:"+pn.get(i)+"                                     ");
                System.out.println("______________________________________________________________________________________ ");
            }
                System.out.println("                           Enter Zero for NOTA                                         ");
                System.out.println("______________________________________________________________________________________ ");  
        }
     }
public class Project1{    
    public static void main(String args[])throws InterruptedException{
        Scanner sc1=new Scanner(System.in);
        int d1;
        int h=0;
        Vc no1 = new Vc();
        Pm no2=new Pm();
        Ld l=new Ld();
        l.ld1();
        System.out.println("");
        System.out.println("                                                   WELCOME TO LPU VOTING SYSTEM                             ");
        System.out.println("1-Voter Cadidate");
        System.out.println("2-Participation Candidate");
        System.out.println("Enter the number");
        d1=sc1.nextInt();
        l.ld1();
        System.out.println("");
        if(d1==1){
            no1.castvote();
            
        }
        else if(d1==100){
            System.out.println(" If you want to See the voting results Press:1");
            System.out.println("if you want to change the voting capacity press:2");
            int r=sc1.nextInt();
            l.ld1();
            System.out.println("");
            if(r==1)
                no1.countvote();
            if(r==2){
                System.out.println("Enter the new capacity but the maximum capacity is 10000");
                no1.cap=sc1.nextInt();
            }
            if(r==3){
                System.out.println("The saveved data is displayed");
                h=1;
            }
        }
        else if(d1==2){
            l.ld1();
            System.out.println("");
            no2.reg();
        }
        else{
            System.out.println("INVALID");
            //continue;
        }
        try{
            l.ld1();
            System.out.println("");
            FileOutputStream fo1 =new FileOutputStream("D:f1.txt");
            ObjectOutputStream out1 =new ObjectOutputStream(fo1);
            out1.writeObject(no1);
            out1.close();
            fo1.close();
            FileOutputStream fo2 =new FileOutputStream("D:f2.txt");
            ObjectOutputStream out2 =new ObjectOutputStream(fo2);
            out2.writeObject(no2);
            out2.close();
            fo2.close();
        }
        catch(Exception e){
            e.printStackTrace();
        }
}
}
