package ex02;

public class NormalizationFilter extends TextDecorator{

    NormalizationFilter(Reader r) {super(r);}
    @Override
    public String next() {
        String nextline = r.next();
        return nextline.replaceAll("\\p{P}", "");
    }
    
}
