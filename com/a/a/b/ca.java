/*
 * Decompiled with CFR 0.150.
 */
package com.a.a.b;

import java.util.AbstractList;

final class ca
extends AbstractList {
    final /* synthetic */ Object[] a;
    final /* synthetic */ Object b;
    final /* synthetic */ Object c;

    ca(Object[] arrobject, Object object, Object object2) {
        this.a = arrobject;
        this.b = object;
        this.c = object2;
    }

    @Override
    public int size() {
        return this.a.length + 2;
    }

    @Override
    public Object get(int n2) {
        switch (n2) {
            case 0: {
                return this.b;
            }
            case 1: {
                return this.c;
            }
        }
        return this.a[n2 - 2];
    }
}

