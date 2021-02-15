import java.util.ArrayList;
//worked with David Yang
public class MyMain {
    // Sorts the ArrayList using insertion sort
    public static ArrayList<Integer> insertionSort(ArrayList<Integer> list) {
        for(int i = 1;i<list.size();i++){
            int a = list.get(i);
            int b = i-1;
            while((b>-1) &&(list.get(b).compareTo(a)) == 1){
                list.set(b+1,list.get(b));
                b--;
            }
            list.set(b+1,a);
        }
        return list;
    }

     // Merges two sorted arrays into one large combined
     // sorted array
     // You may assume arr1 and arr2 are the same length
    public static int[] merge(int[] arr1, int[] arr2) { 
        int [] output = new int[arr1.length + arr2.length];
        int counter = 0;
        int counter2 = 0;    
        int counter3 = 0;

        while(counter<arr1.length && counter2<arr2.length){
            if(arr1[counter]<arr2[counter2]){
                output[counter3] = arr1[counter];
                counter++;
            }
            else{
                output[counter3] = arr2[counter2];
                counter2++;
            }
            counter3++;
        }
        while(counter<arr1.length){
            output[counter3] = arr1[counter];
            counter++;
            counter3++;
        }
        while(counter2<arr2.length){
            output[counter3] = arr2[counter2];
            counter2++;
            counter3++;
        }
        
        return output;
    }

    public static void main(String[] args) {
        // You can test your code here
    }
}
