#if (${PACKAGE_NAME} && ${PACKAGE_NAME} != "")package ${PACKAGE_NAME};#end

import LeetCode.LeetCodeBase;

public class ${NAME} extends LeetCodeBase
{

    private String mDescription = "Need to insert description";
    
    /***
     * This is the individual main function for this solution.
     *
     * @param args
     */
    public static void main(String args[])
    {
        LeetCodeBase lProblem = new ${NAME}();
        lProblem.run();
    }
    
    /***
     * {@inheritDoc}
     */
    @Override
    public void run()
    {
        //Input
        
        
        //output
        printDescription(mDescription);
    }
    
    
}
