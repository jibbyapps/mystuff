package client_serv;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.InetAddress;
import java.net.Socket;
import java.net.UnknownHostException;

/**
 * Created by vitaliiromanchenko on 12.02.16.
 */

//runnabe интерфейс создает поток
//JFrame создает окно
// класс Socket создает соединение двух комп и передачи данных
// ObjectOutputStream cоздаем потоки через которые будем отправлять данные из наших сокетов
public class Cl_Serv extends JFrame implements Runnable
{
    static private Socket connection; //переменная класса Сокет
    static private ObjectOutputStream output;
    static private ObjectInputStream input;
    public static void main(String[] args)
    {
new Thread(new Cl_Serv("Test")).start(); // запускаем поток
        new Thread(new Server()).start(); // запускаем сервер

    }
public Cl_Serv (String name) //конструктор
{
    super(name);
    setLayout(new FlowLayout());
    setSize(300,300);
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    setVisible(true);
    setLocationRelativeTo(null);

    final JTextField t1 = new JTextField(10);
    final JButton b1 = new JButton("Send");

    b1.addActionListener(new ActionListener()
    {
        @Override
        public void actionPerformed(ActionEvent e)
        {
            if (e.getSource()==b1){
            sendData(t1.getText());
        }
        }
    });

    add(t1);
    add(b1);

}


    @Override
    public void run()
    {
        try
        {
             while (true)
            {
                connection = new Socket(InetAddress.getByName("127.0.0.1"), 4567); // в конструктор передается 2 значения, ип адресс и порт
                output = new ObjectOutputStream(connection.getOutputStream());
                input = new ObjectInputStream(connection.getInputStream());
                JOptionPane.showMessageDialog(null, (String) input.readObject());
            }//создаем потоки в цыкле где мы слушаем что приходит и уходит
        }
        catch (UnknownHostException e){}
        catch (IOException e){}
        catch (HeadlessException e){}
        catch (ClassNotFoundException e) {}
    }
    private static void sendData(Object obj)// метод через который мы отправляем данные через наш сокет
    { //object obj класс типа обьект
    try {
        output.flush(); // выкинуть из потока все что в нем было, чтоб не смешивались пакеты
        output.writeObject(obj);
    }
    catch (IOException e){}
    }


}
