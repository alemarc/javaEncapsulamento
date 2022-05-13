/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Classes;
import java.util.ArrayList;
/**
 *
 * @author senai
 */
public class restaurante {
     String pais;
     String nome;
     ArrayList<lanche> cardapios = new ArrayList<>(100);
     ArrayList<lanche> todosCardapios = new ArrayList<>(100);
     cardapio carda = new cardapio();
     
    public void CadastrarRestaurante(String pais, String nome){
        this.pais = pais;
        this.nome = nome;
        if(pais.equals("Brasil")){
            System.out.println("Resturante:" + nome);
            carda.preencheLancheBrasil("NecFeijoada", "Brasil", 20.00);
            carda.preencheLancheBrasil("NecBacon", "Brasil", 25.00);
            carda.preencheLancheBrasil("NecAcarajé", "Brasil", 60.00);
            carda.preencheLancheBrasil("NecPicanha", "Brasil", 80.00);
            carda.mostraBra();
        }else if(pais.equals("Argentina")){
            System.out.println("Resturante:" + nome);
            carda.preencheLancheArg("NecFeijoada", "Argentina", 20.00);
            carda.preencheLancheArg("NecBacon", "Argentina", 25.00);
            carda.preencheLancheArg("NecAcarajé", "Argentina", 60.00);
            carda.preencheLancheArg("NecPicanha", "Argentina", 80.00);
            carda.mostraArg();
        }else if(pais.equals("EUA")){
            System.out.println("Resturante:" + nome);
            carda.preencheLancheEua("NecFeijoada", "Eua", 20.00);
            carda.preencheLancheEua("NecBacon", "Eua", 25.00);
            carda.preencheLancheEua("NecAcarajé", "Eua", 60.00);
            carda.preencheLancheEua("NecPicanha", "Eua", 80.00);
            carda.mostraEua();
        }else if(pais.equals("Japao")){
            System.out.println("Resturante:" + nome);
            carda.preencheLancheJapao("NecFeijoada", "Japao", 20.00);
            carda.preencheLancheJapao("NecBacon", "Japao", 25.00);
            carda.preencheLancheJapao("NecAcarajé", "Japao", 60.00);
            carda.preencheLancheJapao("NecPicanha", "Japao", 80.00);
            carda.mostraJap();
        }
        
    }
    public void mostrarCadapios(){
            carda.preencheLancheBrasil("NecFeijoada", "Brasil", 20.00);
            carda.preencheLancheBrasil("NecBacon", "Brasil", 25.00);
            carda.preencheLancheBrasil("NecAcarajé", "Brasil", 60.00);
            carda.preencheLancheBrasil("NecPicanha", "Brasil", 80.00);
            carda.preencheLancheArg("NecFeijoada", "Argentina", 20.00);
            carda.preencheLancheArg("NecBacon", "Argentina", 25.00);
            carda.preencheLancheArg("NecAcarajé", "Argentina", 60.00);
            carda.preencheLancheArg("NecPicanha", "Argentina", 80.00);
            carda.preencheLancheEua("NecFeijoada", "Eua", 20.00);
            carda.preencheLancheEua("NecBacon", "Eua", 25.00);
            carda.preencheLancheEua("NecAcarajé", "Eua", 60.00);
            carda.preencheLancheEua("NecPicanha", "Eua", 80.00);
            carda.preencheLancheJapao("NecFeijoada", "Japao", 20.00);
            carda.preencheLancheJapao("NecBacon", "Japao", 25.00);
            carda.preencheLancheJapao("NecAcarajé", "Japao", 60.00);
            carda.preencheLancheJapao("NecPicanha", "Japao", 80.00);
            
            carda.mostraBra();
            carda.mostraArg();
            carda.mostraEua();
            carda.mostraJap();
    }
    
    public void mostrarBra(){
        carda.preencheLancheBrasil("NecFeijoada", "Brasil", 20.00);
        carda.preencheLancheBrasil("NecBacon", "Brasil", 25.00);
        carda.preencheLancheBrasil("NecAcarajé", "Brasil", 60.00);
        carda.preencheLancheBrasil("NecPicanha", "Brasil", 80.00);
        carda.mostraBra();
    }
    public void mostrarArg(){
        carda.preencheLancheArg("NecFeijoada", "Argentina", 20.00);
        carda.preencheLancheArg("NecBacon", "Argentina", 25.00);
        carda.preencheLancheArg("NecAcarajé", "Argentina", 60.00);
        carda.preencheLancheArg("NecPicanha", "Argentina", 80.00);
        carda.mostraArg();
    }
    public void mostrarEua(){
        carda.preencheLancheEua("NecFeijoada", "Eua", 20.00);
        carda.preencheLancheEua("NecBacon", "Eua", 25.00);
        carda.preencheLancheEua("NecAcarajé", "Eua", 60.00);
        carda.preencheLancheEua("NecPicanha", "Eua", 80.00);
        carda.mostraEua();
    }
    public void mostrarJap(){
        carda.preencheLancheJapao("NecFeijoada", "Japao", 20.00);
        carda.preencheLancheJapao("NecBacon", "Japao", 25.00);
        carda.preencheLancheJapao("NecAcarajé", "Japao", 60.00);
        carda.preencheLancheJapao("NecPicanha", "Japao", 80.00);
        carda.mostraJap();
    }
}
