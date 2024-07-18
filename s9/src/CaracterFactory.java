import java.util.HashMap;
import java.util.Map;

public class CaracterFactory {
    private Map<String, Caracter> caractere=new HashMap<String, Caracter>();
    public Caracter getCaracter(String ValoareCaracter)
    {
        Caracter caracter=caractere.get(ValoareCaracter);
        if(caracter==null)
        {
            caracter=new Caracter(ValoareCaracter);
            caractere.put(ValoareCaracter,caracter);
        }
        return caracter;
    }
    public int getNrCaractere(){

    }
}
