import random

number = random.randint(1,100);
guessattempt = 1;
userinput = 0;

while True:
    userinput = int(input("Enter a number: "))
    
    if userinput < 1 or userinput > 100:
        print("invalid input")
        continue
    elif userinput > number:
        print("it is higher....try again")
    elif userinput < number:
        print("it is lower....try again")
    elif userinput == number:
        print("correct!!!")
        break

    if guessattempt == 5:
        print("Out of attempts!")
        break
    
    guessattempt += 1


print("The number is: ", number);
print("your attempt is: ", guessattempt);

if(guessattempt == 1 and userinput == number):
        print("legendary");
elif(guessattempt == 2 and userinput == number ):
        print("Excellent");
elif(guessattempt >= 3 and guessattempt <= 4 and userinput == number):
        print("Good");
elif(guessattempt == 5 and userinput == number ):
        print("close");
elif(guessattempt == 5 and userinput != number ):
        print("Try again")
