package utfpr.rmi.atividade06;

import java.rmi.RemoteException;

public class Implementacao implements Servicos {
    
    int votosMario=0;
    int votosJoice=0;

    @Override
    public void computarVotos(String arg0, Integer votos) throws RemoteException {

        if(arg0.equals("Mario Andrade")){
            votosMario = votosMario + votos;
        }
        
        else if(arg0.equals("Joice Bonifacio")){
            votosJoice = votosJoice + votos;
        }
    }
}
