import java.util.Scanner;

class Biodata {
    public static void main(String args[]){

        Scanner input = new Scanner(System.in);

        System.out.println("## Program Java Sederhana Biodata ##");
        System.out.println("====================================");
        System.out.println();

        String Nama, Tanggal_Lahir, Alamat, Pendidikan, Hp;

        System.out.println("Nama: ");
        Nama = input.nextLine();

        System.out.println("Tanggal Lahir: ");
        Tanggal_Lahir = input.nextLine();

        System.out.println("Alamat: ");
        Alamat = input.nextLine();

        System.out.println("Pendidikan: ");
        Pendidikan = input.nextLine();

        System.out.println("Hp: ");
        Hp = input.nextLine();

        System.out.println();

        System.out.println("## Data ##");
        System.out.println("==========");
        System.out.println("Nama: "             + Nama);
        System.out.println("Tanggal Lahir: "    + Tanggal_Lahir);
        System.out.println("Alamat: "           + Alamat);
        System.out.println("Pendidikan: "       + Pendidikan);
        System.out.println("Hp: "               + Hp);
    }
}