public class Main {
    public static void main(String[] args) {

        Calculator calc = Calculator.instance.get();

        int a = calc.plus.apply(1, 2);
        int b = calc.minus.apply(1,1); //переменная b равна 0.
        int c = calc.devide.apply(a, b);
        //при делении на 0 появляется ошибка. Делаем выброс исключения в лямбда-выражении переменной devide.

        calc.println.accept(c);
    }
}