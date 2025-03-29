package tudelft.ghappy;
public class GHappy {
    public boolean gHappy(String str) {
        assert str != null;
      //i >= 0 siempre es verdadero, y cuando i == 0 se intenta acceder a str.charAt(-1), lo que causa un error de índice fuera de rango  
      //Se cambió i >= 0 por i > 0 para evitar acceder a str.charAt(-1).
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == 'g') {
                if (i > 0 && str.charAt(i - 1) == 'g') { continue; }
                if (i + 1 < str.length() && str.charAt(i + 1) == 'g') { continue; }
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        GHappy gHappy = new GHappy(); 
        //pruebas
        System.out.println(gHappy.gHappy("xxggxx")); // true
        System.out.println(gHappy.gHappy("xxgxx"));  // false
        System.out.println(gHappy.gHappy("xxggyygxx")); // false
    }
}
