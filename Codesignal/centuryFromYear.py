def centuryFromYear(year):
    if year // 100 * 100 == year: 
        return year // 100
    return year // 100 + 1
    
