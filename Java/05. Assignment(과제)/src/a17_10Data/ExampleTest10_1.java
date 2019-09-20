package a17_10Data;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class ExampleTest10_1 {

	public static void main(String[] args) {
		try {
			FileReader fr1=new FileReader("input1.txt");
			BufferedReader br1=new BufferedReader(fr1);
			FileReader fr2=new FileReader("input2.txt");
			BufferedReader br2=new BufferedReader(fr2);
			FileWriter fr3=new FileWriter("output7.txt");
			PrintWriter br3=new PrintWriter(fr3);
			int counter=0;
			while(true) {
				String line =br1.readLine();
				if(line==null) break;
				br3.println(line);
			}
			while(true) {
				String line =br2.readLine();
				if(line==null) break;
				br3.println(line);
			}
			br3.flush();
			fr1.close();
			fr2.close();
			fr3.close();
		}catch(IOException e) {
			e.printStackTrace();
		}
	}
}