package ex02;

public class CapitalizationFilter extends TextDecorator{

    CapitalizationFilter(Reader r) {super(r);}
    @Override
    public String next() {
        String nextline = r.next();
        int length = nextline.length();
        String firstchar = nextline.substring(0, 1);
        String restchar = nextline.substring(1, length - 1);
        String lastchar = nextline.substring(length - 1, length);
        String newstr = "";
        return newstr+firstchar.toUpperCase()+restchar+lastchar.toUpperCase()+" ";
    }
    
}
