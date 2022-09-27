import java.util.Scanner;

public class modul1 {
    public static void main(String[] args) {

        // exception
        try {
            int[] arr = new int[5];
        arr[5] = 25;
        Scanner user = new Scanner(System.in);
        System.out.println("nilai array ke : ");
        int index = user.nextInt();

            System.out.printf("index ke-%d, adalah %d", index, arr[index]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println(e);
        }
        System.out.println("program tutup ");
    }
}