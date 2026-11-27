def solution(s):
    answer = []
    d = {}
    s = s.replace("{", "").replace("}", "")
    
    for num in s.split(","):
        d[num] = d.get(num, 0) + 1
    
    result = sorted(d.items(),key=lambda x:x[1], reverse = True)
    
    for key, cnt in result:
        answer.append(int(key))
    
    
    return answer


"""
이거 그냥

문자열 하나씩 읽어서, 숫자 기준으로 딕셔너리에 넣고, 큰 순서대로 반환만 하면 될거같은데?
split 기준은 ,이거나 {}

이거 안되나?
1. 특정 문자열 삭제하기. -> replace
"""