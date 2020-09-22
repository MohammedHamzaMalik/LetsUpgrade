# Question 1
altitude = input('Enter Altitude:')
altitude = int(altitude)
if altitude <= 1000:
    print("Safe to land")
elif 1000 < altitude < 5000:
    print("Bring down to 1000")
else:
    print("Turn around")

# Question 2
for number in range(1, 201):
    if number > 1:
        for i in range(2, number):
            if (number % i) == 0:
                break
        else:
            print(number)
