
import java.io.*;
import java.net.*;
public class myclient {
    public static void main(String[] args) throws IOException {
        DatagramSocket client= new DatagramSocket();
        InetAddress add=InetAddress.getByName("localhost");
        String str ="** Client Call To Server **";
        byte[] bufBytes = str.getBytes();
        DatagramPacket datagramPacket=new DatagramPacket(bufBytes,bufBytes.length,add,9000);
        client.send(datagramPacket);
        client.close();
    }
}
