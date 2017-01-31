package codecheck;

public class App {
	public static void main(String[] args) {
		for (int i = 0, l = args.length; i < l; i++) {
			System.out.println(baka(args[i]));
		}
	}

    String baka(String str) {
      boolean multiple = false;
      boolean three = false;

      try {
        int num = Integer.parseInt(str);
        if ((num % 3) == 0)
          multiple = true;
        
        String[] strs = str.split("");
        for(String x: strs) {
          if(x.equals("3")) {
            three = true;
            break;
          }
        }
        
        if(multiple = true) {
          if(three = true)
            return "dumb";
          else
            return "idiot";
        }
        else if(three = true)
          return "stupid";
        else
          return "smart";
      } catch(NumberFormatException nfex) {
        return "invalid";
      }
    }
}