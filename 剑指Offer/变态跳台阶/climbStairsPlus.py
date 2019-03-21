# -*- coding:utf-8 -*-
class Solution:
    def jumpFloorII(self, number):
        # write code here
        if number <2:return number
        res = [0]*(number+1)
        res[0],res[1]=1,1
        for i in range(2,number+1):
            res[i] = sum(res[:i])
        return res[number]