/*
 * Decompiled with CFR 0.150.
 */
package com.a.a.d;

import com.a.a.d.ac;
import com.a.a.d.ad;
import com.a.a.d.n;
import java.util.ListIterator;

class ae
extends ac
implements ListIterator {
    final /* synthetic */ ad d;

    ae(ad ad2) {
        this.d = ad2;
        super(ad2);
    }

    public ae(ad ad2, int n2) {
        this.d = ad2;
        super(ad2, ad2.g().listIterator(n2));
    }

    private ListIterator c() {
        return (ListIterator)this.b();
    }

    @Override
    public boolean hasPrevious() {
        return this.c().hasPrevious();
    }

    public Object previous() {
        return this.c().previous();
    }

    @Override
    public int nextIndex() {
        return this.c().nextIndex();
    }

    @Override
    public int previousIndex() {
        return this.c().previousIndex();
    }

    public void set(Object object) {
        this.c().set(object);
    }

    public void add(Object object) {
        boolean bl2 = this.d.isEmpty();
        this.c().add(object);
        n.c(this.d.g);
        if (bl2) {
            this.d.d();
        }
    }
}

