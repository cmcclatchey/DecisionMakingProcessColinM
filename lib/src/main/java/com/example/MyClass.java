package com.example;

public class MyClass
{
    public static void main(String[] args)
    {
        System.out.println("\nWhere do I want to eat today? Press 1 for Taco Bell, 2 for Wendy's, " +
                "or 3 for Little Caesars.\n");

        int ffDecision = 3; // Fast food decision

        // Decisions for what food I want to get at chosen place
        int tbDecision = 1;
        int wendysDecision = 1;
        int littleCaesarsDecision = 1;

        if (ffDecision == 1) // Taco Bell decision
        {
            System.out.println("I have chosen Taco Bell.\n\n");
            System.out.println("Do I want a loaded potato griller or mini chicken quesadilla from" +
                    " Taco Bell? 1 for griller or 2 for quesadilla.\n");

            if (tbDecision == 1)
            {
                System.out.println("It looks like I'm having a loaded potato griller from Taco " +
                        "Bell today.");
            }
            else
            {
                System.out.println("It looks like I'm having a mini chicken quesadilla from Taco " +
                        "Bell today.");
            }
        }

        else if (ffDecision == 2) // Wendy's decision
        {
            System.out.println("I have chosen Wendy's.\n\n");
            System.out.println("Do I want a baconator or spicy chicken sandwich from" +
                    " Wendy's? 1 for baconator or 2 for chicken sandwich.\n");

            if (wendysDecision == 1)
            {
                System.out.println("It looks like I'm having a baconator from Wendy's today.");
            }
            else
            {
                System.out.println("It looks like I'm having a spicy chicken sandwich from Wendy's " +
                        "today.");
            }
        }

        else if (ffDecision == 3) // Little Caesars decision
        {
            System.out.println("I have chosen Little Caesars.\n\n");
            System.out.println("Do I want pepperoni on my pizza or just cheese from Little Caesars? " +
                    "1 for pepperoni or 2 for just cheese.\n");

            if (littleCaesarsDecision == 1)
            {
                System.out.println("It looks like I'm getting a pepperoni pizza from Little Caesars" +
                        " today.");
            }
            else
            {
                System.out.println("It looks like I'm getting a cheese pizza from Little Caesars" +
                        " today.");
            }
        }
    }
}
