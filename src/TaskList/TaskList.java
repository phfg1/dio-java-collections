package TaskList;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TaskList {
    private List<Task> taskList;

    public TaskList() {
        this.taskList = new ArrayList<>();
    }

    public void addTask(String description) {
        taskList.add(new Task(description));
    }

    public void removeTask(String description) {
        List<Task> taskToRemove = new ArrayList<>();
        for(Task t : taskList) {
            if (t.getDescription().equalsIgnoreCase(description)){
                taskToRemove.add(t);
            }
        }
        taskList.removeAll(taskToRemove);
    }

    public int totalTasks(){
        return taskList.size();
    }

    public void taskDescription() {
        System.out.println(taskList);
    }

    public static void main(String[] args) {
        TaskList taskList = new TaskList();
        Scanner scanner = new Scanner(System.in);
        int option;

        do{ 
            System.out.println("Selecione a opção desejada: ");
            System.out.println("1 - Add Tarefa");
            System.out.println("2 - Remove Tarefa");
            System.out.println("3 - Ver lista de tarefas");
            System.out.println("4 - Sair");
            option = scanner.nextInt();
            scanner.nextLine();

            switch (option) {
                case 1 : {
                    System.out.println("Descrição da tarefa: ");
                    taskList.addTask(scanner.nextLine());
                    break;
                }
                case 2 : {
                    System.out.println("Descrição da tarefa para remover: ");
                    taskList.removeTask(scanner.nextLine());
                    break;
                }
                case 3 : {
                    taskList.taskDescription();
                    break;
                }
                case 4 : {
                    System.out.println("Saindo do programa.");
                    break;
                }      
                default:
                    System.out.println("Opção inválida.");
                    break;
            }
            
                System.out.println("O numero de elementos na lista é: " + taskList.totalTasks());
            } while( option != 4);

            scanner.close();
        }


}
