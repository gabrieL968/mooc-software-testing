public class ChocolateBags {
    public int calculate(int small, int big, int total) {
        int maxBigBoxes = total / 5;
        int bigBoxesWeCanUse = Math.min(maxBigBoxes, big);
        total -= (bigBoxesWeCanUse * 5);
        
        if (small < total) {
            return -1;
        }
        return total;
    }
    public static void main(String[] args) {
        
        //retorna -1
        //int small = 2;
        //int big = 1;
        //int total = 9;
        
        //retorna valor positivo
        int small = 4;
        int big = 1;
        int total = 9;
        ChocolateBags cb = new ChocolateBags();
        int result = cb.calculate(small, big, total);
        System.out.println(result);
    }
}
