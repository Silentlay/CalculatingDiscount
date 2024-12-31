package seminars.first.Calculator;

public class Calculator {

    // ДЗ 1.1
    // Нужно написать в калькуляторе метод вычисления суммы покупки со скидкой и проверить его, используя AssertJ
    // Примерная сигнатура и тело метода:
    public static double calculatingDiscount(double purchaseAmount, int discountAmount) {
        // purchaseAmount - сумма покупки
        // discountAmount - размер скидки
        double FinalPrice; // окончательная цена со скидкой
        FinalPrice = purchaseAmount * (1 - discountAmount / 100.0);

        if (purchaseAmount < 0) {
            throw new ArithmeticException("Сумма покупки не может быть отрицательной.");
        }
        if (discountAmount < 0 || discountAmount > 100) {
            throw new ArithmeticException("Скидка должна быть в диапазоне от 0 до 100.");
        }

        return FinalPrice; // Метод должен возвращать сумму покупки со скидкой
    }
}