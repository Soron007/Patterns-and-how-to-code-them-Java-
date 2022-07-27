public class Nums {
    public static void main(String[] args) {

        int n = 4;

        int val = 0;
        for(int i = 1; i<=n; i++){
            val++;
            for(int j=1; j<=n; j++){
                System.out.print(val+"\t");

            }
            System.out.println();
        }
    }
}
