/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.client.g.a;

import com.a.a.d.ov;
import com.a.a.d.sz;
import java.io.IOException;
import java.util.List;
import java.util.Map;
import net.minecraft.client.f.j;
import net.minecraft.client.f.s;
import net.minecraft.client.g.a.k;
import net.minecraft.client.g.a.m;
import net.minecraft.client.g.a.o;
import net.minecraft.client.g.a.p;
import net.minecraft.client.g.a.r;
import net.minecraft.client.g.a.t;
import net.minecraft.client.g.a.v;
import net.minecraft.k.a;
import net.minecraft.k.i;
import net.minecraft.u.bo;
import net.minecraft.u.bp;
import org.apache.logging.log4j.d;

public class c
implements j,
o {
    private static final d a = org.apache.logging.log4j.c.c();
    private final Map b = sz.c();
    private final List c = ov.a();
    private final Map d = sz.c();
    private final s e;

    public c(s s2) {
        this.e = s2;
    }

    public void a(bp bp2) {
        t t2 = (t)this.b.get(bp2);
        if (t2 == null) {
            t2 = new k(bp2);
            this.a(bp2, t2);
        }
        p.b(t2.e());
    }

    public void a(bp bp2, String string) {
        t t2 = (t)this.b.get(bp2);
        if (string != "") {
            t2 = null;
        }
        if (t2 == null) {
            t2 = new k(bp2);
            ((k)t2).a = string;
            this.a(bp2, t2);
        }
        p.b(t2.e());
    }

    public boolean a(bp bp2, v v2) {
        if (this.a(bp2, (t)v2)) {
            this.c.add(v2);
            return true;
        }
        return false;
    }

    public boolean a(bp bp2, t t2) {
        boolean bl2 = true;
        try {
            t2.a(this.e);
        }
        catch (IOException iOException) {
            a.f("Failed to load texture: {}", bp2, iOException);
            t2 = p.a;
            this.b.put(bp2, t2);
            bl2 = false;
        }
        catch (Throwable throwable) {
            t t3 = t2;
            a a2 = net.minecraft.k.a.a(throwable, "Registering texture");
            i i2 = a2.a("Resource location being registered");
            i2.a("Resource location", bp2);
            i2.a("Texture object class", new r(this, t3));
            throw new bo(a2);
        }
        if (t2 instanceof k) {
            if (((k)t2).a == "") {
                this.b.put(bp2, t2);
            }
        } else {
            this.b.put(bp2, t2);
        }
        return bl2;
    }

    public t b(bp bp2) {
        return (t)this.b.get(bp2);
    }

    public bp a(String string, m m2) {
        Integer n2 = (Integer)this.d.get(string);
        n2 = n2 == null ? Integer.valueOf(1) : Integer.valueOf(n2 + 1);
        this.d.put(string, n2);
        bp bp2 = new bp(String.format("dynamic/%s_%d", string, n2));
        this.a(bp2, (t)m2);
        return bp2;
    }

    @Override
    public void a() {
        for (o o2 : this.c) {
            o2.a();
        }
    }

    public void c(bp bp2) {
        t t2 = this.b(bp2);
        if (t2 != null) {
            p.a(t2.e());
        }
    }

    @Override
    public void a(s s2) {
        for (Map.Entry entry : this.b.entrySet()) {
            this.a((bp)entry.getKey(), (t)entry.getValue());
        }
    }
}

