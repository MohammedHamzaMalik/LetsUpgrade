filename = input("Enter your file name: ")

try:
    file = open(filename, "r")

    for line in file:
        print(line, end="")

    file.close()

except FileNotFoundError:
    print("File not found or Check your filename")

except PermissionError:
    print("You don't have the permission to read the file")

except ValueError:
    print("No valid integer in line.")

except:
    print("Unexpected error while reading the file")
