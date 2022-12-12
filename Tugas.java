import java.util.Random;
import java.util.Scanner;

public class Tugas {
    static Scanner input = new Scanner(System.in);
    static String beasiswa[][] = new String [10][10];
    static String regular[][] = new String [10][10];
   
    
    static void insert(String array[][], String nama) {
        boolean c = true;
        do{
            int i = 0;
            if(array[i][0] == null){            
            for (int j = 0; j < array[i].length; j++) {
                if(j==0){
                   array[i][0] = nodaftar(nama);
                }else if (j == 1) {
                    System.out.print("Masukkan NIK\t:");
                    array[i][1] = input.nextLine();
                    input.nextLine();
                } else if (j == 2) {
                    System.out.print("Masukkan Nama\t:");
                    array[i][2] = input.nextLine();
                } else if (j == 3) {
                    System.out.print("Masukkan Jenis Kelamin(P/L)\t:");
                    array[i][3] = input.nextLine();
                } else if (j == 4) {
                    System.out.print("Masukkan Agama\t:");
                    array[i][4] = input.nextLine();
                } else if (j == 5) {
                    System.out.print("Masukkan NISN\t:");
                    array[i][5] = input.nextLine();
                } else if (j == 6) {
                    System.out.print("Masukkan Alamat\t:");
                    array[i][6] = input.nextLine();
                    System.out.println("No Daftar : "+array[i][0]);
                    System.out.println("Nama      : "+array[i][2]);
                } else if(j==7){
                    System.out.print("Nilai Tes Tulis       : ");
                    array[i][7]= input.nextLine();
                } else if(j==8){
                    System.out.print("Nilai Tes Wawancara : ");
                    array[i][8] = input.nextLine();
                }
                if (array[i][7]!=null && array[i][8]!= null) {
                    int a = Integer.parseInt(array[i][7]);
                    int b = Integer.parseInt(array[i][8]);
                    if(a>=70 && b>=75){
                    array[i][9] = "LULUS";
                    System.out.println("Selamat anda Lulus");
                    }else{
                    array[i][9] = "TIDAK LULUS";
                    System.out.println("Mohon Maaf anda tidak lulus");
                    }
                }
            }
        }
        i++;
        c= false;
    }while(c==true);
    }

    public static void tampil(String array[][]){
        System.out.println("NoDaftar\tNIK\t\tNama\t\tJK\tAgama\tNISN\t\tAlamat\t");
        for (int i = 0; i < array.length; i++) {
            for(int j= 0;j<array[i].length;j++){
                if(array[i][j] != null){
                    System.out.print(array[i][j]+"\t");
                }
            }
            System.out.println();
        }
    }
    public static void beasiswa(){
        boolean c = true;
        do {
        System.out.println("===== SISTEM PENDAFTARAN MAHASISWA =====");
        System.out.println("1. Input Pendaftar");
        System.out.println("2. Liat Pendaftar");
        System.out.println("0. Keluar");
        System.out.print("Masukkan pilihan: ");
        int pil = input.nextInt();
            switch(pil){
                case 1:  System.out.println("Masukkan Data Pendaftar!!");
                        insert(beasiswa,"BSW");
                        break;
                case 2: System.out.println("Data Mahasiswa");
                        tampil(beasiswa); break;
                case 3: System.out.println("Anda akan diarahkan ke awal ....");
                        c =false;break;
                default: System.out.println("Opsi tidak ada");break;
            }      
       
        } while (c==true);
    }

    public static void regular(){
        boolean c = true;
        do {
        System.out.println("===== SISTEM PENDAFTARAN MAHASISWA =====");
        System.out.println("1. Input Pendaftar");
        System.out.println("2. Liat Pendaftar");
        System.out.println("0. Keluar");
        System.out.print("Masukkan pilihan: ");
        int pil = input.nextInt();
            switch(pil){
                case 1:  System.out.println("Masukkan Data Pendaftar!!");
                        insert(beasiswa,"BSW");
                        break;
                case 2: System.out.println("Data Mahasiswa");
                        tampil(beasiswa); break;
                case 3: System.out.println("Anda akan diarahkan ke awal ....");
                        c =false;break;
                default: System.out.println("Opsi tidak ada");break;
            }      
       
        } while (c==true);
    }
    
    public static String nodaftar(String c){
        Random random = new Random();
        int a =  random.nextInt(100 - 1) + 1;
        String b = Integer.toString(a);
        String nodaftar = c+b;
        return  nodaftar;
    }

    public static void main(String[] args) {
        boolean c = true;
        do{
        System.out.println("===== SISTEM PENDAFTARAN MAHASISWA =====");
        System.out.println("========================================");
        System.out.println("=========================================");
        System.out.println("\t\tProgram Pendaftaran");
        System.out.println("1. Beasiswa");
        System.out.println("2. Regular");
        System.out.println("3. Keluar");
        System.out.print("Pilihan :");int pil = input.nextInt();
        switch (pil){
            case 1 : beasiswa(); break;
            case 2 : insert(regular, "RGL");break;
            case 3 : System.out.println("Bye....");c=false;break;
        }
    }while(c==true);
        
    }
}