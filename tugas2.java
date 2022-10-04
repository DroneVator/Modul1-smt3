import java.util.Scanner;


public class tugas2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Boolean syulit = true;
        while (syulit) {
            System.out.print("Masukkan NIM : ");
            String NIM = input.next();
            try {
                if (NIM.length() == 15) {
                    if (NIM.contains("10370311")) 
                    if (NIM.matches("[0-9]*")){
                        System.out.println("Data yang anda berikan benar");
                    }
                    else{
                        System.out.println("Terjadi kesalahan input data");
                        throw new welek();
                    }
                    {
                        System.out.println("NIM Benar");
                        syulit = false;
                    } 
                } else {
                        throw new ganteng();
                }
            } catch (welek  | ganteng e) {
                System.out.println(e.getMessage() );
            }
                }
    }
}
