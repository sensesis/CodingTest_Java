def solution(k, tangerine):
    d = {}
    answer = 0

    for num in tangerine:
        d[num] = d.get(num, 0) + 1
    
    counts = sorted(d.values(), reverse = True)
    
    num = 0
    for val in counts:
        num += val

        if num < k:
            answer += 1  
        else:
            answer += 1
            break
            
    return answer
"""
귤 수확 k 골라서 판매. 서로 다른 종류 최소화 하는 문제

1. tangerine 딕셔너리로 값 불러옴.
    가장 큰수 기준 정렬하고, 순차로 더해서 구하기
    만약 더하고 값 넘으면 넘기기
"""