package interprocess;


import java.util.HashMap;

public class Tsum {


    public int[] twosum(int[] nums , int target)
    {
        HashMap<Integer,Integer> map = new HashMap<>();

        for (int i=0 ;i< nums.length;i++)
        {
            int need = target-nums[i];
            if (map.containsKey(need)) return new int[]{map.get(need),i};
            map.put(nums[i],i);

        }
        return null;

    }


    public static void main(String[] args) {

        Tsum t = new Tsum();
        int [] nums = {2,6,5,8,11};
        int target = 14;
        int[] result = t.twosum(nums,target);

        System.out.println(result[0]+" "+result[1]);

    }
}

