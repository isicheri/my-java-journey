package practice;

public class Algo {


    public static void isPrime(int n){
//        if(n < 2){
//            return false
//        }
        for(int i =2; i < n; i++){
//            if(n % i == 0){
//
//            }
            System.out.println(i);
        }
        return;
    }

    public static void highestNum(int[] a) {
//        int largest = a[0];
        int largest = a[0];

//        System.out.println(largest);
        for (int i = 0; i < a.length; i++) {
//            System.out.println(largest);
//            System.out.println(largest + " " + a[i]);
            if(largest < a[i]) {
                largest = a[i];
            }

        }
        System.out.println("the main output:");
        System.out.println(largest);
    }

    public static void main(String[] args) {

//        Algo.isPrime(7);
        Algo.highestNum(new int[]{2,3,45,6,7});

    }
}
