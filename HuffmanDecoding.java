 class Node{
      public  int frequency; 
       public  char data;
       public  Node left, right;
 
 void decode(String S ,Node root)
    {
        Node temp=root;
        String answer="";
        for(int i=0;i<S.length();i++){
        
            if(S.charAt(i)=='0')
                temp=temp.left;
            else
                temp=temp.right;
            if(temp.right==null && temp.left==null)
                {
                answer+=(temp.data);
                temp=root;
            }
        }
        System.out.println(answer);
       
    }
 }