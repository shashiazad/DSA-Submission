class Solution:
    def checkInclusion(self, s1: str, s2: str) -> bool:
        if len(s1) > len(s2):
            return False

        freq1 = [0] * 26
        freq2 = [0] * 26

        win = len(s1)

        for ch in s1:
            freq1[ord(ch) - ord('a')] += 1

        for i in range(win):
            freq2[ord(s2[i]) - ord('a')] += 1

        if(freq1 == freq2):
            return True

        for r in range(win, len(s2)):
            l = r - win
            freq2[ord(s2[l]) - ord('a')] -= 1
            freq2[ord(s2[r]) - ord('a')] += 1

            print(freq1)
            print(freq2)

            if freq1 == freq2:
                return True
        return False