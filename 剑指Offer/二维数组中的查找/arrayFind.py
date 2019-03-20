# -*- coding:utf-8 -*-
class Solution:
    # array 二维列表
    def Find(self, target, array):
        # write code here
        rowSum = len(array)
        colSum = len(array[0])
        i,j = rowSum-1,0
        while j<colSum and i >=0:
            if target == array[i][j]:
                return True
            if target < array[i][j]:
                i -= 1
            if target > array[i][j]:
                j += 1
        return False