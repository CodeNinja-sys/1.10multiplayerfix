/*
 * Decompiled with CFR 0.150.
 */
package a.a.a.a.a;

import a.a.a.a.a.dh;

public abstract class p
implements dh {
    protected p() {
    }

    @Override
    public int a() {
        return this.d();
    }

    public Integer d() {
        return this.a();
    }

    @Override
    public void remove() {
        throw new UnsupportedOperationException();
    }

    @Override
    public int b(int n2) {
        int n3 = n2;
        while (n3-- != 0 && this.hasNext()) {
            this.a();
        }
        return n2 - n3 - 1;
    }

    public /* synthetic */ Object next() {
        return this.d();
    }
}

