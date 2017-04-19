/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Chris
 */
public class Message {
    private String message;
    private int digitCount;
    private int charCount;
    
    public void setCounts()

    {
        for(int i = 0; i < message.length();i++)
        {
            if (Character.isDigit(message.charAt(i)))
                digitCount++;
            else if (Character.isLetter(message.charAt(i)))
                charCount++;
        }
    }
public int getCharacterCount()

{
    return charCount;
}
public int getDigitCount()
{
    return digitCount;
}
public Message(String message)
{
    this.message = message;
    setCounts();
}
}
