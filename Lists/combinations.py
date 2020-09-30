test_list = ["geekforgeeks", [5, 4, 3, 4], "is",  
             ["best", "good", "better", "average"]] 
  
# printing original list 
print("The original list is : " + str(test_list)) 
  
# initializing size of inner Optional list  
K = 4
  
res = [] 
cnt = 0
while cnt <= K - 1: 
    temp = [] 
      
    # inner elements selections 
    for idx in test_list: 
          
        # checks for type of Elements 
        if not isinstance(idx, list): 
            temp.append(idx) 
        else: 
            temp.append(idx[cnt]) 
    cnt += 1
    res.append(temp) 
  
# printing result  
print("All index Combinations : " + str(res))