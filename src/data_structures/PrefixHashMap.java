package data_structures;

public class PrefixHashMap {

	private int SIZE = 10000;
	private Entry table[] = new Entry[SIZE];

	public int get(String k) {
		// Uses a different hash function compared to ExactHashMap;
		int hash = get_prefix_hash(k);
		Entry e = table[hash];
		while (e != null) {
			if (isPrefix(k, e.getKey())) {
				return e.getValue();
			}
			e = e.getNext();
		}
		return -1;
	}

	public void put(String k, int v) {
		// Uses a different hash function compared to ExactHashMap;
		int hash = get_prefix_hash(k);
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
		// Uses a different hash function compared to ExactHashMap;
		int hash = get_prefix_hash(k);
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

	private boolean isPrefix(String str, String prefix) {
		return str.startsWith(prefix);
	}

	private int get_prefix_hash(String input) {
		return input.charAt(0) % SIZE;
	}
}
