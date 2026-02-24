package Bloco4.Exerc14;

import java.util.HashSet;
import java.util.Set;

public class UnicidadeEmails {
    public static void main (String[] args){
        Set<String> emails = new HashSet<>();
        emails.add("giulliameneses@gmail.com");
        emails.add("mariaeduarda@gmail.com");
        emails.add("giulliameneses@gmail.com");
        emails.add("luisacamargo@uol.com");

        System.out.printf("Tamanho do Set: " + emails.size());
    }
}
