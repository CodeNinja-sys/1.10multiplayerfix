/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.q.g;

import a.a.a.a.b.as;
import a.a.a.a.b.bl;
import com.a.a.d.aad;
import com.a.a.d.ov;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import net.minecraft.k.a;
import net.minecraft.k.i;
import net.minecraft.q.aq;
import net.minecraft.q.f.a.h;
import net.minecraft.q.f.f;
import net.minecraft.q.f.o;
import net.minecraft.q.k;
import net.minecraft.q.v;
import net.minecraft.u.b.b;
import net.minecraft.u.b.m;
import net.minecraft.u.bo;
import net.minecraft.w.ag;
import org.apache.logging.log4j.c;
import org.apache.logging.log4j.d;

public class t
implements f {
    private static final d a = org.apache.logging.log4j.c.c();
    private final Set b = aad.a();
    private final o c;
    private final h d;
    private final as e = new bl(8192);
    private final v f;

    public t(v v2, h h2, o o2) {
        this.f = v2;
        this.d = h2;
        this.c = o2;
    }

    public Collection c() {
        return this.e.c();
    }

    public void a(net.minecraft.q.f.k k2) {
        if (this.f.q.a(k2.b, k2.c)) {
            this.b.add(m.a(k2.b, k2.c));
            k2.d = true;
        }
    }

    public void d() {
        for (net.minecraft.q.f.k k2 : this.e.c()) {
            this.a(k2);
        }
    }

    @Override
    public net.minecraft.q.f.k b(int n2, int n3) {
        long l2 = m.a(n2, n3);
        net.minecraft.q.f.k k2 = (net.minecraft.q.f.k)this.e.c(l2);
        if (k2 != null) {
            k2.d = false;
        }
        return k2;
    }

    public net.minecraft.q.f.k a(int n2, int n3) {
        net.minecraft.q.f.k k2 = this.b(n2, n3);
        if (k2 == null && (k2 = this.e(n2, n3)) != null) {
            this.e.a(m.a(n2, n3), k2);
            k2.c();
            k2.a(this, this.c);
        }
        return k2;
    }

    @Override
    public net.minecraft.q.f.k d(int n2, int n3) {
        net.minecraft.q.f.k k2 = this.a(n2, n3);
        if (k2 == null) {
            long l2 = m.a(n2, n3);
            try {
                k2 = this.c.a(n2, n3);
            }
            catch (Throwable throwable) {
                a a2 = net.minecraft.k.a.a(throwable, "Exception generating new chunk");
                i i2 = a2.a("Chunk to be generated");
                i2.a("Location", String.format("%d,%d", n2, n3));
                i2.a("Position hash", l2);
                i2.a("Generator", this.c);
                throw new bo(a2);
            }
            this.e.a(l2, k2);
            k2.c();
            k2.a(this, this.c);
        }
        return k2;
    }

    private net.minecraft.q.f.k e(int n2, int n3) {
        try {
            net.minecraft.q.f.k k2 = this.d.a(this.f, n2, n3);
            if (k2 != null) {
                k2.b(this.f.B());
                this.c.b(k2, n2, n3);
            }
            return k2;
        }
        catch (Exception exception) {
            a.b("Couldn't load chunk", (Throwable)exception);
            return null;
        }
    }

    private void b(net.minecraft.q.f.k k2) {
        try {
            this.d.b(this.f, k2);
        }
        catch (Exception exception) {
            a.b("Couldn't save entities", (Throwable)exception);
        }
    }

    private void c(net.minecraft.q.f.k k2) {
        try {
            k2.b(this.f.B());
            this.d.a(this.f, k2);
        }
        catch (IOException iOException) {
            a.b("Couldn't save chunk", (Throwable)iOException);
        }
        catch (aq aq2) {
            a.b("Couldn't save chunk; already in use by another instance of Minecraft?", (Throwable)aq2);
        }
    }

    public boolean a(boolean bl2) {
        int n2 = 0;
        ArrayList arrayList = ov.a(this.e.c());
        for (int i2 = 0; i2 < arrayList.size(); ++i2) {
            net.minecraft.q.f.k k2 = (net.minecraft.q.f.k)arrayList.get(i2);
            if (bl2) {
                this.b(k2);
            }
            if (!k2.a(bl2)) continue;
            this.c(k2);
            k2.f(false);
            if (++n2 != 24 || bl2) continue;
            return false;
        }
        return true;
    }

    public void e() {
        this.d.c();
    }

    @Override
    public boolean a() {
        if (!this.f.a) {
            if (!this.b.isEmpty()) {
                Iterator iterator = this.b.iterator();
                int n2 = 0;
                while (n2 < 100 && iterator.hasNext()) {
                    Long l2 = (Long)iterator.next();
                    net.minecraft.q.f.k k2 = (net.minecraft.q.f.k)this.e.get(l2);
                    if (k2 != null && k2.d) {
                        k2.d();
                        this.c(k2);
                        this.b(k2);
                        this.e.remove(l2);
                        ++n2;
                    }
                    iterator.remove();
                }
            }
            this.d.b();
        }
        return false;
    }

    public boolean f() {
        return !this.f.a;
    }

    @Override
    public String b() {
        return "ServerChunkCache: " + this.e.size() + " Drop: " + this.b.size();
    }

    public List a(ag ag2, b b2) {
        return this.c.a(ag2, b2);
    }

    public b a(k k2, String string, b b2) {
        return this.c.a(k2, string, b2);
    }

    public int g() {
        return this.e.size();
    }

    public boolean c(int n2, int n3) {
        return this.e.b(m.a(n2, n3));
    }
}

