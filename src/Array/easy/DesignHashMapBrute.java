class MyHashMap {
    int[][]set;
    int index;

    public MyHashMap() {
        set=new int[15000][2];
        index=0;
    }

    public void put(int key, int value) {

        for(int i=0;i<index;i++){
            if(set[i][0]==key){
                set[i][1]=value;
                return;

            }
        }

        set[index][0]=key;
        set[index][1]=value;
        index++;

    }

    public int get(int key) {
        for(int i=0;i<index;i++){
            if(set[i][0]==key){
                return set[i][1];
            }
        }
        return -1;

    }

    public void remove(int key) {
        for(int i=0;i<index;i++){
            if(set[i][0]==key){
                set[i][0]=-1;
                set[i][1]=-1;
            }
        }
    }

}

/**
 * Your MyHashMap object will be instantiated and called as such:
 * MyHashMap obj = new MyHashMap();
 * obj.put(key,value);
 * int param_2 = obj.get(key);
 * obj.remove(key);
 */