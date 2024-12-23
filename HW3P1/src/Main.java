public class Main {

    public static void main(String[] args) {
        int[] input = {500, 700, 800, 100, 300, 200, 900, 400, 100, 600};
        System.out.println("Input: ");
        print(input);
        quicksort(input, 0, 9);
        System.out.println("Output: ");
        print(input);
    }
    private static int partition (int[] input, int p, int r){
        int pivot = input[r];
        while(p < r){
            while(input[p] < pivot) p++;
            while(input[r] > pivot) r--;
            if(input[p] == input[r]) p++;
            else if ( p < r) {
                int tmp = input[p];
                input[p] = input[r];
                input[r] = tmp;
            }
        }
        return r;
    }
    private static void quicksort(int[] input, int p, int r){
        if(p < r){
            int j = partition(input, p, r);
            quicksort(input, p, j-1);
            quicksort(input, j+1, r);
        }
    }

    private static void print(int[] input){
        for(int i = 0; i < input.length; i++){
            System.out.println(input[i]);
        }
    }
}