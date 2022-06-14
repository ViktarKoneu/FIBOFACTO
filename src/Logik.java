
public class Logik {
    static int[] logikSide(int algorithmId, int loopType, int n) {
        Fibonacci fibo1 = new Fibonacci();
        Fibonacci fibo2 = new Fibonacci();
        Fibonacci fibo3 = new Fibonacci();
        Faktorial fact1 = new Faktorial();
        Faktorial fact2 = new Faktorial();
        Faktorial fact3 = new Faktorial();
        int[] dimm = new int[n];
        switch (algorithmId) {
            case 1:
                switch (loopType) {
                    case 1:
                        int[] res1 = fibo1.fibonacci1(n);
                        dimm = res1;
                        break;
                    case 2:
                        int[] res2 = fibo2.fibonacci2(n);
                        dimm = res2;
                        break;
                    case 3:
                        int[] res3 = fibo3.fibonacci3(n);
                        dimm = res3;
                        break;
                }
                break;
            case 2:
                switch (loopType) {
                    case 1:
                        int[] res1 = fact1.factory1(n);
                        dimm = res1;
                        break;
                    case 2:
                        int[] res2 = fact2.factory2(n);
                        dimm = res2;
                        break;
                    case 3:
                        int[] res3 = fact3.factory3(n);
                        dimm = res3;
                        break;
                }
                break;
            default:
                System.out.println("failure error");
        }
        return dimm;
    }
}


