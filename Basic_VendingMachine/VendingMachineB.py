items = [("Orange Juice", 1.80, 1), ("Milo", 1.80, 2), ("Sunquick", 2.50, 3), ("Ice Lemon Tea", 2.80, 4), ("Pepsi", 3.00, 5)]

print("ID \t Item\'s Name \t Item\'s Price")
for i in range(len(items)) :
    print(items[i][2], "\t", items[i][0], "\t RM", items[i][1])

print("\n")

item_numb = int(input("Item\'s Number : "))
money_insert = float(input("Money Inserted : "))
bal_topup = 0

while True :
    bal = money_insert + bal_topup - float(items[item_numb - 1][1])

    if bal >= 0 :
        print("You have successfully purchased your item. Thank you!")
        print("Balance : RM {}" .format(bal))
        break
    else :
        print("You do not have enough money. Please insert more!")
        print("Balance Needed : RM {}" .format(bal))
        bal_topup = float(input("Insert Balance Needed : "))
        continue
