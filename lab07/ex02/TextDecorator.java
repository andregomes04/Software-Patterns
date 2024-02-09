package ex02;

public class TextDecorator implements Reader{
    protected Reader r;
    TextDecorator(Reader r){
        this.r = r;
    }

    @Override
    public boolean hasNext() {
       return r.hasNext();
    }

    @Override
    public String next() {
        return r.next();
    }
    
}
