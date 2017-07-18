package LeetCode.Solutions;

import LeetCode.LeetCodeBase;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TwoSum extends LeetCodeBase
{

    private String mDescription = "Two Sum: two numbers from array such that they add up to a specific target";

    /***
     * This is the individual main function for this solution.
     *
     * @param args
     */
    public static void main(String args[])
    {
        LeetCodeBase lProblem = new TwoSum();
        lProblem.run();
    }

    /***
     * {@inheritDoc}
     */
    @Override
    public void run()
    {
        //input
        int lArray1[] = new int[]{3, 2, 4}, lArray2[] = new int[]{1, 2, 3, 4, 5, 6, 7, 100};
        int lTarget1 = 6, lTarget2 = 103;

        //output
        printDescription(mDescription);
        findTwoSum(lArray1, lTarget1);
        findTwoSum(lArray2, lTarget2);

    }

    /***
     * This function will solve the two sum problem and output the solution.
     *
     * @param nums
     * @param target
     */
    private void findTwoSum(int[] nums, int target)
    {

        int lSolution[] = twoSum(nums, target);

        //output formatting
        System.out.print(INDENT_2 + "Array::[");
        Arrays.stream(nums).forEach(aElement -> System.out.print(aElement + ","));
        System.out.print("], Target:: " + target + " Solution:: [");
        Arrays.stream(lSolution).forEach(aElement -> System.out.print(aElement + ","));
        System.out.println("]");
    }

    /***
     * This function finds the solution the two sum problem.
     * @param nums
     * @param target
     * @return
     */
    public int[] twoSum(int[] nums, int target)
    {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++)
        {
            int complement = target - nums[i];
            if (map.containsKey(complement))
            {
                return new int[]{map.get(complement), i};
            }
            map.put(nums[i], i);
        }
        return new int[]{-1, -1};
    }
}
