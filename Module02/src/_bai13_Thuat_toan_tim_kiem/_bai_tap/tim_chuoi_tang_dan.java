package _bai13_Thuat_toan_tim_kiem._bai_tap;

public class tim_chuoi_tang_dan {
    public static void main(String[] args) {
        String string = "Welcome";
        char[] arr = string.toCharArray();
        System.out.print(arr[0]);
        int ss = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > ss) {
                System.out.print(arr[i]);
                ss = arr[i];
            }
        }
    }
}
