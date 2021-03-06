package assignment

import assignment.Main.linkedList

object Main extends App {
  println(">>>>>>>>>>>>>>Single linked list operation>>>>>>>>>>>>>>>>>>>>>>")
  val linkedList: SinglyLinkedList[Int] = new SinglyLinkedList[Int]
  linkedList.insert(11)
  linkedList.insert(12)
  linkedList.insert(13)
  linkedList.insert(14)
  linkedList.printElements()
  linkedList.search(13)
  linkedList.remove(12)
  linkedList.printElements()
  println(">>>>>>>>>>>>>>>Doubly linked list operation>>>>>>>>>>>>>>>>>>>>>>>>>>>>>")
  val doublyLinkedList: DoublyLinkedList[String] =new DoublyLinkedList[String]
  doublyLinkedList.insert("java")
  doublyLinkedList.insert("scala")
  doublyLinkedList.insert("python")
  doublyLinkedList.insert("c++")
  doublyLinkedList.insert("c")
  doublyLinkedList.printList()
  doublyLinkedList.delete("scala")
  doublyLinkedList.printList()
  doublyLinkedList.search(doublyLinkedList.head,"java")
    println(">>>>>>>>>>>>>>>>>>>>Binary tree operation>>>>>>>>>>>>>>>>>>>>>")
  val binaryTree = new BinaryTree()
  val root: Node1 = new Node1(5)
  binaryTree.insert(root, 4)
  binaryTree.insert(root, 5)
  binaryTree.insert(root, 6)
  binaryTree.insert(root, 2)
  binaryTree.insert(root, 8)
  println("Inorder traversing")
  binaryTree.traverseInOrder(root)
  println("preorder traversing")
  binaryTree.traversePreOrder(root)
  println("postorder traversing")
  binaryTree.traversePostOrder(root)

 binaryTree.search(binaryTree.root,8)
  println()
  println(">>>>>>>>>>>>>>>stack operations>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>")
  val stack: Stack[Int] = new Stack[Int]
  stack.push(12)
  stack.push(13)
  stack.push(14)
  stack.push(15)
  stack.printStack()
  stack.pop()
  stack.printStack()
  stack.peek()

  println(">>>>>>>>>>>>>>Queue operations>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>")
  val queue: Queue[String] =new Queue[String]
  queue.enqueue("Aakash")
  queue.enqueue("Akshay")
  queue.enqueue("john")
  queue.enqueue("Gokul")
  queue.enqueue("jeeva")
  queue.printQueue()
  queue.deQueue()
  queue.deQueue()
  queue.deQueue()
  queue.deQueue()
  println(queue.isEmpty())
  queue.peek()

}
