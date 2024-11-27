import java.util.ArrayList;
import java.util.HashMap;

public class TaskTracker {
    private HashMap<String, ArrayList<Integer>> completedExercises;

    public TaskTracker() {
        // Inicializa o HashMap para armazenar os exercícios concluídos por usuário.
        this.completedExercises = new HashMap<>();
    }

    public void add(String user, int exercise) {
        // Adiciona uma lista vazia para um novo usuário, caso ainda não tenha sido adicionada.
        this.completedExercises.putIfAbsent(user, new ArrayList<>());

        // Recupera a lista de exercícios concluídos pelo usuário e adiciona o novo exercício.
        ArrayList<Integer> completed = this.completedExercises.get(user);
        completed.add(exercise);

        // O trecho anterior também funcionaria sem a variável auxiliar, da seguinte forma:
        // this.completedExercises.get(user).add(exercise);
    }

    public void print() {
        // Itera sobre as chaves do mapa para imprimir os usuários e seus exercícios concluídos.
        for (String name: completedExercises.keySet()) {
            System.out.println(name + ": " + completedExercises.get(name));
        }
    }
}
