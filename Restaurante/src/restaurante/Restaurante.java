/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package restaurante;
import Classes.restaurante;
import java.util.Scanner;
/**
 *
 * @author senai
 */
public class Restaurante {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        restaurante restau = new restaurante();
        String pais;
        String nome;
        int controller;
        boolean verifica = false;
        while(verifica == false){
            System.out.println("Digite o digito corresponte para selecionar a opção desejada:");
            System.out.println("1 - Cadastrar Restaurante.");
            System.out.println("2 - Visualiazar todos os cardapios disponiveis.");
            System.out.println("3 - Visualizar um cadapio de um restaurante.");
            System.out.println("0 - Parar o sistema.");
            
            controller = leia.nextInt();
            switch(controller){
                case 0:
                    verifica = true;
                    System.out.println("Obrigado volte sempre!");
                break;
                case 1:
                    System.out.println("Qual pais fica restaurante?");
                    pais = leia.next();
                    System.out.println("Qual o nome do restaurante?");
                    nome = leia.next();
                    restau.CadastrarRestaurante(pais, nome);
                break;
                case 2:
                    restau.mostrarCadapios();
                break;
                case 3:
                    System.out.println("Qual pais você deseja ver?");
                    System.out.println("1 - Brasil");
                    System.out.println("2 - Argentina");
                    System.out.println("3 - Eua");
                    System.out.println("4 - Japao");
                    int cont = leia.nextInt();
                    switch(cont){
                        case 1:
                            restau.mostrarBra();
                        break;
                        case 2:
                            restau.mostrarArg();
                        break;
                        case 3:
                            restau.mostrarEua();
                        break;
                        case 4:
                            restau.mostrarJap();
                        break;
                        default:
                            System.out.println("Desculpe, não encontramos a opção digitada!");
                        break;
                    }           
                    break;
            }
        }
    } 
}
