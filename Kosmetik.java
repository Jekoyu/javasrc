import java.util.Random;
import java.util.Scanner;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Kosmetik {
    static Scanner input = new Scanner(System.in);
    static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

    public static String[][] register(String arr[][]) {
        try {

            System.out.println("------------------------------");
            System.out.println("\tRegister");
            System.out.println("------------------------------");
            System.out.print("> Inputkan Username :");
            String user = in.readLine();
            System.out.print("> Inputkan Password :");
            String pwd = in.readLine();
            System.out.println("------------------------------");
            boolean c = true;
            int i = 0;
            do {
                if (arr[i][0] != null) {
                    i++;
                } else if (arr[i][0] == null) {
                    arr[i][0] = user;
                    arr[i][1] = pwd;
                    arr[i][2] = "2";
                    c = false;
                }

            } while (c == true);
        } catch (IOException e) {
            System.out.println(e);
        }
        return arr;
    }

    public static boolean login(String arr[][], boolean login) {
        try {

            login = false;
            System.out.println("------------------------------");
            System.out.println("\tLogin");
            System.out.println("------------------------------");
            System.out.print("> Inputkan Username : ");
            String user = in.readLine();
            System.out.print("> Inputkan Password : ");
            String pwd = in.readLine();
            System.out.println("------------------------------");
            boolean c = true;
            int i = 0;
            do {
                if (user.equals(arr[i][0]) && pwd.equals(arr[i][1])) {
                    if (arr[i][2].equals("1")) {
                        admin();
                        c = false;
                        login = true;
                    } else if (arr[i][2].equals("2")) {
                        customer();
                        c = false;
                        login = true;
                    }
                } else {
                    System.out.println("Username/pwd Salah");
                    c = false;

                }
                i++;
            } while (c == true);
        } catch (IOException e) {
            System.out.println(e);
        }
        return login;
    }

    public static void admin() {
        System.out.println("admin nih boss");
    }

    public static void customer() {
        System.out.println("cst nih bos");
    }

    public static void main(String[] args) {
        boolean c = true, login = false;
        String users[][] = new String[10][3];

        users[0][0] = "admin";
        users[0][1] = "admin";
        users[0][2] = "1";
        String barang[][] = new String[10][2];
        do {
            login(users, login);
            if (login == false) {
                register(users);
                System.out.println(users[1][0]);
            }
        } while (c == true);
    }
}
