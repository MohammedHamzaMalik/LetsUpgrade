# List and its default functions.
# Following are the default list functions that Python offers:
lst = [1, 2, 3, 7, 4]

lst.sort()
print(lst)

lst.append(6)
print(lst)

lst.extend(['car'])
print(lst)

print(lst.index(1))

print(type(lst))

# Dictionary and its default functions.
# Following are the default dictionary functions that Python offers:

names = {'car': 'bmw', 'bike': 'yamaha', 'car2': 'mercedes'}
# sorted()
print(sorted(names))
# len()
print(len(names))
# any()
print(any(names))
# all()
print(all(names))
# str()
print(str(names))

# Sets and its default functions.
# Following are the default sets functions that Python offers:
fruit = set(["mango", "banana", "grapes"])
print(fruit)
# add()
fruit.add("apple")
print(fruit)
# remove()
fruit.remove("mango")
print(fruit)
# pop()
fruit.pop()
print(fruit)
# discard()
fruit.discard("apple")
print(fruit)
# clear()
fruit.clear()
print(fruit)
#
# # Tuple and its default functions.
# # Following are the default tuple methods that Python offers:
tu = (1,2,3,4)
# index()
print(tu.index(1))
print(tu)
# count()
print(tu.count(2))
# # There are only two tuple methods count() and index() that a tuple object can call.
#
# # String and its default functions.
# # Following are the default string methods that Python offers:
string = 'india'
# capitalize()
print(string.capitalize())
# count()
print(string.count('d'))
# endswith()
print(string.endswith('a'))
# find()
print(string.find('i'))
# isalpha()
print(string.isalpha())
