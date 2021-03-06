public class Accumulator {
    private int[] A;

    public Accumulator(int[] X) {
        A= new int[X.length];
        for (int i=0; i<X.length; i++)
            A[i] = X[i];
    }

    public int twiceSumA() {
        int sum=0;
        for(int i=0; i<A.length; i++)
        {
            sum = A[i] + sum;
        }
        return sum*2;
    }
    
     public static void main(String args[]){ // you can use the main method to test your code
        
      int[]  A = {2,4,3,5,8};
      
      int r=new Accumulator(A).twiceSumA(); //change argument to test different cases
      System.out.println(r);
    }

}