package impl;

public class Main {
    public static void main(String[] args) {
        Iphone phone = new Iphone();
        phone.tocar();
        phone.selecionarMusica("Bohemian Rhapsody");
        phone.pausar();
        phone.ligar("+55 21 99999-9999");
        phone.atender();
        phone.iniciarCorreioVoz();
        phone.exibirPagina("https://www.google.com");
        phone.adicionarNovaAba();
        phone.atualizarPagina();
    }
}
