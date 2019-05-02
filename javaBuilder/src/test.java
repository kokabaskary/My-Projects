import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class test {

	public static void main(String[] args) throws IOException {
		
		File fFile = new File("sqlinsert.txt");
		FileWriter fw = new FileWriter(fFile, false);
		
		for(int i=1; i<101; i++) {
			fw.write("insert into JPAEMPLOYEENEW values("
					+ i

					+ ", \'firstName" + i + "\'"

					+ ", \'lastName" + i + "\'"

					+ ", \'5551212" + i + "\'"

					+ ");\n"

					);
			
		}fw.close();
		
		
		
		

		}



		}



		

		

				
	
	
	


	  

	


