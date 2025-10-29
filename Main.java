import java.time.Year;

public class Main {
    public static void main(String[] args) {
        // Создаем тестовый массив машин
        Car[] cars = {
            new Car(1, "Toyota", "Camry", 2020, "Black", 25000.0, "A123BC"),
            new Car(2, "Honda", "Civic", 2019, "White", 22000.0, "B456DE"),
            new Car(3, "Toyota", "Corolla", 2021, "Red", 20000.0, "C789FG"),
            new Car(4, "BMW", "X5", 2018, "Blue", 45000.0, "D012HI"),
            new Car(5, "Toyota", "RAV4", 2022, "Silver", 30000.0, "E345JK"),
            new Car(6, "Honda", "Accord", 2020, "Gray", 27000.0, "F678LM"),
            new Car(7, "Toyota", "Highlander", 2017, "Green", 35000.0, "G901NO")
        };
        
        // Тестирование методов...
        // [здесь весь код тестирования из предыдущих шагов]
    }
    
    public static Car[] getCarByBrend(Car[] cars, String brend) {
        int count = 0;
        for (Car car : cars) {
            if (car.getBrand().equalsIgnoreCase(brend)) {
                count++;
            }
        }
        
        Car[] result = new Car[count];
        int index = 0;
        for (Car car : cars) {
            if (car.getBrand().equalsIgnoreCase(brend)) {
                result[index] = car;
                index++;
            }
        }
        
        return result;
    }
    
    public static Car[] getCarByBrendAndYearOperational(Car[] cars, String brend, int years) {
        int currentYear = Year.now().getValue();
        
        int count = 0;
        for (Car car : cars) {
            int yearsOperational = currentYear - car.getYear();
            if (car.getBrand().equalsIgnoreCase(brend) && yearsOperational > years) {
                count++;
            }
        }
        
        Car[] result = new Car[count];
        int index = 0;
        for (Car car : cars) {
            int yearsOperational = currentYear - car.getYear();
            if (car.getBrand().equalsIgnoreCase(brend) && yearsOperational > years) {
                result[index] = car;
                index++;
            }
        }
        
        return result;
    }
}
