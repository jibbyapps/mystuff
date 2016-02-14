package client_serv;

import javax.swing.*;
import java.awt.*;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.UnknownHostException;

/**
 * Created by vitaliiromanchenko on 12.02.16.
 */
public class Server implements Runnable
{
    static private Socket connection; //переменная класса Сокет
    static private ObjectOutputStream output;
    static private ObjectInputStream input;
    static private ServerSocket server; // принимает соединение

    @Override
    public void run()
    {
        try
        {
            server = new ServerSocket(4567, 10); //порт и кол макс подключений
            while (true)
            {
                connection = server.accept(); // возвращает сокет
                output = new ObjectOutputStream(connection.getOutputStream());
                input = new ObjectInputStream(connection.getInputStream());
                output.writeObject("вы прислали:"+ (String)input.readObject());
            }//создаем потоки в цыкле где мы слушаем что приходит и уходит
        }
        catch (UnknownHostException e){}
        catch (IOException e){}
        catch (HeadlessException e){}
        catch (ClassNotFoundException e) {}
    }
}
