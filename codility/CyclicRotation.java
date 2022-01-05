package codility;

class CyclicRotation {

    public int[] solution(int[] A, int K) {
       
       int [] res = new int [A.length];

       K = K % A.length;
       if(K == 0){
           return A;
       }

       for( int i = 0;i<A.length;i++){
           res[(i+K) % A.length ] = A[i];
       }
       
       return res;
    }
}