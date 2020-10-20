
import java.util.List;
import javax.swing.JOptionPane;

public class ThreadGetioneservizioChat {
    private int nrMaxConnessioni;
    private List lista;
    private ThreadChatConnessione[] listaConnessioni;
    Thread me;
    private ServerSocket serverChat;
    
    public void run(){
        boolean continua = true;
        
        try{
            serverChat = new ServerSocket(6789);
        }catch (Exception e){
            JOptionPane.showMessageDialog(null, "impossibile instanziare il server");
            continua = false;
        }
        
        if(continua){
            try{
                for(int xx = 0; xx < nrMaxConnessioni; xx++){
                    Socket tempo = null;
                    tempo = serverChat.accept();
                    listaConnessioni[xx] = new ThreadChatConnessione(this.tempo);
                }
                sererChat.close();
            }catch(Exception e){
                JOptionPane.showMessageDialog(null, "Impossibile instaurare server chat");
            }
        }
    }
    public void pedisciMessaggio(strig mex){
        lista.add(mex);
        lista.select(lista.getItemCount() - 1);
        for(int xx = 0; xx < rhis.nrMaxConnessioni; xx++){
            if(listaConnessioni[xx] != null){
                listaConnessioni[xx].spedisciMessaggioChat(mex);
            }
        }
    }
    
    public ThreadGetioneservizioChat(int numeroMaxConnessioni, List lista){
        this.nrMaxConnessioni = nrMaxConnessioni - 1;
        this.lista = lista;
        this.listaConnessioni = new ThreadChatConnessione[this.nrMaxConnessioni];
        me = new Thread(this);
        me.start();
        private ServerSoocket serverChat;
    }
    

    
    
}
