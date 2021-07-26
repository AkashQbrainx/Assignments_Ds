package assignment

class DoublyLinkedList[T] {
  var head: NodeDouble[T] = null
  var tail:NodeDouble[T]=null
  def insert(data: T): Unit = {
    val nodeDouble = new NodeDouble[T](data, null, null)
    if(head==null){
    head=nodeDouble
    tail=nodeDouble
    head.prev=null
    tail.next=null
    }
    else
    {
      tail.next=nodeDouble
        nodeDouble.prev=tail
        tail=nodeDouble
        tail.next=null

      }
  }
  def search(head: NodeDouble[T], data:T): Unit = {
    if (head == null) {
      println("Element is not found ")
    } else if (head.data == data) {
      println("Element is found")
    } else {
      search(head.next, data)
    }
  }
  def delete(key: T): Unit = {
    var currentNode: NodeDouble[T] = head
    while (currentNode != null && currentNode.data != key) {
      currentNode = currentNode.next;
    }
    deleteNode(currentNode:NodeDouble[T]);
  }
  private def deleteNode(nodeDouble: NodeDouble[T]) {
    if (nodeDouble != null) {
      if (nodeDouble.prev != null)
        nodeDouble.prev.next =nodeDouble.next
      else
        head = nodeDouble.next
      if (nodeDouble.next != null)

        nodeDouble.next.prev =nodeDouble.prev
      else
        tail = nodeDouble.prev
    }
  }

  def printList():Unit={
   var current:NodeDouble[T]=head
    if(head==null){
    println("list is empty")}
    while (current!=null){
      print(current.data+",")
      current=current.next
    }
    println()
  }
}
class NodeDouble[T](val data:T,  var prev:NodeDouble[T], var next:NodeDouble[T]){

}