package CastingExample;
import java.util.ArrayList;
import java.util.Stack;

public class speed {
    public static void main(String[] args) {

        int[] arr = {95,90,99,99,80,99};
        int[] speed = {1,1,1,1,1,1};

        Stack cost = new Stack();
        ArrayList answer = new ArrayList();

        int count = 1;
        int current = 0;

        for(int i=arr.length-1 ; i>=0; i--){
            cost.push((int)Math.ceil((double)(100-arr[i])/speed[i]));
        }

        System.out.println(cost);
        while(!cost.isEmpty()){
           current = (int)cost.pop();
            System.out.println(current);
            while(!cost.isEmpty()){
                if(current>=(int)cost.peek()){
//                    System.out.println("카운트 증가");
                    cost.pop();
                    count++;
                }
                else{
                    if(!cost.isEmpty()){
//                        System.out.println("push");
                        answer.add(count);
                        count = 1;
                        break;
                    }
                    else{
                        break;
                    }
                }
            }
        }
        if(cost.isEmpty()){
            answer.add(count);
        }
        System.out.println(answer);
        /*
         * String[] array = new String[arrayList.size()];
         * int size=0;
         * for(String temp : arrayList)
         * {
         *  array[size++] = temp;
         * }
         * */
    }
}
