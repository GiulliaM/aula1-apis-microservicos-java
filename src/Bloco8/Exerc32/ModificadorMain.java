package Bloco8.Exerc32;

import java.lang.reflect.Field;

public class ModificadorMain {
    public static void main (String[] args){
        try{
            Configuracao objetoInstanciado = new Configuracao();

            Field field = objetoInstanciado.getClass().getDeclaredField("urlConexao");
            field.setAccessible(true);

            System.out.println("Valor original: " + field.get(objetoInstanciado));

            field.set(objetoInstanciado, "db.producao.com:5432");

            String valorVerificado = (String) field.get(objetoInstanciado);
            System.out.println("Valor alterado via Reflection: " + valorVerificado);
        } catch (NoSuchFieldException e) {
            System.out.println("Erro: O nome do atributo 'urlConexao' não foi encontrado.");
        } catch (IllegalAccessException e) {
            System.out.println("Erro: Não foi possível acessar o atributo.");
        }
    }
}
