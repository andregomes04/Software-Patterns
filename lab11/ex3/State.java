package ex3;

public interface State {        // interface Estado com todos os métodos
    public void regista(Livro livro);
    public void requisista(Livro livro);
    public void devolve(Livro livro);
    public void reserva(Livro livro);
    public void cancelaReserva(Livro livro);
}

class Inventario implements State{  // uma classe para cada estado, apenas implementamos os métodos que são possíveis

    @Override
    public void regista(Livro livro) {
        livro.setState(new Disponivel());
        System.out.println("O livro " + livro.getName() + " encontra-se disponível.\n");
    }

    @Override
    public void requisista(Livro livro) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("'requisista' não é possível");
    }

    @Override
    public void devolve(Livro livro) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException(" 'devolve' não é possível");
    }

    @Override
    public void reserva(Livro livro) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException(" 'reserva' não é possível");
    }

    @Override
    public void cancelaReserva(Livro livro) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException(" 'cancelaReserva' não é possível");
    }
}

class Disponivel implements State{

    @Override
    public void regista(Livro livro) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException(" 'regista' não é possível");
    }

    @Override
    public void requisista(Livro livro) {
        livro.setState(new Emprestado());
        System.out.println("O livro " + livro.getName() + " encontra-se emprestado.\n");
    }

    @Override
    public void devolve(Livro livro) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException(" 'devolve' não é possível");
    }

    @Override
    public void reserva(Livro livro) {
        livro.setState(new Reservado());
        System.out.println("O livro " + livro.getName() + " encontra-se reservado.\n");
    }

    @Override
    public void cancelaReserva(Livro livro) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException(" 'cancelaReserva' não é possível");
    }

}

class Emprestado implements State{

    @Override
    public void regista(Livro livro) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException(" 'regista' não é possível");
    }

    @Override
    public void requisista(Livro livro) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException(" 'requisista' não é possível");
    }

    @Override
    public void devolve(Livro livro) {
        livro.setState(new Disponivel());
        System.out.println("O livro " + livro.getName() + " encontra-se disponível.\n");
    }

    @Override
    public void reserva(Livro livro) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException(" 'reserva' não é possível");
    }

    @Override
    public void cancelaReserva(Livro livro) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException(" 'cancelaReserva' não é possível");
    }

}

class Reservado implements State{

    @Override
    public void regista(Livro livro) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException(" 'regista' não é possível");
    }

    @Override
    public void requisista(Livro livro) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException(" 'requisista' não é possível");
    }

    @Override
    public void devolve(Livro livro) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException(" 'devolve' não é possível");
    }

    @Override
    public void reserva(Livro livro) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException(" 'reserva' não é possível");
    }

    @Override
    public void cancelaReserva(Livro livro) {
        livro.setState(new Disponivel());
        System.out.println("O livro " + livro.getName() + " encontra-se disponível.\n");
    }

}
