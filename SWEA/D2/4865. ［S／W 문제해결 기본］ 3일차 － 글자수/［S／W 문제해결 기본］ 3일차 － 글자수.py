T = int(input())
for test_case in range(1, T + 1):
    a = input()
    b = input()
    d = {}

    for s in a:
        d[s] = 0

    for s in b:
        if s in d:
            d[s] += 1

    answer = max(d.values())

    print(f"#{test_case} {answer}")