/*
 * Decompiled with CFR 0.150.
 */
package io.netty.util.c.a;

import io.netty.util.c.a.a;
import java.io.Serializable;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;

abstract class h
implements Serializable,
Collection {
    private static final long b = 7249069246763182397L;
    final a a;
    private static final String c = "Required array size too large";

    h(a a2) {
        this.a = a2;
    }

    public a a() {
        return this.a;
    }

    @Override
    public final void clear() {
        this.a.clear();
    }

    @Override
    public final int size() {
        return this.a.size();
    }

    @Override
    public final boolean isEmpty() {
        return this.a.isEmpty();
    }

    @Override
    public abstract Iterator iterator();

    @Override
    public abstract boolean contains(Object var1);

    @Override
    public abstract boolean remove(Object var1);

    @Override
    public final Object[] toArray() {
        long l2 = this.a.d();
        if (l2 > 0x7FFFFFF7L) {
            throw new OutOfMemoryError("Required array size too large");
        }
        int n2 = (int)l2;
        Object[] arrobject = new Object[n2];
        int n3 = 0;
        for (Object e2 : this) {
            if (n3 == n2) {
                if (n2 >= 0x7FFFFFF7) {
                    throw new OutOfMemoryError("Required array size too large");
                }
                n2 = n2 >= 0x3FFFFFFB ? 0x7FFFFFF7 : (n2 += (n2 >>> 1) + 1);
                arrobject = Arrays.copyOf(arrobject, n2);
            }
            arrobject[n3++] = e2;
        }
        return n3 == n2 ? arrobject : Arrays.copyOf(arrobject, n3);
    }

    public final Object[] toArray(Object[] arrobject) {
        long l2 = this.a.d();
        if (l2 > 0x7FFFFFF7L) {
            throw new OutOfMemoryError("Required array size too large");
        }
        int n2 = (int)l2;
        Object[] arrobject2 = arrobject.length >= n2 ? arrobject : (Object[])Array.newInstance(arrobject.getClass().getComponentType(), n2);
        int n3 = arrobject2.length;
        int n4 = 0;
        for (Object e2 : this) {
            if (n4 == n3) {
                if (n3 >= 0x7FFFFFF7) {
                    throw new OutOfMemoryError("Required array size too large");
                }
                n3 = n3 >= 0x3FFFFFFB ? 0x7FFFFFF7 : (n3 += (n3 >>> 1) + 1);
                arrobject2 = Arrays.copyOf(arrobject2, n3);
            }
            arrobject2[n4++] = e2;
        }
        if (arrobject == arrobject2 && n4 < n3) {
            arrobject2[n4] = null;
            return arrobject2;
        }
        return n4 == n3 ? arrobject2 : Arrays.copyOf(arrobject2, n4);
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append('[');
        Iterator iterator = this.iterator();
        if (iterator.hasNext()) {
            while (true) {
                Object e2;
                stringBuilder.append((Object)((e2 = iterator.next()) == this ? "(this Collection)" : e2));
                if (!iterator.hasNext()) break;
                stringBuilder.append(',').append(' ');
            }
        }
        return stringBuilder.append(']').toString();
    }

    public final boolean containsAll(Collection collection) {
        if (collection != this) {
            for (Object e2 : collection) {
                if (e2 != null && this.contains(e2)) continue;
                return false;
            }
        }
        return true;
    }

    public final boolean removeAll(Collection collection) {
        boolean bl2 = false;
        Iterator iterator = this.iterator();
        while (iterator.hasNext()) {
            if (!collection.contains(iterator.next())) continue;
            iterator.remove();
            bl2 = true;
        }
        return bl2;
    }

    public final boolean retainAll(Collection collection) {
        boolean bl2 = false;
        Iterator iterator = this.iterator();
        while (iterator.hasNext()) {
            if (collection.contains(iterator.next())) continue;
            iterator.remove();
            bl2 = true;
        }
        return bl2;
    }
}

