package seminars.first.Calculator;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

public class CalculatorTest {
    public static void main(String[] args) {


        //ДЗ 1.1
        // Проверка корректных расчетов
        System.out.println(Calculator.calculatingDiscount(15000, 5)); // скидка 5%, ожидаем 14250.0
        System.out.println(Calculator.calculatingDiscount(10000, 15)); // скидка 15%, ожидаем 8500.0
        System.out.println(Calculator.calculatingDiscount(15000, 0)); // нет скидки, ожидаем 15000.0

        assertThat(Calculator.calculatingDiscount(15000, 5)).isEqualTo(14250.0);
        assertThat(Calculator.calculatingDiscount(10000, 15)).isEqualTo(8500.0);
        assertThat(Calculator.calculatingDiscount(15000, 0)).isEqualTo(15000.0);

        // Проверка выброса исключения для отрицательной суммы покупки
        //System.out.println(Calculator.calculatingDiscount(-15000, 5));

        assertThatThrownBy(() ->
                seminars.first.Calculator.Calculator.calculatingDiscount(-15000, 5)
       ).isInstanceOf(ArithmeticException.class);

        // Проверка выброса исключения для скидки меньше 0
        //System.out.println(Calculator.calculatingDiscount(1000, -10));
        assertThatThrownBy(() ->
                seminars.first.Calculator.Calculator.calculatingDiscount(1000, -10)
        ).isInstanceOf(ArithmeticException.class);


        // Проверка выброса исключения для скидки больше 100%
       //System.out.println(Calculator.calculatingDiscount(1000, 150));

        assertThatThrownBy(() ->
                seminars.first.Calculator.Calculator.calculatingDiscount(1000, 150)
        ).isInstanceOf(ArithmeticException.class);
    }
}


