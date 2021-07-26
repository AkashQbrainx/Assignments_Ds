package assignment

 class Stack[T] {
    var top:StackNode[T]=null
def push(data:T):Unit={
  val node:StackNode[T]=new StackNode[T](data,null)
  if(top==null){
    top=node
  }
  else
    {
      val temp: StackNode[T] =top
      top=node
      node.next=temp
    }
}
def pop():Unit={
  if(isEmpty()){
    print("stack is empty")
  }
  else
    {
      val topValue=top.data
      println("Element deleted or poped out is "+topValue)
      top=top.next

    }
}
def isEmpty():Boolean={
  if(top==null)
    true
    else
    false
}
   def peek():Unit={
    if(isEmpty()){
      println("stack is empty ")
    }
    else {
      println("element to be deleted is "+top.data)
    }


   }

   def printStack():Unit={
     var node: StackNode[T] = top
     print("Elements of stack are :")
     while (node.next != null) {
       print(node.data+",")
       node = node.next
     }
     print(node.data)
     println()
   }

}
class StackNode[T](val data:T,var next:StackNode[T]){

}