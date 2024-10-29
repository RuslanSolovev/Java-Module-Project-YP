
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Race race = new Race();

        // Цикл для ввода данных о трех автомобилях
        for (int i = 1; i <= 3; i++) {
            System.out.println("Введите название автомобиля " + i + ":");
            String name = scanner.next();

            int speed;
            // Проверка на корректный ввод скорости
            while (true) {
                System.out.println("Введите скорость автомобиля " + i + " (от 0 до 250):");
                speed = scanner.nextInt();
                if (speed > 0 && speed <= 250) {
                    break;
                }
                System.out.println("Ошибка: скорость должна быть от 0 до 250. Попробуйте снова.");
            }

            // Создаем объект автомобиля и проверяем, стал ли он новым лидером
            Car car = new Car(name, speed);
            race.updateLeader(car);
        }

        // Выводим название автомобиля-победителя
        System.out.println("Самая быстрая машина: " + race.getLeaderName());
        scanner.close();
    }
}
