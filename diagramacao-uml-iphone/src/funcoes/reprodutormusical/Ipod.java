package funcoes.reprodutormusical;

public class Ipod implements ReprodutorMusical {

    public void tocar() {
        System.out.println("Tocando música no Ipod");
    }

    public void pausar() {
        System.out.println("Música pausada no Ipod");
    }

    public void selecionarMusica() {
        System.out.println("Selecionando nova música no Ipod");
    }

    public void aumentarVolume() {
        System.out.println("Aumentando o volume do Ipod");
    }

    public void diminuirVolume() {
        System.out.println("Diminuindo o volume do Ipod");
    }
}
