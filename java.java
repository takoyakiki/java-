import java.util.*;
import java.io.*;
import java.time.*;

class Main{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("不明な点がある場合、「help」と入力してください");
        int parse = 0;
        while (true){
            parse = 0;
        System.out.printf("youinput:>");
        String inputs = br.readLine();
        boolean w = inputs.matches("\\d+");
        if(inputs.equals("exit")){
            System.out.printf("終了\n");
            break;

        }else if(inputs.equals("help")){
            System.out.printf("exit:終了\n");
            System.out.println("ここでは数字を入力し、その数字に対応して文字が出力されます");
            continue;
        }
        if(w == true){
            parse = Integer.parseInt(inputs);
        }
        else{
            System.out.printf("有効な数字を入力してください\n");
            continue;
        }
        if (parse == 1){
        System.out.println("Hello world!");
        }
        else if(parse == 2){
            System.out.println("入力:2");
        }else{
            System.out.printf("入力:%s\n",parse);
        }
    }
    }
}
