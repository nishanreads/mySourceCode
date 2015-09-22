import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import org.w3c.tools.codec.*;

import java.io.ByteArrayOutputStream;
import java.io.DataOutputStream;

public class readFileEncodeDecode {

	/**
	 * @param args
	 * @throws FileNotFoundException 
	 */
	public static void main(String[] args) throws FileNotFoundException 
	{
		
		
		File file1 =new File("C:\\1.pdf");
		double bytes = file1.length();
		System.out.println("size of i/p -- " + bytes);
		
		
		java.io.DataInputStream dis = null;
		byte buffer [] = null; // byte array
		
		try
		{
			dis = new java.io.DataInputStream(new java.io.FileInputStream(file1));				
			buffer= new byte[dis.available()];				
			dis.readFully(buffer);
			dis.close();
		}
		catch (Exception e)
		{
			//throw new PRRuntimeException("Can't continue with file upload. Can't read File ");			
		}
		
		Base64Encoder encoder = new Base64Encoder (buffer.toString());
		System.out.println("size of buffer -- "+buffer.length);
		
		String strFileData =encoder.toString();
		//System.out.println(" strFile Data is in Encoded format :: "+strFileData);
		
		Base64Decoder decoder = new Base64Decoder(strFileData);
		
		//byte[] valueDecoded= decoder. 
				
				//Base64.decodeBase64(bytesEncoded );
		
		
		//FileOutputStream imageOutFile = new FileOutputStream("C:\\1.pdf");
		
		
		

	}

}
