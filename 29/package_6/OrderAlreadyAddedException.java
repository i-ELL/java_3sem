package package_6;

public class OrderAlreadyAddedException extends Exception {
    public OrderAlreadyAddedException(String message) {
        super("Заказ уже добавлен: " + message);
    }
}