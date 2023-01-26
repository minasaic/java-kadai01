import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

class Scores1 {

	public static void main(String[] args) {
	try(BufferedReader reader= Files.newBufferedReader(
				Paths.get(".","java-kadai01","scores.csv"))){
					String line =" ";
					while((line = reader.readLine()) != null){
						System.out.println(line);
					}
					reader.close();
			}catch(IOException e){
				e.printStackTrace();
			}
	}
}
