package assignment

class Queue[T] {
var front:QueueNode[T]=null
  var rear:QueueNode[T]=null
  def enqueue(data:T):Unit={
    val queueNode: QueueNode[T] =new QueueNode[T](data:T,null)
    if(rear==null){
      rear=queueNode
      front=queueNode
    }
    rear.next=queueNode
    rear=queueNode

  }
  def deQueue():Unit={
    if(!isEmpty()){
      print("queue is empty")
    }
    var temp: QueueNode[T] =front
    println("Element to be deleted is "+temp.data)
    front=front.next
    if(front==null)
    {
      rear=null
    }
  }
  def peek():Unit={
    if(front!=null){
     println( front.data)
    }
    else
      println("queue is empty")

  }

  def isEmpty():Boolean={
    if(front==null && rear==null){
     true
    }
    else
    false
  }
  def printQueue():Unit={
    var node: QueueNode[T] =front
    print("Elements of the queue are :")
    while (node.next!= null){
      print(node.data+",")
      node=node.next
    }
    print(node.data+",")
    println()
  }

}
class QueueNode[T](val data:T,var next:QueueNode[T]){

}