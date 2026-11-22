def solution(citations):
    answer = 0
    n = len(citations)
    citations = sorted(citations)
    
    for i, h in enumerate(citations):
        maxH = len(citations) - i
        minH = i
        
        if (h >= maxH) and (h >= minH):
            answer = max(answer, maxH)   
            
    return answer        
        


"""
1. 해당 숫자 기준, 같거나 높은수
2. 해당 숫자 기준, 나머지 두개는 숫자보다 낮아야함.

문제풀이
1. citations의 배열 길이 저장
2. sort로 순서대로
3. 숫자의 값과 나머지 배열 길이가 크거나 같으면 ok
4. 숫자의 값과 뒤 배열 길이가 작거나 같으면 ok
5. 해당 숫자를 max값으로 최대값 설정하기
"""