
import java.util.ArrayList;

public class MazePath {
    //count no. of paths
    public static int count(int row,int col){
        if(row==1 || col==1)
        return 1; 
        int left=count(row-1,col);
        int right=count(row,col-1);
        return left+right;
    }
    //path
    public static void path(String p,int row,int col){
        if(row==1 && col==1){
        System.out.print(p+" ");
        return;
        }
        if(row>1)
        path(p+'D',row-1,col);
        if(col>1)
        path(p+'R',row,col-1);
    }
    //path using arraylist
    public static ArrayList<String> pathList(String p,int row,int col){
        if(row==1 && col==1){
            ArrayList<String>list=new ArrayList<>();
            list.add(p);
            return list;
        }
        ArrayList<String>ans=new ArrayList<>();
        if(row>1)
        ans.addAll(pathList(p+'D', row-1, col));
        if(col>1)
        ans.addAll(pathList(p+'R',row, col-1));

        return ans;
    }
    //Diagonal path also allowed
    public static ArrayList<String>pathDiagonal(String p,int row,int col){
        //V-vertical , H-Horizontal D-Diagonal
        if(row==1 && col==1){
        ArrayList<String>list=new ArrayList<>();
        list.add(p);
        return list;
        }
        ArrayList<String>ans=new ArrayList<>();
        if(row>1 && col>1){
            ans.addAll(pathDiagonal(p+'D',row-1,col-1));
        }
        if(row>1){
            ans.addAll(pathDiagonal(p+'V',row-1,col));
        }
        if(col>1){
            ans.addAll(pathDiagonal(p+'H',row,col-1));
        }
        return ans;
    }
    //maze with obstacles
    public static void pathObstacles(String str,boolean[][]maze,int r,int c){
        if(r==maze.length-1 && c==maze[0].length-1){
            System.out.println(str);
            return;
        }
        if(!maze[r][c])
        return;

        if(r<maze.length-1){
            pathObstacles(str+'D', maze, r+1, c);
        }
        if(c<maze[0].length-1){
            pathObstacles(str+'R',maze,r,c+1);
        }

    }
    //including all paths
    public static void main(String[] args) {
        System.out.println(count(3, 3));
        path("",3,3);    
        System.out.println();
        System.out.println(pathList("", 3, 3));  
        System.out.println(pathDiagonal("",3,3));
        boolean[][]mazee={
            {true,true,true},
            {true,false,true},
            {true,true,true}
        };
        pathObstacles("",mazee,0,0);
    }
}
