package com.sibsutis.devices;

import java.util.Objects;

/**
 * Класс телефона
 */
public class Phone extends Device {
    
    /**
     * Конструктор без IP адреса
     * @param id уникальный идентификатор
     * @param price стоимость устройства
     */
    public Phone(int id, int price) {
        super(id, price, null);
    }

    /**
     * Конструктор с IP адресом
     * @param id уникальный идентификатор
     * @param price стоимость устройства
     * @param ip IP адрес устройства
     */
    public Phone(int id, int price, String ip) {
        super(id, price, ip);
    }

    /**
     * Реализация абстрактного метода getDeviceType
     * @return строку "Телефон"
     */
    @Override
    public String getDeviceType() {
        return "Телефон";
    }

    /**
     * Переопределение метода equals для сравнения объектов
     * @param o объект для сравнения
     * @return true если объекты равны
     */
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Phone phone = (Phone) o;
        return device == phone.device && 
               price == phone.price && 
               Objects.equals(ip, phone.ip);
    }

    /**
     * Переопределение метода hashCode
     * @return хеш-код объекта
     */
    @Override
    public int hashCode() {
        return Objects.hash(device, price, ip);
    }

    /**
     * Переопределение метода toString
     * @return строковое представление объекта
     */
    @Override
    public String toString() {
        return String.format("Phone{id=%d, price=%d, ip=%s}", 
                           device, price, ip);
    }
}

