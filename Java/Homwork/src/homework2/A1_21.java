package homework2;

public class A1_21 {

	static String[] hexabin = { "0000", "0001", "0010", "0011", 
			"0100", "0101", "0110", "0111", "1000", "1001", "1010",
			"1011", "1100", "1101", "1110", "1111" };

	public static void print(String s) {
		for (int i = 0; i < s.length(); i++) {
			char c = s.charAt(i);
			int index = 0;
			if (c >= '0' && c <= '9')
				index = (c - '0');
			if (c >= 'a' && c <= 'f')
				index = 10 + (c - 'a');
			System.out.print(hexabin[index] + " ");
		}
		//System.out.print("");
	}

	public static void main(String args[]) {

		print("1abc");
	}
}
