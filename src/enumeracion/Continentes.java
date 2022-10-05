/*
 * Enum que contiene los continentes
 */
package enumeracion;

/**
 *
 * @author Ana
 */
public enum Continentes {
    AFRICA(53,1000),
    AMERICA(34,4000),
    ASIA(44,3000),
    EUROPA(46,2000),
    OCEANIA (14,30000);
    
    private final int numPaises;
    private final int superficie;

    private Continentes(int numPaises, int superficie) {
        this.numPaises = numPaises;
        this.superficie = superficie;
    }

    public static Continentes getAFRICA() {
        return AFRICA;
    }

    public static Continentes getAMERICA() {
        return AMERICA;
    }

    public static Continentes getASIA() {
        return ASIA;
    }

    public static Continentes getEUROPA() {
        return EUROPA;
    }

    public static Continentes getOCEANIA() {
        return OCEANIA;
    }

    public int getNumPaises() {
        return numPaises;
    }
    
   
}

  
    
    

 
