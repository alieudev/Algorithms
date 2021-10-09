#!/bin/python3

import math
import os
import random
import re
import sys

#
# Complete the 'miniMaxSum' function below.
#
# The function accepts INTEGER_ARRAY arr as parameter.
#

def miniMaxSum(arr):
    # Write your code here
    lowest = sum(arr)
    highest = 0 
    
    for i in range(len(arr)): 
        newLowHigh = sum(arr) - arr[i]
        if newLowHigh < lowest: 
            lowest = newLowHigh
        if newLowHigh > highest: 
            highest = newLowHigh
            
    print(lowest, highest)

if __name__ == '__main__':

    arr = list(map(int, input().rstrip().split()))

    miniMaxSum(arr)

