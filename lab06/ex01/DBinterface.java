package ex01;

import java.util.List;

public interface DBinterface {
    public void insere(Empregado emp);
    public void remove(int codigo);
    public boolean isEmpregado(int codigo);
    public List<Empregado> listaDeEmpregados();
}
