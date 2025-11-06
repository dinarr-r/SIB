public class CacheTest {
    public static void main(String[] args) {
        System.out.println("=== Тестирование класса Cache ===");
        
        // Тестирование с целыми числами
        testIntegerCache();
        
        System.out.println("\n=== Тестирование со строками ===");
        
        // Тестирование со строками
        testStringCache();
        
        System.out.println("\n=== Все тесты завершены ===");
    }
    
    private static void testIntegerCache() {
        System.out.println("Создаем кэш для целых чисел с максимальным размером 3");
        Cache<Integer> intCache = new Cache<>(3);
        
        // Тестирование добавления элементов
        System.out.println("\n1. Добавление элементов:");
        intCache.add(10);
        intCache.add(20);
        intCache.add(30);
        System.out.println("После добавления 10, 20, 30: " + intCache);
        
        // Добавляем четвертый элемент - первый должен удалиться
        intCache.add(40);
        System.out.println("После добавления 40: " + intCache);
        
        // Тестирование проверки существования
        System.out.println("\n2. Проверка существования элементов:");
        System.out.println("Элемент 20 существует: " + intCache.exists(20));
        System.out.println("Элемент 10 существует: " + intCache.exists(10));
        System.out.println("Элемент 50 существует: " + intCache.exists(50));
        
        // Тестирование получения первого и последнего элементов
        System.out.println("\n3. Получение первого и последнего элементов:");
        System.out.println("Первый элемент: " + intCache.getFirst());
        System.out.println("Последний элемент: " + intCache.getLast());
        
        // Тестирование получения по индексу
        System.out.println("\n4. Получение элементов по индексу:");
        for (int i = 0; i <= intCache.size(); i++) {
            System.out.println("Элемент с индексом " + i + ": " + intCache.getItemByIndex(i));
        }
        
        // Тестирование удаления
        System.out.println("\n5. Удаление элементов:");
        System.out.println("Удаление элемента 20: " + intCache.remove(20));
        System.out.println("После удаления 20: " + intCache);
        System.out.println("Удаление несуществующего элемента 100: " + intCache.remove(100));
        
        // Тестирование с пустым кэшем
        System.out.println("\n6. Тестирование граничных случаев:");
        Cache<Integer> emptyCache = new Cache<>(2);
        System.out.println("Первый элемент пустого кэша: " + emptyCache.getFirst());
        System.out.println("Последний элемент пустого кэша: " + emptyCache.getLast());
        System.out.println("Элемент с индексом 0 пустого кэша: " + emptyCache.getItemByIndex(0));
    }
    
    private static void testStringCache() {
        System.out.println("Создаем кэш для строк с максимальным размером 2");
        Cache<String> stringCache = new Cache<>(2);
        
        stringCache.add("Apple");
        stringCache.add("Banana");
        System.out.println("После добавления Apple, Banana: " + stringCache);
        
        stringCache.add("Cherry");
        System.out.println("После добавления Cherry: " + stringCache);
        
        System.out.println("Первый элемент: " + stringCache.getFirst());
        System.out.println("Последний элемент: " + stringCache.getLast());
        System.out.println("Существует ли 'Banana': " + stringCache.exists("Banana"));
        System.out.println("Существует ли 'Apple': " + stringCache.exists("Apple"));
    }
}
