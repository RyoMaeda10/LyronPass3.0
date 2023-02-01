import java.util.Scanner;
public class Pass{
public static void main(String[]args){
Scanner sc = new Scanner(System.in);
String stinky = "sz";
System.out.print("Please enter a two letter password: ");
String pw = sc.nextLine();
if(pw.equals(stinky)){
	System.out.println("Well Done Lad");
}
else{
System.out.println("Wrong Password");

}
}
}
