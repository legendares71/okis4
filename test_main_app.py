import math
import pytest
from main_app import g, si, is_happy, number_in_binary_numeral_system, number_in_new_numeral_system

DELTA = 1e-4

# --- Тесты для функции g(x) ---
# (Группа group1)
# Arrange: задаём x и ожидаемый результат expected
@pytest.mark.group1
@pytest.mark.parametrize("x, expected", [
    (7.00, float('nan')),   # выход за правую границу
    (-5.0, float('nan'))     # выход за левую границу
])
def test_g(x, expected):
    # Act: вызываем функцию g(x)
    result = g(x)
    # Assert: сравниваем результат с ожидаемым значением (NaN)
    # Проверяем, что оба значения - NaN
    if math.isnan(expected):    # Проверка через isnan нужна, так как NaN != NaN — обычное сравнение не сработает
        assert math.isnan(result)
    else:
        assert abs(result - expected) < DELTA


# --- Тесты для функции si(i, x) ---
# (Группа group1)
# Arrange: задаём значения i, x и ожидаемый результат expected
@pytest.mark.group1
@pytest.mark.parametrize("i, x, expected", [
    (2, 3.34, 5.5778),
    (0, 3.54, 1.0)
])
def test_si(i, x, expected):
    # Act: вычисляем i-й член степенного ряда
    result = si(i, x)
    # Assert: результат должен быть близок к ожидаемому значению
    assert abs(result - expected) < DELTA


# --- Тесты для функции is_happy(number, ticket_number) ---
# (Группы group1 и group2)
# Arrange: задаём number, ticket_number и ожидаемый результат expected
@pytest.mark.group1
@pytest.mark.group2
@pytest.mark.parametrize("number, ticket_number, expected", [
    (20000, 30000, False),
    (33333, 77777, False)
])
def test_is_happy(number, ticket_number, expected):
    # Act: вызываем функцию is_happy(number, ticket_number)
    result = is_happy(number, ticket_number)
    # Assert: результат должен соответствовать ожидаемому
    assert result == expected


# --- Тесты для функции number_in_binary_numeral_system(number) ---
# (Группа group2)
# Arrange: задаём number и ожидаемый результат expected
@pytest.mark.group2
@pytest.mark.parametrize("number, expected", [
    (2, 10),
    (5, 101)
])
def test_number_in_binary_numeral_system(number, expected):
    # Act: преобразуем число в двоичную систему
    result = number_in_binary_numeral_system(number)
    # Assert: результат должен совпадать с ожидаемым представлением
    assert result == expected


# --- Тесты для функции number_in_new_numeral_system(number, base) ---
# (Группа group2)
# Arrange: задаём number, base и ожидаемый результат expected
@pytest.mark.group2
@pytest.mark.parametrize("number, base, expected", [
    (10, 4, 22),
    (17, 8, 21)
])
def test_number_in_new_numeral_system(number, base, expected):
    # Act: вызываем функцию преобразования
    result = number_in_new_numeral_system(number, base)
    # Assert: сравниваем результат с ожидаемым значением
    assert result == expected
