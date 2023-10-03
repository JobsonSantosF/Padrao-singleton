// Classe de exemplo que usa a configuração
public class Sistema {

    public static void main(String[] args) {
        // Obtendo a instância única da Configuracao
        Configuracao configuracao = Configuracao.getInstancia();

        // Imprimindo o nome do sistema
        System.out.println("Nome do Sistema: " + configuracao.getNomeDoSistema());

        // Modificando o nome do sistema através da instância única
        configuracao.setNomeDoSistema("Sistema de Exemplo");

        // Obtendo a instância novamente e verificando se o nome foi alterado
        Configuracao novaConfiguracao = Configuracao.getInstancia();
        System.out.println("Nome do Sistema (Após Modificação): " + novaConfiguracao.getNomeDoSistema());
    }
}
