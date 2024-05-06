import java.io.FileInputStream; 
import java.io.FileOutputStream; 
import java.io.IOException;
import java.util.Scanner;
import java.util.zip.InflaterInputStream; 

class decompress
{ 
	public static void main(String[] args) throws IOException { 
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the File's Relative Path to Decompress without the extension name: ");  
        String s= sc.nextLine();   
        long startTime = System.currentTimeMillis();
        FileInputStream fis=new FileInputStream(s+".txt");
        FileOutputStream fos=new FileOutputStream(s+"_Decompressed.txt");  
		InflaterInputStream iis=new InflaterInputStream(fis); 
		int text; 
		while((text=iis.read())!=-1) 
		{ 
			fos.write(text); 
		} 
		long stopTime = System.currentTimeMillis();
        double elapsedTime = (stopTime - startTime)/1000;
        System.out.println("Compression Successfully Completed in "+elapsedTime +" Sec.");
		fos.close(); 
		iis.close(); 
		
	} 
}
