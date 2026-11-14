def solution(people, limit):
    answer = len(people)
    
    # 1. l과 r을 초기값 설정
    l = 0
    r = len(people)-1
    people = sorted(people)

    while l < r:
        if people[l] + people[r] <= limit:
            l += 1
            r -= 1
            answer -= 1
        else:
            r -= 1
        
    
    return answer


"""
10 40 50 50 70 80

1. l과 r을 초기값 설정
2. true
3. l + r >= limit -> l+ r- / - count
4. 그게 아니라면 r--
"""