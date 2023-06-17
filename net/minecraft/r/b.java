/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.r;

import com.a.a.d.aad;
import com.a.a.d.sz;
import com.a.b.aa;
import com.a.b.ab;
import com.a.b.w;
import com.a.b.z;
import java.io.File;
import java.io.IOException;
import java.lang.reflect.Constructor;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import net.minecraft.c.a;
import net.minecraft.r.d;
import net.minecraft.r.f;
import net.minecraft.r.j;
import net.minecraft.r.k;
import net.minecraft.r.o;
import net.minecraft.u.aq;
import net.minecraft.u.ca;
import net.minecraft.u.d.l;
import net.minecraft.w.a.g;
import net.minecraft.x.d.b.be;
import org.apache.logging.log4j.c;

public class b
extends f {
    private static final org.apache.logging.log4j.d b = org.apache.logging.log4j.c.c();
    private final a c;
    private final File d;
    private final Set e = aad.a();
    private int f = -300;
    private boolean g;

    public b(a a2, File file) {
        this.c = a2;
        this.d = file;
    }

    public void a() {
        if (this.d.isFile()) {
            try {
                this.a.clear();
                this.a.putAll(this.a(org.apache.commons.b.o.g(this.d)));
            }
            catch (IOException iOException) {
                b.b("Couldn't read statistics file {}", this.d, iOException);
            }
            catch (aa aa2) {
                b.b("Couldn't parse statistics file {}", this.d, aa2);
            }
        }
    }

    public void b() {
        try {
            org.apache.commons.b.o.d(this.d, net.minecraft.r.b.a(this.a));
        }
        catch (IOException iOException) {
            b.b("Couldn't save stats", (Throwable)iOException);
        }
    }

    @Override
    public void a(net.minecraft.w.a.b b2, k k2, int n2) {
        int n3 = k2.d() ? this.a(k2) : 0;
        super.a(b2, k2, n2);
        this.e.add(k2);
        if (k2.d() && n3 == 0 && n2 > 0) {
            this.g = true;
            if (this.c.aL()) {
                this.c.av().a(new l("chat.type.achievement", b2.aK(), k2.j()));
            }
        }
        if (k2.d() && n3 > 0 && n2 == 0) {
            this.g = true;
            if (this.c.aL()) {
                this.c.av().a(new l("chat.type.achievement.taken", b2.aK(), k2.j()));
            }
        }
    }

    public Set c() {
        HashSet hashSet = aad.b((Iterable)this.e);
        this.e.clear();
        this.g = false;
        return hashSet;
    }

    public Map a(String string) {
        w w2 = new ab().a(string);
        if (!w2.q()) {
            return sz.c();
        }
        z z2 = w2.t();
        HashMap hashMap = sz.c();
        for (Map.Entry entry : z2.b()) {
            k k2 = o.a((String)entry.getKey());
            if (k2 != null) {
                ca ca2 = new ca();
                if (((w)entry.getValue()).r() && ((w)entry.getValue()).v().y()) {
                    ca2.a(((w)entry.getValue()).j());
                } else if (((w)entry.getValue()).q()) {
                    z z3 = ((w)entry.getValue()).t();
                    if (z3.b("value") && z3.c("value").r() && z3.c("value").v().y()) {
                        ca2.a(z3.d("value").j());
                    }
                    if (z3.b("progress") && k2.l() != null) {
                        try {
                            Constructor constructor = k2.l().getConstructor(new Class[0]);
                            aq aq2 = (aq)constructor.newInstance(new Object[0]);
                            aq2.a(z3.c("progress"));
                            ca2.a(aq2);
                        }
                        catch (Throwable throwable) {
                            b.f("Invalid statistic progress in {}", this.d, throwable);
                        }
                    }
                }
                hashMap.put(k2, ca2);
                continue;
            }
            b.f("Invalid statistic in {}: Don't know what {} is", this.d, entry.getKey());
        }
        return hashMap;
    }

    public static String a(Map map) {
        z z2 = new z();
        for (Map.Entry entry : map.entrySet()) {
            if (((ca)entry.getValue()).b() != null) {
                z z3 = new z();
                z3.a("value", ((ca)entry.getValue()).a());
                try {
                    z3.a("progress", ((ca)entry.getValue()).b().c());
                }
                catch (Throwable throwable) {
                    b.f("Couldn't save statistic {}: error serializing progress", ((k)entry.getKey()).e(), throwable);
                }
                z2.a(((k)entry.getKey()).e, z3);
                continue;
            }
            z2.a(((k)entry.getKey()).e, ((ca)entry.getValue()).a());
        }
        return z2.toString();
    }

    public void d() {
        for (k k2 : this.a.keySet()) {
            this.e.add(k2);
        }
    }

    public void a(g g2) {
        int n2 = this.c.az();
        HashMap hashMap = sz.c();
        if (this.g || n2 - this.f > 300) {
            this.f = n2;
            for (k k2 : this.c()) {
                hashMap.put(k2, this.a(k2));
            }
        }
        g2.a.a(new be(hashMap));
    }

    public void b(g g2) {
        HashMap hashMap = sz.c();
        for (d d2 : j.e) {
            if (!this.a(d2)) continue;
            hashMap.put(d2, this.a((k)d2));
            this.e.remove(d2);
        }
        g2.a.a(new be(hashMap));
    }

    public boolean e() {
        return this.g;
    }
}

