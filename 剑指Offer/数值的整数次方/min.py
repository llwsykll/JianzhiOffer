# -*- coding:utf-8 -*-
class Solution:
    def Power(self, base, exponent):
        # write code here
        curr = exponent if exponent >=0 else abs(exponent)
        res = 1.0
        while curr>0:
            res *= base
            curr -= 1
        return res if exponent >=0 else 1/res