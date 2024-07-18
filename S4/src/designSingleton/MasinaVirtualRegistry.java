package designSingleton;

import java.util.HashMap;

public class MasinaVirtualRegistry {
    private String adresaIp;
    private int portConexiune;
    private String numeMasinaVirtuala;
    private String username;

    private static HashMap<String, MasinaVirtualRegistry> masinaVirtualRegistry=new HashMap<String, MasinaVirtualRegistry>();

    private MasinaVirtualRegistry(String adresaIp, int portConexiune, String numeMasinaVirtuala, String username) {
        this.adresaIp = adresaIp;
        this.portConexiune = portConexiune;
        this.numeMasinaVirtuala = numeMasinaVirtuala;
        this.username = username;
    }

    public String toString() {
        return "User"+ username + " se conecteaza la masina virtuala "
                +numeMasinaVirtuala+" care are ip ul "+ adresaIp+
                "prin port ul "+ portConexiune;
    }

    public synchronized MasinaVirtualRegistry getInstance(String adresaIp
    ,int portConexiune, String numeMasinaVirtuala, String username)
    {
        MasinaVirtualRegistry conexiuneMasinaVirtuala=masinaVirtualRegistry.get(adresaIp);

        if(conexiuneMasinaVirtuala==null)
        {
            conexiuneMasinaVirtuala=new MasinaVirtualRegistry(adresaIp,portConexiune,numeMasinaVirtuala,username);
            masinaVirtualRegistry.put(adresaIp,conexiuneMasinaVirtuala);
        }
        return conexiuneMasinaVirtuala;
    }
}
