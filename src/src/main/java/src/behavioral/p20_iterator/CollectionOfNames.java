package src.behavioral.p20_iterator;

public class CollectionOfNames implements Container {
    private String names[] = {"Petr", "Martin", "Adam", "David", "Lucie"};

    @Override
    public Iterator getIterator() {
        return new CollectionOfNamesIterator();
    }

    private class CollectionOfNamesIterator implements Iterator {
        int i;

        @Override
        public boolean hasNext() {
            if (i < names.length) {
                return true;
            }
            return false;
        }

        @Override
        public Object next() {
            if (this.hasNext()) {
                return names[i++];
            }
            return null;
        }
    }

    @Override
    public Iterator getReverseIterator() {
        return new CollectionOfNamesReverseIterator();
    }

    private class CollectionOfNamesReverseIterator implements Iterator {
        int i = names.length - 1;

        @Override
        public boolean hasNext() {
            if (i >= 0) {
                return true;
            }
            return false;
        }

        @Override
        public Object next() {
            if (this.hasNext()) {
                return names[i--];
            }
            return null;
        }
    }
}
