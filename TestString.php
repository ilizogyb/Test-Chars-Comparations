<?php
$str1 = "Test";
$str2 = "Te";

/**
 * Function for compares chars into the strings
 * @param string $str1 First string for compare
 * @param string $str2 Second string for compare
 * 
 */
function compareSting($str1, $str2) {
    $counter = 0; 
    for($i = 0; $i < strlen($str1); $i++) {
        for($j = 0; $j < strlen($str2); $j++) {
           if($str1[$i] == $str2[$j]) {
               echo "Char [" . $str1[$i] . "] in 1 string at position: " . $i . "\r\n"; 
               echo "Char [" . $str2[$j] . "] in 2 string at position: " . $j . "\r\n";
               $counter++;
           }
        }
    }
    echo "Matches count: " . $counter;
}

compareSting($str1, $str2);
?>
