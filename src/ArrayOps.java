import java.util.Arrays;

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
		System.out.println("New Array: ");
		print();
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
			System.out.println("New Array: ");
			print();
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
			System.out.println("New Array: ");
			print();
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
			System.out.println("New Array: ");
			print();
			size--;
		}
	}
	
	//grow array method
	void grow() {
		int[] temp = arr;
		arr = new int[capacity*2];
		capacity *= 2;
		for(int i=0; i<size; i++) {
			arr[i] = temp[i];
		}
		System.out.println("New Array: ");
		print();
	}
	
	//search array method
	void search(int ele) {
		boolean flag = false;
		for(int i : arr) {
			if(i == ele) {
				System.out.println("Element " + ele + " found at index " + i);
				flag=true;
				break;
			}
		}
		if(flag == false) {
			System.out.println("Element not found");
		}
	}
	
	//array sort method
	void sort() {
		for(int i=0; i<size-1; i++) {
			for(int j=0; j<size-1-i; j++) {
				if(arr[j] > arr[j+1]) {
					int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
			}
		}
		System.out.println("Sorted Array: ");
		print();
	}
	
	//print array
	void print() {
		System.out.println(Arrays.toString(arr));
	}

	public static void main(String[] args) {
		
		ArrayOps ob = new ArrayOps(10);
		
		ob.insert(1);
		ob.insert(22);
		ob.insert(3);
		ob.insert(77);
		ob.insert(55);
		
		ob.insertAtIndex(99, 5);
		ob.insertAtIndex(99, 2);
		
		ob.delete();
		
		ob.deleteFromIndex(5);
		ob.deleteFromIndex(0);
		
		ob.search(22);
		ob.search(666);
		
		ob.sort();
		
		ob.print();
		
		ob.grow();

	}

}
