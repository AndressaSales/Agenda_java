public class Agenda {
    private String nome;
    private Contatos[] contatos;


    public String getNome(){
        return nome;
    }
    public void setNome(String nome){
        this.nome = nome;
    }

    public Contatos[] getContatos(){
        return contatos;
    }
    public void setContatos(Contatos[] contatos){
        this.contatos = contatos;
    }

    public String obterInfo(){
        String info = "Nome: " + nome + "\n";
        if(contatos != null){
            for(Contatos c : contatos){
                info += c.obterInfo() + "\n";
            }
        }
        return info;
    }
}
