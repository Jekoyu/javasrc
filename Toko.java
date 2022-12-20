import java.util.Scanner;

public class Toko {
    static Scanner s = new Scanner(System.in);
    static Scanner inp = new Scanner(System.in);

    private static String[][] addElementArray(String keranjang[][]) {

        System.out.println("Tambah porduk ke keranjang : ");
        String temp[][] = keranjang;
        keranjang = new String[temp.length + 1][2];
        for (int i = 0; i < temp.length; i++) {
            keranjang[i][0] = temp[i][0];
            keranjang[i][1] = temp[i][1];
        }
        System.out.print("Nama Produk\t:");
        keranjang[temp.length][0] = inp.nextLine();
        System.out.print("Harga Produk\t:");
        keranjang[temp.length][1] = inp.nextLine();

        return keranjang;
    }

    public static void isikeranjang(String keranjang[][]) {
        System.out.println("\n> Isi Keranjang");
        int produk = 0;
        int harga = 1;
        if (keranjang.length == 0) {
            System.out.println("Keranjang kosong");
        } else {
            for (int i = 0; i < keranjang.length; i++) {
                System.out.println("Keranjang ke-" + (i + 1) + " : ");
                System.out.println("Produk " + keranjang[i][produk]);
                System.out.println("Harga " + keranjang[i][harga]);
            }
        }
    }

    public static void daftar(String produk[], int harga[]) {
        for (int a = 0; a < 3; a++) {
            for (int b = 0; b < 2; b++) {
                if (harga[b] > harga[b + 1]) {
                    int temp = harga[b];
                    harga[b] = harga[b + 1];
                    harga[b + 1] = temp;
                    // urutproduk
                    String p = produk[b];
                    produk[b] = produk[b + 1];
                    produk[b + 1] = p;
                }
            }
        }
        for (int a = 0; a < 3; a++) {
            System.out.println(produk[a] + "\t" + harga[a]);
        }
    }

    public static void invoice(String array[][]) {

        System.out.println("nama\tharga\tjumlah\total");
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {

                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {

        String pilih;
        String username[] = new String[1];
        String password[] = new String[1];
        String user[] = new String[1];
        String pass[] = new String[1];

        System.out.print("Apakah anda telah memiliki akun(y/t)? ");
        pilih = s.nextLine();

        if (pilih.equals("y")) {
            for (int i = 0; i < 1; i++) {
                System.out.println("<===LOGIN===>");
                System.out.print("\nUsername : ");
                user[i] = s.nextLine();
                System.out.print("Pass : ");
                pass[i] = s.nextLine();
            }

            for (int i = 0; i < user.length; i++) {
                if (user[i].equals(username[i]) && pass[i].equals(password[i])) {
                    System.out.println("masuk");
                } else {
                    System.out.println("gagal");
                }
            }
        } else if (pilih.equals("t")) {
            for (int i = 0; i < 1; i++) {
                System.out.println("<===REGISTER===>");
                System.out.print("Masukkan username anda : ");
                username[i] = s.nextLine();
                System.out.print("Masukkan password anda : ");
                password[i] = s.nextLine();
            }
            for (int i = 0; i < 1; i++) {
                System.out.println("<===LOGIN===>");
                System.out.print("\nUsername : ");
                user[i] = s.nextLine();
                System.out.print("Password : ");
                pass[i] = s.nextLine();
            }

            for (int i = 0; i < user.length; i++) {
                if (user[i].equals(username[i]) && pass[i].equals(password[i])) {
                    String krjg[][] = new String[0][0];
                    String produk[] = new String[3];
                    int harga[] = new int[3];
                    int plh = 0;
                    produk[0] = "Bedak";
                    harga[0] = 31000;
                    produk[1] = "Bronzer";
                    harga[1] = 83000;
                    produk[2] = "Maskara";
                    harga[2] = 67000;
                    do {
                        System.out.println("\n<===PRODUK===>");
                        System.out.println("1.Daftar produk");
                        System.out.println("2.Tambah daftar keranjang");
                        System.out.println("3.Hapus daftar keranjang");
                        System.out.println("4.Ubah daftar keranjang");
                        System.out.println("5.Lihat daftar keranjang");
                        System.out.println("6.Lihat invoice");
                        System.out.println("7.Keluar");
                        System.out.print("Pilih : ");
                        plh = s.nextInt();
                        switch (plh) {
                            case 1:
                                daftar(produk, harga);
                                break;
                            case 2:
                                krjg = addElementArray(krjg);
                                break;
                            case 3:
                                break;
                            case 4:

                                break;
                            case 5:
                                isikeranjang(krjg);
                                break;
                            case 6:
                                invoice(krjg);
                                break;
                            case 7:
                                System.out.println("Terima Kasih..");
                                break;
                        }
                    } while (plh != 7);
                } else {
                    System.out.println("Username atau password yang anda masukkan tidak sesuai");
                }
            }
        } else {
            System.out.println("Yang anda inputkan salah");
        }

    }

}