
public class cat {
    public static String[][] columnWiseSorting(String array[][], int colmn) {
        System.out.println("\n>Urutkan Data Mahasiswa");
        int flag, h = 0;
        String temp[] = new String[3];
        for (int k = 0; k < array.length; k++) {
            if (array[k][0] != null) {
                h++;
            }
        }
        for (int i = 0; i < h; i++) {
            flag = i;
            for (int j = i + 1; j < h; j++) {
                if (array[j][colmn].compareTo(array[flag][colmn]) < 0)
                    flag = j;
            }
            if (flag != 1) {
                for (int j = 0; j < temp.length; j++)
                    temp[j] = array[i][j];
                for (int j = 0; j < temp.length; j++)
                    array[i][j] = array[flag][j];
                for (int j = 0; j < temp.length; j++)
                    array[flag][j] = temp[j];
            }
        }
        return array;
    }

    public static void main(String[] args) {
        String bas[][] = new String[5][3];
        String arr[][] = { { "Magelang", "2", "Bagas" }, { "Sleman", "9", "Abdi" }, { "Magelang", "10", "Reno" },
                { null, null, null },
                { null, null, null }
        };
        int colmn = 2;
        columnWiseSorting(arr, colmn);
        for (int i = 0; i < arr.length; i++) {
            if (arr[i][0] != null) {
                for (int j = 0; j < arr[i].length; j++) {
                    System.out.print(arr[i][j] + " ");
                }
            } else {
                break;
            }
            System.out.println();
        }
    }
}