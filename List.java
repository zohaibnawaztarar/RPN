/**
 * This class contains the methods that are used to add, delete and print integers.
 * 
 * @author Zohaib
 * @version 1.0
 */
public class List 
{
    private ListNode head; //Creates new node at head
    /**
     * Constructor for objects of class List
     * Create a head
     */
    public List()
    {
        head = null; // Sets the head equals null
    }

    /**
     * Add a new node at the start of a list
     * 
     * @param  data to add
     * @return nothing    
     */
    public void createList(int Number)
    {
        ListNode  marker;
        ListNode  newOne;

        newOne = new ListNode(Number);        
        newOne.setNext(head);

        head = newOne;
    }

    /**
     * Add a new node at the start of a list
     * 
     * @param  data to add
     * @return nothing    
     */

    public void addToList(int number)
    {
        ListNode  marker;
        ListNode  newOne;
        // add int to be pushed at top of stack
        newOne = new ListNode(number);        
        newOne.setNext(head);

        head = newOne;
    }

    /**
     * Print the list, starting at head
     * 
     * @param  none
     * @return nothing    
     */

    public void printList()
    {
        ListNode marker;

        System.out.println("The list contains:");    
        for (marker = head; marker != null; marker=marker.getNext())
        {
            System.out.println(marker.printInfo()+",");  
        }
    }

    /**
     * This method deletes the number from top.
     *
     * @param  none
     * @return The return value
     */
    public ListNode deleteFromStart()
    {
        ListNode nodeToDelete=null;

        if (head==null)
        {
            System.out.println("List is empty");    
        }
        else
        {
            nodeToDelete = head;
            head = head.getNext();
        }
        return nodeToDelete;
    }
}
