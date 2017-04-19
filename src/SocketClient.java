/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Chris
 */
import java.io.*;
import java.net.*;
import java.util.*;
public class SocketClient {
     public static void main (String args[]) throws IOException
     {
         Socket sock = new Socket("127.0.0.1",6100);
         System.out.println("Enter the string you want to send");
         Scanner scan = new Scanner(System.in);
         String mess = scan.next();
         OutputStreamWriter osw = new OutputStreamWriter(sock.getOutputStream());
         osw.write(mess);      
     }
    
}
