/*
A B C D E  
A B C D
A B C
A B
A
 */
public class Pattern8 {
    public static void main(String[] args) {
        char a='A';
        for(int i=5;i>=1;i--){
            for(int j=1;j<=i;j++){
                System.out.print(a+" ");
                a++;
            }
            a='A';
            System.out.println(" ");
        }
    }
}
