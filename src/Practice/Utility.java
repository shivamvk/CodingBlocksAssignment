package Practice;

import java.util.Scanner;

class Utility {

    public static void main(String[] args) {
        be();
    }

    private static void be(){
        Scanner scanner = new Scanner(System.in);
        char ch;
        do{
            ch = scanner.next().charAt(0);
            switch(ch){
                case 'X':
                    break;

                case 'x':
                    break;

                case '+':
                    int a = scanner.nextInt();
                    int b = scanner.nextInt();
                    System.out.println(a+b);
            }
        } while(ch != 'X' || ch != 'x');
    }

    static void display(int[] nums){
        for (int i : nums){
            System.out.println(i);
        }
    }

    static void swap(int [] nums, int a, int b){
        int temp = nums[a];
        nums[a] = nums[b];
        nums[b] = temp;
    }

    //linear search
    static int find(int[] nums, int a){
        for (int i=0; i<nums.length; i++){
            if (nums[i] == a){
                return i;
            }
        }
        return -1;
    }

    static int findMax(int[] nums){
        int max = 0;
        for (int i=0; i < nums.length; i++){
            if (nums[i]>nums[max]){
                max = i;
            }
        }
        return max;
    }

    static int findMax(int[] nums, int start, int end){
        int max = start;
        for (int i=start; i<end; i++){
            if (nums[i] > nums[max]){
                max = i;
            }
        }
        return max;
    }
}
