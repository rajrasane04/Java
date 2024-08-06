import java.util.Scanner;

public class JavaPatternsUsingLoops {
    public static void main(String[] args) {
        pattern10();
    }

    // Pattern 1
    public static void pattern1(){
        Scanner sc = new Scanner(System.in);
        int n,i,j;
        
        System.out.println("Enter how many lines of pattern you want to print :- ");
        n = sc.nextInt();

        sc.close();

        System.out.println("Pattern :- ");

        for(i=0;i<n;i++){
            for(j=0;j<n;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    // Pattern 2
    public static void pattern2(){
        Scanner sc = new Scanner(System.in);
        int n,i,j;
        
        System.out.println("Enter how many lines of pattern you want to print :- ");
        n = sc.nextInt();

        sc.close();

        System.out.print("Pattern :- ");

        for(i=0;i<=n;i++){
            for(j=0;j<i;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    // Pattern 3
    public static void pattern3(){
        Scanner sc = new Scanner(System.in);
        int n,i,j;
        
        System.out.println("Enter how many lines of pattern you want to print :- ");
        n = sc.nextInt();

        System.out.println("Pattern :- ");

        for(i=0;i<=n;i++){
            for(j=0;j<n-i;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    // Pattern 4
    public static void pattern4(){
        Scanner sc = new Scanner(System.in);
        int n,i,j;
        
        System.out.println("Enter how many lines of pattern you want to print :- ");
        n = sc.nextInt();

        System.out.println("Pattern :- ");

        for(i=1;i<=n;i++){
            for(j=1;j<=i;j++){
                System.out.print(j);
            }
            System.out.println();
        }
    }

    // Pattern 5
    public static void pattern5(){
        Scanner sc = new Scanner(System.in);
        int n,i,j;
        char ch = 'A';
        
        System.out.println("Enter how many lines of pattern you want to print :- ");
        n = sc.nextInt();

        System.out.print("Pattern :- ");

        for(i=0;i<=n;i++){
            for(j=0;j<i;j++){
                System.out.print(ch);
                ch++;
            }
            System.out.println();
        }
    }

    // pattern 6 (Hollow Rectangle)
    public static void pattern6(){
        Scanner sc = new Scanner(System.in);
        int n1,n2,i,j;
        
        System.out.println("Enter how many rows of pattern you want to print :- ");
        n1 = sc.nextInt();

        System.out.println("Enter how many columns of pattern you want to print :- ");
        n2 = sc.nextInt();

        sc.close();

        System.out.println("Pattern :- ");
        for(i=1;i<=n1;i++){
            for(j=1;j<=n2;j++){
                if(i==1 || i==n1 || j==1 || j==n2){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    // pattern 7 (inverted and Rotated Half Pyramid)
    public static void pattern7(){
        Scanner sc = new Scanner(System.in);
        int n,i,j;
        
        System.out.println("Enter how many lines of pattern you want to print :- ");
        n = sc.nextInt();

        sc.close();

        System.out.println("Pattern :- ");
        for(i=1;i<=n;i++){
            for(j=1;j<=n-i;j++){
                System.out.print(" ");
            }
            for(j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    // pattern 8 (Inverted Half Pyramid with numbers)
    public static void pattern8(){
        int n,i,j;
        Scanner sc =new Scanner(System.in);

        System.out.println("Enter number for how many lines of pattern you want to display:- ");
        n = sc.nextInt();

        System.out.println("pattern :- ");
        for(i=1;i<=n;i++){
            for(j=1;j<=n+1-i;j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }

    // pattern 9 (Floyds Triangle)
    public static void pattern9(){
        int n,i,j,k=1;
        Scanner sc =new Scanner(System.in);

        System.out.println("Enter number for how many lines of pattern you want to display:- ");
        n = sc.nextInt();

        System.out.println("pattern :- ");
        for(i=1;i<=n;i++){
            for(j=1;j<i+1;j++){
                System.out.print(k+" ");
                k++;
            }
            System.out.println();
        }
    }

    // pattern 10 (0-1 Triangle)
    public static void pattern10(){
        int n,i,j;
        Scanner sc =new Scanner(System.in);

        System.out.println("Enter number for how many lines of pattern you want to display:- ");
        n = sc.nextInt();

        System.out.println("pattern :- ");
        for(i=1;i<=n;i++){
            for(j=1;j<=i;j++){
                if((i+j)%2==0){
                    System.out.print(1);
                }
                else{
                    System.out.print(0);
                }
            }
            System.out.println();
        }
    }
}
