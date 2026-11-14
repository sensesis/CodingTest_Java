def solution(elements):
    list = elements * 2
    s = set()
    
    for i in range(len(elements)):
        for num in range(len(elements)):
            s.add(sum(list[num:num+i]))
    
    return len(s)
    

"""
연속하는 부분 수열의 합이 최대 몇개인지 아는 문제.
원형 수열: 처음과 끝이 연결된 형태 수열
1. list 이어붙여서 쉽게 원형 큐 적용
2. 길이가 1이니깐, elements 크기 만큼 for를 돌면서, 범위를 더하면 될듯? answer = 
"""