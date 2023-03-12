import java.io.*;
import java.util.*;
public class Project{
    public static void main(String args[]){
System.out.println("                                                   WELCOME TO LPU VOTING SYSTEM                             ");
System.out.println("1-Voter Cadidate");
System.out.println("2-Participation Candidate");
Scanner sc=new Scanner(System.in);
int d1=sc.nextInt();
if(d1==1){
System.out.println("Voter ID");
String vid=sc.next();
System.out.println(" ______________________________________________________________________________________");
System.out.println("|           ---------->         Candidate 1                                            |");
System.out.println("|           ---------->         NAME:Sai                                               |");
System.out.println("|           ---------->         Party:XYZ                                              |");
System.out.println("|______________________________________________________________________________________|");
System.out.println(" ______________________________________________________________________________________");
System.out.println("|           ---------->         Candidate 2                                            |");
System.out.println("|           ---------->         NAME:Vijay                                             |");
System.out.println("|           ---------->         Party:ZYX                                              |");
System.out.println("|______________________________________________________________________________________|");
System.out.println("                                                                                      ");
System.out.println(" ______________________________________________________________________________________");
System.out.println("|           ---------->         Candidate 3                                            |");
System.out.println("|           ---------->         NAME:Kumar                                             |");
System.out.println("|           ---------->         Party:YXZ                                              |");
System.out.println("|______________________________________________________________________________________|");
int  c1=0,c2=0,c3=0,d2;
System.out.println("Enter the candidate number");
d2=sc.nextInt();
if(d2==1){
    c1++;
    System.out.println("Your vote is recorded");
}
else if(d2==2){
    c2++;
    System.out.println("Your vote is recorded");
}
else{
    c3++;
    System.out.println("Your vote is recorded");
}
}
else {
    System.out.print("Enter the Your name: ");
    String name=sc.next();
    System.out.println("Enter  your age");
    int age=sc.nextInt();
    System.out.println("Enter your adhar number");
    long adhnum=sc.nextLong();
    System.out.println("Enter your party name");
    String party=sc.next();
    System.out.println("Your data is recorded and you will be notified by post once your enrollment is cofirmed");
}
}
}