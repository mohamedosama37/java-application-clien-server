/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ClientServer;

import java.io.DataInputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.io.PrintStream;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Client {
    
Socket  mySocket;
DataInputStream dis;
PrintStream ps;
public static void main (String [] args)
{
    new Client ();

  }
public Client()
{
        try
        {
            mySocket =new Socket ("192.168.1.75",5020);
            dis= new DataInputStream(mySocket.getInputStream());
            ps = new PrintStream(mySocket.getOutputStream ());
            ps.println( " FIRST MSG");
            String replyMsg = dis.readLine();
System.out.println(replyMsg);
        }
        catch(IOException ex)
{
ex.printStackTrace();
}
//try
//{
//ps.close();
//dis.close();
//mySocket.close();
//}
//catch(Exception ex)
//{
//ex.printStackTrace();
//}

        
}       
        
}

