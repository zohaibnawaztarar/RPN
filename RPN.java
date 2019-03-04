/**
 * This class performs all the calculations for RPN Calculator and shows the result
 * 
 * @author Zohaib
 * @version 1.0
 */
public class RPN
{
    // instance variables 
    private String userInput;
    Stack stack = new Stack();
    /**
     * Constructor for objects of class RPN
     */
    public RPN()
    {
        // initialise instance of Stack class
        stack = new Stack(); 
    }

    /**
     * Ttakes user input and applies 'Reverse Polish Notation' to the data to calculate the result.
     * 
     * @param  none
     * @return none 
     */
    public void processString()
    {
        System.out.println("Please enter data: ");
        String userString = Genio.getString(); //Prompt user for input

        String [] splitString = userString.split(",");

        int operand;

        System.out.println("Your data = " + userString);

        for(int i=0;i<splitString.length; i++)
        {
            if (splitString[i].equals("+")) // Performs Addition
            {
                int secondOperand = stack.pop();
                int firstOperand = stack.pop();
                stack.push(firstOperand + secondOperand);
            }

            else if (splitString[i].equals("-")) // Performs Subtraction
            {
                int secondOperand = stack.pop();
                int firstOperand = stack.pop();
                stack.push(firstOperand - secondOperand);
            }
            else if (splitString[i].equals("*")) // Performs multiplication
            {
                int secondOperand = stack.pop();
                int firstOperand = stack.pop();
                stack.push(firstOperand * secondOperand);
            }
            else if (splitString[i].equals("/")) // Performs Division
            {
                int secondOperand = stack.pop();
                int firstOperand = stack.pop();
                stack.push(firstOperand / secondOperand);
            }
            else
            {
                try
                {  
                    operand = Integer.parseInt(splitString[i]);

                    stack.push(Integer.parseInt(splitString[i]));
                }
                catch (java.lang.NumberFormatException e) // ensure that data is input as expected and will not crash the program
                {
                    System.out.println("Invalid Input Please enter the integers in correct format!");

                }
            }
        }
        //Shows Result
        System.out.println("Result is:" + stack.pop());
        Tester.pressKey(); // Calls the press key method to allow details to remain on screen

    }
}