package LeetCode;

import org.reflections.Reflections;

import java.util.Set;

public class Main
{

    /***
     * This is the main function that runs all current solutions.
     * Each solution should also have its own main to run individually.
     *
     * @param args
     */
    public static void main(String args[])
    {
        testAll();
    }

    /***
     * This function runs each of the solved problems in this project
     */
    private static void testAll()
    {
        LeetCodeBase lClass;

        // Retrieves list of classes that represent a solution, this is based on the
        // class extending the LeetCode.LeetCodeBase class.
        Reflections lReflections = new Reflections("");
        Set<Class<? extends LeetCodeBase>> lClasses = lReflections.getSubTypesOf(LeetCodeBase.class);

        System.out.println("Starting to run all solutions");

        for (Class iClass : lClasses)
        {
            try
            {
                lClass = ((LeetCodeBase) iClass.newInstance());
                lClass.run();
            }
            catch (Exception aException)
            {
                System.out.println(iClass.getCanonicalName() + " has failed due to: " + aException.getMessage());
            }
        }

        System.out.println("Finished running all solutions\n");
    }
}
