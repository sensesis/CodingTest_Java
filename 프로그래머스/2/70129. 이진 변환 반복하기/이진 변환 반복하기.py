def solution(s):
    answer = 0
    rnd = 0 
    cnt = 0
    curStr = s
    
    # x의 모든 0 제거
    while curStr != '1':
        cnt = 0
        rnd += 1
        for ch in curStr:
            if ch == '1':
                cnt += 1
            else:
                answer += 1
        curStr = bin(cnt)[2:] 
    
    return [rnd, answer]
    


"""
1. x의 모든 0제거
    - 제거 하는 함수 사용 (모르겠음)
    - for문으로 확인
2. c를 2진법으로 바꿈
    - bin(6)
3. 값이 1이 될때까지 반복, 1이되었으면 0제거 숫자 반환
    - len = 1 or s == "1"
    
    count: 0 넣을 카운트 갯수
    
"""