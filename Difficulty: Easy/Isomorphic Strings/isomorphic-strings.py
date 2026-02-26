class Solution:
    def areIsomorphic(self, s1, s2):
        # code here 
        if len(s1)!=len(s2):
            return False
        map_st={}
        map_ts={}
        for c1,c2 in zip(s1,s2):
            if c1 in map_st:
                if map_st[c1]!=c2:
                    return False
            else:
                map_st[c1]=c2
            if c2 in map_ts:
                if map_ts[c2]!=c1:
                    return False
            else:
                map_ts[c2]=c1
        return True