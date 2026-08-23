class Solution:
    def isPalindrome(self, s: str, l: int, r: int) -> bool:
        while l <= r:
            if s[l].lower() != s[r].lower():
                return False
            l += 1
            r -= 1
        return True

    def validPalindrome(self, s: str) -> bool:
        l = 0
        r = len(s) - 1
        while l <= r:
            if s[l].lower() == s[r].lower():    
                l += 1
                r -= 1
            else:
                return self.isPalindrome(s, (l+1), r) or self.isPalindrome(s, l, (r-1))
        return True