/**
 * 第1章 マカロン屋さんのお仕事
 *
 * 問題4 注文を受ける
 *
 * 3種類のマカロンを任意の個数購入できるようにします。
 * [問題3]までの表示を行った後で
 * 実行例を参考に処理を追記してください。
 * （ >8 は >を表示した後で入力待ち状態になり、
 *   ユーザーがキーボードから8を入力したイメージです。）
 *
 *
 * <実行例>
 *
 * それぞれ何個ずつ買いますか？（最大30個まで）
 *
 * シトロン      >8
 * ショコラ      >2
 * ピスターシュ  >6
 *
 * シトロン     8個
 * ショコラ     2個
 * ピスターシュ 6個
 *
 * をお買いあげですね。
 * 承りました。
 */

package jp.co.sss.java100_questions_cac.lesson01.challenge04;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Patisserie {

	public static void main(String[] args) throws IOException {

		//		それぞれの変数の宣言と代入
		int num1 = 30;
		int num2 = 30;
		int num3 = 30;
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

		System.out.println("たいへんお待たせしました。");
		System.out.println("【ポエール・ネルメ】");
		System.out.println("ただいまより開店です！！");

		System.out.println("本日のおすすめ商品です。\n\nシトロン\t\t\\250・・・残り" + num1 + "個\nショコラ\t\t\\280・・・残り" + num2
				+ "個\nピスターシュ\t\\320・・・残り" + num3 + "個");
		System.out.println("\nそれぞれ何個ずつ買いますか？（最大30個まで）");

		//		各購入数を入力、文字列型から数値型に変換
		System.out.print("\nシトロン　　　＞");
		String str1 = reader.readLine();
		int num4 = Integer.parseInt(str1);

		System.out.print("ショコラ　　　＞");
		String str2 = reader.readLine();
		int num5 = Integer.parseInt(str2);

		System.out.print("ピスターシュ　＞");
		String str3 = reader.readLine();
		int num6 = Integer.parseInt(str3);

		//		購入数表示
		System.out.println(
				"\nシトロン\t\t" + num4 + "個\nショコラ\t\t" + num5 + "個\nピスターシュ\t" + num6 + "個");

		System.out.println("\nをお買い上げですね。\n承りました。");
	}

}
