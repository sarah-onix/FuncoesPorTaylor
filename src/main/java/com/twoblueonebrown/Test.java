import java.util.Scanner;

public class Test {

    public static int fat( int n ) {
        int current = 1;
        int ans = 1;
        while( current < n + 1 ) {
            ans = ans * current;
            current++;
        }
        return ans;
    }
	public static void main(String[] args) {
        Scanner in = new Scanner( System.in );
        while( true ) {
            int n = in.nextInt();
            System.out.println(fat(n));
        }
	}

}

