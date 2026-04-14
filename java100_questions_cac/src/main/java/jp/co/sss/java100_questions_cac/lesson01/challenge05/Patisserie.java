/**
 * 第1章 マカロン屋さんのお仕事
 *
 * 問題5 合計金額を求める
 *
 * 入力されたマカロンの個数から合計購入数、合計金額を求めます。
 * 合計購入数、合計金額を求める処理を追記した後で
 * [問題4]の表示を実行例を参考にして改変してください。
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
 * 合計個数    16個
 * 合計金額  4480円
 *
 * をお買いあげですね。
 * 承りました。
 *
 */

package jp.co.sss.java100_questions_cac.lesson01.challenge05;

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
		System.out.println("それぞれ何個ずつ買いますか？（最大30個まで）\n");

		//		各購入数を入力、文字列型から数値型に変換
		System.out.print("シトロン　　　＞");
		String str1 = reader.readLine();
		int num4 = Integer.parseInt(str1);

		System.out.print("ショコラ　　　＞");
		String str2 = reader.readLine();
		int num5 = Integer.parseInt(str2);

		System.out.print("ピスターシュ　＞");
		String str3 = reader.readLine();
		int num6 = Integer.parseInt(str3);

		//		合計個数と合計金額を計算
		int num7 = num4 + num5 + num6;
		int num8 = num4 * 250 + num5 * 280 + num6 * 320;

		//		購入数と合計個数、合計金額を表示
		System.out.println(
				"\nシトロン\t\t" + num4 + "個\nショコラ\t\t" + num5 + "個\nピスターシュ\t"
						+ num6
						+ "個");
		System.out.println("\n合計個数\t\t" + num7 + "個\n合計金額\t" + num8 + "円");
		System.out.println("\nをお買い上げですね。\n承りました。");

	}

}
