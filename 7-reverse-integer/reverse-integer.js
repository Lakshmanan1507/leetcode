/**
 * @param {number} x
 * @return {number}
 */
var reverse = function(x) {
    let sign = x < 0 ? -1 : 1;
    x = Math.abs(x);

    let result = 0;

    while (x > 0) {
        let digit = x % 10;
        x = Math.floor(x / 10);

        // Check 32-bit overflow
        if (result > Math.floor((2147483647 - digit) / 10)) {
            return 0;
        }

        result = result * 10 + digit;
    }

    return result * sign;
};