def setDiscountDict(i, discount):
    curD = {}
    for name in discount[i:i+10]:
        curD[name] = curD.get(name, 0) + 1
    
    return curD

def solution(want, number, discount):
    answer = 0
    d = {}
    curD = {}
    
    # 1. want number 딕셔너리 초기값 설정
    for k, v in zip(want, number):
        d[k] = v
    
    for i in range(0, len(discount)-10 +1):
        curD = setDiscountDict(i, discount)
        
        if d == curD:
            answer += 1
        
    return answer;
        
    
    

"""
10일동안 회원 자격 부여
회원 대상으로 매일 1가지 제품 할인 + 하루에 1개만 가능


discount는 최대 100,000 = 이중 for제외하고 가능

1. want number 딕셔너리 초기값 설정
2. discount값 초기값 설정
3. 대조 후 맞으면 count+=1


"""