
#Arthmetic operators
num1<-20
10->num2

print(num1 + num2)
print(num1 - num2)
print(num1 * num2)
print(num1/num2)



# Relational Operators
print(num1 == num2)
print(num1 != num2)
print(num1 >= num2)
print(num1 <= num2)
print(num1 < num2)
print(num1 > num2)



#logical operators
var1<-TRUE
var2<-FALSE
class(var1)
class(var2)

print(!var1)
print(var1 & var2)
print(var1 | var2)
isTRUE(var2)


# decision Making Statements in R
#   1- if statements
#   2- if-else statements 
#   3- switch statements

# 1- if 
num3<-5
if(num3 < 9)
{
  print("correct")
}

# 2- if-else
num4<-10

if(num4 == 8)
{
  print(" num matched ")
}else
{
  print(" num not matched ")
}

# 3- Switch statements
x<- switch(4,"uday","aditya","singh","panwar")
print(x)


#loops in R
# 1- for loop
# 2- repeat loop
# 3- while loop


x<- LETTERS[1:37]
for(i in x)
{
  print(i)
}

# 3- whilw loop
x<-"uday"
count<-0
while (count<5) {
  print(x)
  count=count+1
}

# 2- repeat loop

x<-"hello"
count<-2
repeat {
  print(x)
  count <- count+1
  
  if(count>5)
  {
    break
  }
}

#ARRAYS

# 1D
vec1<- c(10,16,22,43,15,25)
print(vec1)

# 2D

arr = array(2:13,dim = c(2,3,2))
print(arr)


# EXAMPLE-1
vec1 <- c(1, 2, 3, 4, 5, 6, 7, 8, 9)
vec2 <- c(10, 11, 12)

arr = array(c(vec1, vec2), dim = c(2, 3, 2))
print (arr)


#Example-2
vec1<-c(1,2,3,4,5,6,7,8,"hello")
a<-c("Row-1","Row-2","Row-3")
b<-c("Col-1","Col-2","Col-3")
d<-c("Matrix-1")
arr<- array(c(vec1,vec2),dim = c(3,3,1),dimnames=list(a,b,d))
print(arr)
print(arr[1,1,1])
mat1<- arr[2,2,1]
print(mat1)
mat2<- arr[2,1,1]
print(mat2)
print(mat1+mat2)

































