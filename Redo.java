import java.util.Scanner;
public class Redo {
    static Scanner input = new Scanner(System.in);

    static void insert2(String array[][]) {
        boolean c = true;
        do{
            int i = 0;
            if(array[i][0] == null){            
            for (int j = 0; j < array[i].length-3; j++) {
                if(j==0){
                   System.out.print("Masukkan NIK\t:");
                    array[i][0] = input.nextLine();
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
                }
            }
        }
        i++;
        c= false;
    }while(c==true);
    }
    static void insert(String array[][]){
        for (int i = 0; i < array.length; i++) {
            if( array[i][0] == null){            
            for (int j = 0; j < array[i].length-3; j++) {
                if(j==0){
                    System.out.print("Masukkan N0daf\t:");
                   array[i][0] = input.nextLine() ;
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
                }
            }
        
        }
    }
    }
    static void show(String array[][]){
        for (int i = 0 ;i<array.length;i++){
            for(int j = 0 ;j<array[i].length;j++){
                if(array[i][j] != null){
                System.out.println(array[i][j]);
            }
            }
        }
    }

    public static void main(String[] args) {
        
        
        String array[][] = new String [10][10];
        insert2(array);
        System.out.print("add:");
        show(array);
        int a = input.nextInt();
        if(a==1){
            insert(array);
            show(array);
        }
        // boolean c = true;
        // do{
        // System.out.print("data :");
        // String t = input.nextLine();
        // if(t.equals("T")){
        //     c = false;
        // }
        // }while(c == true);
    }
}