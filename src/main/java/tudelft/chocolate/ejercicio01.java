@ParameterizedTest(name = "small={0}, big={1}, total={2}, result={3}")
@CsvSource({
    "4,1,9,0", "3,2,13,0", "2,2,12,2", "5,1,6,1", "2,1,7,-1", "0,1,5,0"
})
public void bigAndSmallBars(int small, int big, int total, int expectedResult) {
    int result = new ChocolateBags().calculate(small, big, total);
    Assertions.assertEquals(expectedResult, result);
}

@ParameterizedTest(name = "small={0}, big={1}, total={2}, result={3}")
@CsvSource({ "4,0,4,0", "3,0,3,0", "2,0,2,0", "1,0,1,0", "0,0,1,-1" })
public void onlySmallBars(int small, int big, int total, int expectedResult) {
    int result = new ChocolateBags().calculate(small, big, total);
    Assertions.assertEquals(expectedResult, result);
}
