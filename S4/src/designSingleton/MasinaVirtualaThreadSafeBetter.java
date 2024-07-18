//package designSingleton;
//
//public class MasinaVirtualaThreadSafeBetter {
//    private String adresaIp;
//    private int portConexiune;
//    private String numeMasinaVirtuala;
//    private String username;
//
//    private static MasinaVirtualaThreadSafeBetter instance=null;
//
//    private MasinaVirtualaThreadSafeBetter() {
//        this.adresaIp="10.0.0.1";
//        this.portConexiune=3389;
//        this.numeMasinaVirtuala="TSBVM";
//        this.username="admin";
//    }
//
//    public String toString() {
//        return "User"+ username + " se conecteaza la masina virtuala "
//                +numeMasinaVirtuala+" care are ip ul "+ adresaIp+
//                "prin port ul "+ portConexiune;
//    }
//    public static synchronized  MasinaVirtualaThreadSafeBetter getInstance()
//    {
//        if(instance==null)
//        {
//            synchronized (MasinaVirtualaThreadSafeBetter.class)
//            {
//                if (instance)
//            }
//        }
//
//    }
//
//}
