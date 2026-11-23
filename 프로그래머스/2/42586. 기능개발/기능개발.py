from collections import deque

def solution(progresses, speeds):
    answer = []
    pq = deque(progresses)
    sq = deque(speeds)
    
    while pq:
        count = 0
        
        for i, s in enumerate(sq):
            pq[i] += s
        
        for p in pq:
            if p < 100:
                break
            
            count += 1
        
        for i in range(0, count, +1):
            pq.popleft()
            sq.popleft()
        
        if count > 0:
            answer.append(count)
                    
    return answer