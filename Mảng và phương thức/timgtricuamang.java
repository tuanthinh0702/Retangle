import java.util.Scanner;

public class timgtricuamang {
    public static void main(String[] args) {
        String[] students = { "christian", "Michael","Camila","Sienna","Tanya","Connor","Zachariah","Mallory","zoe","Emily"};
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a name's student:");
        String input_name = scanner.nextLine();
        boolean isExist = false;
        for(int i=0; i< students.length;i++)
        {
            if(students[i].equals(input_name))
            {
                System.out.println("Position of the student in the list"+ input_name+"is:"+(i+1));
                isExist = true;
                break;
            }
            if(!isExist)
            {
                System.out.println("Not found"+ input_name + "in the list.");
            }
        }
    }
}
