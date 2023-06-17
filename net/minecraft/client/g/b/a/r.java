/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.client.g.b.a;

import com.a.a.d.aad;
import com.a.b.k;
import java.io.Reader;
import java.io.StringReader;
import java.lang.reflect.Type;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import net.minecraft.client.g.b.a.af;
import net.minecraft.client.g.b.a.ak;
import net.minecraft.client.g.b.a.ao;
import net.minecraft.client.g.b.a.at;
import net.minecraft.client.g.b.a.au;
import net.minecraft.client.g.b.a.av;
import net.minecraft.client.g.b.a.aw;
import net.minecraft.client.g.b.a.ax;
import net.minecraft.client.g.b.a.ay;
import net.minecraft.client.g.b.a.b;
import net.minecraft.client.g.b.a.d;
import net.minecraft.client.g.b.a.e;
import net.minecraft.client.g.b.a.f;
import net.minecraft.client.g.b.a.h;
import net.minecraft.client.g.b.a.p;
import net.minecraft.client.g.b.a.q;
import net.minecraft.client.g.b.a.v;
import net.minecraft.u.bc;
import net.minecraft.u.bp;
import org.apache.logging.log4j.c;

public class r {
    private static final org.apache.logging.log4j.d f = org.apache.logging.log4j.c.c();
    static final k a = new com.a.b.r().a((Type)((Object)r.class), (Object)new f()).a((Type)((Object)ak.class), (Object)new ay()).a((Type)((Object)b.class), (Object)new v()).a((Type)((Object)aw.class), (Object)new au()).a((Type)((Object)h.class), (Object)new af()).a((Type)((Object)q.class), (Object)new e()).a((Type)((Object)av.class), (Object)new ax()).i();
    private final List g;
    private final boolean h;
    private final boolean i;
    private final q j;
    private final List k;
    public String b = "";
    protected final Map c;
    protected r d;
    protected bp e;

    public static r a(Reader reader) {
        return (r)bc.a(a, reader, r.class, false);
    }

    public static r a(String string) {
        return r.a(new StringReader(string));
    }

    public r(bp bp2, List list, Map map, boolean bl2, boolean bl3, q q2, List list2) {
        this.g = list;
        this.i = bl2;
        this.h = bl3;
        this.c = map;
        this.e = bp2;
        this.j = q2;
        this.k = list2;
    }

    public List a() {
        return this.g.isEmpty() && this.k() ? this.d.a() : this.g;
    }

    private boolean k() {
        return this.d != null;
    }

    public boolean b() {
        return this.k() ? this.d.b() : this.i;
    }

    public boolean c() {
        return this.h;
    }

    public boolean d() {
        return this.e == null || this.d != null && this.d.d();
    }

    public void a(Map map) {
        if (this.e != null) {
            this.d = (r)map.get(this.e);
        }
    }

    public Collection e() {
        HashSet hashSet = aad.a();
        for (av av2 : this.k) {
            hashSet.add(av2.a());
        }
        return hashSet;
    }

    protected List f() {
        return this.k;
    }

    public at g() {
        return this.k.isEmpty() ? at.a : new at(this.k);
    }

    public boolean b(String string) {
        return !"missingno".equals(this.c(string));
    }

    public String c(String string) {
        if (!this.d(string)) {
            string = String.valueOf('#') + string;
        }
        return this.a(string, new d(this, null));
    }

    private String a(String string, d d2) {
        if (this.d(string)) {
            if (this == d2.b) {
                f.f("Unable to resolve texture due to upward reference: {} in {}", string, this.b);
                return "missingno";
            }
            String string2 = (String)this.c.get(string.substring(1));
            if (string2 == null && this.k()) {
                string2 = this.d.a(string, d2);
            }
            d2.b = this;
            if (string2 != null && this.d(string2)) {
                string2 = d2.a.a(string2, d2);
            }
            return string2 != null && !this.d(string2) ? string2 : "missingno";
        }
        return string;
    }

    private boolean d(String string) {
        return string.charAt(0) == '#';
    }

    public bp h() {
        return this.e;
    }

    public r i() {
        return this.k() ? this.d.i() : this;
    }

    public q j() {
        h h2 = this.a(ao.b);
        h h3 = this.a(ao.c);
        h h4 = this.a(ao.d);
        h h5 = this.a(ao.e);
        h h6 = this.a(ao.f);
        h h7 = this.a(ao.g);
        h h8 = this.a(ao.h);
        h h9 = this.a(ao.i);
        return new q(h2, h3, h4, h5, h6, h7, h8, h9);
    }

    private h a(ao ao2) {
        return this.d != null && !this.j.c(ao2) ? this.d.a(ao2) : this.j.b(ao2);
    }

    public static void b(Map map) {
        for (r r2 : map.values()) {
            try {
                r r3 = r2.d;
                r r4 = r3.d;
                while (r3 != r4) {
                    r3 = r3.d;
                    r4 = r4.d.d;
                }
                throw new p();
            }
            catch (NullPointerException nullPointerException) {
                // empty catch block
            }
        }
    }
}

