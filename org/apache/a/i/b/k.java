/*
 * Decompiled with CFR 0.150.
 */
package org.apache.a.i.b;

import org.apache.a.l.a;
import org.apache.a.l.j;

public class k
extends a {
    protected final j a;
    protected final j b;
    protected final j c;
    protected final j d;

    public k(j j2, j j3, j j4, j j5) {
        this.a = j2;
        this.b = j3;
        this.c = j4;
        this.d = j5;
    }

    public k(k k2) {
        this(k2.a(), k2.b(), k2.c(), k2.d());
    }

    public k(k k2, j j2, j j3, j j4, j j5) {
        this(j2 != null ? j2 : k2.a(), j3 != null ? j3 : k2.b(), j4 != null ? j4 : k2.c(), j5 != null ? j5 : k2.d());
    }

    public final j a() {
        return this.a;
    }

    public final j b() {
        return this.b;
    }

    public final j c() {
        return this.c;
    }

    public final j d() {
        return this.d;
    }

    public Object a(String string) {
        org.apache.a.o.a.a((Object)string, "Parameter name");
        Object object = null;
        if (this.d != null) {
            object = this.d.a(string);
        }
        if (object == null && this.c != null) {
            object = this.c.a(string);
        }
        if (object == null && this.b != null) {
            object = this.b.a(string);
        }
        if (object == null && this.a != null) {
            object = this.a.a(string);
        }
        return object;
    }

    public j a(String string, Object object) {
        throw new UnsupportedOperationException("Setting parameters in a stack is not supported.");
    }

    public boolean b(String string) {
        throw new UnsupportedOperationException("Removing parameters in a stack is not supported.");
    }

    public j e() {
        return this;
    }
}

