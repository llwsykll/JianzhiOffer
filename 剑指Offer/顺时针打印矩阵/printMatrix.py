# -*- coding:utf-8 -*-
class Solution:
    # matrix类型为二维列表，需要返回列表
    def printMatrix(self, matrix):
        # write code here
        res = []
        row = len(matrix)
        col = len(matrix[0])
        lay = min(row-1,col-1)//2 + 1
        for i in range(0,lay):
            for k in range(i,col-i):
                res.append(matrix[i][k])
            for j in range(i+1,row-i):
                res.append(matrix[j][col-1-i])
            for k in range(col-i-2,i-1,-1):
                if row-i-1!=i:
                    res.append(matrix[row-i-1][k])
            for j in range(row-i-2,i,-1):
                if col-i-1!= i:
                    res.append(matrix[j][i])
        return res