/*
 * Decompiled with CFR 0.150.
 */
package a.a.a.a.a;

import a.a.a.a.a.cs;
import a.a.a.a.a.dh;
import a.a.a.a.a.di;
import a.a.a.a.c.ae;
import java.lang.reflect.Array;
import java.util.AbstractCollection;
import java.util.Collection;
import java.util.Iterator;

public abstract class n
extends AbstractCollection
implements cs {
    protected n() {
    }

    @Override
    public int[] a(int[] arrn) {
        return this.b(arrn);
    }

    @Override
    public int[] f() {
        return this.b((int[])null);
    }

    @Override
    public int[] b(int[] arrn) {
        if (arrn == null || arrn.length < this.size()) {
            arrn = new int[this.size()];
        }
        di.a(this.a(), arrn);
        return arrn;
    }

    @Override
    public boolean a(cs cs2) {
        boolean bl2 = false;
        dh dh2 = cs2.a();
        int n2 = cs2.size();
        while (n2-- != 0) {
            if (!this.e(dh2.a())) continue;
            bl2 = true;
        }
        return bl2;
    }

    @Override
    public boolean b(cs cs2) {
        dh dh2 = cs2.a();
        int n2 = cs2.size();
        while (n2-- != 0) {
            if (this.a(dh2.a())) continue;
            return false;
        }
        return true;
    }

    @Override
    public boolean c(cs cs2) {
        boolean bl2 = false;
        int n2 = this.size();
        dh dh2 = this.a();
        while (n2-- != 0) {
            if (cs2.a(dh2.a())) continue;
            dh2.remove();
            bl2 = true;
        }
        return bl2;
    }

    @Override
    public boolean d(cs cs2) {
        boolean bl2 = false;
        int n2 = cs2.size();
        dh dh2 = cs2.a();
        while (n2-- != 0) {
            if (!this.f(dh2.a())) continue;
            bl2 = true;
        }
        return bl2;
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
            if (!this.a((Integer)iterator.next())) continue;
            bl2 = true;
        }
        return bl2;
    }

    @Override
    public boolean e(int n2) {
        throw new UnsupportedOperationException();
    }

    @Override
    public dh g() {
        return this.a();
    }

    @Override
    public abstract dh a();

    @Override
    public boolean remove(Object object) {
        if (object == null) {
            return false;
        }
        return this.f((Integer)object);
    }

    public boolean a(Integer n2) {
        return this.e(n2);
    }

    public boolean b(Object object) {
        if (object == null) {
            return false;
        }
        return this.f((Integer)object);
    }

    @Override
    public boolean contains(Object object) {
        if (object == null) {
            return false;
        }
        return this.a((int)((Integer)object));
    }

    @Override
    public boolean a(int n2) {
        dh dh2 = this.a();
        while (dh2.hasNext()) {
            if (n2 != dh2.a()) continue;
            return true;
        }
        return false;
    }

    @Override
    public boolean f(int n2) {
        dh dh2 = this.a();
        while (dh2.hasNext()) {
            if (n2 != dh2.a()) continue;
            dh2.remove();
            return true;
        }
        return false;
    }

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
        dh dh2 = this.a();
        while (n2-- != 0) {
            if (collection.contains(dh2.next())) continue;
            dh2.remove();
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
        dh dh2 = this.a();
        int n2 = this.size();
        boolean bl2 = true;
        stringBuilder.append("{");
        while (n2-- != 0) {
            if (bl2) {
                bl2 = false;
            } else {
                stringBuilder.append(", ");
            }
            int n3 = dh2.a();
            stringBuilder.append(String.valueOf(n3));
        }
        stringBuilder.append("}");
        return stringBuilder.toString();
    }

    public /* synthetic */ boolean add(Object object) {
        return this.a((Integer)object);
    }

    @Override
    public /* synthetic */ Iterator iterator() {
        return this.a();
    }
}

