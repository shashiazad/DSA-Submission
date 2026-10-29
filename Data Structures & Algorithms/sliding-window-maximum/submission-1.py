class Solution:
    def maxSlidingWindow(self, nums: List[int], k: int) -> List[int]:
        n = len(nums)
        dq = deque()
        res = [0] * (n - k + 1) 
        for i in range(n):
            # remove one element from left of the window as window move forward by one
            if dq and dq[0] <= i - k:
                dq.popleft()
            # remove all the element from end that can not be max than upcoming element
            while dq and nums[dq[-1]] <= nums[i]:
                dq.pop()
            #add the upcoming element
            dq.append(i)
            #if we reach the window size, add the max element in result
            if i >= k - 1:
                res[i - k + 1] = nums[dq[0]]

        return res