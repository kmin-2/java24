package min;

public class Point<T, V> {
	T x;  //int x; �̷���ó�� �Ȱ�����
	V y;
	Point(T x, V y){
		this.x=x; this.y=y;}
	public T getX() {
		return x;}
	public V gety() {
		return y;}
}
