import java.util.Scanner;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Tugas {
    static Scanner input = new Scanner(System.in);
    static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    static String beasiswa[][] = new String[10][11];
    static String regular[][] = new String[10][10];
    static String biaya = "Rp. 1.500.000,00";

    public static void judul(String a) {
        System.out.println("==========================================");
        System.out.println("\t" + a);
        System.out.println("==========================================");
    }

    public static void insertRegular(String array[][], String nama) {
        boolean c = true;
        try {
            do {
                int i = 0;
                if (array[i][0] != null) {
                    i++;
                }
                if (array[i][0] == null) {
                    for (int j = 0; j < array[i].length; j++) {
                        if (j == 0) {
                            array[i][0] = nodaftar(regular, nama);
                        } else if (j == 1) {
                            System.out.print("NIK\t\t\t:");
                            array[i][1] = in.readLine();
                        } else if (j == 2) {
                            System.out.print("Nama\t\t\t:");
                            array[i][2] = in.readLine();
                        } else if (j == 3) {
                            System.out.print("Jenis Kelamin(P/L)\t:");
                            array[i][3] = in.readLine().toUpperCase();
                        } else if (j == 4) {
                            System.out.print("Agama\t\t\t:");
                            array[i][4] = in.readLine();
                        } else if (j == 5) {
                            System.out.print("NISN\t\t\t:");
                            array[i][5] = in.readLine();
                        } else if (j == 6) {
                            System.out.print("Alamat\t\t\t:");
                            array[i][6] = in.readLine();
                            judul("Inputkan Nilai UTBK");
                            System.out.println("No Daftar\t\t: " + array[i][0]);
                            System.out.println("Nama\t\t\t: " + array[i][2]);
                        } else if (j == 7) {
                            System.out.print("Nilai Tes UTBK\t\t: ");
                            array[i][7] = in.readLine();
                        }
                        if (array[i][7] != null) {
                            int a = Integer.parseInt(array[i][7]);
                            if (a >= 500) {
                                array[i][8] = "LULUS";

                                if (j == 8) {
                                    judul("Selamat anda lulus!");
                                    System.out.println("Biaya Daftar ulang: " + biaya);
                                    System.out.print("Daftar Ulang (Y/T)?:");
                                    String du = in.readLine().toUpperCase();
                                    if (du.equals("Y")) {
                                        System.out.println("Pilih Prodi:");
                                        System.out.println("1. Sistem Informasi");
                                        System.out.println("2. T. Informatika");
                                        System.out.println("3. Manajen");
                                        System.out.println("4. Teknik Komputer");
                                        System.out.print("Pilih: ");
                                        int pil = input.nextInt();
                                        switch (pil) {
                                            case 1:
                                                array[i][9] = "Sistem Informasi";
                                                break;
                                            case 2:
                                                array[i][9] = "T. Informatika";
                                                break;
                                            case 3:
                                                array[i][9] = "Manajemen";
                                                break;
                                            case 4:
                                                array[i][9] = "Teknik Komputer";
                                                break;
                                            default:
                                                System.out.println("Opsi salah");
                                                break;
                                        }
                                    } else {
                                        System.out.println("Mohon maaf anda tidak melakukan daftar ulang");
                                        c = false;
                                    }
                                }
                            } else if (a < 500) {
                                array[i][8] = "TIDAK LULUS";
                                System.out.println("Mohon Maaf anda tidak lulus");
                            }
                        }
                    }
                }
                c = false;
            } while (c == true);
        } catch (IOException e) {
            System.out.println(e);
        }
    }

    public static void insertBeasiswa(String array[][]) {
        boolean c = true;
        try {
            do {
                int i = 0;
                if (array[i][0] != null) {
                    i++;
                }
                if (array[i][0] == null) {
                    for (int j = 0; j < array[i].length; j++) {
                        if (j == 0) {
                            array[i][0] = nodaftar(beasiswa, "BSW");
                        } else if (j == 1) {
                            System.out.print("NIK\t\t\t:");
                            array[i][1] = in.readLine();
                        } else if (j == 2) {
                            System.out.print("Nama\t\t\t:");
                            array[i][2] = in.readLine();
                        } else if (j == 3) {
                            System.out.print("Jenis Kelamin(P/L)\t:");
                            array[i][3] = in.readLine();
                        } else if (j == 4) {
                            System.out.print("Agama\t\t\t:");
                            array[i][4] = in.readLine();
                        } else if (j == 5) {
                            System.out.print("NISN\t\t\t:");
                            array[i][5] = in.readLine();
                        } else if (j == 6) {
                            System.out.print("Alamat\t\t\t:");
                            array[i][6] = in.readLine();
                            judul("Inputkan Nilai TES");
                            System.out.println("No Daftar\t\t: " + array[i][0]);
                            System.out.println("Nama\t\t\t: " + array[i][2]);
                        } else if (j == 7) {
                            System.out.print("Nilai Tes Tulis\t\t: ");
                            array[i][7] = in.readLine();
                        } else if (j == 8) {
                            System.out.print("Nilai Tes Wawancara\t: ");
                            array[i][8] = in.readLine();
                        }

                        if (array[i][7] != null && array[i][8] != null) {
                            int a = Integer.parseInt(array[i][7]);
                            int b = Integer.parseInt(array[i][8]);
                            if (a >= 70 && b >= 75) {
                                array[i][9] = "LULUS";
                                if (j == 10) {
                                    judul("Selamat anda lulus!");
                                    System.out.println("Pilih Prodi:");
                                    System.out.println("1. Sistem Informasi");
                                    System.out.println("2. T. Informatika");
                                    System.out.println("3. Manajen");
                                    System.out.println("4. Teknik Komputer");
                                    System.out.print("Pilih: ");
                                    int pil = input.nextInt();
                                    switch (pil) {
                                        case 1:
                                            array[i][10] = "Sistem Informasi";
                                            break;
                                        case 2:
                                            array[i][10] = "T. Informatika";
                                            break;
                                        case 3:
                                            array[i][10] = "Manajemen";
                                            break;
                                        case 4:
                                            array[i][10] = "Teknik Komputer";
                                            break;
                                        default:
                                            System.out.println("Opsi salah");
                                            break;
                                    }
                                }
                            } else {
                                array[i][9] = "TIDAK LULUS";
                                System.out.println("Mohon Maaf anda tidak lulus");
                            }
                        }
                    }
                }
                c = false;
            } while (c == true);
        } catch (IOException e) {
            System.out.println(e);
        }
    }

    public static void tampilBeasiswa(String array[][]) {
        judul("Pendaftar Beasiswa");
        System.out.println(
                "NoDaftar NIK\tNama\t\tJK\tAgama\tNISN\tAlamat\tTes Tulis\tTes Wawancara\tStatus\tJurusan");
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (array[i][j] != null) {
                    if (array[i][j].length() < 8) {
                        System.out.print(array[i][j] + "\t");
                    } else {
                        System.out.print(array[i][j] + " ");
                    }
                }
            }
            if (array[i][0] != null) {
                System.out.println();
            }

        }
    }

    public static void tampilRegular(String array[][]) {
        System.out.println("Pendaftar Regular");
        System.out.println("NoDaftar\tNIK\tNama\tJK\tAgama\tNISN\tAlamat\tNilai UTBK\tStatus\tJurusan");
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (array[i][j] != null) {
                    if (array[i][j].length() < 8) {
                        System.out.print(array[i][j] + "\t");
                    } else {
                        System.out.print(array[i][j] + " ");
                    }
                }
            }
            if (array[i][0] != null) {
                System.out.println();
            }
        }
    }

    public static void beasiswa() {
        judul("Program Pendaftaran Beasiswa");
        System.out.println("1. Input Pendaftar");
        System.out.println("2. Liat Pendaftar");
        System.out.println("0. Keluar");
        System.out.print("Masukkan pilihan: ");
        int pil = input.nextInt();
        switch (pil) {
            case 1:
                System.out.println("Masukkan Data Pendaftar!!");
                insertBeasiswa(beasiswa);
                break;
            case 2:
                // if (beasiswa[1][0] != null) {
                // System.out.println("Urutkan Berdasar!");
                // System.out.println("1. No Daftar");
                // System.out.println("2. NIK");
                // System.out.println("3. Nisn");
                // System.out.println("4. Niilai Tes Tulis");
                // System.out.println("5. Nilai Tes Wawancara");
                // System.out.print("Pilih(1-5): ");
                // int a = input.nextInt();
                // switch (a) {
                // case 1:
                // urutkan(beasiswa, 0);
                // break;
                // case 2:
                // urutkan(beasiswa, 1);
                // break;
                // case 3:
                // urutkan(beasiswa, 5);
                // break;
                // case 4:
                // urutkan(beasiswa, 7);
                // break;
                // case 5:
                // urutkan(beasiswa, 8);
                // default:
                // System.out.println("Opsi tidak ada");
                // }
                // }
                judul("Data Mahasiswa");
                tampilBeasiswa(beasiswa);
                break;
            case 0:
                System.out.println("Anda akan diarahkan ke awal ....");
                break;
            default:
                System.out.println("Opsi tidak ada");
                break;
        }

    }

    public static void regular() {
        judul("Program Pendaftaran Regular");
        System.out.println("1. Input Pendaftar");
        System.out.println("2. Liat Pendaftar");
        System.out.println("0. Keluar");
        System.out.print("Masukkan pilihan: ");
        int pil = input.nextInt();

        switch (pil) {
            case 1:
                System.out.println("Masukkan Data Pendaftar!!");
                insertRegular(regular, "RGL");
                break;
            case 2:
                System.out.println("Data Mahasiswa");
                tampilRegular(regular);
                break;
            case 0:
                System.out.println("Anda akan diarahkan ke awal ....");
                break;
            default:
                System.out.println("Opsi tidak ada");
                break;
        }
    }

    public static String nodaftar(String arr[][], String a) {
        String re = "";
        for (int i = 0; i < 10; i++) {
            if (arr[i][0] == null) {
                re = a + String.format("%04d", (i + 1));
                break;
            }
            if (!arr[i][0].equals(a + String.format("%04d", i))) {
                re = a + String.format("%04d", (i));
            }
        }
        return re;
    }

    public static String[][] urutkan(String array[][], int u) {
        judul("Urutan data Mahasiswa");

        int flag;
        String temp[] = new String[array.length];
        int k = 0;
        while (array[k][0] != null) {
            k++;
        }
        // if (a.equals("asc")) {

        // for (int i = 0; i < array.length; i++) {
        // flag = i;
        // for (int j = i + 1; j < array.length; j++) {
        // if (Integer.parseInt(array[j][u]) < Integer.parseInt(array[flag][u]))
        // flag = j;
        // }
        // if (flag != 1) {
        // for (int j = 0; j < temp.length; j++)
        // temp[j] = array[i][j];
        // for (int j = 0; j < temp.length; j++)
        // array[i][j] = array[flag][j];
        // for (int j = 0; j < temp.length; j++)
        // array[flag][j] = temp[j];
        // }
        // }
        if (u == 0) {
            for (int i = 0; i < k + 1; i++) {
                flag = i;
                for (int j = i + 1; j < k + 1; j++) {
                    if (Integer.parseInt(array[j][u].substring(3)) < Integer.parseInt(array[flag][u].substring(3)))
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
        } else {
            for (int i = 0; i < k + 1; i++) {
                flag = i;
                for (int j = i + 1; j < k + 1; j++) {
                    if (Integer.parseInt(array[j][u]) < Integer.parseInt(array[flag][u]))
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
        }
        return array;

    }

    public static void main(String[] args) {
        judul("Sistem Pendaftaran Mahasiswa Baru");
        System.out.println("1. Beasiswa");
        System.out.println("2. Regular");
        System.out.println("0. Keluar");
        System.out.print("Pilihan :");
        int pil = input.nextInt();
        do {
            switch (pil) {
                case 1:
                    beasiswa();
                    break;
                case 2:
                    regular();
                    break;
                case 0:
                    System.out.println("Bye....");
                    break;
            }
        } while (pil != 0);
    }
}