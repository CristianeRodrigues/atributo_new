/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atributo_new;

/**
 *
 * @author Cristiane
 */
public class Funcionario {
    int codigo;
    String funcao;
    Endereco end;
    
    public void setCodigo(int codigo){
        this.codigo = codigo;
        System.out.println("código");
    }
    
    public void cadastrarEndereco(Endereco end){
        this.end = end;
    }
    
    public void setCidade(String cidade){
        float indice = 50;
        end.cidade=cidade;
    }
    public String getNumero(){
        return end.numero;
    }
}
