public class LinearArrayRec {
    public static void main(String[] args) {
        System.out.println("rec hello world");
        int[] arr = {1, 2, 3, 4, 5, 6, 10, 12, 18};
        System.out.println(isLinear(arr, 0));
        System.out.println(linearSearchRec(arr, 18, 0));
    }

    static boolean isLinear(int[] arr, int index){
        if(index == arr.length - 1)
            return true;
        return arr[index] < arr[index + 1] && isLinear(arr, index + 1);
    }

    static int linearSearchRec(int[] arr, int target, int index) {
        if (index == arr.length)
            return -1;
        if (arr[index] == target)
            return index;
        else
            return linearSearchRec(arr, target, index + 1);
    }
}
