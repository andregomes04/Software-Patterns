package ex02;

public class VowelFilter extends TextDecorator{

    VowelFilter(Reader r) {super(r);}
    @Override
    public String next() {
        String nextline = r.next();
        return nextline.replaceAll("[aeiou]", "");
    }
}
