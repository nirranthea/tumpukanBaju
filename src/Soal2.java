import java.util.Arrays;

/**
 * Sony dan Ina sangat senang karena akan mempunyai anak mereka. Sony mempunyai plan
 * untuk membelikan mainan anaknya dengan budget tertentu.
 *
 * Contoh 1
 *  Ada pilihan mainan jika direpresentasikan dengan array = [1,2,3,4] Sony mempunyai uang n= 7.
 *  Maka mainan yang dapat dipilih oleh Sony adalah :
 *      ● array = [1,2,3] total = 6 , atau
 *      ● array = [3,4] total 7
 *  Dari dua opsi tersebut diambil yang opsi pertama [1,2,3] karena Sony ingin memberikan
 *  banyak mainan ke anak nya.
 *
 * Contoh 2
 *  Input : uang = 50 dan mainan = [ 1,12,5,111,200,1000,10 ]
 *  Output : 4
 *  Explaination : Sony dapat membeli 4 mainan dengan pilihan mainan [1,12,5,10]
 */

public class Soal2 {
    public int solution(int[] mainan, int budget){
        //TODO : Catatan
        /* Logic problem ini yaitu membeli mainan dengan harga paling terendah terlebih dahulu
           agar mendapatkan jumlah mainan terbanyak.
           Pertama, Urutkan Array, lalu ambil kombinasi mulai dari yang terendah, sampai jumlah kombinasi
           tersebut tidak melebihi budget
         */

        int jmlMainan;
        int jmlBayar;

        //sorting Mainan dari harga paling rendah
        Arrays.sort(mainan);

        //Jika mainan paling murah lebih besar dari Budget
        if (mainan[0] > budget) {
            System.out.println("semua mainan mahal");
            return 0;
        }

        jmlMainan = 1;
        jmlBayar = mainan[0];
        System.out.print("Mainan yang dibeli " + mainan[0]);
        for (int i=1; i<mainan.length; i++){
            jmlBayar += mainan[i];
            if (jmlBayar > budget){
                System.out.println();
                return jmlMainan;
            }
            else {
                jmlMainan += 1;
                System.out.print(" " + mainan[i]);
            }
        }
        System.out.println();
        return jmlMainan;
    }
}
