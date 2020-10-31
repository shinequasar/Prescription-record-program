
import java.io.BufferedReader;
import java.io.File; //���� Ŭ������ ������ �����ϴ� ��� ����
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
			System.out.println("���� ���⿡ ���� �߽��ϴ�. ���ϸ�xx:" + filename);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}	//���۸� �̿��ؼ� ���Ͽ� �ؽ�Ʈ �����͸� ����ϱ�. �� �پ� ����ϱ�.
	
}

