# -*- coding:utf-8 -*-
class Solution:
    def Fibonacci(self,n):
    # write code here
        if n<2:return n
        res = [0 for i in range(0,n+1)]
        res[0],res[1] = 0,1
        for i in range(2,n+1):
            res[i] = res[i-1] + res[i-2]
        return res[-1]