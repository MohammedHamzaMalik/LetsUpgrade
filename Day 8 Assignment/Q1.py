def smarty_div(func): #This is a decorater function
    def inside(x, y):
        print("Lets divide ", x, " with ", y, ".")
        if y == 0:
            print("Sorry! you cannot divide a number by zero, try some different number.")
            return
        return func(x, y)
    return inside


def lets_divide(x, y):
    print("Result = ", x / y)


lets_divide = smarty_div(lets_divide)
print(lets_divide)

lets_divide(4, 2)
lets_divide(5, 0)
