from collections import deque

def solution(priorities, location):
    answer = 0
    q = deque()
    
    for i, l in enumerate(priorities):
        q.append((l, i))
    
    maxP = max(priorities)
    
    while q:
        if maxP == q[0][0]:
            answer += 1
            
            if q[0][1] == location:
                break    
            
            q.popleft()
            if q:
                maxP = max(x[0] for x in q)
        else:
            q.append(q.popleft())
    
    return answer


"""

"""