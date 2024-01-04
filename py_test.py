print("hello")
import torch
x = torch.rand(5, 3)
print(x)

print(torch.cuda.is_available())

def add(a,b):
    return a+b

print(add(1,2))