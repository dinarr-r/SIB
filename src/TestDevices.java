import com.sibsutis.Printable;
import com.sibsutis.devices.Device;
import com.sibsutis.devices.PersonalComputer;
import com.sibsutis.devices.Phone;

/**
 * Тестовый класс для проверки иерархии устройств
 */
public class TestDevices {
    public static void main(String[] args) {
        // Создание объектов
        Device pc1 = new PersonalComputer(1, 50000, "192.168.1.100");
        Device pc2 = new PersonalComputer(2, 45000);
        Device phone1 = new Phone(3, 30000, "192.168.1.101");
        Device phone2 = new Phone(4, 25000);
        
        // Тестирование методов sprint()
        System.out.println("=== Testing sprint() method ===");
        System.out.println(pc1.sprint());
        System.out.println(pc2.sprint());
        System.out.println(phone1.sprint());
        System.out.println(phone2.sprint());
        
        // Тестирование методов getDeviceType()
        System.out.println("\n=== Testing getDeviceType() method ===");
        System.out.println("PC1 type: " + pc1.getDeviceType());
        System.out.println("Phone1 type: " + phone1.getDeviceType());
        
        // Тестирование equals и hashCode
        System.out.println("\n=== Testing equals() and hashCode() ===");
        Device pc3 = new PersonalComputer(1, 50000, "192.168.1.100");
        System.out.println("pc1.equals(pc3): " + pc1.equals(pc3));
        System.out.println("pc1 hashCode: " + pc1.hashCode());
        System.out.println("pc3 hashCode: " + pc3.hashCode());
        
        // Тестирование через интерфейс Printable
        System.out.println("\n=== Testing through Printable interface ===");
        Printable printableDevice = new PersonalComputer(5, 60000, "192.168.1.102");
        System.out.println(printableDevice.sprint());
    }
}
