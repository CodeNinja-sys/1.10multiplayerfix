/*
 * Decompiled with CFR 0.150.
 */
package com.a.a.d;

import com.a.a.d.agi;
import com.a.a.d.jj;
import com.a.a.d.jk;
import com.a.a.d.lo;
import com.a.a.d.mq;
import com.a.a.d.nj;
import java.util.Collection;
import java.util.EnumSet;
import java.util.Iterator;

final class ji
extends lo {
    private final transient EnumSet a;
    private transient int c;

    static lo a(EnumSet enumSet) {
        switch (enumSet.size()) {
            case 0: {
                return lo.j();
            }
            case 1: {
                return lo.d(mq.d(enumSet));
            }
        }
        return new ji(enumSet);
    }

    private ji(EnumSet enumSet) {
        this.a = enumSet;
    }

    @Override
    boolean a() {
        return false;
    }

    @Override
    public agi aO_() {
        return nj.a(this.a.iterator());
    }

    @Override
    public int size() {
        return this.a.size();
    }

    @Override
    public boolean contains(Object object) {
        return this.a.contains(object);
    }

    @Override
    public boolean containsAll(Collection collection) {
        return this.a.containsAll(collection);
    }

    @Override
    public boolean isEmpty() {
        return this.a.isEmpty();
    }

    @Override
    public boolean equals(Object object) {
        return object == this || this.a.equals(object);
    }

    @Override
    public int hashCode() {
        int n2 = this.c;
        return n2 == 0 ? (this.c = this.a.hashCode()) : n2;
    }

    @Override
    public String toString() {
        return this.a.toString();
    }

    @Override
    Object aR_() {
        return new jk(this.a);
    }

    @Override
    public /* synthetic */ Iterator iterator() {
        return this.aO_();
    }

    /* synthetic */ ji(EnumSet enumSet, jj jj2) {
        this(enumSet);
    }
}

