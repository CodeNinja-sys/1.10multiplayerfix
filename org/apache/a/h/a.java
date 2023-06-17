/*
 * Decompiled with CFR 0.150.
 */
package org.apache.a.h;

import org.apache.a.f;
import org.apache.a.k.b;
import org.apache.a.n;

public abstract class a
implements n {
    protected static final int a = 4096;
    protected f b;
    protected f c;
    protected boolean d;

    protected a() {
    }

    public f d() {
        return this.b;
    }

    public f e() {
        return this.c;
    }

    public boolean b() {
        return this.d;
    }

    public void a(f f2) {
        this.b = f2;
    }

    public void a(String string) {
        b b2 = null;
        if (string != null) {
            b2 = new b("Content-Type", string);
        }
        this.a(b2);
    }

    public void b(f f2) {
        this.c = f2;
    }

    public void b(String string) {
        b b2 = null;
        if (string != null) {
            b2 = new b("Content-Encoding", string);
        }
        this.b(b2);
    }

    public void a(boolean bl2) {
        this.d = bl2;
    }

    public void h() {
    }
}

