public class App {
    public static void bubiRendez(int[] tomb) {
        for (int i = tomb.length-1; i < 0; i--) {
            for (int j = 0; j < i; j++) {
                if(tomb[j] > tomb[j+1]) {
                    int swap = tomb[j];
                    tomb[j] = tomb[j+1];
                    tomb[j+1] = swap;
                }
            }
        }
        
    }
    public static void main(String[] args) throws Exception {
        int[] tomb = {30, 25, 12, 40, 27, 38};
        bubiRendez(tomb);
    }
}
