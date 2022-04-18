package week2;

public class findtargetindex {

	public static void main(String[] args) {
		int[] a={1,3,5,6};
        int target=4;
        int print= searchinsert(a,target);
        System.out.println(print);
    }
    private static int searchinsert(int[] a, int target) {
        int start = 0;
        int end =a.length - 1;
        while(start <= end){
            int mid = start+(end - start) / 2;
            if(a[mid] == target){
                return mid;
            }
            else if(a[mid] < target){
                start = mid + 1;
            }
            else{
                end = mid - 1;
            }
        }
        return start;

	}

}
