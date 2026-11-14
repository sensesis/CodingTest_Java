def solution(arr):
    num = 1
    
    while True:
        a = False
        for i in arr:
            if num % i != 0:
                num += 1
                a = True
                break
        
        if not a:
            break
            
    return num
"""
최소 공배수 = 두 수의 배수 중 공통이 되는 가장 작은 숫자
Ex) 2, 7 = 14

1. num값은 배열중 가장 큰 값을 기준으로 함
2. num값 % i 가 모두 0이라면?
    - num값 반환
    그게 아니라면? num+=1 하고 반복

for whi
"""