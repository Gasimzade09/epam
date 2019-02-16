import java.io.*;
import java.util.Scanner;

public class SearchCsv {
    public static void main(String[] args) {
        SearchCsv s = new SearchCsv();
        s.search();
    }

    public void search(){
        Scanner sc = new Scanner(System.in);
        String word = sc.next();
        String folderName = System.getProperty("user.dir") + "\\src\\example";
        String fullName = folderName + File.separator;
        String fileName = fullName + "test.csv";
        String result = fullName + "result.csv";
        FileReader reader;
        String text;
        BufferedReader br;
        try {
            reader = new FileReader(fileName);
            br = new BufferedReader(reader);
            while ((text = br.readLine())!= "\n" && text !=null){
                System.out.println(text);
                if(text.contains(word)){
                    File file = new File(result);
                    file.createNewFile();
                    FileWriter writer = new FileWriter(file, true);
                    writer.write(text);
                    writer.append('\n');
                    writer.flush();
                }
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
