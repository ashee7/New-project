import re

prev=0
run=bool(True)
def calculator():
    global prev
    global run
    while run:
        if prev==0:
            eq=input('enter eq')
            if eq=="quit":
                run=bool(False)
            else:
                eq=re.sub('[a-zA-Z!@#$^&<>?:;]','',eq)
                result=eval(eq)
                print(result)
                prev=result
        else:
            eq=input()
            if eq=="quit":
                run=bool(False)
            else:
                eq=re.sub('[^(-9+" "+"-"]','',eq)
                eq=(str(prev)+str(eq))
                result=eval(eq)
                print(result)
                prev=result

calculator()
    