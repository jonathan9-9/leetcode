#include <unordered_map>
#include <vector>
#include <iostream>

class Solution {
public:
    std::vector<int> twoSum(std::vector<int>& nums, int target) {
        std::unordered_map<int, int> numToIndex;

        for (int i = 0; i < nums.size(); ++i) {
            int complement = target - nums[i];
            if (numToIndex.find(complement) != numToIndex.end()) {
                std::vector<int> result;
                result.push_back(numToIndex[complement]);
                result.push_back(i);
                return result;
            }
            numToIndex[nums[i]] = i;
        }


        return std::vector<int>();
    }
};

int main() {
    Solution solution;

    std::vector<int> nums {2, 7, 11, 15};

    int target = 9;

    std::vector<int> result = solution.twoSum(nums, target);

    for (int num : result) {
        std::cout << num << " ";
    }
    std::cout << std::endl;

    return 0;

}
