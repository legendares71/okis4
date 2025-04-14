import math


def g(x):
    if -4 <= x <= 4:
        if x <= 0:
            return math.cos(
                math.radians(math.sin(math.radians(math.cos(math.radians(x * x + 2 * x)))))) + math.pi * math.e
        else:
            return math.exp(math.sqrt(1 + ((2 * x) / (1 + x * x))))
    else:
        print(f"Введенный аргумент {x} не удовлетворяет интервалу определения функции [-4;4]")
        return float('nan')


def si(i, x):
    return math.pow(x, i) / factorial(i)


def factorial(i):
    if i == 1 or i == 0:
        return 1
    return factorial(i - 1) * i


def is_happy(number, ticket_number):
    if number < 1 or number > 999999:
        print(f"\nНомер {number} некорректный")
        print("Повторите ещё раз!!!")
        return False

    if 10000 < ticket_number <= 999999:
        digits = [int(d) for d in str(number).zfill(6)]
        return sum(digits[:3]) == sum(digits[3:])
    elif 0 < ticket_number <= 10000:
        digits = [int(d) for d in str(number).zfill(4)]
        return sum(digits[:2]) == sum(digits[2:])

    return False


def number_in_binary_numeral_system(number):
    return int(bin(number)[2:])


def number_in_new_numeral_system(number, base):
    if number < 0 or base < 2 or base > 10:
        raise ValueError("Некорректные данные: число должно быть неотрицательным, а основание в диапазоне [2,10]")

    result = 0
    multiplier = 1
    while number > 0:
        result += (number % base) * multiplier
        multiplier *= 10
        number //= base

    return result
