import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.Paths;
import java.util.Formatter;
import java.util.Scanner;

public class Decodificador {
	public static void main(String[] args) throws IOException, FileNotFoundException {
		Scanner input = new Scanner(Paths.get("SETI_message_modified.txt"));
		StringBuilder imagenUno = new StringBuilder();
		StringBuilder imagenDos = new StringBuilder();
		for (int contadorLinea = 1; contadorLinea <= 2271; contadorLinea++) {
			if (contadorLinea <= 757) {
				input.nextLine();
			}
			if (contadorLinea > 757 && contadorLinea <= 1514) {
				StringBuilder linea = new StringBuilder(input.nextLine().replace(' ', '0'));
				imagenUno.append(Integer.parseInt(linea.reverse().toString(), 2) + "\n");
			}
			if (contadorLinea > 1514 && contadorLinea <= 2271) {
				StringBuilder linea = new StringBuilder(input.nextLine().replace(' ', '0'));
				imagenDos.append(Integer.parseInt(linea.reverse().toString(), 2) + "\n");
			}
		}
		input.close();
		Formatter archivoImagenUno = new Formatter("imagenUno.txt");
		archivoImagenUno.format("%s", imagenUno.toString());
		archivoImagenUno.close();
		Formatter archivoImagenDos = new Formatter("imagenDos.txt");
		archivoImagenDos.format("%s", imagenDos.toString());
		archivoImagenDos.close();
	}
}