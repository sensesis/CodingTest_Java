def solution(progresses, speeds):
    list = []
    answer = []
    
    for i in range(len(progresses)):
        if ((100-progresses[i]) % speeds[i]) == 0:
            list.append((100-progresses[i]) // speeds[i])
        else:
            list.append(((100-progresses[i]) // speeds[i])+1)
    
    release = list[0]
    count = 1
    
    for i in list[1:]:
        if i <= release:
            count += 1
        else:
            answer.append(count)
            release = i
            count = 1
    
    answer.append(count)
    
    return answer


"""
기능 개발이 100%일때 서비스 반영 가능
뒤에 있는 기능이 만약 먼저 개발된다면 앞 배포될때 함께 배포

progress: 작업 진도 배열
speeds: 개발속도

1. for로 100 / 30
"""