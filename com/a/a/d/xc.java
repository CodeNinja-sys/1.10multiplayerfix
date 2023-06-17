/*
 * Decompiled with CFR 0.150.
 */
package com.a.a.d;

import java.util.Collection;
import java.util.Iterator;
import java.util.Set;

public interface xc
extends Collection {
    public int a(Object var1);

    public int a(Object var1, int var2);

    public int b(Object var1, int var2);

    public int c(Object var1, int var2);

    public boolean a(Object var1, int var2, int var3);

    public Set d();

    public Set aS_();

    @Override
    public boolean equals(Object var1);

    @Override
    public int hashCode();

    public String toString();

    @Override
    public Iterator iterator();

    @Override
    public boolean contains(Object var1);

    public boolean containsAll(Collection var1);

    public boolean add(Object var1);

    @Override
    public boolean remove(Object var1);

    public boolean removeAll(Collection var1);

    public boolean retainAll(Collection var1);
}

