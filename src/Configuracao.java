// Singleton usando Padrão de Projeto Singleton
public class Configuracao {

    private static Configuracao instancia; // A instância única
    private String nomeDoSistema;

    // Construtor privado para evitar criação de instâncias fora da classe
    private Configuracao() {
        nomeDoSistema = "Configuração Padrão";
    }

    // Método para obter a instância única da Configuracao
    public static Configuracao getInstancia() {
        if (instancia == null) {
            instancia = new Configuracao();
        }
        return instancia;
    }

    // Métodos para acessar e modificar a configuração
    public String getNomeDoSistema() {
        return nomeDoSistema;
    }

    public void setNomeDoSistema(String novoNome) {
        nomeDoSistema = novoNome;
    }
}

