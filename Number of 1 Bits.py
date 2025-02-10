class Solution(object):
    def hammingWeight(self, n):
        """
        :type n: int
        :rtype: int
        """
        exp = 0
        while n <= 2**exp:
            if n == 2**exp:
                print(exp)
            
n = int(input("Digite um Número:"))
a = Solution()
a.hammingWeight(n)