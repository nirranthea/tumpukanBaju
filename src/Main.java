import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        //TODO : Contoh Soal-1
        int[] tes1 = {1,2,1,2,1,2,3};
        int[] tes2 = {10,20,20,10,10,30,50,10,20};
        int[] tes3 = {3,4,2,1,3,1,4,2,2,3,4,1};
        int[] tes4 = {5};
        int hasil1, hasil2, hasil3, hasil4;

        System.out.println("SOAL 1 - Mencari Total Tumpukan Baju");
        Soal1 soalSatu = new Soal1();

        System.out.println("Contoh 1 : " + Arrays.toString(tes1));
        hasil1 = soalSatu.solution(tes1);
        System.out.println("Total = " + hasil1 + " pasang kaus kaki\n");

        System.out.println("Contoh 2 : " + Arrays.toString(tes2));
        hasil2 = soalSatu.solution(tes2);
        System.out.println("Total = " + hasil2 + " pasang kaus kaki\n");

        System.out.println("Contoh 3 : " + Arrays.toString(tes3));
        hasil3 = soalSatu.solution(tes3);
        System.out.println("Total = " + hasil3 + " pasang kaus kaki\n");

        System.out.println("Contoh 4 : " + Arrays.toString(tes4));
        hasil4 = soalSatu.solution(tes4);
        System.out.println("Total = " + hasil4 + " pasang kaus kaki\n");


        //TODO : Contoh Soal-2
        int[] tesTwo1 = {4,3,2,1};
        int tesTwo1n = 7;
        int[] tesTwo2 = {1,12,5,111,200,1000,10};
        int tesTwo2n = 50;
        int[] tesTwo3 = {11,15,16,17,19,25};
        int tesTwo3n = 10;
        int hasilTwo1, hasilTwo2, hasilTwo3;

        System.out.println("SOAL 2");
        Soal2 soalDua = new Soal2();

        System.out.println("Contoh 1 : " + Arrays.toString(tesTwo1) + ", " + tesTwo1n);
        hasilTwo1 = soalDua.solution(tesTwo1, tesTwo1n);
        System.out.println("Jumlah mainan yang dibeli = " + hasilTwo1 + "\n");

        System.out.println("Contoh 2 : " + Arrays.toString(tesTwo2) + ", " + tesTwo2n);
        hasilTwo2 = soalDua.solution(tesTwo2, tesTwo2n);
        System.out.println("Jumlah mainan yang dibeli = " + hasilTwo2 + "\n");

        System.out.println("Contoh 3 : " + Arrays.toString(tesTwo3) + ", " + tesTwo3n);
        hasilTwo3 = soalDua.solution(tesTwo3, tesTwo3n);
        System.out.println("Jumlah mainan yang dibeli = " + hasilTwo3 + "\n");

    }

}
