import java.io.FileInputStream; 
import java.io.FileNotFoundException; 
import java.io.FileOutputStream; 
import java.io.IOException; 
import java.util.zip.Deflater; 
import java.util.zip.DeflaterOutputStream; 
import java.util.*; 
  
class compress 
{ 
    public static void main(String[] args) throws IOException {
        
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the File's Relative Path to be Compressed without the extension name : ");  
        String s= sc.nextLine();   
        long startTime = System.currentTimeMillis();
        FileInputStream fis=new FileInputStream(s+".txt");
        FileOutputStream fos=new FileOutputStream(s+"_Compressed.txt"); 
        DeflaterOutputStream dos=new DeflaterOutputStream(fos); 

        int data; 
        while ((data=fis.read())!=-1) 
        { 
            dos.write(data); 
        }
        long stopTime = System.currentTimeMillis();
        double elapsedTime = (stopTime - startTime)/1000;
        System.out.println("Compression Successfully Completed in "+elapsedTime +" Sec.");
        
        fis.close(); 
        dos.close(); 
    } 
}