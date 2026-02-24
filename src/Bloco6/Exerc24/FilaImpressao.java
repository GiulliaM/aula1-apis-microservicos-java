package Bloco6.Exerc24;

import java.util.LinkedList;
import java.util.Queue;

public class FilaImpressao {
    public static void main (String[] args){
        Queue<String> fila = new LinkedList<>();

        fila.add("Documento1.pdf");
        fila.add("Foto_Passeio.png");
        fila.add("Relatorio_Final.docx");
        fila.add("Contrato_Assinado.pdf");
        fila.add("Seminário.pptx");

        System.out.println("Iniciando fila de impressão");

        while (!fila.isEmpty()) {
            String documentoAtual = fila.poll();
            System.out.println("Imprimindo: " + documentoAtual);
        }

        System.out.println("\nFila vazia. Todos os documentos foram impressos.");
    }
}
