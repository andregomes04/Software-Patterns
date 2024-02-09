package ex02;
import java.util.Scanner;

public class TextReader implements Reader {
    String file;
    Scanner s;
    TextReader(String file){
        this.file = file;
        s = new Scanner(file);
    }

    @Override
    public boolean hasNext() {
        return s.hasNextLine();
    }

    @Override
    public String next() {
        return s.nextLine();
    }
    
}
