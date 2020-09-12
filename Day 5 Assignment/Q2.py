primes = range(2, 2501)
for i in range(2, 8):
    primes = list(filter(lambda x: x == i or x % i, primes))

print(primes)
