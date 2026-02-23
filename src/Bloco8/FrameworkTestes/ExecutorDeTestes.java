package Bloco8.FrameworkTestes;

import java.lang.reflect.Method;

public class ExecutorDeTestes {
    public static void executarTestes(Object obj){
        Method[] metodos = obj.getClass().getDeclaredMethods();

        for (Method method : metodos) {
            if(method.isAnnotationPresent(Teste.class)){
                try {
                    method.invoke(obj);
                }catch (Exception e) {
                    System.out.println("Erro ao invocar o método: " + method.getName());
                }
            }
        }
    }

    public static void main (String[] args){
        MinhaClasseDeTeste minhaClasseDeTeste = new MinhaClasseDeTeste();

        executarTestes(minhaClasseDeTeste);
    }
}
