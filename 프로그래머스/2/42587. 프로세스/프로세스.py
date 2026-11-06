from collections import deque

def solution(priorities, location):
    answer = 0
    # 큐 생성
    q = deque()
    # 빈 큐 만들고 반복문으로 넣기
    for i, p in enumerate(priorities):
        q.append((p, i))
    
    while q:
        p, i = q.popleft()
        
        if q and p < max(q)[0]:
            q.append((p, i)) 
        else:
            answer+=1
            if i == location:
                break
            
    return answer


"""
특정 프로세스가 몇 번째 실행되는지 아는 문제

1. 대기 큐에서 대기중인 프로세스 꺼냄
2. 큐에 대기중인 프로세스 중 우선순위 높은 프로세스가 있으면 방금꺼낸 프로세스 다시 큐에 넣음
3. 만약 그런 프로세스 없으면 실행 후 종료


1. enumrate() = 리스트돌때 인덱스 자동으로 붙여주는 내장함수
2. rotate() = 앞 or 뒤로 옮겨줌

"""