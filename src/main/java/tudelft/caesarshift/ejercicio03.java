//see agregan caracteres dos veces : sb.append(currentChar);
//si el mensaje contiene espacios el codigo devuelve invalid porque solo acepta letras minusculas

package tudelft.caesarshift;

public class CaesarShiftCipher {

    public String caesarShiftCipher(String message, int shift) {
        StringBuilder sb = new StringBuilder();
        shift = shift % 26; 
        for (char currentChar : message.toCharArray()) {
            if (currentChar == ' ') {
                sb.append(' '); // mantiene los espacios sin cambios
            } else if (currentChar < 'a' || currentChar > 'z') {
                return "invalid"; // caracter no valido
            } else {
                char newChar = (char) (currentChar + shift);

                if (newChar > 'z') {
                    newChar -= 26; // ajustar si se pasa de 'z'
                } else if (newChar < 'a') {
                    newChar += 26; // ajustar si se pasa por debajo de 'a'
                }

                sb.append(newChar);
            }
        }
        return sb.toString();
    }
    public static void main(String[] args) {
        CaesarShiftCipher cipher = new CaesarShiftCipher();
        System.out.println(cipher.caesarShiftCipher("abc xyz", 3));   // "def abc"
        System.out.println(cipher.caesarShiftCipher("hello world", 5)); // "mjqqt btwqi"
        System.out.println(cipher.caesarShiftCipher("xyz", -3));      // "uvw"
        System.out.println(cipher.caesarShiftCipher("test123", 4));   // "invalid"
    }
}
