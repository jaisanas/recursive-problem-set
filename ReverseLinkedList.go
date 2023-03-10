package main

import "fmt"

type Node struct {
	val int
	next *Node
}

func (n *Node) setNext(next *Node) {
	n.next = next
}

func (n *Node) print() {
	temp := n
	for temp != nil {
		fmt.Printf("%d ", temp.val);
		temp = temp.next;
	}
	fmt.Println()
}

func reverse(head *Node) *Node {
	if head == nil || head.next == nil {
		return head
	}

	p := reverse(head.next)
	head.next.next = head
	head.next = nil

	return p
}

type List struct {
	head Node
}

func main() {
	n1 := &Node{val: 1}
	n2 := &Node{val: 2}
	n3 := &Node{val: 3}
	n4 := &Node{val: 4}
	n5 := &Node{val: 5}

	n1.setNext(n2)
	n2.setNext(n3)
	n3.setNext(n4)
	n4.setNext(n5)

	n1.print()
	n1 = reverse(n1)
	n1.print()
}