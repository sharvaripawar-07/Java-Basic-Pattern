/*
 A  
A B
A B C
A B C D
A B C D E
 */
public class Pattern7 {
    public static void main(String[] args) {
        // char lihiatna te variable single inverted comma madhech declare karayach
        char a='A';
        for(int i=1;i<=5;i++){
            for(int j=1;j<=i;j++){
                System.out.print(a+" ");
                a++;
               
            }
            a='A';
            System.out.println(" ");

        }
    }
}
