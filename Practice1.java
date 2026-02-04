import java.util.*; 
public class Practice1{
    public static void main(String[] args){
        try (Scanner sc = new Scanner(System.in)) {
            int A = sc.nextInt();
            int B = sc.nextInt();
            
            if(A==B){
                System.out.println("A is Equal to B");
            }else{
                if(A > B){
                    System.out.println("A is greater than B");
                }else{
                    System.out.println("A is less than B");
                }
            }
        }

    }
    
}    
     
       

