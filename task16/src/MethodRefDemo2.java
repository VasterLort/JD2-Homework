public class MethodRefDemo2 {

    public static void main(String[] args) {
        boolean result;

        MyIntNum myNum = new MyIntNum(15);

        IntPredicate ip = myNum::hasCommonFactor;
        result = ip.test(5);
        System.out.println("Числа имеют общий делитель: " + result);
    }
}
