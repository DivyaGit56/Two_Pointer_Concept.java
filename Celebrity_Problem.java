class Solution {
    public int celebrity(int mat[][]) {
        // code here
        int n = mat.length;
        
        
        int top = 0;
        int down = n-1;
        
        while(top <down){
            if(mat[top][down] == 1){
                top++; // top know down ,that  means top can not be celebrity
            }else{
                down--;
            }
        }
            
    
             int candidate = top;
      // verify
            for(int i = 0; i<n; i++){
                if(i == candidate) continue;
                
                if((mat[candidate][i] == 1)||(mat[i][candidate] == 0)){
                return -1;
                
                    
                }
            }
            return candidate;
        }
    }
    
