# -*- coding:utf-8 -*-
# class TreeNode:
#     def __init__(self, x):
#         self.val = x
#         self.left = None
#         self.right = None
class Solution:
    # 返回从上到下每个节点值列表，例：[1,2,3]
    def PrintFromTopToBottom(self, root):
        # write code here
        res = []
        if not root:
            return res
        sta = [root]
        while len(sta)>0:
            node = sta.pop(0)
            if node.left:
                sta.append(node.left)
            if node.right:
                sta.append(node.right)
            res.append(node.val)
        return res