package data_structures;

public class ExactHashMap {
	private int SIZE = 10000;
	private Entry table[] = new Entry[SIZE];

	public int get(String k) {
		int hash = getHash(k);
		Entry e = table[hash];
		while (e != null) {
			if (k.equals(e.getKey())) {
				return e.getValue();
			}
			e = e.getNext();
		}
		return -1;
	}

	public void put(String k, int v) {
		int hash = getHash(k);
		Entry e = table[hash];
		if (e != null) {
			if (e.getKey().equals(k)) {
				e.setValue(v);
			} else {
				while (e.getNext() != null) {
					e = e.getNext();
				}
				Entry entryInOldBucket = new Entry(k, v);
				e.setNext(entryInOldBucket);
			}
		} else {
			Entry entryInNewBucket = new Entry(k, v);
			table[hash] = entryInNewBucket;
		}
	}

	public boolean remove(String k) {
		int hash = getHash(k);
		Entry prev = null;
		Entry current = table[hash];

		if (k.equals(current.getKey())) {
			current = current.getNext();
			table[hash] = current;
			return true;
		}

		prev = current;

		while ((current = current.getNext()) != null) {
			if (k.equals(current.getKey())) {
				prev.setNext(current.getNext());
				System.out.println("GOT HERE !");
				return true;
			}
			prev = current;
		}
		return false;
	}

	protected int getHash(String input_string) {
		int res = 0;
		for (int i = 0; i < input_string.length(); i++) {
			res += i * input_string.charAt(i);
		}
		return res % SIZE;
	}
}
