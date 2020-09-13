def armstrong():
    for num in range(1, 1001):
      temp = num
      sum = 0
      while temp > 0:
        digit = temp % 10
        sum = sum + digit ** 3
        temp = temp//10

      if sum == num:
        yield num


for value in armstrong():
    print(value)
