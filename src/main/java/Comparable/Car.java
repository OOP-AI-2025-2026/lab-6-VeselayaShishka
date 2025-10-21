package Comparable;

public class Car implements Comparable {

    private int price;
    private int year; // рік виготовлення
    private int horsePower;

    // Додайте конструктор з трьома аргументами
    public Car(int price, int year, int horsePower) {
        setPrice(price);
        setYear(year);
        setHorsePower(horsePower);
    }

    private void setPrice(int price) {
        this.price = price;
    }
    private void setYear(int year) {
        this.year = year;
    }
    private void setHorsePower(int horsePower) {
        this.horsePower = horsePower;
    }

    public int getPrice() {
        return price;
    }
    public int getYear() {
        return year;
    }
    public int getHorsePower() {
        return horsePower;
    }

    @Override
    public int compareTo(Object o) {
        if(this.price > ((Car)o).price) {
            return -1;
        }
        if (this.price < ((Car)o).price) {
            return 1;
        }
        if(this.year > ((Car)o).year) {
            return -1;
        }
        if (this.year < ((Car)o).year) {
            return 1;
        }
        if(this.horsePower > ((Car)o).horsePower) {
            return 1;
        }
        if(this.horsePower < ((Car)o).horsePower) {
            return -1;
        }

        return 0;
    }
}
