# -*- coding:utf-8 -*-
class Solution:
    def reOrderArray(self, array):
        # write code here
        left,right = len(array)-2,len(array)-1
        while left>=0:
            if array[left] %2 == 0 and array[right] %2 != 0 and right-left == 1:
                array[left],array[right] = array[right],array[left]
                left -= 1
                right -= 1
            elif array[left] %2 == 0 and array[right] %2 != 0 and right-left != 1:
                i = left
                temp = array[i]
                while i < right:
                    array[i] = array[i+1]
                    i+=1
                array[right] = temp
                left -= 1
                right -= 1
            elif array[left]%2 != 0 and array[right]%2!=0:
                left-=1
            else:
                left -= 1
                right -= 1
        return array
