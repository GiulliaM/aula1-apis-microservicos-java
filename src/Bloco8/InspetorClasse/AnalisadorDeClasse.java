package Bloco8.InspetorClasse;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class AnalisadorDeClasse {
    public static void inspecionar(Object obj){
        if (obj == null){
            System.out.println("O objeto fornecido é nulo");
            return;
        }
        Class<?> clazz = obj.getClass();

        System.out.println("Inspeção de Classe:");
        System.out.println("Nome completo da classe: " + clazz.getName());

        System.out.println("Atributos da classe: ");
        Field[] campos = clazz.getDeclaredFields();
        for (Field f : campos){
            System.out.println("- " + f.getName() + " (Tipo: " + f.getType().getSimpleName() + ")");
        }

        System.out.println("Métodos da classe: ");
        Method[] metodos = clazz.getDeclaredMethods();
        for (Method m : metodos) {
            System.out.println("- " + m.getName() + " (Retorno: " + m.getReturnType().getSimpleName() + ")");
        }
    }

    public static void main(String[] args) {
        Produto p = new Produto(101, "Tablet para design", 5000.0);

        inspecionar(p);
    }
}
