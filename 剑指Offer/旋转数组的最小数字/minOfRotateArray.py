# -*- coding:utf-8 -*-
class Solution:
    def minNumberInRotateArray(self, rotateArray):
        # write code here
        left,right = 0,len(rotateArray)-1
        mid = -1
        while rotateArray[left]>=rotateArray[right]:
            if right - left == 1:
                return rotateArray[right]
            mid = left + (right-left)//2
            if rotateArray[mid] >= rotateArray[left]:
                left = mid
            if rotateArray[mid] <= rotateArray[right]:
                right = mid
        return rotateArray[mid]


# -*- coding:utf-8 -*-
class Solution:
    def minNumberInRotateArray(self, rotateArray):
        # write code here
        rotateArray.sort()
        return rotateArray[0]