def solution(array, commands):
    answer = []
    #command 3번돌기
    for i, j, k in commands:
        num = sorted(array[i-1:j])
        answer.append(num[k-1])
    
    return answer
        


"""
1. commands에 순서대로 i ~ j까지 자르고 정렬 -> k번째 찾기
"""