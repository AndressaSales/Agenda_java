import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        
        Scanner tela = new Scanner(System.in);

        System.out.println("Entre com o nome da agenda: ");
        String nome = tela.nextLine();

        Agenda agenda = new Agenda();
        agenda.setNome(nome);
        
        Contatos[] contatos = new Contatos[3];
        for(int i = 0; i < 3; i++){
            System.out.println("Entre com as informações do contato" + (i + 1));
            Contatos c = new Contatos();

            System.out.println("Entre com o nome: ");
            nome = tela.nextLine();
            c.setNome(nome);

            System.out.println("Entre com o telefone: ");
            String telefone = tela.nextLine();
            c.setTelefone(telefone);

            System.out.println("Entre com o email: ");
            String email = tela.nextLine();
            c.setEmail(email);

            contatos[i] = c;
        }
        agenda.setContatos(contatos);

       if(agenda != null){
         System.out.println(agenda.obterInfo());
       }
        
    }
}
