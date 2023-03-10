package main

import "fmt"

func mergeSort(data []int, start int, end int) {
	if(start < end) {
		mid := (start + end) / 2
		mergeSort(data, start, mid)
		mergeSort(data, mid + 1, end)
		merge(data, start, mid, end)
	}
}

func merge(data []int, start int, mid int, end int) {
	temp := make([]int, end - start + 1)
	i := start
	j := mid + 1
	k := 0

	for i <= mid && j <= end {
		if(data[i] <= data[j]) {
			temp[k] = data[i]
			i++
			k++
		} else {
			temp[k] = data[j]
			j++
			k++
		}
	}

	for i <= mid {
		temp[k] = data[i]
		i++
		k++
	}

	for j <= end {
		temp[k] = data[j]
		k++
		j++
	}

	for a := start; a <= end; a++ {
		data[a] = temp[a - start]
	}
}

func main() {
	data := [...]int{1, 3, 2, 4}
	mergeSort(data[:], 0, len(data) - 1)
	fmt.Println(data)
}