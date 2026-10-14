import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
          ArrayList<Contato> lista = new ArrayList<>(); 
          Scanner leitor = new Scanner (System.in);    

                int opcao = 0;
                while (opcao != 5){
                    System.out.println("============= AGENDA DE CONTATOS  =============");
                    System.out.println("1 - Adicionar contato");
                    System.out.println("2 - Listar todos os contatos");
                    System.out.println("3 - Buscar contato por nome");
                    System.out.println("4 - Remover contato");
                    System.out.println("5 - Sair");
                    System.out.println("Digite uma opção: ");
                    opcao = leitor.nextInt();

                    // adicionar contato
                    if (opcao == 1){
                        System.out.println("Digite o nome do contato: ");
                        String nome = leitor.next();
                        System.out.println("Digite o telefone do contato (com o ddd):");
                        String telefone = leitor.next();
                        System.out.println("Digite o email do contato: ");
                        String email = leitor.next();
                        Contato contato = new Contato(nome, telefone, email);
                        lista.add(contato);
                        System.out.println("Contato adicionado com sucesso!!" );
                        System.out.println(contato);
                    }

                    // listar todos os contatos
                    if (opcao == 2 ){
                        System.out.println(" ============== CONTATOS CADASTRADOS =============");
                        for (Contato contato : lista){
                            System.out.println(contato);
                        }
                    }

                    // buscar contato por nome
                    if (opcao == 3){
                        System.out.println("Digite o nome do contato que deseja fazer a busca:");
                        String nomeBusca = leitor.next();
                        boolean encontrado = false;
                        System.out.println(" ============== RESULTADO DA BUSCA =============");

                        for (Contato contato : lista){
                                if (contato.getNome().equalsIgnoreCase(nomeBusca)){
                                    System.out.println("Contato encontrado:" );
                                    System.out.println(contato);
                                    encontrado = true;
                                } 
                            } // fim do for 
                            if (encontrado == false) {
                                System.out.println("Contato não encontrado.");
                            }
                    } 
                    // remover contato
                    if (opcao == 4){
                        System.out.println("Digite o nome do contato que você quer remover:");
                        String removerNome = leitor.next();
                        boolean encontrado = false;

                        for (Contato contato : lista){
                            if (contato.getNome().equalsIgnoreCase(removerNome)){
                                lista.remove(contato);
                                System.out.println("Contato removido com sucesso!");
                                encontrado = true;
                                break;
                            } 
                        } // fim do for 
                            if(encontrado == false) {
                                System.out.println("Não foi possivel remover o contato.");
                            }
                        }

                    // sair 
                    if (opcao == 5){
                        System.out.println("Saindo do programa...");
                    }
            }
        }
     }
            
            
    
    


