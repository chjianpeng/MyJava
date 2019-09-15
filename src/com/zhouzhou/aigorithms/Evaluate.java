package com.zhouzhou.aigorithms;

import java.util.Stack;

/**
 * Dijkstra的双栈算术表达式求值算法
 * ( 1 + ( ( 2 + 3 ) * ( 4 * 5 ) ) )
 */
public class Evaluate {
    public static void main(String[] args) {
        Stack<String> ops = new Stack<>();
        Stack<Double> vals = new Stack<>();
        String string = "( 1 + ( ( 2 + 3 ) * ( 4 * 5 ) ) )";
        String[] split = string.split(" ");
        for (int i=0; i < split.length; i++){
            String s = split[i];
            if (s.equals("(")){

            }else if (s.equals("+")){
                ops.push(s);
            }else if (s.equals("-")){
                ops.push(s);
            }else if (s.equals("*")){
                ops.push(s);
            }else if (s.equals("/")){
                ops.push(s);
            }else if (s.equals("sqrt")){
                ops.push(s);
            }else if (s.equals(")")){
                String op = ops.pop();
                double v = vals.pop();
                if (op.equals("+")){
                    v = vals.pop() + v;
                }else if (op.equals("-")){
                    v = vals.pop() - v;
                }else if (op.equals("*")){
                    v = vals.pop() * v;
                }else if (op.equals("/")){
                    v = vals.pop() / v;
                }else if (op.equals("sqrt")){
                    v = Math.sqrt(v);
                }
                vals.push(v);
            }else {
                vals.push(Double.parseDouble(s));
            }
        }
        System.out.println(vals.pop());

    }
}
