package Iphone;

public class Main {
    public static void main(String[] args) {
        Smartphone smartphone = new Smartphone();
        
        // Testando Reprodutor Musical
        smartphone.selecionarMusica("Imagine - John Lennon");  // Passando uma String como esperado
        smartphone.tocar();
        smartphone.pausar();
        
        // Testando Aparelho Telefônico
        smartphone.ligar("123456789");
        smartphone.atender();
        smartphone.iniciarCorreioVoz();
        
        // Testando Navegador Internet
        smartphone.exibirPagina("www.google.com");
        smartphone.adicionarNovaAba();
        smartphone.atualizarPagina();
    }
}
