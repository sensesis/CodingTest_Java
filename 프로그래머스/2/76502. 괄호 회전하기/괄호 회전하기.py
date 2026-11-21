def isTrue(s):
    sta = []
    
    for ch in s:
        if sta and (ch == "]" or ch == ")" or ch == "}"):
            if (sta[-1] == "[") and (ch == "]"): sta.pop()
            elif (sta[-1] == "(") and (ch == ")"): sta.pop()
            elif (sta[-1] == "{") and (ch == "}"): sta.pop()
        else:
            sta.append(ch)
    
    if not sta:
        return True 
    
    return False
        

def solution(s):
    answer = 0
    curStr = s
    
    for i in range(1, (len(s)-1) +1):
        if isTrue(curStr):
            answer += 1
        curStr = curStr[1:] + curStr[0]
    
    return answer
            
        