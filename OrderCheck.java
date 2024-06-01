import java.util.Arrays;

public class OrderCheck {
    public int countStudents(int[] height) {
        int [] sortedHieght=height.clone();
        Arrays.sort(sortedHieght);
        int count=0;
        for (int i=0;i<height.length;i++){
            if(height[i]!=sortedHieght[i]){
                count++;
            }
        }
return count;
    }
    public static void main(String[] args) {
        OrderCheck oc = new OrderCheck();
        System.out.println(oc.countStudents(new int[]{1, 1, 3, 3, 4, 1})); // Expected: 3
        System.out.println(oc.countStudents(new int[]{1, 2, 3, 4, 5})); // Expected: 0
        System.out.println(oc.countStudents(new int[]{5, 4, 3, 2, 1})); // Expected: 4
        System.out.println(oc.countStudents(new int[]{1, 1, 1, 2, 2, 3, 3, 3})); // Expected: 0
        System.out.println(oc.countStudents(new int[]{1000000000, 100000000, 10000000, 1000000, 100000, 10000, 1000, 100, 10, 1})); // Expected: 9
        System.out.println(oc.countStudents(new int[]{1, 1, 1, 1, 1})); // Expected: 0
        System.out.println(oc.countStudents(new int[]{})); // Expected: 0
    }
}
