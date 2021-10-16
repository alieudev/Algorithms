def adjacentElementsProduct(inputArray):
    product = inputArray[0] * inputArray[1]
    for i in range(len(inputArray)-1):
        if inputArray[i] * inputArray[i+1] > product: 
            product = inputArray[i] * inputArray[i+1]
    return product
        


