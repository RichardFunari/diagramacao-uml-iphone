package funcoes.navegadorinternet;

public class Safari implements NavegadorNaInternet {

    public void exibirPagina() {
        System.out.println("Exibindo página no navegador Safari");
    }

    public void adicionarNovaAba() {
        System.out.println("Abrindo nova aba no navegador Safari");
    }

    public void atualizarPagina() {
        System.out.println("A página do Safari foi atualizada");
    }

    public void fecharAba() {
        System.out.println("Fechando aba do navegador Safari");
    }

    public void fecharNavegador() {
        System.out.println("O navegador Safari será fechado");
    }

}
