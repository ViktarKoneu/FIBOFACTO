import java.util.Arrays;


import static java.lang.System.out;

public class Main {

            public static void main(String[] args) {
                int algorithmId = 1;
                int loopType = 2;
                int n = 12;
                int[] dimm = Logik.logikSide(algorithmId, loopType, n);
                out.println(Arrays.toString(dimm));
            }
        }


