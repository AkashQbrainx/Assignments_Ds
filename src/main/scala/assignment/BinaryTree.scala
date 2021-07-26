package assignment

 class BinaryTree() {

var root: Node1 =null
   def insert(node: Node1, value: Int) {
     if (value < node.value) {
       if (node.left != null) {
         insert(node.left: Node1, value: Int);
       }
       else {
         println("inserted " + value + " to the left of " + node.value)
         node.left = new Node1(value)
       }
     }
     else if (value > node.value) {
       if (node.right != null) {
         insert(node.right, value)

       }
       else {
         println("inserted " + value + " to the right of " + node.value)
         node.right = new Node1(value)
       }
     }
   }

      def delete(value:Int):Unit={
        root=deleteKey(root:Node1,value)
      }
      def deleteKey(root: Node1, value: Int):Node1= {
        if (root == null) {
          root
        }
        if (value < root.value) {
          root.left = deleteKey(root.left, value)
        }
        else if (value > root.value) {
          root.right = deleteKey(root.right, value)
        }
        else {
          if (root.left == null) {
            root.right
          }
          else if (root.right == null) {
            root.left
          }
          root.value = minimum(root.right)
          root.right = deleteKey(root.right, root.value)
        }
        root
      }
   def minimum(root: Node1):Int={
     var low=root.value
     while (root.value!=null){
       low=root.left.value
    //   root=root.left

     }
     low

   }

   def search(value: Int): Boolean = {
     var root: Node1 = searchValue(root:Node1, value)
     if (root != null)
       false
     else
       true
   }

   def searchValue(root: Node1, value: Int): Node1 = {
     if (root == null || root.value == value) {
       root
     }
     if (root.value > value) {
       searchValue(root.left, value)
     }
     searchValue(root.right, value)
   }


   def search(temp:Node1,data:Int): Unit ={
     if(root==null){
    println("tree is empty")
  }
  else{
    if(temp.value== data){
     println("value is present")
    }
    if(temp.left!=null){
      search(temp.left,data)

    }
    if(temp.right!=null){
      search(temp.right,data)

    }
  }
}



   def traverseInOrder(node: Node1): Unit = {
     if (node != null) {
       traverseInOrder(node.left);
       println(" " + node.value);
       traverseInOrder(node.right);
     }

   }

def traversePreOrder(node:Node1):Unit={
  if (node != null) {
      println(" "+node.value)
      traversePreOrder(node.left)
      traversePreOrder(node.right)
    }
  }

   def traversePostOrder(node: Node1):Unit={
     if (node != null){
       traversePostOrder(node.left)
       traversePostOrder(node.right)
       println(" "+node.value)
     }
   }


 }
class Node1(var value:Int){
  var left: Node1 = null
  var right: Node1 = null
}