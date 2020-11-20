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


public class Server1 
{
    ServerSocket myServerSocket;
    Socket s;
    DataInputStream dis;
    PrintStream ps;
     public static void main (String[] args)   
     {
          new Server1();
     }
     
     public Server1()
     {
         try
         {
             myServerSocket = new ServerSocket(5020);
             s=myServerSocket.accept();
             dis= new DataInputStream(s.getInputStream ());
             ps=new PrintStream(s.getOutputStream());
             String msg = dis.readLine();
            System.out.println (msg);
            ps.println("data recieved");
         }
         catch  (Exception ex)
                 {
                     ex.printStackTrace ();
                     
                 }      
     }
}





