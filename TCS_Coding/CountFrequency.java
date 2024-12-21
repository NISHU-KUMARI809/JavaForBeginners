package TCS_Coding;

import java.util.HashMap;
import java.util.Map;

public class CountFrequency {
    public static void main(String[] args) {
        int arr[]={1,2,1,1,2,3,2,4,3,4,5,5,6,5,6};
        HashMap<Integer,Integer>map=new HashMap<Integer,Integer>();
        for(int i=0;i<arr.length;i++){
            if(map.containsKey(arr[i])){
                map.put(arr[i],map.get(arr[i])+1);
            }
            else{
                map.put(arr[i],1);
            }
        }
        //to traverse through the hashmap..........
        for(Map.Entry<Integer,Integer> entry :map.entrySet()){
            System.out.println(entry.getKey()+" "+entry.getValue());
        }
    }
    
}
