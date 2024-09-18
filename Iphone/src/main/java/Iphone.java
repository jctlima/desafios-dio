public class Iphone implements ReprodutorMusical, AparelhoTelefonico, NavegadorInternet {

    // Atributos relacionados ao reprodutor musical
    private String faixaAtual;

    // Atributos relacionados ao aparelho telefônico
    private String numeroAtual;

    // Atributos relacionados ao navegador
    private String paginaAtual;

    // Implementação de métodos da interface ReprodutorMusical
    @Override
    public void play() {
        System.out.println("Reproduzindo a faixa: " + faixaAtual);
    }

    @Override
    public void pause() {
        System.out.println("Faixa pausada.");
    }

    @Override
    public void stop() {
        System.out.println("Reprodução parada.");
    }

    @Override
    public void selecionarFaixa(String faixa) {
        this.faixaAtual = faixa;
        System.out.println("Faixa selecionada: " + faixa);
    }

    // Implementação de métodos da interface AparelhoTelefonico
    @Override
    public void fazerChamada(String numero) {
        this.numeroAtual = numero;
        System.out.println("Ligando para: " + numero);
    }

    @Override
    public void receberChamada(String numero) {
        System.out.println("Recebendo chamada de: " + numero);
    }

    // Implementação de métodos da interface NavegadorInternet
    @Override
    public void abrirPagina(String url) {
        this.paginaAtual = url;
        System.out.println("Abrindo a página: " + url);
    }

    @Override
    public void atualizarPagina() {
        System.out.println("Atualizando a página: " + paginaAtual);
    }

    @Override
    public void fecharPagina() {
        System.out.println("Fechando a página.");
    }
}
