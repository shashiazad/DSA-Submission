class Solution:
    def maxSlidingWindow(self, nums: List[int], k: int) -> List[int]:
        n = len(nums)
        dq = deque()
        res = [0] * (n - k + 1) 
        for i in range(n):
            if dq and dq[0] <= i - k:
                dq.popleft()

            while dq and nums[dq[-1]] <= nums[i]:
                dq.pop()

            dq.append(i)

            if i >= k - 1:
                res[i - k + 1] = nums[dq[0]]
        return res