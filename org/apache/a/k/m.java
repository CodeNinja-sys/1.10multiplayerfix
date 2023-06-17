/*
 * Decompiled with CFR 0.150.
 */
package org.apache.a.k;

import java.util.List;
import java.util.NoSuchElementException;
import org.apache.a.f;
import org.apache.a.i;
import org.apache.a.o.a;
import org.apache.a.o.b;

public class m
implements i {
    protected final List a;
    protected int b;
    protected int c;
    protected String d;

    public m(List list, String string) {
        this.a = (List)org.apache.a.o.a.a((Object)list, "Header list");
        this.d = string;
        this.b = this.a(-1);
        this.c = -1;
    }

    protected int a(int n2) {
        int n3 = n2;
        if (n3 < -1) {
            return -1;
        }
        int n4 = this.a.size() - 1;
        boolean bl2 = false;
        while (!bl2 && n3 < n4) {
            bl2 = this.b(++n3);
        }
        return bl2 ? n3 : -1;
    }

    protected boolean b(int n2) {
        if (this.d == null) {
            return true;
        }
        String string = ((f)this.a.get(n2)).c();
        return this.d.equalsIgnoreCase(string);
    }

    public boolean hasNext() {
        return this.b >= 0;
    }

    public f a() {
        int n2 = this.b;
        if (n2 < 0) {
            throw new NoSuchElementException("Iteration already finished.");
        }
        this.c = n2;
        this.b = this.a(n2);
        return (f)this.a.get(n2);
    }

    public final Object next() {
        return this.a();
    }

    public void remove() {
        org.apache.a.o.b.a(this.c >= 0, "No header to remove");
        this.a.remove(this.c);
        this.c = -1;
        --this.b;
    }
}

