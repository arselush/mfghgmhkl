public class LoopsPractice {
    public static void main(String[] args) {
        for (int i = 2; i <= 20; i += 2) {
            if (i != 20) {
                System.out.print(i + ", ");
            } else {
                System.out.print(i + ".");
            }
        }
    }
}
