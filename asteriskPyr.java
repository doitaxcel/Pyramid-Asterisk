import java.util.Scanner;

public class asteriskPyr {
    public static void main(String args[]){
        Scanner x = new Scanner(System.in);
        
        // int i,s,l;
        // i = inital
        // s = space
        // l = asterisk(symbol/logo) 

        System.out.println("How many rows do you want in your Pyramid?");
        int row = x.nextInt();
        
        for(int i=1; i<=row ; i++){   //this loop is for the rows

            for(int s=1 ; s<=row-i ;s++){ //this loop is the condition to print the Spaces(" ")
                System.out.print(" ");
            }
            for(int l=1; l<=i*2-1;l++){ //this loop is the condition to print the Askterisk(*)
                System.out.print("*");
            }  
        System.out.println();
        }            

    }
}
