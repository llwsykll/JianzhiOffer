class Solution:
    def __init__(self):
        self.arr = [];
        self.minL = [];
        self.mini = 2**31-1
    def push(self, node):
        # write code here
        self.arr.append(node)
        if node<=self.mini:
            self.minL.append(node)
            self.mini = node
        else:
            self.minL.append(self.mini)
    def pop(self):
        # write code here
        self.arr.pop()
        self.minL.pop()
        self.mini = self.minL[-1]

a = Solution()
a.push(3)
a.push(4)
a.push(2)
a.push(3)
a.pop()
a.pop()
a.pop()