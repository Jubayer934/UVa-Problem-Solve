current=input()
t = 1
while current != "#":
        print("Case",t,end="")
        print(": ",end="")
        
        if current == "HELLO":
            print("ENGLISH")
        elif current == "HOLA":
            print("SPANISH")
        elif current == "HALLO":
            print("GERMAN")
        elif current == "BONJOUR":
            print("FRENCH")
        elif current == "CIAO":
            print("ITALIAN")
        elif current == "ZDRAVSTVUJTE":
            print("RUSSIAN")
        else:
            print("UNKNOWN")
        t=t+1
        
        current=input()