package min;
/*class MyArray{
	private Object[] array=new Object[10];
	//�ε���0����(����)�� �ּҰ� >> ��ü��ü�� �ּ�
	int i;
	public void add(Object obj) {
		array[i++]=obj;
	}
	public Object get(int index) {
		return array[index];
	}}*/

class MyArray<E>{
	private Object[] array=new Object[10];
	//�ε���0����(����)�� �ּҰ� >> ��ü��ü�� �ּ�
	int i;
	public void add(E obj) {
		array[i++]=obj;
	}
	public E get(int index) {
		return (E) array[index];
	}}
public class MyArraryTest2 {
	public static void main(String[] args) {
		/*MyArray myarray1=new MyArray();
		myarray1.add(new String("test"));
		String str=(String) myarray1.get(0);
		System.out.println(str);
		
		MyArray myarray2=new MyArray();
		myarray2.add(new Integer(100));
		Integer num=(Integer)myarray2.get(0);
		System.out.println(num);*/
		
		MyArray<String>myarray1=new MyArray<String>();
		myarray1.add(new String("test"));
		String str=(String) myarray1.get(0);
		System.out.println(str);
		
		
		MyArray<Integer>myarray2=new MyArray<Integer>();
		myarray2.add(new Integer(100));
		Integer num=(Integer)myarray2.get(0);
		System.out.println(num);
		
	}
	
}
