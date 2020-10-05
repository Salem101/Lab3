def bubbleSort(arr): 
    n = len(arr) 
   
    #traverse through all elements of array
    for i in range(n): 
        swapped = False
  
        # Last i element is in correct spot
        for j in range(0, n-i-1): 
   
            # swap elements if greater than next element
            if arr[j] > arr[j+1] : 
                arr[j], arr[j+1] = arr[j+1], arr[j] 
                swapped = True
  
        # if nothing swapped then break from inner loop
        if swapped == False: 
            break

arr = []
n = int(input("Enter number of elements in your list: "))
for i in range(0, n):
    ele= int(input())
    arr.append(ele)
    
print ("Unsorted array: ")
for i in range (len(arr)):
    print ("%d" %arr[i], end = " ")
bubbleSort(arr) 
print (" ")
print ("Sorted array:") 
for i in range(len(arr)): 
    print ("%d" %arr[i],end=" ") 
