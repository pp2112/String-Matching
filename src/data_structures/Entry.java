package data_structures;

class Entry {
    private String key;
    private int value;
    private Entry next;

    Entry(String k, int v) {
        key = k;
        value = v;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public String getKey() {
        return key;
    }
    
    public void setNext(Entry next){
    	this.next = next;
    }
    
    public Entry getNext(){
    	return next;
    }
}