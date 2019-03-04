/**
 * This Class contains entry point of program and shows the menu and instructions for user.
 * 
 * @author Zohaib
 * @version 1.0
 */
public class Tester
{
    private Stack testStack;
    private RPN rpn;

    /**
     * Main method which is Entry point for the program.
     * Calls the menu to be displayed
     *
     * @param String[] Args
     * return none
     */
    public static void main(String args[])
    {
        Tester test = new Tester();
        test.init();
        test.process();
    }

    private void init()
    {
        testStack = new Stack(); // initialise instance of Stack class
        rpn = new RPN(); // initialise instance of RPN class
    }

    /**
     * Process the user choice for menu.
     *
     */
    private void process()
    {
        char choice; // To hold value of choice entered by user

        do
        {
            choice=menu();
            processchoice(choice);
        } while (choice != 'q' && choice != 'Q');
    }

    /**
     * Display a menu, validate the user's input and return the choice they made
     * 
     * @param   none
     * @return  char x, the validated choice made by the user
     */
    private char menu()
    {
        char choice=' ';
        boolean valid=false;

        while (!valid)
        {
            System.out.println('\u000C'); // Clears screen
            System.out.println("Please make a choice, and press ENTER");
            System.out.println("C - Run Calculator");
            System.out.println("I - Instructions - How It Works");
            System.out.println("Q - Quit");        

            // Asks for user input
            choice=Genio.getCharacter(); 

            switch (choice)
            {
                case 'C':
                case 'c':
                case 'I':
                case 'i':
                case 'Q':
                case 'q': 
                valid=true;
                break;
                default: System.out.println("That is not a valid choice, please try again"); // Incase user enters wrong value
                pressKey();
                break;         
            }
        }

        return choice;
    }

    /**
     * Process the choice made by the user
     * 
     * @param   choice
     * @return  none
     */
    private void processchoice(char choice)
    {
        switch (choice)
        {
            case 'C':
            case 'c':  rpn.processString(); // Calls for processString method from RPN class
            break;

            case 'I':
            case 'i':  getInstructions(); // Calls for instruction method
            break;            

            case 'Q':
            case 'q': System.out.println("\nGoodbye!\n\nYou may now close the program!");
            default:    
            break;
        }
    }

    /**
     * Instructions that are displayed to the user about how RPN calculator works.
     * 
     * @param  none
     * @return none 
     */
    public void getInstructions()
    {
        System.out.println("\t\tREVERSE POLISH NOTATION CALCULATOR");
        System.out.println("\t\t\tINSTRUCTIONS\n-----------------------------------------------------------------");
        System.out.println("\nIn reverse Polish notation the operators follow their operands; for instance, to add 6 and 2," +
            "\none would write 6 2 + rather than 6 + 2, multiply 6 * 2 would be 6 2 *, Divide 6 / 2 would be 6 2 / and so on");
        System.out.println("\n\nPlease enter an input that contains ONLY numbers (1-9) and ONLY the operators (+, -, *, /)");
        System.out.println("\n\nIMPORTANT!! - Please separate numbers & the operators with a comma (,)");
        System.out.println("\nE.G. 2,4,-,8,9,+,7,*\n");
        System.out.println("----------------------------------------------------------------------------------------------");   
        pressKey(); // Calls the press key method to allow details to remain on screen
    }

    /**
     * Creates a 'pause' effect to allow details to remain on screen
     * 
     * @param  none
     * @return none 
     */
    public static void pressKey()
    {
        String s;
        System.out.println("\t\nPress return to continue: ");
        s = Genio.getString();
    }

    /**
     * When user choose add, take number and add to list
     * 
     * @param   none
     * @return  none
     */
    private void add()
    {
        boolean valid;
        int number;

        System.out.println("Please enter an integer");
        number = Genio.getInteger();

        valid=false;

        testStack.push(number);
    }

    private void delete()
    {
        testStack.pop();
        System.out.println("Number Deleted");
    }

}