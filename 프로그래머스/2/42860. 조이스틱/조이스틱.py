def solution(name):
    answer = 0
    for s in name:
        d = ord(s) - ord('A')
        answer += min(d, 26 - d)

    n = len(name)
    move = n - 1                              # 오른쪽으로만 쭉 가는 경우
    for i in range(n):
        nxt = i + 1
        while nxt < n and name[nxt] == 'A':   # i 뒤에 이어진 A 구간을 건너뜀
            nxt += 1
        move = min(move, 2 * i + (n - nxt), i + 2 * (n - nxt))

    return answer + move