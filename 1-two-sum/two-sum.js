/**
 * @param {number[]} nums
 * @param {number} target
 * @return {number[]}
 */
var twoSum = function(nums, target) {
    let len = nums.length;

    for (let a = 0; a < len; a++) {
        for (let b = a + 1; b < len; b++) {
            let total = nums[a] + nums[b];

            if (total === target) {
                return [a, b];
            }
        }
    }

    return [];
};