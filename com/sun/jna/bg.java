/*
 * Decompiled with CFR 0.150.
 */
package com.sun.jna;

import com.sun.jna.bd;
import com.sun.jna.bf;
import java.util.AbstractCollection;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Set;

class bg
extends AbstractCollection
implements Set {
    private bd[] a;
    private int b;
    private final bf c;

    bg(bf bf2) {
        this.c = bf2;
    }

    private void a(int n2) {
        if (this.a == null) {
            this.a = new bd[n2 * 3 / 2];
        } else if (this.a.length < n2) {
            bd[] arrbd = new bd[n2 * 3 / 2];
            System.arraycopy(this.a, 0, arrbd, 0, this.a.length);
            this.a = arrbd;
        }
    }

    public int size() {
        return this.b;
    }

    public boolean contains(Object object) {
        return this.a(object) != -1;
    }

    public boolean add(Object object) {
        if (!this.contains(object)) {
            this.a(this.b + 1);
            this.a[this.b++] = (bd)object;
        }
        return true;
    }

    private int a(Object object) {
        bd bd2 = (bd)object;
        for (int i2 = 0; i2 < this.b; ++i2) {
            bd bd3 = this.a[i2];
            if (bd2 != bd3 && (bd2.getClass() != bd3.getClass() || bd2.e() != bd3.e() || !bd2.g().equals(bd3.g()))) continue;
            return i2;
        }
        return -1;
    }

    public boolean remove(Object object) {
        int n2 = this.a(object);
        if (n2 != -1) {
            if (--this.b > 0) {
                this.a[n2] = this.a[this.b];
                this.a[this.b] = null;
            }
            return true;
        }
        return false;
    }

    public Iterator iterator() {
        bd[] arrbd = new bd[this.b];
        if (this.b > 0) {
            System.arraycopy(this.a, 0, arrbd, 0, this.b);
        }
        return Arrays.asList(arrbd).iterator();
    }
}

