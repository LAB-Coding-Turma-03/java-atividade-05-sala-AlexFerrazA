package br.com.impacta.models;
public class Produto{

    public int codigo;
    public String descricao;
    public double valor;

    public int getCodigo(){
        return codigo;
    } 

    public void setCodigo(int codigo){
        this.codigo = codigo;
    }

    public String getDescricao(){
        return descricao;
    } 

    public void setDescricao(String descricao){
        this.descricao = descricao;
    }

    public double getvalor(){
        return valor;
    } 

    public void setValor(double valor){
        this.valor = valor;
    }


    public String montarResumo(Produto produto){
      String retorno = "código: " + getCodigo() +", descricao: "+ getDescricao() + ",valor: " + getvalor(); 
    
      return retorno;
    }
  
}
