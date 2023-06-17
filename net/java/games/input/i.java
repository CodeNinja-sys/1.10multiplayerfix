/*
 * Decompiled with CFR 0.150.
 */
package net.java.games.input;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import net.java.games.input.ar;
import net.java.games.input.as;
import net.java.games.input.dj;
import net.java.games.input.h;
import net.java.games.input.k;
import net.java.games.input.l;
import net.java.games.input.q;
import net.java.games.input.r;
import net.java.games.input.s;
import net.java.games.input.t;

public abstract class i
implements q {
    static final int b = 32;
    private static final ar a = new ar();
    private final String c;
    private final k[] d;
    private final q[] e;
    private final dj[] f;
    private final Map g = new HashMap();
    private as h = new as(32);

    protected i(String string, k[] arrk, q[] arrq, dj[] arrdj) {
        this.c = string;
        this.d = arrk;
        this.e = arrq;
        this.f = arrdj;
        for (int i2 = arrk.length - 1; i2 >= 0; --i2) {
            this.g.put(arrk[i2].d(), arrk[i2]);
        }
    }

    public final q[] b() {
        return this.e;
    }

    public final k[] c() {
        return this.d;
    }

    public final k a(l l2) {
        return (k)this.g.get(l2);
    }

    public final dj[] d() {
        return this.f;
    }

    public r e() {
        return r.a;
    }

    public int f() {
        return 0;
    }

    public final String g() {
        return this.c;
    }

    public String toString() {
        return this.c;
    }

    public s h() {
        return s.a;
    }

    public final void b(int n2) {
        try {
            this.a(n2);
            this.h = new as(n2);
        }
        catch (IOException iOException) {
            t.a("Failed to create new event queue of size " + n2 + ": " + iOException);
        }
    }

    protected void a(int n2) {
    }

    public final as i() {
        return this.h;
    }

    protected abstract boolean a(ar var1);

    protected void a() {
    }

    public synchronized boolean j() {
        k[] arrk = this.c();
        try {
            this.a();
            for (int i2 = 0; i2 < arrk.length; ++i2) {
                h h2 = (h)arrk[i2];
                if (h2.c()) {
                    h2.b(0.0f);
                    continue;
                }
                h2.g();
            }
            while (this.a(a)) {
                h h3 = (h)a.a();
                float f2 = a.b();
                if (h3.c()) {
                    if (f2 == 0.0f) continue;
                    h3.b(h3.f() + f2);
                } else {
                    if (f2 == h3.h()) continue;
                    h3.c(f2);
                }
                if (this.h.a()) continue;
                this.h.a(a);
            }
            return true;
        }
        catch (IOException iOException) {
            t.a("Failed to poll device: " + iOException.getMessage());
            return false;
        }
    }
}

