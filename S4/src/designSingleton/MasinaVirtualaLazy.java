package designSingleton;

public class MasinaVirtualaLazy {
    private String adresaIp;
    private int portConexiune;
    private String numeMasinaVirtuala;
    private String username;

    private static MasinaVirtualaLazy instance=null;

    private MasinaVirtualaLazy() {
        this.adresaIp="10.0.0.1";
        this.portConexiune=3389;
        this.numeMasinaVirtuala="lazyVM";
        this.username="admin";
    }
    public String toString() {
        return "User"+ username + " se conecteaza la masina virtuala "
                +numeMasinaVirtuala+" care are ip ul "+ adresaIp+
                "prin port ul "+ portConexiune;
    }
    public static MasinaVirtualaLazy getInstance()
    {
        if(instance==null)
        {
            instance=new MasinaVirtualaLazy();
        }
        return instance;
    }
}
