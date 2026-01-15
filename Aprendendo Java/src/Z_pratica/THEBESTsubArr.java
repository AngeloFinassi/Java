package Z_pratica;
import java.util.HashMap;
import java.util.Map;

public class THEBESTsubArr {
    public static void main(String[] args) {
        int[] nums = {1, -1, 5, -2, 3};
        int k = 3;

        // map guarda: soma acumulada -> índice mais antigo
        Map<Integer, Integer> map = new HashMap<>();

        map.put(0, -1); // soma zero antes de começar, para acptura subarray no indice 0

        int sum = 0;
        int maxLen = 0;

        for (int i = 0; i < nums.length; i++) {

            sum += nums[i];

            // se já existe soma (sum - k), temos um subarray
            if (map.containsKey(sum - k)) {
                int startIndex = map.get(sum - k);
                int length = i - startIndex;

                maxLen = Math.max(maxLen, length);
            }

            // só salva a primeira ocorrência da soma
            map.putIfAbsent(sum, i);
        }

        System.out.println("Maior subarray com soma k: " + maxLen);
    }
}
