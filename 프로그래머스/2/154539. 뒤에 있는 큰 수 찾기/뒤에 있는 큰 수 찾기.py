def solution(numbers):
    answer = [-1] * len(numbers)
    sta = []
    
    for i, num in enumerate(numbers):
        while sta and numbers[sta[-1]] < num:
            answer[sta.pop()] = num
        
        sta.append(i)
    
    return answer