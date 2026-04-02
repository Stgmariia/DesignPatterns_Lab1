package behavioral;

interface Iterator {
    boolean hasNext();
    Object next();
}

interface Container {
    Iterator getIterator();
}

class NameRepository implements Container {
    public String[] names = {"Роберт", "Джон", "Юлія", "Лора"};

    @Override
    public Iterator getIterator() {
        return new NameIterator();
    }

    private class NameIterator implements Iterator {
        int index;

        @Override
        public boolean hasNext() {
            return index < names.length;
        }

        @Override
        public Object next() {
            if (this.hasNext()) {
                return names[index++];
            }
            return null;
        }
    }
}

public class IteratorPattern {
    public static void show() {
        NameRepository namesRepository = new NameRepository();

        System.out.println("--- Демонстрація патерна Ітератор ---");
        for (Iterator iter = namesRepository.getIterator(); iter.hasNext(); ) {
            String name = (String) iter.next();
            System.out.println("Ім'я: " + name);
        }
    }
}