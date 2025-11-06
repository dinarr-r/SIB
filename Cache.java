java

import java.util.LinkedList;

/**
 * Обобщенный класс для хранения последних n элементов
 * @param <T> тип хранимых элементов
 */
public class Cache<T> {
    private final LinkedList<T> items;
    private final int maxSize;
    
    /**
     * Конструктор класса Cache
     * @param maxSize максимальное количество элементов в кэше
     */
    public Cache(int maxSize) {
        if (maxSize <= 0) {
            throw new IllegalArgumentException("Размер кэша должен быть положительным числом");
        }
        this.maxSize = maxSize;
        this.items = new LinkedList<>();
    }
    
    /**
     * Добавляет элемент в кэш
    
     */
    public void add(T item) {
        if (item == null) {
            throw new IllegalArgumentException("Элемент не может быть null");
        }
        
        items.addLast(item);
        
   
        if (items.size() > maxSize) {
            items.removeFirst();
        }
    }
    
    public boolean remove(T item) {
        return items.remove(item);
    }
    
    public boolean exists(T item) {
        return items.contains(item);
    }
    

    public T getFirst() {
        if (items.isEmpty()) {
            return null;
        }
        return items.getFirst();
    }
    
   
    public T getLast() {
        if (items.isEmpty()) {
            return null;
        }
        return items.getLast();
    }
    
 
    public T getItemByIndex(int index) {
        if (index < 0 || index >= items.size()) {
            return null;
        }
        return items.get(index);
    }
    
    public int size() {
        return items.size();
    }
    public int getMaxSize() {
        return maxSize;
    }
    
    public boolean isEmpty() {
        return items.isEmpty();
    }
    
    @Override
    public String toString() {
        return "Cache{size=" + items.size() + ", maxSize=" + maxSize + ", items=" + items + "}";
    }
}
