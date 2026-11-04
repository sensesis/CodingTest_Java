def solution(s):
    sta = []
    
    for i in s:
        if i == "(":
            sta.append(i)
        else:
            if not sta:
                return False
            sta.pop()

    return len(sta) == 0

# Stack을 사용해서 문제 풀기
# list를 통해서 append하기.
# s == "("면 append, ")"면 앞에와 비교. 만약 "("면 지우기