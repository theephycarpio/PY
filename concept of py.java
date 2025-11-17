class Dog(Animal):

   def speak(self):

       return "Woof!"


class Cat(Animal):

   def speak(self):

       return "Meow!"


dog = Dog()

cat = Cat()


print(dog.speak())   

print(cat.speak())   


_______________class Animal:

   def speak(self):

       return "Some generic animal sound"

_________________________





class Vehicle:

    def __init__(self, brand, fuel):

        self.brand = brand

        self.fuel = fuel


class Car(Vehicle):

    def __init__(self, brand, fuel, doors):

        super().__init__(brand, fuel)  

        self.doors = doors


    def drive(self):

        self.fuel -= 10

        print(f"{self.brand} is driving. Remaining fuel: {self.fuel}")



_______________________________________




class BankAccount:

    def __init__(self, balance=0):

        self.__balance = balance  


    def deposit(self, amount):

        self.__balance += amount


    def withdraw(self, amount):

        if amount <= self.__balance:

            self.__balance -= amount

        else:

            print("Insufficient funds")


    def get_balance(self):

        return self.__balance





___________________________________________





class Person:

    def __init__(self, age):

        self._age = None

        self.age = age  # calls the setter below

@property

    def age(self):

        return self._age8


@getter.setter

    def age(self, value):

        if isinstance(value, int) and value > 0:

            self._age = value

        else:

            raise ValueError("Age must be a positive integer.")




_________________________________________




class InkPrinter:

    def print_document(self):

        print("Printing using ink — slower but colorful.")


class LaserPrinter:

    def print_document(self):

        print("Printing using laser — faster and sharper.")



_________________________________________




def make_it_speak(obj):

    obj.speak()


class Bird:

    def speak(self):

        print("Tweet tweet!")


class Robot:

    def speak(self):

        print("Beep boop!")



______________________________________





class Shape(ABC):

    @abstractmethod

    def area(self):

        pass


class Circle(Shape):

    def __init__(self, radius):

        self.radius = radius


    def area(self):

        return 3.14 * self.radius ** 2


class Rectangle(Shape):

    def __init__(self, width, height):

        self.width = width

        self.height = height


    def area(self):

        return self.width * self.height


____________________________________



class Employee(ABC):

    @abstractmethod

    def calculate_pay(self):

        pass


class HourlyEmployee(Employee):

    def __init__(self, hours, rate):

        self.hours = hours

        self.rate = rate


    def calculate_pay(self):

        return self.hours * self.rate


class SalariedEmployee(Employee):

    def __init__(self, salary):

        self.salary = salary


    def calculate_pay(self):

        return self.salary
