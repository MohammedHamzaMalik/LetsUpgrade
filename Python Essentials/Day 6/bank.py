class Account:

    def __init__(self, owner, balance):
        self.owner = owner
        self.balance = balance

    def __str__(self):
        return 'Account owner: {owner}\nAccount balance: ${balance}'.format(owner=self.owner, balance=self.balance)

    def deposit(self, dp_money):
        self.balance += dp_money
        print('Deposit Accepted, your current balance is {balance}'.format(balance=self.balance))

    def withdraw(self, wd_money):
        if wd_money > self.balance:
            print('Sufficient Money is not available!')
        else:
            self.balance -= wd_money
            print('Withdrawal Accepted, your current balance is {balance}'.format(balance=self.balance))


acct1 = Account(input('Enter your name: '), 100)
print(acct1)

acct1.deposit(int(input('Enter the amount for deposit: ')))
acct1.withdraw(int(input('Enter the amount for withdrawal: ')))
acct1.withdraw(int(input('Enter the amount for withdrawal: ')))
