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
public class SocketServer {
    
    public static void main (String args[]) throws IOException
    {
        ServerSocket server  = new ServerSocket(6100);
        
        while(true)
        {
            String str;
             
            Socket client = server.accept();
            PrintWriter pw = new PrintWriter(client.getOutputStream(), true);
            BufferedReader br = new BufferedReader(new InputStreamReader(client.getInputStream()));
            ObjectOutputStream oo = new ObjectOutputStream(client.getOutputStream());
            while ((str = br.readLine()) != null) {
               MessageImpl message = new MessageImpl(str);
                  oo.writeObject(message);
            }
        }
    }
    
}
