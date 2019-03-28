# -*- coding:utf-8 -*-
class Solution:
    def IsPopOrder(self, pushV, popV):
        # write code here
        sta = []
        ind = 0
        for n in pushV:
            sta.append(n)
            while len(sta)>0 and sta[-1] == popV[ind]:
                sta.pop()
                ind+=1
        return len(sta)==0