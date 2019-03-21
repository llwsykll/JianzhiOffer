# -*- coding:utf-8 -*-
class Solution:
    def rectCover(self, number):
        # write code here
        if number<3: return number
        res = [0] * (number+1)
        res[0],res[1],res[2] = 0,1,2
        for i in range(3,number+1):
            res[i] = res[i-1]+ res[i-2]
        return res[number]