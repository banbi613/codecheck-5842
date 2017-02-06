package codecheck;

public class App {
	public static void main(String[] args) {
		for (int i = 0, l = args.length; i < l; i++) {
			// 入力を空白で分割
			String[] strs = args[i].split(" ");
			for(String str: strs) {
				System.out.println(baka(str));
			}
		}
	}

	static String baka(String str) {
		boolean mult = false; // 3の倍数
		boolean three = false; // 3のつく数

		try {
			// 入力文字列を数値に変換
			int num = Integer.parseInt(str);

			// 3の倍数 判定
			if ((num % 3) == 0)
				mult = true;

			// 3のつく数 判定
			String[] strs = str.split("");
			for (String n : strs) {
				if (n.equals("3")) {
					three = true;
					break;
				}
			}

			// 3の倍数かつ3のつく数
			if(mult && three)
				return "dumb";
			// 3の倍数
			else if (mult)
				return "idiot";
			// 3のつく数
			else if (three)
				return "stupid";
			// その他
			else
				return "smart";
			
		} catch (NumberFormatException nfex) {
			// 数値以外の値の入力
			return "invalid";
		}
	}
}
