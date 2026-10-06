import java.util.*;
class Graph{
    public static void main(String args[]){
        int visited[]=new int[5];
        ArrayList<List<Integer>> list=new ArrayList<>();
        list.add(new ArrayList<>());
        list.add(new ArrayList<>());
        list.add(new ArrayList<>());
        list.add(new ArrayList<>());
        list.add(new ArrayList<>());
        list.get(1).add(2);
        list.get(1).add(3);
        list.get(2).add(1);
        list.get(2).add(4);
        list.get(3).add(1);
        list.get(3).add(4);
        list.get(4).add(2);
        list.get(4).add(3);
        dfs(visited,list,1);

    }
    static void dfs(int[] visited,ArrayList<List<Integer>> list, int start){
        if(visited[start]!=1){
            System.out.println(start);
            visited[start]=1;
            for(Integer ele:list.get(start)){
                if(visited[ele]!=1)
                    dfs(visited,list,ele);
            }
        }
    }
}