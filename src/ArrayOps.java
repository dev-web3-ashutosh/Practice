/*
 * insert at end
 * insert at index
 * delete from end
 * delete from index
 * grow
 * search
 * sort
 * print
 */
public class ArrayOps {
	
	int[] arr;
	int size, capacity;

	public ArrayOps(int capacity) {
		this.capacity = capacity;
		arr = new int[capacity];
		size = 0;
	}
	
	//insert at end
	void insert(int ele) {
		if(size == capacity) {
			grow(); //grow method
		}
		
		arr[size] = ele;
		System.out.println("Element " + ele + " inserted at index " + size);
		System.out.println("New Array: " + print()); //print method
		size++;
	}
	
	//insert at index
	void insertAtIndex(int ele, int index) {
		if(index > size-1) {
			System.out.println("Invalid index");
			return;
		}
		else {
			//right shift operation
			for(int i=size-1; i>=index; i--) {
				arr[i+1] = arr[i];
			}
			
			arr[index] = ele;
			System.out.println("Element " + ele + " inserted at index " + index);
			System.out.println("New Array: " + print()); //print method
			size++;
		}
	}
	
	//delete from end
	void delete() {
		if(size == 0) {
			System.out.println("Array already empty");
			return;
		}
		else {
			int temp = arr[size-1];
			arr[size-1] = 0;
			System.out.println("Element " + temp + " deleted from index " + (size-1));
			System.out.println("New Array: " + print()); //print method
			size--;
		}
	}

	//delete from index
	void deleteFromIndex(int index) {
		if(index > size-1) {
			System.out.println("Invalid index");
			return;
		}
		else {
			int temp = arr[index];
			
			//left shift operation
			for(int i=index; i<size; i++) {
				arr[i] = arr[i+1];
			}
			
			arr[size-1] = 0;
			System.out.println("Element " + temp + " deleted from index " + index);
			System.out.println("New Array: " + print()); //print method
			size--;
		}
		
		
	}

	public static void main(String[] args) {
		
		

	}

}