//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) throws InterruptedException {
        Thread task1 = new Thread(()->{
            for (int i = 0; i < 100; i++) {
                System.out.println("Thread -1: "+i);
            }
        });
        Thread task2 = new Thread(()->{
            for (int i = 0; i < 100; i++) {
                System.out.println("Thread -2: "+i);
            }
        });

        task2.setName("Deamon thread");
        task2.setDaemon(true); // Фоновый поток

        task1.start(); //Запуск первого потока
        task2.start();



        task1.join(); //Ожидание пока поток не закочиться
        System.out.println("Thread is finish");


    }
}