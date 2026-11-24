def solution(topping):
    answer = 0
    lefts = set()
    rights = {}
    
    for t in topping:
        rights[t] = rights.get(t, 0) + 1
    
    for i, t in enumerate(topping):
        lefts.add(t)
        rights[t] -= 1
        
        if rights[t] == 0:
            rights.pop(t)
        
        #print(f"{i}: left: {lefts}, right: {rights}, answer: {answer}")
        
        if len(lefts) == len(rights):
            answer += 1
    
    return answer

"""
토핑 번호 배열 toppin에서 공평하게 자르는 수 return하는 문제


완전 탐색
1. 해당 숫자 기준으로, set으로 넣기.
2. set 숫자로 판단해서 Max로 결과값 도출


제약사항 O(n log n)까지 가능
"""