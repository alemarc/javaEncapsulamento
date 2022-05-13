package Classes;
import java.util.ArrayList;

public class cardapio {
    
    ArrayList<lanche> lanchesBra = new ArrayList<>(100);
    ArrayList<lanche> lanchesArg = new ArrayList<>(100);
    ArrayList<lanche> lanchesEua = new ArrayList<>(100);
    ArrayList<lanche> lanchesJap = new ArrayList<>(100);
    
    //Brasil 
    void preencheLancheBrasil(String nome, String descricao, Double valor){
        lanche brasil = new lanche();
        brasil.nome = nome;
        brasil.descricao = descricao;
        brasil.valor = valor;
        
        lanchesBra.add(brasil);
        
    } 
    void removeItemBra(String nome){
        for(lanche l:lanchesBra){
            if(l.nome.equals(nome)){
                lanchesBra.remove(l);
                break;
            }
        }
    }
    void mostraBra(){
            System.out.println("=============Cardapio Brasil================");
        for(lanche l:lanchesBra){
            System.out.println(l.nome);
            System.out.println(l.descricao);
            System.out.println(String.valueOf(l.valor));
            System.out.println("--------------------------------------------");
        }
    }
    //argentina
    void preencheLancheArg(String nome, String descricao, Double valor){
        lanche argentina = new lanche();
        argentina.nome = nome;
        argentina.descricao = descricao;
        argentina.valor = valor;
        
        lanchesArg.add(argentina);
        
    } 
    void removeItemArg(String nome){
        for(lanche l:lanchesArg){
            if(l.nome.equals(nome)){
                lanchesArg.remove(l);
                break;
            }
        }
    }
    void mostraArg(){
            System.out.println("=============Cardapio Argentina================");
        for(lanche l:lanchesArg){
            System.out.println(l.nome);
            System.out.println(l.descricao);
            System.out.println(l.valor);
            System.out.println("--------------------------------------------");
        }
    }
    //Eua
    void preencheLancheEua(String nome, String descricao, Double valor){
        lanche eua = new lanche();
        eua.nome = nome;
        eua.descricao = descricao;
        eua.valor = valor;
        
        lanchesEua.add(eua);
        

    } 
    void removeItemEua(String nome){
        for(lanche l:lanchesEua){
            if(l.nome.equals(nome)){
                lanchesEua.remove(l);
                break;
            }
        }
    }
    void mostraEua(){
            System.out.println("=============Cardapio Eua================");
        for(lanche l:lanchesEua){
            System.out.println(l.nome);
            System.out.println(l.descricao);
            System.out.println(l.valor);
            System.out.println("--------------------------------------------");
        }
    }
    //Japao
    void preencheLancheJapao(String nome, String descricao, Double valor){
        lanche japao = new lanche();
        japao.nome = nome;
        japao.descricao = descricao;
        japao.valor = valor;
        
        lanchesJap.add(japao);
        
    } 
    void removeItemJap(String nome){
        for(lanche l:lanchesJap){
            if(l.nome.equals(nome)){
                lanchesJap.remove(l);
                break;
            }
        }
    }
    void mostraJap(){
            System.out.println("=============Cardapio Japão================");
        for(lanche l:lanchesJap){
            System.out.println(l.nome);
            System.out.println(l.descricao);
            System.out.println(l.valor);
            System.out.println("--------------------------------------------");
        }
    }
}
