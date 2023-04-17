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
class Demo implements java.io.Serializable
{
	public int a;
	public int  b;
    public int c;

	// Default constructor
	public Demo(int a, int b,int c)
	{
		this.a = a;
		this.b = b;
        this.c=c;
	}

}

class Vc implements Serializable{
    Scanner sc3=new Scanner(System.in);
    Pm co1 =new Pm();
    int d2;
    int cap=10;
    int vs[]=new int [10000];
    ArrayList  checkvid =new ArrayList<>();
    int winner,maj;
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
                System.out.println("YOU CASTED YOUR VOTE UNDER NOTA");
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
        winner=can+1;
        maj=max;
    }


}

class Pm implements Serializable{
        Scanner sc2=new Scanner(System.in);
        ArrayList  na =new ArrayList<>();
        ArrayList pn =new  ArrayList<>();
        ArrayList an=new ArrayList<>();
        int vs1[]=new int [10000];
        int cap1;
        int winner1;
        int maj1;
        ArrayList  checkvidc =new ArrayList<>();
        int d2c;
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
        public void costumcast(int num){
             cap1=num;
            for(int i=0;i<cap1;i++){
                System.out.println("Voter ID");
                String vid=sc2.next();
                if(checkvidc.isEmpty()){
                    checkvidc.add(vid);
                    System.out.println(" ELEIGIABLE FOR CASTING THE VOTE");
                }
                else{
                    int f=-1;
                    f=checkvidc.indexOf(vid);
                    if(f!=-1){
                        System.out.println("You already casted your vote");
                        continue;
                    }
                    else{
                        System.out.println("YOU ARE ELEIGIABLE FOR CASTING THE VOTE");
                    }
                }
               
                display();
                System.out.println("Enter the candidate number");
                d2c=sc2.nextInt();
        
        
                if(d2c>0){
                    vs1[d2c-1]++;
                    System.out.println("Your vote is recorded");
                }
                else{
                    System.out.println("YOU CASTED YOUR VOTE UNDER NOTA");
                }
                System.out.println("");
            }
        }
        public void coustcountvote(){
            int sumc=0,maxc=vs1[0],canc=0;
            for(int i=0;i<10000;i++){
                sumc=sumc+vs1[i];
            }
            System.out.println("The total number of votes are "+ sumc +".");
            for(int i=1;i<10000;i++){
                if(maxc<vs1[i]){
                    maxc=vs1[i];
                    canc=i;
                }
            }
            System.out.println("THe Winner is Candiddate "+(canc+1)+".");
            winner1=canc+1;
            maj1=maxc;
        }
        
     }
     public class Project2{
        public static void main(String args[])throws InterruptedException{
        Scanner sc1=new Scanner(System.in);
        int d1,hy;
        String g,g2;
        Vc no1 = new Vc();
        Pm no2 =new Pm();
        Ld l=new Ld();
        l.ld1();
        System.out.println("");
        System.out.println("                                                   WELCOME TO LPU VOTING SYSTEM                             ");
        System.out.println("                                                                                                            ");
        System.out.println("                                                                                                            ");        
        System.out.println("                                                    DEFAULT(:Press-1:)                                      ");
        System.out.println("                                                    CUSTOM(:Press-2:)                                       ");
        System.out.println("Enter the number :");
        d1=sc1.nextInt();
        l.ld1();
        System.out.println("");
        if(d1==1){
            no1.castvote();
            l.ld1();
            System.out.println("");
            no1.countvote();
            
        }
        else if(d1==2){
            no2.reg();
            System.out.println("                                             ALL THE REGIDTRATIONS ARE DONE TYPE     ::YES::                  ");
            g=sc1.next();
            l.ld1();
            System.out.println("                                               SETUP IS READY FOR VOTING                                  ");
            if(g.equalsIgnoreCase("Yes")){
                System.out.println("Enter number of Voters in this session");
                hy=sc1.nextInt();
                l.ld1();
            no2.costumcast(hy);
            }
            System.out.println("TYPE ::DONE::");
            g2=sc1.next();
            l.ld1();
            if(g2.equalsIgnoreCase("DONE")){
            no2.coustcountvote();
            }

        }
        l.ld1();
        System.out.println("");
        Demo object = new Demo(no2.cap1,no2.winner1,no2.maj1);
        Demo object1 = new Demo(no1.cap,no1.winner,no1.maj);

        try{

            FileOutputStream file = new FileOutputStream("D:fo1.txt");
			ObjectOutputStream out = new ObjectOutputStream(file);
            out.writeObject(object);
			
			out.close();
			file.close();
            FileOutputStream file1 = new FileOutputStream("D:fo2.txt");
			ObjectOutputStream out1 = new ObjectOutputStream(file1);
            out1.writeObject(object1);
			
			out1.close();
			file1.close();
			
			System.out.println("Object has been serialized");
        }
        catch(IOException ex)
		{
			System.out.println("IOException is caught");
		}
        Demo object2 = null;
        Demo object3= null;

		// Deserialization
		try
		{
			// Reading the object from a file
			FileInputStream file2 = new FileInputStream("D:fo1.txt");
			ObjectInputStream in2 = new ObjectInputStream(file2);
			
			// Method for deserialization of object
			object2 = (Demo)in2.readObject();
			
			in2.close();
			file2.close();
			
			System.out.println("Object has been deserialized ");
			System.out.println("Total attended          : " + object2.a);
			System.out.println("Winner candidate number :" + object2.b);
            System.out.println("Vote Majority           :"  + object2.c);
		}
        catch(IOException ex)
		{
			System.out.println("IOException is caught");
		}
		
		catch(ClassNotFoundException ex)
		{
			System.out.println("ClassNotFoundException is caught");
		}
        try
		{
			// Reading the object from a file
			FileInputStream file3 = new FileInputStream("D:fo2.txt");
			ObjectInputStream in3 = new ObjectInputStream(file3);
			
			// Method for deserialization of object
			object3 = (Demo)in3.readObject();
			
			in3.close();
			file3.close();
			
			System.out.println("Object has been deserialized(Defult) ");
			System.out.println("Total attended          : " + object3.a);
			System.out.println("Winner candidate number :" + object3.b);
            System.out.println("Vote Majority           :" + object3.c);
		}
		
		catch(IOException ex)
		{
			System.out.println("IOException is caught");
		}
		
		catch(ClassNotFoundException ex)
		{
			System.out.println("ClassNotFoundException is caught");
		}

        }
        
     } 
