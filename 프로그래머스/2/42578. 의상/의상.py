def solution(clothes):
    d = {}
    answer = 1

    for name in clothes:
        d[name[1]] = d.get(name[1], 0) + 1
    
    for i in d.values():
        answer *= i + 1        
    
    answer -= 1
        
    return answer
        

"""
조합하는 코테문제

이건 딕셔너리를 해야될거같음. 왜? headgear, eyewear처럼이니깐
그리고 각 기본 모든 숫자 +로 하고, 많은 조합을 하면 될거가틍ㄴ데, 그 많은 조합에 대한 알고리즘을 짜면될거같음

의상 2 썬글라스 1
의상 3 썬글라스 1
의상3 썬글라스 2 
"""