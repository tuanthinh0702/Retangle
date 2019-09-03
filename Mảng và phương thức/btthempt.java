//import java.util.Scanner;
//
//public class btthempt {
//    public static void main(String[] args) {
//        int size;
//        Scanner scanner = new Scanner(System.in);
//        int[] array;
//            do {
//                System.out.println("nhập size");
//                size = scanner.nextInt();
//                if(size>20)
//                {
//                    System.out.print("lớn hơn 20 phần tử");
//                }
//            }while(size>20);
//
//        array = new int[size];
//                for(int i =0; i< array.length;i++)
//                {
//                    System.out.println("phần tử thứ "+(i+1) +":");
//                    array[i] = scanner.nextInt();
//                }
//        System.out.println("nhập vị trí");
//        int vitri = scanner.nextInt();
//                if(vitri<=0 && vitri>=array.length-1) {
//                    System.out.println("không hiển thị ");
//                }
//                else {
//                    for (int i = 0; i < array.length; i++) {
//                        if (vitri == i) {
//                            array[i] = scanner.nextInt();
//                        }
//                    }
//                }
//
//    }
//
//}
