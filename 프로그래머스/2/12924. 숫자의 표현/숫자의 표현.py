def solution(n):
    answer = 0
    num = 0
    left = 0
    right = 0
    
    while right <= n:
        if num < n:
            right += 1
            num += right
            continue
            
        elif num > n:
            left += 1
            num -= left
            continue
            
        else:
            answer += 1
            right += 1
            num += right
            
    return answer            
            
            
            
            
            


"""
n의 값을 1~n까지 조합으로 값을 찾기

1. 슬라이딩 윈도우
- 먼저 1,2,3,4,5를 다 더해서 맞으면 left 지우고 right 추가, 
- 만약 result보다 크다면? left 지우기
"""