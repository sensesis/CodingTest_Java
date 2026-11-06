def solution(nums):
    answer = len(nums) / 2;
    s = set()
    
    for p in nums:
        s.add(p)
    
    if len(s) < answer:
        answer = len(s)
    
    return answer
    
    
    
    
    
"""
n마리 포켓몬 중, n/2마리 가져가는 문제
최대한 다양한 종류의 폰켄못 가지길 원함

1.answer 정답
2. set s

1. 해시셋 사용
    - 해시셋으로 중복 없앰
    - 갯수 더해서 만약 default값인 n/2보다 작으면? 해당값, 그게 아니라면 default
"""
    