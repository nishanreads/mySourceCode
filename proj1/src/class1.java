import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import org.w3c.tools.codec.*;
import java.io.ByteArrayOutputStream;
import java.io.DataOutputStream;
import java.io.IOException;

public class class1 
{
	public static void main(String[] args) throws Base64FormatException, IOException 
	{
		/*BufferedReader br = null;
		try 
		{
			String sCurrentLine;
			//br = new BufferedReader(new FileReader("C:\\testing.txt"));
			br = new BufferedReader(new FileReader("C:\\PDF1.pdf"));
			System.out.println(br.toString());
			while ((sCurrentLine = br.readLine()) != null) 
			{
				System.out.println(sCurrentLine);
			}

		} 
		catch (IOException e) 
		{
			e.printStackTrace();
		} finally {
			try {
				if (br != null)br.close();
			} catch (IOException ex) {
				ex.printStackTrace();
			}
		}*/

/*		String strFileName  = "C:\\Desert.jpg";
		java.io.File objFile = new java.io.File(strFileName);
		System.out.println(objFile);*/
		
		File file1 =new File("C:\\1.pdf");
		double bytes = file1.length();
		System.out.println("KILO bytes in terms of SIZE : " + bytes/1024);
		
		
		java.io.DataInputStream dis = null;
		byte buffer [] = null;
		
		try
		{
			dis = new java.io.DataInputStream(new java.io.FileInputStream(file1));	
			
			buffer= new byte[dis.available()];				
			dis.readFully(buffer);
			System.out.println(buffer.length);
			dis.close();
		}
		catch (Exception e)
		{
			//throw new PRRuntimeException("Can't continue with file upload. Can't read File ");			
		}
		
		//String strFileData = Base64Util.encodeToString(buffer);
		String pwd = "aa";
		Base64Encoder encoder = new Base64Encoder (buffer.toString());
		//System.out.println(encoder.processString());
		String encodedWord = encoder.processString();
		Base64Decoder decoder = new Base64Decoder(encodedWord);
		//System.out.println(decoder.processString());
		String s = decoder.processString();
		
		ByteArrayOutputStream baos = null;
	      DataOutputStream dos = null;
	      
	   // create byte array output stream
	         baos = new ByteArrayOutputStream();
	         
	         // create data output stream
	         dos = new DataOutputStream(baos);
	         
	         // write to the output stream from the string
	         dos.writeBytes(s);
	         System.out.println(" IMPORTANT :: "+dos.size());
	         
	         // flushes bytes to underlying output stream
	         dos.flush();
	   
	         System.out.println(s+" in bytes:");
	         
	         // for each byte in the buffer content
	         for(byte b:baos.toByteArray())
	         {   
	            // print byte
	            System.out.print(b + ",");
	         }
	      
		
	}
}










