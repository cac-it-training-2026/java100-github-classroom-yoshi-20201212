/**
 * 第1章 マカロン屋さんのお仕事
 *
 * 問題7 10分割して販売する
 *
 * マカロンが大きすぎて売上が芳しくないので
 * 1個のマカロンを10分割して0.1個から販売することにします。
 * (値段も0.1倍～)
 * ただし合計金額と在庫は小数を切り捨て、
 * 常に整数で表示します。
 *
 * 問題6の答えを改変し、以下の実行例を参考に処理を記述してください。
 *
 * <実行例>
 *
 * ～～～～～～～～～省略～～～～～～～～～～～
 *
 * それぞれ何個ずつ買いますか？（最大30個まで）
 *
 * シトロン      >5
 * ショコラ      >1.5
 * ピスターシュ  >2.5
 *
 * シトロン     5.0個
 * ショコラ     1.5個
 * ピスターシュ 2.5個
 *
 * 合計個数    9.0個
 * 合計金額   2470円
 *
 * をお買いあげですね。
 * 承りました。
 *
 * 本日のおすすめ商品です。
 *
 * シトロン      \250 ・・・ 残り25個
 * ショコラ      \280 ・・・ 残り28個
 * ピスターシュ  \320 ・・・ 残り27個
 *
 */

package jp.co.sss.java100_questions_cac.lesson01.challenge07;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Patisserie {

	public static void main(String[] args) throws IOException {

		//		それぞれの変数の宣言と代入
		double dnum1 = 30;
		double dnum2 = 30;
		double dnum3 = 30;
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

		System.out.println("たいへんお待たせしました。");
		System.out.println("【ポエール・ネルメ】");
		System.out.println("ただいまより開店です！！");

		System.out.println("本日のおすすめ商品です。\n\nシトロン\t\t\\250・・・残り" + dnum1 + "個\nショコラ\t\t\\280・・・残り" + dnum2
				+ "個\nピスターシュ\t\\320・・・残り" + dnum3 + "個");
		System.out.println("それぞれ何個ずつ買いますか？（最大30個まで）");

		//		各購入数を入力、文字列型から浮動小数点数型に変換
		System.out.print("シトロン　　　＞");
		String str1 = reader.readLine();
		double dnum4 = Double.parseDouble(str1);

		System.out.print("ショコラ　　　＞");
		String str2 = reader.readLine();
		double dnum5 = Double.parseDouble(str2);

		System.out.print("ピスターシュ　＞");
		String str3 = reader.readLine();
		double dnum6 = Double.parseDouble(str3);

		//		数値型に変換し、合計個数と合計金額を計算
		int inum7 = (int) (dnum4 + dnum5 + dnum6);
		int inum8 = (int) (dnum4 * 250 + dnum5 * 280 + dnum6 * 320);

		//		購入数と合計個数、合計金額を表示
		System.out.println(
				"\nシトロン\t\t" + dnum4 + "個\nショコラ\t\t" + dnum5 + "個\nピスターシュ\t" + dnum6 + "個");
		System.out.println("\n合計個数\t\t" + inum7 + "個\n合計金額\t" + inum8 + "円");
		System.out.println("\nをお買い上げですね。\n承りました。");

		//		購入された数を在庫から引く
		dnum1 = dnum1 - dnum4;
		dnum2 = dnum2 - dnum5;
		dnum3 = dnum3 - dnum6;

		System.out.println("\n本日のおすすめ商品です。");
		System.out.println(
				"\nシトロン\t\t\\250・・・残り" + dnum1 + "個\nショコラ\t\t\\280・・・残り" + dnum2 + "個\nピスターシュ\t\\320・・・残り" + dnum3
						+ "個");
	}

}