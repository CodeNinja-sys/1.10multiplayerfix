/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.client.c;

import com.a.a.d.aad;
import com.a.a.d.bw;
import com.a.a.d.hy;
import com.a.a.d.io;
import com.a.a.d.ov;
import com.a.a.d.sz;
import com.a.a.d.vi;
import e.a.p;
import e.a.s;
import io.netty.util.c.ag;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import net.minecraft.client.c.a;
import net.minecraft.client.c.ab;
import net.minecraft.client.c.h;
import net.minecraft.client.c.l;
import net.minecraft.client.c.o;
import net.minecraft.client.c.u;
import net.minecraft.client.c.w;
import net.minecraft.client.c.y;
import net.minecraft.client.c.z;
import net.minecraft.u.b.n;
import net.minecraft.u.bp;
import net.minecraft.u.bu;
import net.minecraft.u.bv;
import net.minecraft.w.a.b;
import org.apache.logging.log4j.c;
import org.apache.logging.log4j.d;
import org.apache.logging.log4j.f;
import org.apache.logging.log4j.g;

public class v {
    private static final f a = org.apache.logging.log4j.g.a("SOUNDS");
    private static final d b = org.apache.logging.log4j.c.c();
    private static final Set c = aad.a();
    private final h d;
    private final net.minecraft.client.b.a e;
    private o f;
    private boolean g;
    private int h;
    private final Map i = hy.a();
    private final Map j = ((bw)this.i).aT_();
    private final vi k = io.v();
    private final List l = ov.a();
    private final Map m = sz.c();
    private final Map n = sz.c();
    private final List o = ov.a();
    private final List p = ov.a();

    public v(h h2, net.minecraft.client.b.a a2) {
        this.d = h2;
        this.e = a2;
        try {
            e.a.p.a(e.a.b.f.class);
            e.a.p.a("ogg", e.a.a.a.class);
        }
        catch (s s2) {
            b.b(a, "Error linking with the LibraryJavaSound plug-in", (Throwable)s2);
        }
    }

    public void a() {
        c.clear();
        for (bv bv2 : bv.a) {
            bp bp2 = bv2.a();
            if (this.d.a(bp2) != null) continue;
            b.f("Missing sound for event: {}", bv.a.b(bv2));
            c.add(bp2);
        }
        this.b();
        this.i();
    }

    private synchronized void i() {
        if (!this.g) {
            try {
                new Thread((Runnable)new y(this), "Sound Library Loader").start();
            }
            catch (RuntimeException runtimeException) {
                b.b(a, "Error starting SoundSystem. Turning off sounds & music", (Throwable)runtimeException);
                this.e.a(bu.a, 0.0f);
                this.e.b();
            }
        }
    }

    private float a(bu bu2) {
        return bu2 != null && bu2 != bu.a ? this.e.a(bu2) : 1.0f;
    }

    public void a(bu bu2, float f2) {
        if (this.g) {
            if (bu2 == bu.a) {
                this.f.e(f2);
            } else {
                for (String string : this.k.c((Object)bu2)) {
                    z z2 = (z)this.i.get(string);
                    float f3 = this.e(z2);
                    if (f3 <= 0.0f) {
                        this.b(z2);
                        continue;
                    }
                    this.f.a(string, f3);
                }
            }
        }
    }

    public void b() {
        if (this.g) {
            this.c();
            this.f.b();
            this.g = false;
        }
    }

    public void c() {
        if (this.g) {
            for (String string : this.i.keySet()) {
                this.f.i(string);
            }
            this.i.clear();
            this.m.clear();
            this.l.clear();
            this.k.h();
            this.n.clear();
        }
    }

    public void a(ab ab2) {
        this.o.add(ab2);
    }

    public void b(ab ab2) {
        this.o.remove(ab2);
    }

    public void d() {
        z z2;
        Iterator iterator;
        Map.Entry entry;
        Object object2;
        ++this.h;
        for (Object object2 : this.l) {
            object2.a();
            if (object2.b()) {
                this.b((z)object2);
                continue;
            }
            entry = (String)this.j.get(object2);
            this.f.a((String)((Object)entry), this.e((z)object2));
            this.f.b((String)((Object)entry), this.d((z)object2));
            this.f.a((String)((Object)entry), object2.j(), object2.k(), object2.l());
        }
        object2 = this.i.entrySet().iterator();
        while (object2.hasNext()) {
            int n2;
            iterator = (Map.Entry)object2.next();
            entry = (String)iterator.getKey();
            z2 = (z)iterator.getValue();
            if (this.f.a((String)((Object)entry)) || (n2 = ((Integer)this.n.get(entry)).intValue()) > this.h) continue;
            int n3 = z2.g();
            if (z2.f() && n3 > 0) {
                this.m.put(z2, this.h + n3);
            }
            object2.remove();
            b.a(a, "Removed channel {} because it's not playing anymore", entry);
            this.f.n((String)((Object)entry));
            this.n.remove(entry);
            try {
                this.k.c((Object)z2.e(), entry);
            }
            catch (RuntimeException runtimeException) {
                // empty catch block
            }
            if (!(z2 instanceof a)) continue;
            this.l.remove(z2);
        }
        iterator = this.m.entrySet().iterator();
        while (iterator.hasNext()) {
            entry = iterator.next();
            if (this.h < (Integer)entry.getValue()) continue;
            z2 = (z)entry.getKey();
            if (z2 instanceof a) {
                ((a)z2).a();
            }
            this.c(z2);
            iterator.remove();
        }
    }

    public boolean a(z z2) {
        if (!this.g) {
            return false;
        }
        String string = (String)this.j.get(z2);
        return string == null ? false : this.f.a(string) || this.n.containsKey(string) && (Integer)this.n.get(string) <= this.h;
    }

    public void b(z z2) {
        String string;
        if (this.g && (string = (String)this.j.get(z2)) != null) {
            this.f.i(string);
        }
    }

    public void c(z z2) {
        if (this.g) {
            u u2 = z2.a(this.d);
            bp bp2 = z2.c();
            if (u2 == null) {
                if (c.add(bp2)) {
                    b.f(a, "Unable to play unknown soundEvent: {}", bp2);
                }
            } else {
                if (!this.o.isEmpty()) {
                    for (Object object : this.o) {
                        object.a(z2, u2);
                    }
                }
                if (this.f.e() <= 0.0f) {
                    b.a(a, "Skipped playing soundEvent: {}, master volume was zero", bp2);
                } else {
                    Object object;
                    object = z2.d();
                    if (object == net.minecraft.client.c.h.a) {
                        if (c.add(bp2)) {
                            b.f(a, "Unable to play empty soundEvent: {}", bp2);
                        }
                    } else {
                        float f2 = z2.h();
                        float f3 = 16.0f;
                        if (f2 > 1.0f) {
                            f3 *= f2;
                        }
                        bu bu2 = z2.e();
                        float f4 = this.e(z2);
                        float f5 = this.d(z2);
                        if (f4 == 0.0f) {
                            b.a(a, "Skipped playing sound {}, volume was zero.", ((l)object).a());
                        } else {
                            boolean bl2 = z2.f() && z2.g() == 0;
                            String string = net.minecraft.u.b.n.a(ag.b()).toString();
                            bp bp3 = ((l)object).b();
                            if (((l)object).h()) {
                                this.f.b(false, string, v.a(bp3), bp3.toString(), bl2, z2.j(), z2.k(), z2.l(), z2.m().a(), f3);
                            } else {
                                this.f.a(false, string, v.a(bp3), bp3.toString(), bl2, z2.j(), z2.k(), z2.l(), z2.m().a(), f3);
                            }
                            b.a(a, "Playing sound {} for event {} as channel {}", ((l)object).a(), bp3, string);
                            this.f.b(string, f5);
                            this.f.a(string, f4);
                            this.f.g(string);
                            this.n.put(string, this.h + 20);
                            this.i.put(string, z2);
                            if (bu2 != bu.a) {
                                this.k.a((Object)bu2, string);
                            }
                            if (z2 instanceof a) {
                                this.l.add((a)z2);
                            }
                        }
                    }
                }
            }
        }
    }

    private float d(z z2) {
        return net.minecraft.u.b.n.a(z2.i(), 0.5f, 2.0f);
    }

    private float e(z z2) {
        return net.minecraft.u.b.n.a(z2.h() * this.a(z2.e()), 0.0f, 1.0f);
    }

    public void e() {
        for (Map.Entry entry : this.i.entrySet()) {
            String string = (String)entry.getKey();
            boolean bl2 = this.a((z)entry.getValue());
            if (!bl2) continue;
            b.a(a, "Pausing channel {}", string);
            this.f.h(string);
            this.p.add(string);
        }
    }

    public void f() {
        for (String string : this.p) {
            b.a(a, "Resuming channel {}", string);
            this.f.g(string);
        }
        this.p.clear();
    }

    public void a(z z2, int n2) {
        this.m.put(z2, this.h + n2);
    }

    private static URL a(bp bp2) {
        String string = String.format("%s:%s:%s", "mcsounddomain", bp2.c(), bp2.b());
        w w2 = new w(bp2);
        try {
            return new URL(null, string, w2);
        }
        catch (MalformedURLException malformedURLException) {
            throw new Error("TODO: Sanely handle url exception! :D");
        }
    }

    public void a(b b2, float f2) {
        if (this.g && b2 != null) {
            float f3 = b2.bd + (b2.bb - b2.bd) * f2;
            float f4 = b2.bc + (b2.ba - b2.bc) * f2;
            double d2 = b2.aR + (b2.aU - b2.aR) * (double)f2;
            double d3 = b2.aS + (b2.aV - b2.aS) * (double)f2 + (double)b2.ce_();
            double d4 = b2.aT + (b2.aW - b2.aT) * (double)f2;
            float f5 = net.minecraft.u.b.n.b((f4 + 90.0f) * ((float)Math.PI / 180));
            float f6 = net.minecraft.u.b.n.a((f4 + 90.0f) * ((float)Math.PI / 180));
            float f7 = net.minecraft.u.b.n.b(-f3 * ((float)Math.PI / 180));
            float f8 = net.minecraft.u.b.n.a(-f3 * ((float)Math.PI / 180));
            float f9 = net.minecraft.u.b.n.b((-f3 + 90.0f) * ((float)Math.PI / 180));
            float f10 = net.minecraft.u.b.n.a((-f3 + 90.0f) * ((float)Math.PI / 180));
            float f11 = f5 * f7;
            float f12 = f6 * f7;
            float f13 = f5 * f9;
            float f14 = f6 * f9;
            this.f.c((float)d2, (float)d3, (float)d4);
            this.f.a(f11, f8, f12, f13, f10, f14);
        }
    }

    public void a(String string, bu bu2) {
        if (bu2 != null) {
            for (String string2 : this.k.c((Object)bu2)) {
                z z2 = (z)this.i.get(string2);
                if (!string.isEmpty()) {
                    if (!z2.c().equals(new bp(string))) continue;
                    this.b(z2);
                    continue;
                }
                this.b(z2);
            }
        } else if (!string.isEmpty()) {
            for (z z3 : this.i.values()) {
                if (!z3.c().equals(new bp(string))) continue;
                this.b(z3);
            }
        } else {
            this.c();
        }
    }

    static /* synthetic */ d g() {
        return b;
    }

    static /* synthetic */ void a(v v2, o o2) {
        v2.f = o2;
    }

    static /* synthetic */ void a(v v2, boolean bl2) {
        v2.g = bl2;
    }

    static /* synthetic */ o a(v v2) {
        return v2.f;
    }

    static /* synthetic */ net.minecraft.client.b.a b(v v2) {
        return v2.e;
    }

    static /* synthetic */ f h() {
        return a;
    }
}

