class Solution:
    def mySqrt(self, x: int) -> int:
        if x < 2:
            return x
        l, r = 1, x // 2
        ans = 1
        while l <= r:
            mid = l + (r - l) // 2
            if mid * mid <= x:
                ans = mid
                l = mid + 1
            else:
                r = mid - 1
        return ans
