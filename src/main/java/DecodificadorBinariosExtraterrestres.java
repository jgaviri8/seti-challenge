import java.math.BigInteger;

public class DecodificadorBinariosExtraterrestres {

	public static void main(String[] args) {
		String[] cadenas = {(new StringBuilder("                                                             1  111  1 1      11     1 111111  111      111  1  11".replace(' ', '0'))).reverse().toString(),
							(new StringBuilder("                                                                                                                        1    1    1  1 11   1 1 1     1  11 1 111 1 11  11111".replace(' ', '0'))).reverse().toString(),
							(new StringBuilder("                                                                 1111   11  1 11  111    1   11 11111 111 1  1 111 1".replace(' ', '0'))).reverse().toString(),
							(new StringBuilder("                                                                                                                          1   1 1 1 11 1 1  1111111 11 11  1 11 11 11 1     111".replace(' ', '0'))).reverse().toString(),
							(new StringBuilder("                                                                              1 11 1 1 1   1    111 1 1 1 111    1   1  1     1 111".replace(' ', '0'))).reverse().toString(),
							(new StringBuilder("                                                                                                                                 1 111     1  11111     11   11 1111     1   11    11".replace(' ', '0'))).reverse().toString(),
							(new StringBuilder("                                                                                                 1  111 1   11 11 1 1      1 11  1  1111  11   1 1 1 1".replace(' ', '0'))).reverse().toString(),
							(new StringBuilder("                                                                                                                                                     11 1111111  11  111 1111 1   1   1111 111  11111 11".replace(' ', '0'))).reverse().toString()};
		for (int i = 0; i < cadenas.length; i++) {
			System.out.printf("%d%n", new BigInteger(cadenas[i], 2));
		}
	}

}
