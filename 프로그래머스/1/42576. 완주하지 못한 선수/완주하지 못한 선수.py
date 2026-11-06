def solution(participant, completion):
    answer = ''
    # 딕셔너리 만듦
    d = dict()
    # participant 딕셔너리에 적용
    for name in participant:
        d[name] = d.get(name, 0) + 1
    
    # 순회로 해당 값 있으면 value 값 1빼기
    for name in completion:
        if d.get(name):
            d[name] -= 1
            
    # 순회로 값이 1이상이면? 해당 이름 반환
    for name in participant:
        if d[name] == 1:
            answer = name
    
    
    return answer
            

"""
participant는 참여 선수
completion은 완주한 선수
못 들어간 선수의 이름을 반환해라

1. 해시
2. 딕셔너리
"""