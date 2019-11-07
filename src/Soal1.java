import java.util.ArrayList;

/**
 * 1. Mencari Total Tumpukan Baju
 *
 *      Razid bekerja di toko pakaian. Dia memiliki banyak kaus kaki yang harus dipasangkan
 *      berdasarkan warna untuk dijual.
 *
 *      Direpresentasikan array bilangan bulat digunakan untuk mewakili warna masing-masing
 *      kaus kaki, tentukan berapa banyak pasang kaus kaki dengan warna-warna senada.
 *
 *      Contoh 1
 *          Ada 7 kaus kaki dengan warna array = [1,2,1,2,1,3,2] dari array tersebut ada 2 pasang
 *          warna yang sama dan ada 3 kaus kaki yang warna yang tidak mempunyai pasangan. Yaitu :
 *              Array[0] dan Array[2] = dengan value 1
 *              Array[1] dan Array[3] = dengan value 2
 *              Array selain itu tidak ada value yang sama.
 *      Contoh 2
 *          Sample Input
 *              array = 10 20 20 10 10 30 50 10 20
 *          Sample Output
 *              3 Pasang Kaos Kaki
 */

public class Soal1 {
    public int solution(int[] kausKaki){

        int initialCheck = 0;
        int jumlahPasangan = 0;

        //input dimasukkan ke List agar dynamic
        ArrayList<Integer> yangDiCek = new ArrayList<>();
        ArrayList<Integer> idxDiCek = new ArrayList<>();
        for (int i=0; i<kausKaki.length; i++) {
            yangDiCek.add(kausKaki[i]);
            idxDiCek.add(i);
        }

        while (yangDiCek.size() >= 2) { //jika yangDiCek hanya tersisa 1 atau kurang, break loop
            for (int j = initialCheck + 1; j < yangDiCek.size(); j++) {
                if (yangDiCek.get(j) == yangDiCek.get(initialCheck)) {
                    System.out.println("--Yang berpasangan index " + idxDiCek.get(initialCheck) + "&" + idxDiCek.get(j));
                    //Eliminasi patokan yang telah dicek dan pasangannya
                    yangDiCek.remove(j);
                    idxDiCek.remove(j);
                    yangDiCek.remove(initialCheck);
                    idxDiCek.remove(initialCheck);

                    jumlahPasangan += 1;
                    break;
                }
                //Jika sampai ujung tidak ada pasangan, eliminasi patokan yang telah dicek
                if (j == yangDiCek.size() - 1) {
                    yangDiCek.remove(initialCheck);
                    idxDiCek.remove(initialCheck);
                }
            }
        }

        return jumlahPasangan;
    }
}
