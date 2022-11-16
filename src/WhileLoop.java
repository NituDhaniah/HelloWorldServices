public class WhileLoop {
    public static void main(String[] args) {
        int i = 1;
        while (i <= 5) {
            System.out.println(i);
            i++;
            int j = 1;
            while (j <= i) ;
            j++;
            {
                System.out.println();
            }
        }
    }
}