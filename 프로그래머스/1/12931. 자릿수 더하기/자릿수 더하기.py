def solution(n):
    answer = 0
    
    while n > 0:
        answer += n % 10;
        n //= 10

    return answer

# 방법 1: / 10으로 숫자 더하기
# 방법 2: 문자열 -> 형변환 후 더하기