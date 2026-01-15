package Z_pratica;

//so funciona se for todos num positivos e crescente, pois quebra se passar do target, deixando de lado proximas combinações
public class subArrSum {
    static void main (){
        //ler as vars, criar func
        int [] arr = {1,-1,5,-2,3};
        int target = 3;
        int position = 0;

        //loop percorre array
        for (int i=0; i <arr.length; i++){
            int sum = 0;
            //tem q ser arr dinamico n posso criar vazio e ir adicionando?
            int[] subArr = new int[arr.length];

            //salva temp as posições consultadas, verifica se a soma de algum subarray é igual ao target
            while (position < arr.length -1){
                if (sum < target) {
                    sum += arr[position];
                    subArr[position] = arr[position];
                    position++;
                }
                else if (sum > target){
                    break;
                }

                System.out.println("Subarray encontrado:");
                for (int j = i; j <= position; j++) {
                    System.out.print(arr[j] + " POS: " + j + " | ");
                }
                System.out.println();
                break;
            }
            position = i + 1;
            sum = 0;
            subArr = new int[arr.length];
        }
    }
}
