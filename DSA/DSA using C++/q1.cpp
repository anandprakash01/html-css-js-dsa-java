/*Given an array of integers nums and an integer target,
return indices of the two numbers such that they add up to target.
        You may assume that each input would have exactly one solution,
        and you may not use the same element twice.*/

#include <iostream>
#include <vector>
using namespace std;

vector<int> twosum(vector<int> nums, int target)
{
    vector<int> result;
    for (int i = 0; i < nums.size() - 1; i++)
    {
        for (int j = i + 1; j < nums.size(); j++)
        {
            if (nums[i] + nums[j] == target){
                result.push_back(i);
            }
            result.push_back(j);
            break;
        }
    }
}

int main()
{
    int n;
    cin >> n;
    int nums[n];
    for (int i = 0; i < n; i++)
    {
        cin >> nums[i];
    }

    int target;
    cin >> target;
    vector<int> result = twosum(nums, target);

    return 0;
}
