import java.util.Scanner;
public class massiv {
    public static Scanner sc;
    public static int[] arr;

    public static void fillArr(int i){
        if(i < arr.length){
            System.out.println("Введите " + (i+1) + " элемент");
            arr[i] = sc.nextInt();
            fillArr(++i);
        }
    }

    public static void printArr(int i){
        if(i < arr.length){
            System.out.print(arr[i]+" ");
            printArr(++i);
        }
    }

    public static void main(String[] args){
        sc = new Scanner(System.in);
        System.out.println("введите кол-во элементов");
        int b = sc.nextInt();
        arr = new int[b];
        fillArr(0);
        printArr(0);
    }
}