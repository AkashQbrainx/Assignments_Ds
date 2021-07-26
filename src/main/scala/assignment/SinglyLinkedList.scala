package assignment

  class SinglyLinkedList[T] {
    var head: Node[T] = null

    def insert(data: T): Unit = {
      val node: Node[T] = new Node[T](data, null)
      if (head == null) {
        head = node
      }
      else {
        var tail: Node[T] = head
        while (tail.next != null) {
          tail = tail.next
        }
        tail.next = node
      }
    }

    def printElements(): Unit = {
      var node: Node[T] = head
      while (node.next != null) {
        print(node.data + ",")
        node = node.next
      }
      print(node.data)
      println()
    }

    def remove(key: T): Unit = {
      var current: Node[T] = head
      var previous: Node[T] = null
      if (current != null && current.data == key) {
        head = current.next
        println("value " + key + " is found and deleted")
      }
      while (current != null && current.data != key) {
        previous = current
        current = current.next
      }
      if (current != null) {
        previous.next = current.next
        println("value " + key + " is found and deleted")

      }
    }

    def search(element: T): Unit = {
      if (head == null) {
        println("element not found")
      }
      var index: Int = 0
      var temp: Node[T] = head
      while (temp != null) {
        if (temp.data == element) {
          println("element found at index" + index)
        }
        index = index + 1
        temp = temp.next
      }
      -1
    }
  }
class Node[T](val data: T,var next: Node[T]) {
}








