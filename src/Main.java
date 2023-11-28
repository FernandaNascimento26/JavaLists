import java.util.LinkedList;

// Classe para representar um contato
class Contato {
    public String nome;
    public long contato;
    public String email;

    public Contato(String nome, long contato, String email) {
        this.nome = nome;
        this.contato = contato;
        this.email = email;
    }
}

// Função principal (exemplo de uso)
public class Main {
    public static void main(String[] args) {
        LinkedList<Contato> listaDeContatos = new LinkedList<>();

        // Adicionando contatos à lista
        listaDeContatos.add(new Contato("Maria", 1234567890, "maria@example.com"));
        listaDeContatos.add(new Contato("Joao", 98765432, "joao@example.com"));
        listaDeContatos.add(new Contato("Ana", 11112222333L, "ana@example.com")); // L após o número long

        // Mostrando os contatos da lista
        System.out.println("Lista de Contatos:");
        for (Contato contato : listaDeContatos) {
            System.out.println("Nome: " + contato.nome + ", Contato: " + contato.contato + ", Email: " + contato.email);
        }

        // Removendo um contato da lista
        listaDeContatos.removeIf(contato -> contato.nome.equals("Maria"));

        // Mostrando os contatos após a remoção
        System.out.println("\nLista de Contatos apos a remocao:");
        for (Contato contato : listaDeContatos) {
            System.out.println("Nome: " + contato.nome + ", Contato: " + contato.contato + ", Email: " + contato.email);
        }
    }
}
