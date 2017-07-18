package LeetCode;

import java.util.stream.Stream;

public abstract class LeetCodeBase {

    protected String INDENT_1 = "~~~ ";
    protected String INDENT_2 = "~~~~~~ ";

    public abstract void run();

    protected void printDescription(String aDescription)
    {
        int lPoundCount = aDescription.length() + 8;

        //Top row formatting
        System.out.print(INDENT_1);
        Stream.generate(() -> "#").limit(lPoundCount).forEach(System.out::print);

        //Middle row formatting
        System.out.print("\n" + INDENT_1);
        System.out.print("### " + aDescription + " ###");
        System.out.print("\n" + INDENT_1);

        //Final row formatting
        Stream.generate(() -> "#").limit(lPoundCount).forEach(System.out::print);
        System.out.println();
    }
}
