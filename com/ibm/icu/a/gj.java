/*
 * Decompiled with CFR 0.150.
 */
package com.ibm.icu.a;

import com.ibm.icu.a.gg;
import com.ibm.icu.a.gk;
import java.util.Iterator;

public class gj
implements Iterator {
    private CharSequence b;
    private int c;
    private int d;
    private gk e = new gk();
    final /* synthetic */ gg a;

    gj(gg gg2, CharSequence charSequence, int n2) {
        this.a = gg2;
        this.b = charSequence;
        this.c = this.b.length();
        this.a(n2);
    }

    public void a(int n2) {
        if (n2 < 0 || n2 > this.c) {
            throw new IndexOutOfBoundsException();
        }
        this.d = n2;
    }

    public final boolean hasNext() {
        return this.d < this.c;
    }

    public final boolean a() {
        return this.d > 0;
    }

    public gk b() {
        int n2 = Character.codePointAt(this.b, this.d);
        int n3 = this.a.a(n2);
        this.e.a = this.d++;
        this.e.b = n2;
        this.e.c = n3;
        if (n2 >= 65536) {
            ++this.d;
        }
        return this.e;
    }

    public gk c() {
        int n2 = Character.codePointBefore(this.b, this.d);
        int n3 = this.a.a(n2);
        --this.d;
        if (n2 >= 65536) {
            --this.d;
        }
        this.e.a = this.d;
        this.e.b = n2;
        this.e.c = n3;
        return this.e;
    }

    public void remove() {
        throw new UnsupportedOperationException("Trie2.CharSequenceIterator does not support remove().");
    }

    public /* synthetic */ Object next() {
        return this.b();
    }
}

