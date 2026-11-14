def solution(n):
    answer = 0
    arr = [0] * (n+2)
    arr[0] = 0
    arr[1] = 1
    
    for i in range(2, (n+1)+1): 
        arr[i] = arr[i-2] + arr[i-1]
    
    answer = arr[-1] % 1234567
    
    
    return answer


"""

"""