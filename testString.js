var str1 = "Test";
var str2 = "Te";

/**
 * Function for compares chars into the strings
 * @param {firstStr} First string for compare
 * @param {secondStr} Second string for compare
 * 
 */
function equalsString(firstStr, secondStr) {
    var charArr = firstStr.split(/([a-zA-Z])/);
    var str2len = str2.length;
    var charLen = charArr.length;
    var counter = 0;
    //Removing empty elements
    for(i = 0; i < charLen; i++) {
        if(charArr[i] == '') {
           charArr.splice(i,1);
        }
    }
    //Iterate from string and compare with charr array
    for(i = 0; i < str2len; i++) {
        for(j = 0; j < charLen; j++) {
            if(str2.charAt(i) === charArr[j]){
                counter++;
                console.log("Char [" + str2.charAt(i) + "] in 2 string, pos: " + i);
                console.log("Char [" + str1.charAt(j) + "] in 1 string, pos: " + j);
            }
        }
    }
    console.log('Chars matches: ' + counter);
}

equalsString(str1, str2);