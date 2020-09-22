for number in range(1042000, 702648266):
    # power of number
    power = len(str(number))
    # initialize total
    total = 0
    temp = number

    while temp > 0:
        digit = temp % 10
        total += digit ** power
        temp //= 10

    if number == total:
        print('The first armstrong number is : ', number)
        break
