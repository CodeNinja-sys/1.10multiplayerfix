/*
 * Decompiled with CFR 0.150.
 */
package a.a.a.a.b;

import a.a.a.a.b.dh;

public class dl
implements dh {
    final a.a.a.a.a.dh a;

    public dl(a.a.a.a.a.dh dh2) {
        this.a = dh2;
    }

    @Override
    public boolean hasNext() {
        return this.a.hasNext();
    }

    public Long b() {
        return this.a.a();
    }

    @Override
    public long a() {
        return this.a.a();
    }

    @Override
    public void remove() {
        this.a.remove();
    }

    @Override
    public int b(int n2) {
        return this.a.b(n2);
    }

    public /* synthetic */ Object next() {
        return this.b();
    }
}

