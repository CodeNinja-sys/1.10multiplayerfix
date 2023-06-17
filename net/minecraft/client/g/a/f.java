/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.client.g.a;

import com.a.a.d.ov;
import com.a.a.d.sz;
import java.io.Closeable;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import net.minecraft.client.f.an;
import net.minecraft.client.f.s;
import net.minecraft.client.g.a.b;
import net.minecraft.client.g.a.d;
import net.minecraft.client.g.a.e;
import net.minecraft.client.g.a.g;
import net.minecraft.client.g.a.l;
import net.minecraft.client.g.a.n;
import net.minecraft.client.g.a.p;
import net.minecraft.client.g.a.q;
import net.minecraft.client.g.a.u;
import net.minecraft.client.g.a.v;
import net.minecraft.client.r;
import net.minecraft.k.a;
import net.minecraft.k.i;
import net.minecraft.u.bo;
import net.minecraft.u.bp;
import org.apache.commons.b.t;
import org.apache.logging.log4j.c;

public class f
extends g
implements v {
    private static final org.apache.logging.log4j.d h = org.apache.logging.log4j.c.c();
    public static final bp a = new bp("missingno");
    public static final bp b = new bp("textures/atlas/blocks.png");
    private final List i = ov.a();
    private final Map j = sz.c();
    private final Map k = sz.c();
    private final String l;
    private final u m;
    private int n;
    private final d o = new d("missingno");

    public f(String string) {
        this(string, null);
    }

    public f(String string, u u2) {
        this.l = string;
        this.m = u2;
    }

    private void g() {
        int[] arrn = p.b;
        this.o.b(16);
        this.o.c(16);
        int[][] arrarrn = new int[this.n + 1][];
        arrarrn[0] = arrn;
        this.o.a(ov.a((Object[])new int[][][]{arrarrn}));
    }

    @Override
    public void a(s s2) {
        if (this.m != null) {
            this.a(s2, this.m);
        }
    }

    public void a(s s2, u u2) {
        this.j.clear();
        u2.a(this);
        this.g();
        this.f();
        this.b(s2);
    }

    public void b(s s2) {
        Object object;
        int n2 = r.B();
        e e2 = new e(n2, n2, 0, this.n);
        this.k.clear();
        this.i.clear();
        int n3 = Integer.MAX_VALUE;
        int n4 = 1 << this.n;
        for (Map.Entry entry : this.j.entrySet()) {
            object = (d)entry.getValue();
            Object object2 = this.a((d)object);
            Iterator iterator = null;
            try {
                l l2 = net.minecraft.client.g.a.l.a(s2.a((bp)object2));
                iterator = s2.a((bp)object2);
                boolean bl2 = iterator.a("animation") != null;
                ((d)object).a(l2, bl2);
            }
            catch (RuntimeException runtimeException) {
                h.b("Unable to parse metadata from {}", object2, runtimeException);
                t.a((Closeable)((Object)iterator));
                continue;
            }
            catch (IOException iOException) {
                try {
                    h.b("Using missing texture, unable to load {}", object2, iOException);
                }
                catch (Throwable throwable) {
                    t.a(iterator);
                    throw throwable;
                }
                t.a((Closeable)((Object)iterator));
                continue;
            }
            t.a((Closeable)((Object)iterator));
            n3 = Math.min(n3, Math.min(((d)object).c(), ((d)object).d()));
            int n5 = Math.min(Integer.lowestOneBit(((d)object).c()), Integer.lowestOneBit(((d)object).d()));
            if (n5 < n4) {
                h.f("Texture {} with size {}x{} limits mip level from {} to {}", object2, ((d)object).c(), ((d)object).d(), net.minecraft.u.b.n.e(n4), net.minecraft.u.b.n.e(n5));
                n4 = n5;
            }
            e2.a((d)object);
        }
        int n6 = Math.min(n3, n4);
        int n7 = net.minecraft.u.b.n.e(n6);
        if (n7 < this.n) {
            h.f("{}: dropping miplevel from {} to {}, because of minimum power of two: {}", this.l, this.n, n7, n6);
            this.n = n7;
        }
        this.o.d(this.n);
        e2.a(this.o);
        e2.c();
        h.d("Created: {}x{} {}-atlas", e2.a(), e2.b(), this.l);
        p.a(this.e(), this.n, e2.a(), e2.b());
        object = sz.b(this.j);
        for (Object object2 : e2.d()) {
            if (object2 != this.o && !this.a(s2, (d)object2)) continue;
            String string = ((d)object2).i();
            object.remove(string);
            this.k.put(string, object2);
            try {
                p.a(((d)object2).a(0), ((d)object2).c(), ((d)object2).d(), ((d)object2).a(), ((d)object2).b(), false, false);
            }
            catch (Throwable throwable) {
                a a2 = net.minecraft.k.a.a(throwable, "Stitching texture atlas");
                i i2 = a2.a("Texture being stitched together");
                i2.a("Atlas path", this.l);
                i2.a("Sprite", object2);
                throw new bo(a2);
            }
            if (!((d)object2).m()) continue;
            this.i.add(object2);
        }
        for (Object object2 : object.values()) {
            ((d)object2).a(this.o);
        }
    }

    private boolean a(s s2, d d2) {
        block9: {
            boolean bl2;
            bp bp2 = this.a(d2);
            an an2 = null;
            try {
                an2 = s2.a(bp2);
                d2.a(an2, this.n + 1);
                break block9;
            }
            catch (RuntimeException runtimeException) {
                h.b("Unable to parse metadata from {}", bp2, runtimeException);
                bl2 = false;
            }
            catch (IOException iOException) {
                boolean bl3;
                h.b("Using missing texture, unable to load {}", bp2, iOException);
                boolean bl4 = bl3 = false;
                return bl4;
            }
            finally {
                t.a(an2);
            }
            return bl2;
        }
        try {
            d2.d(this.n);
            return true;
        }
        catch (Throwable throwable) {
            a a2 = net.minecraft.k.a.a(throwable, "Applying mipmap");
            i i2 = a2.a("Sprite being mipmapped");
            i2.a("Sprite name", new b(this, d2));
            i2.a("Sprite size", new q(this, d2));
            i2.a("Sprite frames", new n(this, d2));
            i2.a("Mipmap levels", this.n);
            throw new bo(a2);
        }
    }

    private bp a(d d2) {
        bp bp2 = new bp(d2.i());
        return new bp(bp2.c(), String.format("%s/%s%s", this.l, bp2.b(), ".png"));
    }

    public d a(String string) {
        d d2 = (d)this.k.get(string);
        if (d2 == null) {
            d2 = this.o;
        }
        return d2;
    }

    public void b() {
        p.b(this.e());
        for (d d2 : this.i) {
            d2.j();
        }
    }

    public d a(bp bp2) {
        if (bp2 == null) {
            throw new IllegalArgumentException("Location cannot be null!");
        }
        d d2 = (d)this.j.get(bp2);
        if (d2 == null) {
            d2 = net.minecraft.client.g.a.d.a(bp2);
            this.j.put(bp2.toString(), d2);
        }
        return d2;
    }

    @Override
    public void a() {
        this.b();
    }

    public void a(int n2) {
        this.n = n2;
    }

    public d c() {
        return this.o;
    }
}

