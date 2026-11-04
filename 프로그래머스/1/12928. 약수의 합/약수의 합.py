def solution(n):
    answer = 0
    
    # for문으로 1 ~ n까지
    for i in range(1, n + 1):
        # 만약 나머지가 없다면? 
        if n % i == 0:
            # anwer += i
            answer += i
        
    return answer

# 약수를 구하는 문제
# 약수는 나를 나눠서 나머지가 없는 수. 1제외