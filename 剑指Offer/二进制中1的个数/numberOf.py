# -*- coding:utf-8 -*-
class Solution:
    def NumberOf1(self, n):
        # write code here
        res = 0
        if n < 0:
            n = n & 0xffffffff
        while n!=0 :
            if n&1 != 0:
                res+=1
            n>>=1
        return res