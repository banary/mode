package com.circle.base.algorithm;

/**
 * 递归回溯，八皇后问题
 *
 * 1. 初始化
 * 2. 递归摆放皇后
 * 3. 输出结果
 */
public class EightQueen {

    public static void main(String[] args) {
        EightQueen eightQueen = new EightQueen();
        eightQueen.settleQueen(0);
        eightQueen.printChessBoard();
    }

    public static final int MAX_NUM=9;

    /**
     * 维度一表示横坐标；维度二表示纵坐标
     */
    public static final int[][] chessBoard = new int[MAX_NUM][MAX_NUM];

    /**
     * 检查落点是否符合规则
     * @param x
     * @param y
     * @return
     */
    public boolean check(int x, int y){
        for(int i=0;i<y;i++){
            //检查纵向
            if(chessBoard[x][i]==1){
                return false;
            }

            //检查左侧斜向
            if(x-1-i>=0 && chessBoard[x-1-i][y-1-i] == 1){
                return false;
            }

            //检查左侧斜向
            if(x+1+i<MAX_NUM && chessBoard[x+1+i][y-1-i] == 1){
                return false;
            }
        }
        return true;
    }

    boolean settleQueen(int y){
        if(y >= MAX_NUM){
            return true;
        }

        //遍历当前行，逐一格子验证
        for(int i=0; i<MAX_NUM; i++){
            //为当前行清零，以免在回溯的时候出现脏数据
            for(int x=0; x<MAX_NUM; x++){
                chessBoard[x][y]=0;
            }
            //检查是否符合规则，如果符合更改元素值并进一步递归
            if(check(i,y)){
                chessBoard[i][y]=1;
                if(settleQueen(y+1)){
                    return true;
                }
            }
        }
        return false;
    }

    public void printChessBoard(){
        for(int i=0; i<MAX_NUM; i++){
            StringBuilder sb = new StringBuilder();
            for(int j=0; j<MAX_NUM; j++){
                sb.append("  ");
                sb.append(chessBoard[j][i]);
            }
            sb.append("\r");
            System.out.println(sb.toString());
        }

    }

}
