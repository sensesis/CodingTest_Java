def solution(s):
    l = []
    
    for word in s:
        if len(l) == 0 or l[-1] != word:
            l.append(word)
        else:
            l.pop()
    
    return 1 if not l else 0
        
        
            


"""
아예 없애야하는 문제.

스택으로 풀면 쉽겠는데?
1. 한자리씩 삽입. 만약 최근 값이랑 들어오는값이랑 같다? 그러면 삭제.
2. 만약 리스트에 아무것도 없다면? 1, 그게 아니라면 0
"""