/**
 * @param {number} x
 * @return {boolean}
 */
var isPalindrome = function(x) {
    if (x < 0) {
        return false;
    }

    let str = String(x);
    let rev = str.split("").reverse().join("");

    return rev === str;
};