package min;

public class Point<T, V> {
	T x;  //int x; 이런것처럼 똑같은거
	V y;
	Point(T x, V y){
		this.x=x; this.y=y;}
	public T getX() {
		return x;}
	public V gety() {
		return y;}
}
