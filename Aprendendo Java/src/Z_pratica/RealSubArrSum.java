package Z_pratica;

public class RealSubArrSum {
    public static void main(String[] args) {
        int[] nums = {1, -1, 5, -2, 3};
        int k = 3;

        //neste caso, soma todo o arr, para cada indice, testando todas as combinações possiveis, se for igual imprime, senão, só passa proxima posição, beeeemmm mais fácil e sem 3 ifs, mas continua O^2, dois fors aninhados
        for (int start = 0; start < nums.length; start++) {
            int sum = 0;
            for (int end = start; end < nums.length; end++) {
                sum += nums[end];

                if (sum == k) {
                    System.out.println("Subarray encontrado de índice " + start + " a " + end + ":");
                    for (int i = start; i <= end; i++) {
                        System.out.print(nums[i] + " ");
                    }
                    System.out.println();
                }
            }
        }
    }
}
