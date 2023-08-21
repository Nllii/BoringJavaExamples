import sys

def calculate_birthday(day, month):
    # Your birthday calculation logic here
    print(f"Happy Birthday! You were born on {month}/{day}!")

if __name__ == "__main__":
    day = int(sys.argv[1])
    month = int(sys.argv[2])
    calculate_birthday(day, month)
