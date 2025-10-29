package com.sibsutis.devices;

import com.sibsutis.Printable;

/**
 * Абстрактный класс устройства
 */
public abstract class Device implements Printable {
    protected int device; // уникальный идентификатор устройства
    protected int price;  // стоимость устройства
    protected String ip;  // IP адрес устройства, может быть null

    /**
     * Конструктор устройства
     * @param id уникальный идентификатор
     * @param price стоимость устройства
     * @param ip IP адрес устройства (может быть null)
     */
    public Device(int id, int price, String ip) {
        this.device = id;
        this.price = price;
        this.ip = ip;
    }

    /**
     * Абстрактный метод для получения типа устройства
     * @return строку с типом устройства
     */
    public abstract String getDeviceType();

    /**
     * Реализация метода интерфейса Printable
     * @return строку с полной информацией об устройстве
     */
    @Override
    public String sprint() {
        return String.format("Device{id=%d, price=%d, ip=%s, type=%s}", 
                           device, price, ip, getDeviceType());
    }

    /**
     * Метод split (назначение не указано в диаграмме)
     * @return целое число
     */
    public int split() {
        return 0; // базовая реализация
    }

    // Геттеры
    public int getDeviceId() {
        return device;
    }

    public int getPrice() {
        return price;
    }

    public String getIp() {
        return ip;
    }

    // Сеттеры
    public void setDeviceId(int device) {
        this.device = device;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }
}
