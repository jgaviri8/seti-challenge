import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class ConversorDeArchivo {
	public static void main(String[] args) throws IOException {
		FileInputStream in = null;
		FileOutputStream out = null;
		
		try {
			in = new FileInputStream("SETI_message.txt");
			out = new FileOutputStream("SETI_message_modified.txt");
			
			int contadorColumnas = 0;
			int c;
			
			while((c = in.read()) != -1) {
				if(c==48)
					out.write(32);
				else
					out.write(c);
				contadorColumnas += 1;
				if(contadorColumnas == 359) {
					out.write(13);
					out.write(10);
					contadorColumnas = 0;
				}
			}
		}  finally {
            if (in != null) {
                in.close();
            }
            if (out != null) {
                out.close();
            }
        }
	}
}