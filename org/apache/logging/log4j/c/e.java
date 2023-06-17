/*
 * Decompiled with CFR 0.150.
 */
package org.apache.logging.log4j.c;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import org.apache.logging.log4j.c.h;
import org.apache.logging.log4j.c.k;
import org.apache.logging.log4j.j;

public class e
implements k {
    private static final long a = 5050501L;
    private static ThreadLocal b = new ThreadLocal();
    private final boolean c;

    public e(boolean bl2) {
        this.c = bl2;
    }

    @Override
    public String a() {
        if (!this.c) {
            return "";
        }
        List list = (List)b.get();
        if (list == null || list.size() == 0) {
            throw new NoSuchElementException("The ThreadContext stack is empty");
        }
        ArrayList arrayList = new ArrayList(list);
        int n2 = arrayList.size() - 1;
        String string = (String)arrayList.remove(n2);
        b.set(Collections.unmodifiableList(arrayList));
        return string;
    }

    @Override
    public String b() {
        List list = (List)b.get();
        if (list == null || list.size() == 0) {
            return null;
        }
        int n2 = list.size() - 1;
        return (String)list.get(n2);
    }

    @Override
    public void a(String string) {
        if (!this.c) {
            return;
        }
        this.b(string);
    }

    @Override
    public int c() {
        List list = (List)b.get();
        return list == null ? 0 : list.size();
    }

    @Override
    public List d() {
        List list = (List)b.get();
        if (list == null) {
            return Collections.emptyList();
        }
        return list;
    }

    @Override
    public void a(int n2) {
        if (n2 < 0) {
            throw new IllegalArgumentException("Maximum stack depth cannot be negative");
        }
        List list = (List)b.get();
        if (list == null) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        int n3 = Math.min(n2, list.size());
        for (int i2 = 0; i2 < n3; ++i2) {
            arrayList.add(list.get(i2));
        }
        b.set(arrayList);
    }

    public k f() {
        List list = null;
        if (!this.c || (list = (List)b.get()) == null) {
            return new h(new ArrayList());
        }
        return new h(list);
    }

    @Override
    public void clear() {
        b.remove();
    }

    @Override
    public int size() {
        List list = (List)b.get();
        return list == null ? 0 : list.size();
    }

    @Override
    public boolean isEmpty() {
        List list = (List)b.get();
        return list == null || list.isEmpty();
    }

    @Override
    public boolean contains(Object object) {
        List list = (List)b.get();
        return list != null && list.contains(object);
    }

    @Override
    public Iterator iterator() {
        List list = (List)b.get();
        if (list == null) {
            List list2 = Collections.emptyList();
            return list2.iterator();
        }
        return list.iterator();
    }

    @Override
    public Object[] toArray() {
        List list = (List)b.get();
        if (list == null) {
            return new String[0];
        }
        return list.toArray(new Object[list.size()]);
    }

    public Object[] toArray(Object[] arrobject) {
        List list = (List)b.get();
        if (list == null) {
            if (arrobject.length > 0) {
                arrobject[0] = null;
            }
            return arrobject;
        }
        return list.toArray(arrobject);
    }

    public boolean b(String string) {
        if (!this.c) {
            return false;
        }
        List list = (List)b.get();
        ArrayList<String> arrayList = list == null ? new ArrayList<String>() : new ArrayList(list);
        arrayList.add(string);
        b.set(Collections.unmodifiableList(arrayList));
        return true;
    }

    @Override
    public boolean remove(Object object) {
        if (!this.c) {
            return false;
        }
        List list = (List)b.get();
        if (list == null || list.size() == 0) {
            return false;
        }
        ArrayList arrayList = new ArrayList(list);
        boolean bl2 = arrayList.remove(object);
        b.set(Collections.unmodifiableList(arrayList));
        return bl2;
    }

    public boolean containsAll(Collection collection) {
        if (collection.isEmpty()) {
            return true;
        }
        List list = (List)b.get();
        return list != null && list.containsAll(collection);
    }

    public boolean addAll(Collection collection) {
        if (!this.c || collection.isEmpty()) {
            return false;
        }
        List list = (List)b.get();
        ArrayList arrayList = list == null ? new ArrayList() : new ArrayList(list);
        arrayList.addAll(collection);
        b.set(Collections.unmodifiableList(arrayList));
        return true;
    }

    public boolean removeAll(Collection collection) {
        if (!this.c || collection.isEmpty()) {
            return false;
        }
        List list = (List)b.get();
        if (list == null || list.isEmpty()) {
            return false;
        }
        ArrayList arrayList = new ArrayList(list);
        boolean bl2 = arrayList.removeAll(collection);
        b.set(Collections.unmodifiableList(arrayList));
        return bl2;
    }

    public boolean retainAll(Collection collection) {
        if (!this.c || collection.isEmpty()) {
            return false;
        }
        List list = (List)b.get();
        if (list == null || list.isEmpty()) {
            return false;
        }
        ArrayList arrayList = new ArrayList(list);
        boolean bl2 = arrayList.retainAll(collection);
        b.set(Collections.unmodifiableList(arrayList));
        return bl2;
    }

    public String toString() {
        List list = (List)b.get();
        return list == null ? "[]" : list.toString();
    }

    @Override
    public /* synthetic */ j e() {
        return this.f();
    }

    public /* synthetic */ boolean add(Object object) {
        return this.b((String)object);
    }
}

