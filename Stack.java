/**
 * This class which implements a stack.
 * 
 * @author Zohaib
 * @version 1.0
 */
public class Stack
{
    // instance variable
    private List myList;
    /**
     * Constructor for objects of class Stack
     */
    public Stack()
    {
        myList = new List();
    }

    /**
     * Push data onto the stack
     * 
     * @param       data to be pushed onto the stack
     * @return      NONE
     */
    public void push(int num1)
    {
        myList.addToList(num1);
    }

    /**
     * Pop data from the top of the stack
     * 
     * @param       NONE
     * @return      Data node containing the actual data which was popped
     */
    public int pop()
    {
        ListNode num2;
        num2 = myList.deleteFromStart();
        if (num2 != null) 
        {
            return num2.getData();
        }
        else
        {
            System.out.println ("Stack is empty");
        }
        return 0;
    }

    /**
     * Checks to see if the list/stack is empty or not.
     * 
     * @param       NONE
     * @return      true or false
     */
    public boolean isStackEmpty()
    {
        return false;
    }

    /**
     * Prints the list Nodes
     *
     * @param  none
     * @return none
     */
    public void print()
    {
        myList.printList();
    }
}
