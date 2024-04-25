public class a25_linearSearch {

    public static int linearSearch(int num[],int key){
        for(int i=0;i<num.length;i++){
            if(num[i]==key){
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args){
        int num[]={2,4,6,8,10,12,14};
        int key=10;
        
        int index=linearSearch(num, key);
        if(index == -1){
            System.out.println("Not found");
        }
        else{
            System.out.println(index);
        }
       // System.out.println("Key is at index :"+linearSearch(num, key));
    }
}
// TC : O(n)