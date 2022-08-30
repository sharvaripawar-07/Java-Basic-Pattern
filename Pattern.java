/******
*****
*****
*****
*****
*/
// public class Pattern{
//     public static void main(String[] args) {
//         for(int i=1;i<=5;i++) {
//             for(int j=1;j<=5;j++) {
//                 System.out.print("* ");
//             }
//             System.out.println(" ");
//         }
//     }
// }

// using function and taking input from user
import java.util.*; 
public class Pattern{
     static void pat1(int i, int j,int n){
        for(i=1;i<=n;i++){
            for(j=1;j<=n;j++){
                System.out.print("* ");
            }
            System.out.println(" ");
        }
     }
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
       pat1(n, n, n);
    }
}