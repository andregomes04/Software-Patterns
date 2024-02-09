package ex02;

public class TermFilter extends TextDecorator{
    TermFilter(Reader r) {super(r);}

    @Override
    public String next() {
        String nextline = r.next();
        return nextline.split(" ")[0];
    }
    
}
