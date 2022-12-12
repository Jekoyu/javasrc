import java.util.Scanner;

public class Main {
    static Scanner scannerNumber = new Scanner(System.in);
    static Scanner scannerString = new Scanner(System.in);
    private static String[][] addElementArray(String array[][]){
        System.out.print("\n> Tambah Data Mahasiswa");
        String arrayTemp[][] = array;
        array = new String[arrayTemp.length+1][3];
        for (int i = 0;i<arrayTemp.length;i++){
            array[i][0] = arrayTemp[i][0];
            array[i][1] = arrayTemp[i][1];
            array[i][2] = arrayTemp[i][2];
        }
        System.out.print("Masukkan NIM\t:");
        array[arrayTemp.length][0] = scannerString.nextLine();
        System.out.println("Masukkan NAMA\t:");
        array[arrayTemp.length][1]=scannerString.nextLine();
        return array;
    }

    private static String[][] removeElementArray(String array[][]){
        System.out.println("\n> Hapus Data Mahasiswa");
        if (array.length==0){
            System.out.println("Data Kosong");
            return array;
        }else {
            System.out.print("Masukkan NIM yang akan dihapus\t: ");
            String removeELement =scannerString.nextLine();
            String arraTemp[][] = array;
            array = new String[arraTemp.length-1][3];

            for (int i = 0;i<array.length;i++){
                System.out.println("Proses ke-"+i);
                if (!arraTemp[i][0].equals(removeELement)){
                    System.out.println("Ini Ya");
                    array[i][0] = arraTemp[i][0];
                    array[i][1] = arraTemp[i][1];
                    array[i][2] = arraTemp[i][2];
                }else {
                    System.out.println("Ini Kah");
                    array[i][0] = arraTemp[i+1][0];
                    array[i][1] = arraTemp[i+1][1];
                    array[i][2] = arraTemp[i+1][2];
                }
            }
            return array;
        }
    }
    public static String [][] selectionAsc(String array[][]){
        System.out.println("\n>Urutkan Data Mahasiswa");
        int flag ;
        String temp[] = new String[3];
        for (int i = 0 ;i<array.length;i++){
            flag = i;
            for (int j= i+1;j<array.length;j++){
                if (array[j][0].compareTo(array[flag][0])<0)flag=j;
            }
            if (flag!=1){
                for (int j = 0;j< temp.length;j++)
                    temp[j] = array[i][j];
                for (int j = 0;j< temp.length;j++)
                    array[i][j]=array[flag][j];
                for (int j = 0 ;j< temp.length;j++)
                    array[flag][j]=temp[j];
            }
        }
            return array;
    }
    public static void printArray(String array[][]){
        System.out.println("\n> Cetak Data Mahasiswa");
        if (array.length==0){
            System.out.println("Data Kosong");
        }else {
            for (int i = 0; i <array.length ; i++) {
                System.out.println("Mahasiswa ke-"+(i+1)+"\t:");
                System.out.println("NIM\t: "+array[i][0]);
                System.out.println("Nama\t: "+array[i][1]);
                System.out.println("Prodi\t: "+array[i][2]);

            }
        }
    }
    private static void menu(){
        System.out.println("\n>=== Data Mahasiswa ====");
        System.out.println("1. Tambah Data Mahasiswa");
        System.out.println("2. Hapus Data Mahasiswa");
        System.out.println("3. Urutkan Data Mahasiswa");
        System.out.println("4. Cetak Data Mahasiswa");
        System.out.println("5. Tutup");
    }

    public static void main(String[] args) {
       String arrayMahasiswa[][] = new String[0][3];
       int pilih = 0;
       do {
           menu();
           System.out.print("Silahkan Pilih Menu\t:");
           pilih = scannerNumber.nextInt();
           switch (pilih){
               case 1:
                   arrayMahasiswa = addElementArray(arrayMahasiswa);break;
               case 2:
                   arrayMahasiswa = removeElementArray(arrayMahasiswa);break;
               case 3:
                   arrayMahasiswa = selectionAsc(arrayMahasiswa);
                   printArray(arrayMahasiswa);break;
               case 4:
                   printArray(arrayMahasiswa);break;
               case 5:
                   System.out.println("\nKeluar dari sistem....");break;

           }
       }while (pilih!=5);

    }
}