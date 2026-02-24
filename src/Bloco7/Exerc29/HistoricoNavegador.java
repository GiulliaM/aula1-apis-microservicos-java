package Bloco7.Exerc29;


import java.util.LinkedList;

public class HistoricoNavegador {

    private LinkedList<String> historico = new LinkedList<>();
    private int indiceAtual = -1;

    public void visitar(String url){
        while (historico.size() > indiceAtual + 1){
            historico.removeLast();
        }

        historico.add(url);
        indiceAtual++;
        System.out.println("Visitando site: " + url);
    }

    public void voltar(){
        if(indiceAtual > 0){
            indiceAtual--;
            System.out.println("Voltando para site: " + historico.get(indiceAtual));
        }else{
            System.out.println("Não há páginas anteriores");
        }
    }

    public void avancar(){
        if(indiceAtual > 0){
            indiceAtual--;
            System.out.println("Avançando para site: " + historico.get(indiceAtual));
        }else{
            System.out.println("Você esta na página mais recente");
        }
    }

    public void estadoAtual(){
        System.out.println("\nHistórico Atual: " + historico);
        System.out.println("Página Atual: " + (indiceAtual != -1 ? historico.get(indiceAtual) : "Nenhuma"));
        System.out.println("----------------------------");
    }

    public static void main(String[] args){
        HistoricoNavegador nav = new HistoricoNavegador();

        nav.visitar("youtubemusic.com");
        nav.visitar("github.com");
        nav.visitar("sesc.com.br");
        nav.estadoAtual();

        nav.voltar(); // Volta para github
        nav.voltar(); // Volta para google
        nav.estadoAtual();

        nav.avancar();
        nav.visitar("youtube.com");

        nav.estadoAtual();
    }
}
