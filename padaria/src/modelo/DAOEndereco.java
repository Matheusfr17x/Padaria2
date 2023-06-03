package modelo;

import java.util.List;

public class DAOEndereco {
    
    public List<Endereco> getLista(){ // DATA ACESS OBJECT
        return Dados.listaEndereco;
    }
    
     public boolean salvar(Endereco obj){
        if(obj.getCodEndereco() == null){
            Integer codigo = Dados.listaEndereco.size() + 1;
            obj.setCodEndereco(codigo);
            Dados.listaEndereco.add(obj);
        }
        return true;
    }
    
    public boolean remover(Cliente obj){
        Dados.listaEndereco.remove(obj);
        return true;
    }
}
