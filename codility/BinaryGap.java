package codility;

public class BinaryGap {
    public int solution(int N) {

        int maxGap = 0;
        int gap = -1;
        while (true) {
            if (N % 2 == 1) {
                maxGap = maxGap < gap ? gap : maxGap;
                N = N - 1;
                if (N == 0) {
                    break;
                }
                gap = 0;
            } else {
                if (gap != -1)
                    gap++;
            }
            N = N / 2;
        }
        return maxGap;
    }
}