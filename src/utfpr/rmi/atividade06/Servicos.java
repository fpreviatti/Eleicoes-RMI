package utfpr.rmi.atividade06;
import java.rmi.Remote;
import java.rmi.RemoteException;


public interface Servicos extends Remote {
    
    void computarVotos(String nome, Integer votos) throws RemoteException;
    
}