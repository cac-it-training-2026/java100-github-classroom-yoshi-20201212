/**
 * 第1章 マカロン屋さんのお仕事
 *
 * 問題6  在庫を減らす
 *
 * [問題5]までの表示を行った後で
 * 3種のマカロンそれぞれの在庫を減らす処理を追記し
 * 以下の実行例と同じものを最後に表示してください。
 *
 * <実行例>
 *
 * ～～～～～～～～～省略～～～～～～～～～～～
 *
 * 本日のおすすめ商品です。
 *
 * シトロン      \250 ・・・ 残り22個
 * ショコラ      \280 ・・・ 残り28個
 * ピスターシュ  \320 ・・・ 残り24個
 *
 */

package jp.co.sss.java100_questions_cac.lesson01.challenge06;

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
		System.out.println("それぞれ何個ずつ買いますか？（最大30個まで）");

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

		//		購入された数を在庫から引く
		num1 = num1 - num4;
		num2 = num2 - num5;
		num3 = num3 - num6;

		System.out.println("\n本日のおすすめ商品です。");
		System.out.println(
				"\nシトロン\t\t\\250・・・残り" + num1 + "個\nショコラ\t\t\\280・・・残り" + num2 + "個\nピスターシュ\t\\320・・・残り" + num3 + "個");

	}

}
