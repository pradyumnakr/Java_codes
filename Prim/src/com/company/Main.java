package com.company;
import java.util.*;
public class Main {

    public static void main(String[] args) {
	// write your code here
        int n,i,j,u=0,v=0,a=0,b=0,mincost=0,min=0,source;
        int ne=1;
        int cost[][]=new int[20][20];
        int visited[]=new int[20];
        Scanner in=new Scanner(System.in);
        System.out.println("Enter the number of nodes\n");
        n=in.nextInt();
        System.out.println("Enter the cost matrix\n");
        for (i=1;i<=n;i++){
            for(j=1;j<=n;j++){
                cost[i][j]=in.nextInt();
            }
        }
        for(i=1;i<=n;i++)
            visited[i]=0;
        System.out.println("Enter the root node\n");
        source=in.nextInt();
        visited[source]=1;
        System.out.println("Minimum cost spanning tree is\n");
        while(ne<n)
        {
            min=999;
            for(i=1;i<=n;i++){
                for(j=1;j<=n;j++){
                    if(cost[i][j]<min){
                        if(visited[i]==0)
                            continue;
                        else{
                            min=cost[i][j];
                            a=u=i;
                            b=v=j;
                        }
                    }
                }
            }
            if(visited[u]==0||visited[v]==0)
            {
                ne++;
                mincost+=min;
                System.out.println("\nEdge "+ne+"\t"+a+"-->"+b+" = "+min+"\n");
                visited[b]=1;
            }
            cost[a][b]=cost[b][a]=999;

        }
        System.out.println("Minimumcost is = "+mincost+"\n");
    }
}
