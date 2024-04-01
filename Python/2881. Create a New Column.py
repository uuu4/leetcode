import pandas as pd

def createBonusColumn(employees: pd.DataFrame) -> pd.DataFrame:
    employees.insert(len(employees.columns), "bonus", 2 * employees['salary'])
    return employees
