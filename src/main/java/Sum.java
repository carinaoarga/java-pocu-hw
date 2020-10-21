public class Sum {

    public static void main(String[] args){
        int[] numbers = {12, 20, 30, 40, 50};

        int sum = 0;

        for(int x : numbers){
            if(x == 30){
                continue;   //interrupts the step
            }

            sum+=x;

            if(sum>100){
                break;     //exits the loop
            }
            System.out.println(x);
        }

        System.out.println("sum: " + sum);
    }
}
