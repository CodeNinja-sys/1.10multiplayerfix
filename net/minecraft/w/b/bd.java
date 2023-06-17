/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.w.b;

import com.a.a.d.aad;
import java.util.Iterator;
import java.util.Set;
import net.minecraft.p.b;
import net.minecraft.w.b.bm;
import net.minecraft.w.b.r;
import org.apache.logging.log4j.c;
import org.apache.logging.log4j.d;

public class bd {
    private static final d a = org.apache.logging.log4j.c.c();
    private final Set b = aad.c();
    private final Set c = aad.c();
    private final b d;
    private int e;
    private int f = 3;
    private int g;

    public bd(b b2) {
        this.d = b2;
    }

    public void a(int n2, bm bm2) {
        this.b.add(new r(this, n2, bm2));
    }

    public void a(bm bm2) {
        Iterator iterator = this.b.iterator();
        while (iterator.hasNext()) {
            r r2 = (r)iterator.next();
            bm bm3 = r2.a;
            if (bm3 != bm2) continue;
            if (r2.c) {
                r2.c = false;
                r2.a.c();
                this.c.remove(r2);
            }
            iterator.remove();
            return;
        }
    }

    public void a() {
        this.d.a("goalSetup");
        if (this.e++ % this.f == 0) {
            for (Object object : this.b) {
                if (((r)object).c) {
                    if (this.b((r)object) && this.a((r)object)) continue;
                    ((r)object).c = false;
                    ((r)object).a.c();
                    this.c.remove(object);
                    continue;
                }
                if (!this.b((r)object) || !((r)object).a.e()) continue;
                ((r)object).c = true;
                ((r)object).a.b();
                this.c.add(object);
            }
        } else {
            Object object;
            object = this.c.iterator();
            while (object.hasNext()) {
                r r2 = (r)object.next();
                if (this.a(r2)) continue;
                r2.c = false;
                r2.a.c();
                object.remove();
            }
        }
        this.d.b();
        if (!this.c.isEmpty()) {
            this.d.a("goalTick");
            for (Object object : this.c) {
                ((r)object).a.d();
            }
            this.d.b();
        }
    }

    private boolean a(r r2) {
        return r2.a.a();
    }

    private boolean b(r r2) {
        if (this.c.isEmpty()) {
            return true;
        }
        if (this.a(r2.a.i())) {
            return false;
        }
        for (r r3 : this.c) {
            if (r3 == r2 || !(r2.b >= r3.b ? !this.a(r2, r3) : !r3.a.h())) continue;
            return false;
        }
        return true;
    }

    private boolean a(r r2, r r3) {
        return (r2.a.i() & r3.a.i()) == 0;
    }

    public boolean a(int n2) {
        return (this.g & n2) > 0;
    }

    public void b(int n2) {
        this.g |= n2;
    }

    public void c(int n2) {
        this.g &= ~n2;
    }

    public void a(int n2, boolean bl2) {
        if (bl2) {
            this.c(n2);
        } else {
            this.b(n2);
        }
    }
}

