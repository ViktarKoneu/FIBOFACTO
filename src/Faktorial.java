
public class Faktorial {

    int[] factory1(int n) {
        int[] fiboarr = new int[n];
        fiboarr[0] = 1;
        int i = 1;
        while (n > i) {
            fiboarr[i] = fiboarr[i - 1] * i;
            i++;
        }
        return fiboarr;
    }

    int[] factory2(int n) {
        int[] fiboarr = new int[n];
        fiboarr[0] = 1;
        int i = 1;
        do {
            fiboarr[i] = fiboarr[i - 1] * i;
            i++;
        } while ((n > i));
        return fiboarr;
    }

    int[] factory3(int n) {
        int[] fiboarr = new int[n];
        fiboarr[0] = 1;
        for (int i = 1; i < n; i++) {
            fiboarr[i] = fiboarr[i - 1] * i;
        }
        return fiboarr;
    }
}
