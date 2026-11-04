def solution(n):
    answer = []
    
    # for 역순으로 넣기
    while n > 0:
        answer.append(n % 10);
        n = n // 10;
    
    return answer

# list를 역순으로 해주는 함수
# 기본적으로 새로운 list를 안해도되니깐 list로만 해도될거같음.