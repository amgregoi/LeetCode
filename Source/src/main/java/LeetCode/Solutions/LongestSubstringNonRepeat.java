package LeetCode.Solutions;

import LeetCode.LeetCodeBase;

import java.util.HashMap;
import java.util.Map;

public class LongestSubstringNonRepeat extends LeetCodeBase
{

    static String mDescription = "Longest substring with no repeating characters from a string";

    /***
     * This is the individual main function for this solution.
     *
     * @param args
     */
    public static void main(String args[])
    {
        LeetCodeBase lProblem = new LongestSubstringNonRepeat();
        lProblem.run();
    }

    /***
     * {@inheritDoc}
     */
    @Override
    public void run()
    {
        // Test Strings
        String lInput = "abcabcbbabcdefghij"; //Answer: 10
        String lInput2 = "abcabcbb"; //Answer: 3
        String lInput3 = "abcabcdefghijklmnopbcbb"; //Answer: 16

        // Output
        printDescription(mDescription);
        System.out.println(INDENT_2 + lInput + ", Solution:: " + findLongestSubStringLength(lInput));
        System.out.println(INDENT_2 + lInput2 + ", Solution:: " + findLongestSubStringLength(lInput2));
        System.out.println(INDENT_2 + lInput3 + ", Solution:: " + findLongestSubStringLength(lInput3));
    }

    /***
     * This function finds the longest substring from the specified string with no repeating characters.
     *
     * @param aString
     * @return
     */
    private int findLongestSubStringLength(String aString)
    {
        int lResult = 0;
        Map<Character, Integer> lMap = new HashMap<>();

        for (int iCurIndex = 0, iPrevIndex = 0; iCurIndex < aString.length(); iCurIndex++)
        {
            if (lMap.containsKey(aString.charAt(iCurIndex)))
            {
                iPrevIndex = Math.max(lMap.get(aString.charAt(iCurIndex)), iPrevIndex);
            }

            lResult = Math.max(lResult, iCurIndex - iPrevIndex);
            lMap.put(aString.charAt(iCurIndex), iCurIndex);
        }

        return lResult;
    }
}
