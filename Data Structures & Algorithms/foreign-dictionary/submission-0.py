class Solution:
    def foreignDictionary(self, words: List[str]) -> str:
        adj = {}

        for word in words:
            for ch in word:
                if ch not in adj:
                    adj[ch] = set()
        
        for i in range(len(words) - 1):
            w1 = words[i]
            w2 = words[i+1]
            
            length = min(len(w1), len(w2))

            if len(w1) > len(w2) and w1[:length] == w2:
                return ""

            for j in range(length):
                if w1[j] != w2[j]:
                    adj[w1[j]].add(w2[j])
                    break
        
        indegree = {}

        for ch in adj:
            indegree[ch] = 0

        for ch in adj:
            for nb in adj[ch]:
                indegree[nb] += 1
        #queue 
        qu = deque()
        for ch in indegree:
            if indegree[ch] == 0:
                qu.append(ch)

        #topological sorting
        traversal = []

        while qu:
            ch = qu.popleft()
            traversal.append(ch)

            for nb in adj[ch]:
                indegree[nb] -= 1

                if indegree[nb] == 0:
                    qu.append(nb)
        
        #if cycle exist there can be mismatch in length of traversal and adj
        if len(traversal) != len(adj):
            return ""


        return "".join(traversal)