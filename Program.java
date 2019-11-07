import java.io.*;
public class Program
{
  public static void main(String[] args)throws IOException
  {
    BufferedReader prva=new BufferedReader(new BufferedReader(new InputStreamReader(System.in)));
    System.out.println("Vnesite poljubno besedo:");
    String a=prva.readLine();
    System.out.println(a);
    int b=2;
    int c=7;
    System.out.println(b+" "+c);
    System.out.println("Preverimo ce se lahko beseda pretvori v niz:");
    //static int parseInt(String s)
    try{
  int stevilka = Integer.parseInt(a);
  System.out.println(stevilka+"    Niz se lahko pretvori v stevilo.");
} 
    catch (NumberFormatException e) 
    {
  System.out.println("Niz se ne more pretvorit v stevilo.");
    }
  }
}
  