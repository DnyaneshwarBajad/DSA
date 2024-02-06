class sybit016{
    boolean confirm(String sample){
        String name = "";
        for(int i = 4;i<=6;i++){
            name = name + sample.charAt(i);
        }
        if((name.equals("bcs")) || (name.equals("bit")) || (name.equals("bme"))){
            return true;
        }
        else{
            return false;
        }
    }
    int getvalid(String arr[]){
        int count = 0;
        for(int i = 0;i<arr.length;i++){
            if(confirm(arr[i])){
                count++;
            }
        }
        return count;
    }
    int getvalidRegistrationCountLE50(String sample){
      String name ="";
      for (int i=7;i<=9;i++){
      name =name+sample.charAt(i);
      }
      
      }
    
    }
    public static void main(String[] args) {
        String regnums[] = {"2022bcs022","2022bit041","2022bme001"};
         sybit016 obj = new sybit016();
        int ans = obj.getvalid(regnums);
        System.out.println(ans);
    }

    



