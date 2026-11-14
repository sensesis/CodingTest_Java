def solution(n, lost, reserve):
    d = {}
    answer = 0
    for i in range(0, (n+1)+1):
        d[i] = 1

    for i in lost:
        d[i] -= 1

    for i in reserve:
        d[i] += 1

    for i in sorted(lost):          # 바뀐 곳 1: sorted
        if d[i] != 0:               # 바뀐 곳 2: 빌릴 필요 없으면 건너뜀
            continue
        if d[i-1] >= 2:
            d[i-1] -= 1
            d[i] += 1
        elif d[i+1] >= 2:
            d[i+1] -= 1
            d[i] += 1

    for i in range(1, n+1):
        if d[i] >= 1:
            answer += 1

    return answer