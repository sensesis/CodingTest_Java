from collections import deque

def LRU(name, cache, cacheSize):
    
    if name in cache:
        #print(f"cache: {cache}")
        cache.remove(name)
        cache.append(name)
        return cache, 1
    
    elif cacheSize == 0:
        return cache, 5
    
    else:
        if (len(cache) >= cacheSize):
            cache.popleft()
            
    cache.append(name)
    #print(f"cache: {cache}")
    
    return cache, 5
        
        
            
    
def solution(cacheSize, cities):
    answer = 0
    cache = deque()
    cities = [c.lower() for c in cities]

    for name in cities:
        cache, t = LRU(name, cache, cacheSize)
        answer += t
        #print(f"name: {name}, answer: {answer}")
        
    return answer

"""
제약조건
시간복잡도: O(n log n)까지 가능

필요 변수
1. answer: 실행시간
2. cache: 캐시(set)

1. LRU 알고리즘 설계
    1. set
        len이 3개 이상이면 첫 번째 삭제
        
"""