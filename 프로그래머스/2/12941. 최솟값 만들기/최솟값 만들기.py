def solution(A,B):
    answer = 0
    A = sorted(A)
    B = sorted(B, reverse = True)
    
    for a,b in zip(A, B):
        answer += a*b
    
    return answer

    
    
"""
A, B 각각 리스트별로 곱하고 더하는 문제

1. for 문으로 a,b 값 리스트로 뽑음
2. answer += (a*b)

제약조건: 최소값
"""    
    