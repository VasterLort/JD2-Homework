public class Main {
    public static void main(String[] args) {
//        5-6)
        MyTest num = (n) -> (n <= 20 && n >= 10);

        System.out.println("Заданное число входит  диапазон от 10 до 20: " + num.testing(5));
        System.out.println();

//        7)
        NumericFunc factorial = (n) -> {
            int res = 1;
            for (int i = 1; i <= n; i++) res *= i;
            return res;
        };

        System.out.println("Фaктopиaл 3 равен: " + factorial.func(3));
        System.out.println("Фaктopиaл 8 равен: " + factorial.func(8));
        System.out.println();

//        8)
        MyFunc<Integer> factorial2 = (n) -> {
            int res = 1;
            for (int i = 1; i <= n; i++) res *= i;
            return res;
        };

        System.out.println("Фaктopиaл 3 равен: " + factorial2.func(3));
        System.out.println("Фaктopиaл 8 равен: " + factorial2.func(8));
        System.out.println();

//        9)
        String inStr = "Лямбда-выражения расширяют Java";
        String outStr;

        System.out.println("Входная строка: " + inStr);

        StringFunc rem = (String str) -> {
            String result = "";
            for (int i = 0; i < str.length(); i++)
                if (str.charAt(i) != ' ') result += str.charAt(i);
            return result;
        };

        outStr = changeStr(rem, inStr);

        System.out.println("Строка с замененными пробелами: " + outStr);
    }

    private static String changeStr(StringFunc sf, String s) {
        return sf.func(s);
    }
}
