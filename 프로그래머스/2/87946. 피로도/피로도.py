from itertools import permutations

def solution(k, dungeons):
    result = 0 
    
    for p in permutations(dungeons):
        curP = k
        curC = 0
        
        for minP, usedP in p:
            if (curP >= minP) and (curP >= usedP):
                curC += 1
                curP -= usedP
        
        result = max(result, curC)

    return result
"""
k: 현재 피로도
dungeons: 최소, 소모 피로도
최대 던전수 Return 하는 문제

항상 최소 필요 피로도 >= 소모 피로도
최소 필요 피로도 == 소모 피로도 일수도 있음

문제 접근, 실제 소모 피로도를 sort해서 하면 되지않을까 싶음. 왜? 최소 필요 소모도
"""