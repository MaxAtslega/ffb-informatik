package de.atslega.arztpraxis.liste;

public class List implements ListInterface {

    private ListElement anchor;
    private ListElement current;

    @Override
    public boolean isEmpty() {
        return anchor == null;
    }

    @Override
    public boolean hasAccess() {
        return current != null;
    }

    @Override
    public void next() {
        if (hasAccess()) {
            current = current.getNext();
        }
    }

    @Override
    public void back() {
        if (hasAccess()) {
            current = current.getBefore();
        }
    }

    @Override
    public void toFirst() {
        current = anchor;
    }

    @Override
    public void toLast() {
        if (!isEmpty()) {
            current = anchor;
            while (current.getNext() != null) {
                current = current.getNext();
            }
        }
    }

    @Override
    public Object getObject() {
        if (hasAccess()) {
            return current.getContent();
        }
        return null;
    }

    @Override
    public void setObject(Object pObject) {
        if (hasAccess()) {
            current.setContent(pObject);
        }
    }

    @Override
    public void append(Object pObject) {
        ListElement newElement = new ListElement(pObject, null, current);

        if (isEmpty()) {
            anchor = newElement;
            current = newElement;
        } else {
            toLast();
            current.setNext(newElement);
            current = newElement;
        }
    }

    @Override
    public void insert(Object pObject) {
        if (hasAccess()) {
            ListElement newElement = new ListElement(pObject, current, current.getBefore());
            ListElement previousElement = current.getBefore();

            if (previousElement != null) {
                previousElement.setNext(newElement);
            } else {
                anchor = newElement;
            }

            current.setBefore(newElement);
            current = newElement;
        }
    }

    @Override
    public void concat(List pList) {
        if (pList != null && !pList.isEmpty()) {
            if (isEmpty()) {
                anchor = pList.anchor;
                current = pList.current;
            } else {
                toLast();
                current.setNext(pList.anchor);
                pList.anchor.setBefore(current);
                current = pList.current;
            }
            pList.anchor = null;
            pList.current = null;
        }
    }

    @Override
    public void remove() {
        if (hasAccess()) {
            ListElement previousElement = current.getBefore();
            ListElement nextElement = current.getNext();

            if (previousElement != null) {
                previousElement.setNext(nextElement);
            } else {
                anchor = nextElement;
            }

            if (nextElement != null) {
                nextElement.setBefore(previousElement);
                current = nextElement;
            } else {
                current = previousElement;
            }
        }
    }

    @Override
    public String display() {
        StringBuilder result = new StringBuilder();
        ListElement currentElement = anchor;

        while (currentElement != null) {
            result.append(currentElement.getContent().toString()).append(" ");
            currentElement = currentElement.getNext();
        }

        return result.toString().trim();
    }
}
