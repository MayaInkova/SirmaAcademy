package Methods;

// Базов клас Shape
class Shape {
    public static void main(String[] args) {
        // Създаваме обект от тип Rectangle (пример за Overriding)
        Rectangle rect = new Rectangle(5, 10);
        System.out.println("Площ на правоъгълник: " + rect.area()); // 50

        // Използваме претоварения метод area(int) за квадрат (Overloading)
        System.out.println("Площ на квадрат: " + rect.area(4)); // 16
    }

    // Метод, който ще бъде презаписан
    public double area() {
        return 0;
    }
}

// Подклас Rectangle, който наследява Shape
class Rectangle extends Shape {
    private int width;
    private int height;

    // Конструктор за правоъгълник
    public Rectangle(int width, int height) {
        this.width = width;
        this.height = height;
    }

    // Презаписваме (Overriding) метода area() от Shape
    @Override
    public double area() {
        return width * height;
    }

    // Претоварен (Overloading) метод за квадрат
    public double area(int side) {
        return side * side;
    }
}


