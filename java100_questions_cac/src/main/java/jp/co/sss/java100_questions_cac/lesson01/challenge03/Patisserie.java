/**
 * 第1章 マカロン屋さんのお仕事
 *
 * 問題3 マカロンを作る
 *
 * シトロン、ショコラ、ピスターシュを30個ずつ作成します。
 * シトロン、ショコラ、ピスターシュの個数を格納する変数を
 * 宣言し、それぞれに30を代入してください。
 * [問題2]の表示を以下の実行例のように改変します。
 * （表示する個数はそれぞれの変数の値とします。）
 *
 * <実行例>
 *
 * 本日のおすすめ商品です。
 *
 * シトロン      \250 ・・・ 残り30個
 * ショコラ      \280 ・・・ 残り30個
 * ピスターシュ  \320 ・・・ 残り30個
 *
 */

package jp.co.sss.java100_questions_cac.lesson01.challenge03;

public class Patisserie {

	public static void main(String[] args) {

		//		変数を作成し、在庫数を代入
		int num1 = 30;
		int num2 = 30;
		int num3 = 30;
		System.out.println("たいへんお待たせしました。");
		System.out.println("【ポエール・ネルメ】");
		System.out.println("ただいまより開店です！！");

		System.out.println("本日のおすすめ商品です。\n\nシトロン\t\t\\250・・・残り" + num1 + "個\nショコラ\t\t\\280・・・残り" + num2
				+ "個\nピスターシュ\t\\320・・・残り" + num3 + "個");

	}
}