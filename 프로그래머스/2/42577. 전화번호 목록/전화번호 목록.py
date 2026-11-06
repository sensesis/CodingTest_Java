def solution(phone_book):
    s = set(phone_book)
    
    for num in phone_book:
        for i in range(0, len(num)):
            if num[:i] in s:
                return False
        
    return True    

"""
1. 해시 셋 사용
    - 
"""