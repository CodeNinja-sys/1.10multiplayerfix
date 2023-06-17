/*
 * Decompiled with CFR 0.150.
 */
package a.a.a.a.c;

import a.a.a.a.c.ad;

public abstract class c
implements ad {
    protected c() {
    }

    @Override
    public void remove() {
        throw new UnsupportedOperationException();
    }

    @Override
    public int b(int n2) {
        int n3 = n2;
        while (n3-- != 0 && this.hasNext()) {
            this.next();
        }
        return n2 - n3 - 1;
    }
}

