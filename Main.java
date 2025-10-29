public class Main {
    public static void main(String[] args) {
        // Создаем массив машин для тестирования
        Car[] cars = {
            new Car(1, "Toyota", "Camry", 2020, "Black", 25000.0, "A123BC"),
            new Car(2, "Honda", "Civic", 2019, "White", 22000.0, "B456DE"),
            new Car(3, "Toyota", "Corolla", 2021, "Red", 20000.0, "C789FG"),
            new Car(4, "BMW", "X5", 2018, "Blue", 45000.0, "D012HI")
        };
        
        // Тестируем метод getCarByBrend
        Car[] toyotaCars = getCarByBrend(cars, "Toyota");
        System.out.println("Машины марки Toyota:");
        for (Car car : toyotaCars) {
            System.out.println(car.getBrand() + " " + car.getModel() + " " + car.getYear());
        }
    }
    
    // Статический метод для поиска машин по марке
    public static Car[] getCarByBrend(Car[] cars, String brend) {
        // Считаем количество машин нужной марки
        int count = 0;
        for (Car car : cars) {
            if (car.getBrand().equalsIgnoreCase(brend)) {
                count++;
            }
        }
        
        // Создаем массив нужного размера
        Car[] result = new Car[count];
        int index = 0;
        
        // Заполняем массив
        for (Car car : cars) {
            if (car.getBrand().equalsIgnoreCase(brend)) {
                result[index++] = car;
            }
        }
        
        return result;
    }
}
