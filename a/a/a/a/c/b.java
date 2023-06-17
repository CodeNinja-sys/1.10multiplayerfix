/*
 * Decompiled with CFR 0.150.
 */
package a.a.a.a.c;

import a.a.a.a.c.ad;
import a.a.a.a.c.ae;
import a.a.a.a.c.w;
import java.lang.reflect.Array;
import java.util.AbstractCollection;
import java.util.Collection;
import java.util.Iterator;

public abstract class b
extends AbstractCollection
implements w {
    protected b() {
    }

    @Override
    public Object[] toArray() {
        Object[] arrobject = new Object[this.size()];
        ae.a((Iterator)this.a(), arrobject);
        return arrobject;
    }

    @Override
    public Object[] toArray(Object[] arrobject) {
        int n2 = this.size();
        if (arrobject.length < n2) {
            arrobject = (Object[])Array.newInstance(arrobject.getClass().getComponentType(), n2);
        }
        ae.a((Iterator)this.a(), arrobject);
        if (n2 < arrobject.length) {
            arrobject[n2] = null;
        }
        return arrobject;
    }

    public boolean addAll(Collection collection) {
        boolean bl2 = false;
        Iterator iterator = collection.iterator();
        int n2 = collection.size();
        while (n2-- != 0) {
            if (!this.add(iterator.next())) continue;
            bl2 = true;
        }
        return bl2;
    }

    public boolean add(Object object) {
        throw new UnsupportedOperationException();
    }

    @Override
    public ad g() {
        return this.a();
    }

    @Override
    public abstract ad a();

    public boolean containsAll(Collection collection) {
        int n2 = collection.size();
        Iterator iterator = collection.iterator();
        while (n2-- != 0) {
            if (this.contains(iterator.next())) continue;
            return false;
        }
        return true;
    }

    public boolean retainAll(Collection collection) {
        boolean bl2 = false;
        int n2 = this.size();
        ad ad2 = this.a();
        while (n2-- != 0) {
            if (collection.contains(ad2.next())) continue;
            ad2.remove();
            bl2 = true;
        }
        return bl2;
    }

    public boolean removeAll(Collection collection) {
        boolean bl2 = false;
        int n2 = collection.size();
        Iterator iterator = collection.iterator();
        while (n2-- != 0) {
            if (!this.remove(iterator.next())) continue;
            bl2 = true;
        }
        return bl2;
    }

    @Override
    public boolean isEmpty() {
        return this.size() == 0;
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        ad ad2 = this.a();
        int n2 = this.size();
        boolean bl2 = true;
        stringBuilder.append("{");
        while (n2-- != 0) {
            if (bl2) {
                bl2 = false;
            } else {
                stringBuilder.append(", ");
            }
            Object e2 = ad2.next();
            if (this == e2) {
                stringBuilder.append("(this collection)");
                continue;
            }
            stringBuilder.append(String.valueOf(e2));
        }
        stringBuilder.append("}");
        return stringBuilder.toString();
    }

    @Override
    public /* synthetic */ Iterator iterator() {
        return this.a();
    }
}

