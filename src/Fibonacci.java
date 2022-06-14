public class Fibonacci {

    int[] fibonacci1(int n) {
        int[] fiboarr = new int[n];
        fiboarr[0] = 0;
        fiboarr[1] = 1;
        int i = 2;
        while (n > i) {
            fiboarr[i] = fiboarr[i - 1] + fiboarr[i - 2];
            i++;
        }
        return fiboarr;
    }


    int[] fibonacci2(int n) {
        int[] fiboarr = new int[n];
        fiboarr[0] = 0;
        fiboarr[1] = 1;
        int i = 2;
        do {
            fiboarr[i] = fiboarr[i - 1] + fiboarr[i - 2];
            i++;
        } while ((n > i));
        return fiboarr;
    }



    int[] fibonacci3(int n) {
        int[] fiboarr = new int[n];
        fiboarr[0] = 0;
        fiboarr[1] = 1;
        for (int i = 2; i < n; i++) {
            fiboarr[i] = fiboarr[i - 1] + fiboarr[i - 2];
        }
        return fiboarr;
    }


}
