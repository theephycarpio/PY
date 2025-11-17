# ==============================

# Linked List Implementation

# ==============================

class Node:

    def __init__(self, data):

        self.data = data

        self.next = None


class LinkedList:

    def __init__(self):

        self.head = None


    def insert(self, data):

        new_node = Node(data)

        if not self.head:

            self.head = new_node

            return

        curr = self.head

        while curr.next:

            curr = curr.next

        curr.next = new_node


    def display(self):

        curr = self.head

        while curr:

            print(curr.data, end=" -> ")

            curr = curr.next

        print("None")



# ==============================

# Stack Implementation

# ==============================

class Stack:

    def __init__(self):

        self.items = []


    def push(self, data):

        self.items.append(data)


    def pop(self):

        if not self.is_empty():

            return self.items.pop()

        return None


    def peek(self):

        if not self.is_empty():

            return self.items[-1]

        return None


    def is_empty(self):

        return len(self.items) == 0


    def display(self):

        print("Stack:", self.items)



# ==============================

# Queue Implementation

# ==============================

class Queue:

    def __init__(self):

        self.items = []


    def enqueue(self, data):

        self.items.append(data)


    def dequeue(self):

        if not self.is_empty():

            return self.items.pop(0)

        return None


    def is_empty(self):

        return len(self.items) == 0


    def display(self):

        print("Queue:", self.items)



# ==============================

# Binary Tree Implementation

# ==============================

class TreeNode:

    def __init__(self, data):

        self.data = data

        self.left = None

        self.right = None


def inorder_traversal(root):

    if root:

        inorder_traversal(root.left)

        print(root.data, end=" ")

        inorder_traversal(root.right)



# ==============================

# Main Program

# ==============================

if _name_ == "_main_":

    print("=== LINKED LIST ===")

    ll = LinkedList()

    ll.insert(10)

    ll.insert(20)

    ll.insert(30)

    ll.display()


    print("\n=== STACK ===")

    stack = Stack()

    stack.push(5)

    stack.push(15)

    stack.push(25)

    stack.display()

    print("Popped:", stack.pop())

    stack.display()


    print("\n=== QUEUE ===")

    queue = Queue()

    queue.enqueue("A")

    queue.enqueue("B")

    queue.enqueue("C")

    queue.display()

    print("Dequeued:", queue.dequeue())

    queue.display()


    print("\n=== BINARY TREE ===")

    root = TreeNode(1)

    root.left = TreeNode(2)

    root.right = TreeNode(3)

    root.left.left = TreeNode(4)

    root.left.right = TreeNode(5)


    print("Inorder Traversal:")

    inorder_traversal(root)

    print()
