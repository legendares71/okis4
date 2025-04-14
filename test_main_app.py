import math
import pytest
from main_app import g, si, is_happy, number_in_binary_numeral_system, number_in_new_numeral_system

# --- Тесты для функции g(x) ---
# (Группа group1)
@pytest.mark.group1
@pytest.mark.parametrize("x, expected", [
    (7.00, float('nan')),  # для x=7, ожидается NaN
    (-5, float('nan'))     # для x=-5, ожидается NaN
])
def test_g(x, expected):
    result = g(x)
    if math.isnan(expected):
        assert math.isnan(result)
    else:
        assert abs(result - expected) < 1e-4

# --- Тесты для функции si(i, x) ---
# (Группа group1)
@pytest.mark.group1
@pytest.mark.parametrize("i, x, expected", [
    (2, 3.34, 5.5778),
    (0, 3.54, 1)
])
def test_si(i, x, expected):
    result = si(i, x)
    assert abs(result - expected) < 1e-4

# --- Тесты для функции is_happy(number, ticket_number) ---
# (Группы group1 и group2)
@pytest.mark.group1
@pytest.mark.group2
@pytest.mark.parametrize("number, ticket_number, expected", [
    (20000, 30000, False),
    (33333, 77777, False)
])
def test_is_happy(number, ticket_number, expected):
    result = is_happy(number, ticket_number)
    assert result == expected

# --- Тесты для функции number_in_binary_numeral_system(number) ---
# (Группа group2)
@pytest.mark.group2
@pytest.mark.parametrize("number, expected", [
    (2, 10),
    (5, 101)
])
def test_number_in_binary_numeral_system(number, expected):
    result = number_in_binary_numeral_system(number)
    assert result == expected

# --- Тесты для функции number_in_new_numeral_system(number, base) ---
# (Группа group2)
@pytest.mark.group2
@pytest.mark.parametrize("number, base, expected", [
    (10, 4, 22),
    (17, 8, 21)
])
def test_number_in_new_numeral_system(number, base, expected):
    result = number_in_new_numeral_system(number, base)
    assert result == expected
