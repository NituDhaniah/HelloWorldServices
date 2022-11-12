public class Calculator {
    public static void main(String[] args) {

        System.out.println("the addition is:" + (add(5, 7)));
        System.out.println(subtract(4, 4));
        System.out.println(multiply(5, 5));
        System.out.println(divide(5, 2));
        System.out.println("concatenation is:" + (stringFunction("Neetu", 10, 7)));
    }
gggg
    public static int add(int a, int b) {
        int c = a + b;
        return c;
    }

    public static int subtract(int d, int e) {
        int f = d - e;
        return f;

    }

    public static int multiply(int g, int h) {
        int i = g * h;
        return i;
    }

    public static float divide(int j, int k) {
        float m = j % k;
        return m;
    }

    public static String stringFunction(String name, int age, int creditScore) {

      String p= ( name + " " + age + " " + creditScore);
        return p;
    }
}



