
import java.io.BufferedReader;
import java.io.PrintWriter;
import java.net.Socket;

public class ThreadChatConnessione {
    private ThreadGestioneservizioChat gestoreChat;
    private Socket client = null;
    private BufferedReader input = null;
    private PrintWriter output = null;
    Thread me;
    
    public ThreadChatConnessione(ThreadGestioneservizioChat gestoreChat, Socket client){
        this.gestoreChat = gestoreChat;
        this.client = client;
        try{
            this.input = new BufferedReader(new InputStreamReader(client.getInputStream()));
            this.output = new PrintWriter(thi.client.getOutputStream(), true);
        }catch (Exception e){
            output.println("Errore nella lettura");
        }
        me = new Thread(this);
        me.start();
    }
    
}
