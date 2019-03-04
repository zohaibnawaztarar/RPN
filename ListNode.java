/**
 * This class contains 'getters' & 'setters' for the data contained in the List & Stack Class 
 * 
 * @author Zohaib
 * @version 1.0
 */
public class ListNode    
{
    // instance variables
    public int data;
    private ListNode next; // fields to store a reference to the next node in the list after this one
    /**
     * Constructor for objects of class List
     */
    public ListNode(int data)
    {
        // initialise instance variables
        this.data = data;
        this.next = null; // set next node to null
    }

    /**
     * Get the number contained in next node
     * 
     * @param  none
     * @return the next node
     */
    public ListNode getNext()
    {
        return next;
    }

    /**
     * Set the next node after this one
     * 
     * @param  the node to be added at this node's next
     * @return nothing
     */
    public void setNext(ListNode next)
    {
        this.next = next;
    }

    /**
     * Get the data contained in node
     * 
     * @param  none
     * @return data at this node
     */
    public int getData()
    {
        return data;
    }

    /**
     * Return a string containing the data from this node, formatted
     * 
     * @param  none
     * @return none
     */

    public String printInfo()
    {
        String info; 
        info = "Number =" + data ;
        return info;
    }
}