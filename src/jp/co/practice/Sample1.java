package jp.co.practice;

public class Sample1 {
	public static void main(String[] args){
		try{
			int[] test;
			test = new int[5];
			
			System.out.println("test[10]に値を代入します。");
			test[10] = 2;
			System.out.println("test[10]に2を代入しました。");
		}
		catch(ArrayIndexOutOfBoundsException e){
			System.out.println("配列の要素を超えています");
		}
		System.out.println("無事終了しました");
	}

}
