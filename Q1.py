list1 = [1, 5, 6, 4, 1, 2, 3, 5]
list2 = [1, 5, 6, 5, 1, 2, 3, 6]
sub_list = [1, 1, 5]

check = 0
if all(x in list1 for x in sub_list):
    check = 1

check2 = 0
if all(x in list2 for x in sub_list):
    check = 1

if check:
    print(list1, "- it's a match")
else:
    print(list1, "- it's Gone")

if check2:
    print(list2, "- it's a match")
else:
    print(list2, "- it's Gone")