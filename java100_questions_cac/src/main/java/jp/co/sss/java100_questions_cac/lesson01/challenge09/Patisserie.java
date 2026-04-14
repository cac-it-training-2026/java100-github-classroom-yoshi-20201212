/**
 * 第1章 マカロン屋さんのお仕事
 *
 * 問題9 新商品の開発
 *
 * 翌日から新商品を発売することにしました。
 * 新商品の名前は「三色マカロン」です。
 * シトロン、ショコラ、ピスターシュの３つの味が
 * 1個のマカロンに集約されているのが特徴で、
 * その配合率は前日の売上比で決まり、
 * 価格はマカロン１個あたりの平均売上価格に準じて
 * 自動的に決定されます。（ただし、1の位は切り捨て）
 *
 * 以下の実行例を参考に処理を追記、改変してください。
 *
 * <実行例>
 *
 * ～～～～～～～～～省略～～～～～～～～～～～
 *
 * 閉店時間となりました。
 * またのお越しをお待ちしております。
 *
 * 売上の割合
 * 売上合計      \2470
 *
 * 内訳
 * シトロン      \1250・・・ 50%
 * ショコラ      \420・・・ 17%
 * ピスターシュ  \800・・・ 32%
 *
 * 明日の三色マカロンの配合率が決まりました！
 *
 * シトロンの味    ・・・ 50%
 * ショコラの味    ・・・ 17%
 * ピスターシュの味・・・ 32%
 *
 * が楽しめます！
 *
 * 値段は\270です。
 *
 */

package jp.co.sss.java100_questions_cac.lesson01.challenge09;

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

		System.out.println("\n閉店時間となりました。\nまたのお越しをお待ちしております。");

		//		30から現在の在庫を引き、売り上げの合計金額を求める変数を作成
		double dnum11 = 30 - dnum1; //シトロンの売り上げ個数 
		double dnum12 = 30 - dnum2; //ショコラの売り上げ個数
		double dnum13 = 30 - dnum3; //ピスターシュの売り上げ個数
		double dnum14 = 250 * dnum11; //シトロンの売上高
		double dnum15 = 280 * dnum12; //ショコラの売上高
		double dnum16 = 320 * dnum13; //ピスターシュの売上高
		int inum17 = (int) (dnum14 + dnum15 + dnum16);//全体の売上高
		System.out.println("\n\n売上の割合 \n売上合計 \t\t \\" + inum17);

		int inum18 = (int) (dnum14 / inum17 * 100); //シトロンの売り上げ割合
		int inum19 = (int) (dnum15 / inum17 * 100); //ショコラの売り上げ割合
		int inum20 = (int) (dnum16 / inum17 * 100); //ピスターシュの売り上げ割合

		System.out.println("\n内訳 \nシトロン \t\t \\" + (int) dnum14 + "円・・・" + inum18 + "%");
		System.out.println("ショコラ \t\t \\" + (int) dnum15 + "円・・・" + inum19 + "%");
		System.out.println("ピスターシュ \t \\" + (int) dnum16 + "円・・・" + inum20 + "%");

		System.out.println("\n明日の三色マカロンの配合率が決まりました！ \n\nシトロンの味 \t\t ・・・" + inum18 + "% \nショコラの味 \t\t ・・・" + inum19
				+ "% \nピスターシュの味\t・・・" + inum20 + "% \n\nが楽しめます！");

		int inum21 = (inum18 * 250 + inum19 * 280 + inum20 * 320) / 100;
		System.out.println("\n値段は\\" + inum21 + "です。");
	}

}
