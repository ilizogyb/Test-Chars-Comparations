class TestStringJava {
    public String str2 = "Test";
    public String str1 = "Te";
    public int counter;
    
    /**
     * Method for compares chars into the strings
     * @param str1 First string for compare
     * @param str2 Second string for compare
     * 
     */
    public void compareStrings(String str1, String str2) {
        char [] charsPattern = this.str1.trim().toCharArray();
        char [] searchStr = this.str2.trim().toCharArray();
        
        System.out.println("-------------------------------------- " );
        
        for(int i = 0; i < searchStr.length; i++) {
            for(int j = 0; j < charsPattern.length; j++ ) {
                if(searchStr[i] == charsPattern[j]) {
                    counter++;
                    System.out.println("Char [" + searchStr[i] + "] in 1 string, at position: " + i);
                    System.out.println("Char [" + charsPattern[j] + "] in 2 string, at position: " + j);
                }
            }
        }
        
        System.out.println("-------------------------------------- " );
        System.out.println("Matches count: " + counter);


    }
    public static void main(String[] args){
        TestStringJava test = new TestStringJava();
        test.compareStrings( test.str1,  test.str2);
    }
}
