
import java.io.BufferedReader;
import java.io.File; //파일 클래스는 파일을 관리하는 기능 제공
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileInputOutput {
	private String filename; 
	
	FileInputOutput(String fname){
		filename = fname;
	}

	File file = new File("./filename.txt");
	
	public void loadLine() {
		String line = null;
		try {
			FileReader reader = new FileReader(filename);
			BufferedReader bufReader = new BufferedReader(reader);
			while((line = bufReader.readLine()) != null) {
				System.out.println(line);
			}
			bufReader.close();
		}catch(FileNotFoundException e) {
			System.out.println("파일 열기에 실패 했습니다. 파일명xx:" + filename);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}	//버퍼를 이용해서 파일에 텍스트 데이터를 출력하기. 한 줄씩 출력하기.
	
}

