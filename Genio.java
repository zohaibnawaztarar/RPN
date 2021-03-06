import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * General purpose class to enable simple coding of programs requiring data input at 
 * a text based interface.
 * 
 * The class is under development, so where unexpected exceptions occur, please could
 * you report them to me at pgregor@computing.dundee.ac.uk
 * 
 * Peter Gregor
 * Version 1.1, 1st September 2003
 */

    
public class Genio
{


    /**
     * Constructor for objects of class genio, but nothing needing constructed!
     */
    public Genio()
    {
        String temp;
        temp = getString();
        System.out.println(temp);
    }

     
    /** getStr()  is a private method which safely returns a string for use
     *  by the public methods getString and getCharacter in the class.
     */
    
    static private String getStr() 
    {
        String inputLine = "";          // will hold the full input line 
        BufferedReader reader = 
            new BufferedReader(new InputStreamReader(System.in));
        try 
        {
            inputLine = reader.readLine();
        }
        catch(Exception exc) 
        {
            System.out.println ("There was an error during reading: "
                                + exc.getMessage());
        }
        return inputLine;
    }
    
    /** getInteger() returns an integer value. Exception handling is used to trap
     * invalid data - including floating point numbers, non-numeric characters
     * and no data. In the event of an exception, the user is prompted to enter
     * the correct data in the correct format
     */
    static public int getInteger()
    {
        int temp=0;
        boolean OK = false;
        
        BufferedReader keyboard = new BufferedReader(new InputStreamReader(System.in));
        do 
        {
            try
            {
                temp = Integer.parseInt(keyboard.readLine());
                OK = true;
            }

            catch (Exception eRef)
            {
                if (eRef instanceof NumberFormatException) 
                {
                    System.out.print("Integer value needed: ");
                }
                else
                {
                    System.out.println("Please report this error: "+eRef.toString());
                }
            }
          
        } while(OK == false);
        return(temp);
     }
     
    /** getReal() returns a floating point value. Exception handling is used to trap
     * invalid data - including non-numeric characters and no data.
     * In the event of an exception, the user is prompted to enter
     * data in the correct format
     */        
    static public float getReal()
    {
        float temp=0;
        boolean OK = false;

        BufferedReader keyboard = new BufferedReader(new InputStreamReader(System.in));
        do 
        {
            try
            {
                temp = Float.parseFloat(keyboard.readLine());
                OK = true;
            }


            catch (Exception eRef)
            {
                if (eRef instanceof NumberFormatException) 
                {
                    System.out.print("Number needed: ");
                } 
                else
                {
                    System.out.println("Please report this error: "+eRef.toString());
                }
            }
           
        } while(OK == false);
        
        return(temp);
     }
     
    /** getDouble() returns a double precisionfloating point value. 
     * Exception handling is used to trap invalid data - including non-numeric
     * characters and no data.
     * In the event of an exception, the user is prompted to enter
     * data in the correct format
     */        
    static public double getDouble()
    {
        double temp=0;
        boolean OK = false;
        BufferedReader keyboard = new BufferedReader(new InputStreamReader(System.in));
        do 
        {
            try
            {
                temp = Double.parseDouble(keyboard.readLine());
                OK = true;
            }

            catch (Exception eRef)
            {
                if (eRef instanceof NumberFormatException) 
                {
                    System.out.print("Number needed: ");
                }
                else
                {
                    System.out.println("Please report this error: "+eRef.toString());
                }
            }
           
        } while(OK == false);
        
        return(temp);
     }

    /** getCharacter() returns a character from the keyboard. It does this by 
     * reading an string then taking the first character read. sunsequest characters
     * are discarded without raising an exception.
     * The method checks to ensure a character has been entered, and prompts 
     * if it has not.
     */
        
     static public char getCharacter()
     {
         String tempStr="";
         char temp=' ';
         boolean OK = false;
         do 
         {
             try
             {
                 tempStr = getStr();
                 temp = tempStr.charAt(0);
                 OK = true;
             }

             catch (Exception eRef)
             {
                 if (eRef instanceof StringIndexOutOfBoundsException)
                 {
                     System.out.print("Enter a character: ");
                 }            
                 else 
                 {
                     System.out.println("Please report this error: "+eRef.toString());
                 }
             }
           
         } while(OK == false);
        
         return(temp);
     }
     
     /** getString() returns a String entered at the keyboard
      */
     
     static public String getString()
     {
        String temp="";
        try
        {
            temp = getStr();
        }
        catch (Exception eRef)
        {
            System.out.println("Please report this error: "+eRef.toString());
        }
        return(temp);
     }
     
}


