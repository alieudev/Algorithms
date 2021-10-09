#!/bin/python3

import math
import os
import random
import re
import sys

#
# Complete the 'timeConversion' function below.
#
# The function is expected to return a STRING.
# The function accepts STRING s as parameter.
#

def timeConversion(s):
    # Write your code here

    am_pm = s[-2:]
    hour = s[:2]
    if int(hour) == 12 and am_pm == 'PM': 
        return s[:-2]
    if int(hour) == 12 and am_pm == 'AM': 
        return('00' + str(s[2:-2]))
    
    if am_pm == 'PM' and int(hour) < 12: 
        return str(int(int(hour) + 12)) + s[2:-2]
    if am_pm == 'AM' and int(hour) < 12: 
        return s[:-2]
    

if __name__ == '__main__':
    fptr = open(os.environ['OUTPUT_PATH'], 'w')

    s = input()

    result = timeConversion(s)

    fptr.write(result + '\n')

    fptr.close()

