# -*- coding:utf-8 -*-
class Solution:
    def VerifySquenceOfBST(self, sequence):
        # write code here
        if len(sequence)==0:
            return False
        if len(sequence)==1:
            return True
        return self.judge(sequence)
    def judge(self,a):
        if len(a)==0:
            return True
        i = len(a)-1
        while i>=0 and a[i-1]>=a[-1]:
            i-=1
        for j in range(0,i-1):
            if a[j]>a[-1]:
                return False
        return self.judge(a[0:i]) and self.judge(a[i:-2])