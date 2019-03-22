# -*- coding:utf-8 -*-
# class ListNode:
#     def __init__(self, x):
#         self.val = x
#         self.next = None
 
class Solution:
    def FindKthToTail(self, head, k):
        # write code here
        left,right,i = head,head,0
        while i<k and right:
            right = right.next
            i+=1
        if i<k:
            return None
        while right:
            left = left.next
            right = right.next
        return left