package week01;

public class banbok {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};

//        for (int i = 0; i < 5; i++) {
//            System.out.println(arr[i]);
//            // printf("%d\n", arr[i]);
//        }
        int a = 10;
        int b = 20;
        int c = 30;
        int d = 40;
        while((a < d) || (a++ < b)){  //앞에가 true면 뒤에 연산 안하고 넘어가버린다
            System.out.printf("chuleak");
        }
    }
}