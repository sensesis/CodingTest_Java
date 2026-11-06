def solution(participant, completion):
    answer = ''
    d = {}
    for name in participant:
        d[name] = d.get(name, 0) + 1
    
    for name in completion:
        d[name] -= 1
        
    for name in participant:
        if d[name] > 0:
            answer = name
    
    return answer