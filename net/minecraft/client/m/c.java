/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.client.m;

import com.a.a.b.aj;
import com.a.a.d.ov;
import com.a.a.d.sz;
import com.a.b.ab;
import com.a.b.t;
import com.a.b.w;
import com.a.b.z;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import net.minecraft.client.f.an;
import net.minecraft.client.f.s;
import net.minecraft.client.g.ay;
import net.minecraft.client.g.bd;
import net.minecraft.client.m.a;
import net.minecraft.client.m.b;
import net.minecraft.client.m.e;
import net.minecraft.client.m.g;
import net.minecraft.client.m.i;
import net.minecraft.client.m.j;
import net.minecraft.u.bc;
import net.minecraft.u.bp;
import org.apache.logging.log4j.d;

public class c {
    private static final d a = org.apache.logging.log4j.c.c();
    private static final i b = new i();
    private static c c;
    private static int d;
    private static boolean e;
    private final Map f = sz.c();
    private final List g = ov.a();
    private final List h = ov.a();
    private final List i = ov.a();
    private final List j = ov.a();
    private final Map k = sz.c();
    private final int l;
    private final String m;
    private final boolean n;
    private boolean o;
    private final net.minecraft.client.e.a p;
    private final List q;
    private final List r;
    private final j s;
    private final j t;

    static {
        d = -1;
        e = true;
    }

    public c(s s2, String string) {
        ab ab2 = new ab();
        bp bp2 = new bp("shaders/program/" + string + ".json");
        this.m = string;
        an an2 = null;
        try {
            try {
                t t2;
                an2 = s2.a(bp2);
                z z2 = ab2.a(org.apache.commons.b.t.b(an2.b(), aj.c)).t();
                String string2 = bc.f(z2, "vertex");
                String string3 = bc.f(z2, "fragment");
                t t3 = bc.a(z2, "samplers", null);
                if (t3 != null) {
                    int n2 = 0;
                    for (w w2 : t3) {
                        try {
                            this.a(w2);
                        }
                        catch (Exception exception) {
                            net.minecraft.client.e.b b2 = net.minecraft.client.e.b.a(exception);
                            b2.a("samplers[" + n2 + "]");
                            throw b2;
                        }
                        ++n2;
                    }
                }
                if ((t2 = bc.a(z2, "attributes", null)) != null) {
                    int n3 = 0;
                    this.q = ov.b(t2.b());
                    this.r = ov.b(t2.b());
                    for (Object object : t2) {
                        try {
                            this.r.add(bc.a((w)object, "attribute"));
                        }
                        catch (Exception exception) {
                            net.minecraft.client.e.b b3 = net.minecraft.client.e.b.a(exception);
                            b3.a("attributes[" + n3 + "]");
                            throw b3;
                        }
                        ++n3;
                    }
                } else {
                    this.q = null;
                    this.r = null;
                }
                t t4 = bc.a(z2, "uniforms", null);
                if (t4 != null) {
                    int n4 = 0;
                    for (Iterator iterator : t4) {
                        try {
                            this.b((w)((Object)iterator));
                        }
                        catch (Exception exception) {
                            net.minecraft.client.e.b b4 = net.minecraft.client.e.b.a(exception);
                            b4.a("uniforms[" + n4 + "]");
                            throw b4;
                        }
                        ++n4;
                    }
                }
                this.p = net.minecraft.client.e.a.a(bc.a(z2, "blend", null));
                this.n = bc.a(z2, "cull", true);
                this.s = net.minecraft.client.m.j.a(s2, net.minecraft.client.m.a.a, string2);
                this.t = net.minecraft.client.m.j.a(s2, net.minecraft.client.m.a.b, string3);
                this.l = net.minecraft.client.m.g.b().c();
                net.minecraft.client.m.g.b().b(this);
                this.h();
                if (this.r != null) {
                    for (Object object : this.r) {
                        int n5 = ay.b(this.l, (CharSequence)object);
                        this.q.add(n5);
                    }
                }
            }
            catch (Exception exception) {
                net.minecraft.client.e.b b5 = net.minecraft.client.e.b.a(exception);
                b5.b(bp2.b());
                throw b5;
            }
        }
        catch (Throwable throwable) {
            org.apache.commons.b.t.a(an2);
            throw throwable;
        }
        org.apache.commons.b.t.a(an2);
        this.d();
    }

    public void a() {
        net.minecraft.client.m.g.b().a(this);
    }

    public void b() {
        ay.d(0);
        d = -1;
        c = null;
        e = true;
        for (int i2 = 0; i2 < this.h.size(); ++i2) {
            if (this.f.get(this.g.get(i2)) == null) continue;
            bd.g(ay.q + i2);
            bd.i(0);
        }
    }

    public void c() {
        this.o = false;
        c = this;
        this.p.a();
        if (this.l != d) {
            ay.d(this.l);
            d = this.l;
        }
        if (this.n) {
            bd.p();
        } else {
            bd.q();
        }
        for (int i2 = 0; i2 < this.h.size(); ++i2) {
            if (this.f.get(this.g.get(i2)) == null) continue;
            bd.g(ay.q + i2);
            bd.v();
            Iterator<Object> iterator = this.f.get(this.g.get(i2));
            int n2 = -1;
            if (iterator instanceof b) {
                n2 = ((b)iterator).g;
            } else if (iterator instanceof net.minecraft.client.g.a.t) {
                n2 = ((net.minecraft.client.g.a.t)((Object)iterator)).e();
            } else if (iterator instanceof Integer) {
                n2 = (Integer)((Object)iterator);
            }
            if (n2 == -1) continue;
            bd.i(n2);
            ay.f(ay.a(this.l, (CharSequence)this.g.get(i2)), i2);
        }
        for (e e2 : this.i) {
            e2.b();
        }
    }

    public void d() {
        this.o = true;
    }

    public e a(String string) {
        return this.k.containsKey(string) ? (e)this.k.get(string) : null;
    }

    public e b(String string) {
        return this.k.containsKey(string) ? (e)this.k.get(string) : b;
    }

    private void h() {
        int n2 = 0;
        int n3 = 0;
        while (n2 < this.g.size()) {
            String string = (String)this.g.get(n2);
            int n4 = ay.a(this.l, string);
            if (n4 == -1) {
                a.f("Shader {}could not find sampler named {} in the specified shader program.", this.m, string);
                this.f.remove(string);
                this.g.remove(n3);
                --n3;
            } else {
                this.h.add(n4);
            }
            ++n2;
            ++n3;
        }
        for (e e2 : this.i) {
            String string = e2.a();
            int n5 = ay.a(this.l, string);
            if (n5 == -1) {
                a.f("Could not find uniform named {} in the specified shader program.", string);
                continue;
            }
            this.j.add(n5);
            e2.a(n5);
            this.k.put(string, e2);
        }
    }

    private void a(w w2) {
        z z2 = bc.f(w2, "sampler");
        String string = bc.f(z2, "name");
        if (!bc.a(z2, "file")) {
            this.f.put(string, null);
            this.g.add(string);
        } else {
            this.g.add(string);
        }
    }

    public void a(String string, Object object) {
        if (this.f.containsKey(string)) {
            this.f.remove(string);
        }
        this.f.put(string, object);
        this.d();
    }

    private void b(w w2) {
        z z2 = bc.f(w2, "uniform");
        String string = bc.f(z2, "name");
        int n2 = net.minecraft.client.m.e.a(bc.f(z2, "type"));
        int n3 = bc.j(z2, "count");
        float[] arrf = new float[Math.max(n3, 16)];
        t t2 = bc.l(z2, "values");
        if (t2.b() != n3 && t2.b() > 1) {
            throw new net.minecraft.client.e.b("Invalid amount of values specified (expected " + n3 + ", found " + t2.b() + ")");
        }
        int n4 = 0;
        for (w w3 : t2) {
            try {
                arrf[n4] = bc.d(w3, "value");
            }
            catch (Exception exception) {
                net.minecraft.client.e.b b2 = net.minecraft.client.e.b.a(exception);
                b2.a("values[" + n4 + "]");
                throw b2;
            }
            ++n4;
        }
        if (n3 > 1 && t2.b() == 1) {
            while (n4 < n3) {
                arrf[n4] = arrf[0];
                ++n4;
            }
        }
        int n5 = n3 > 1 && n3 <= 4 && n2 < 8 ? n3 - 1 : 0;
        e e2 = new e(string, n2 + n5, n3, this);
        if (n2 <= 3) {
            e2.a((int)arrf[0], (int)arrf[1], (int)arrf[2], (int)arrf[3]);
        } else if (n2 <= 7) {
            e2.b(arrf[0], arrf[1], arrf[2], arrf[3]);
        } else {
            e2.a(arrf);
        }
        this.i.add(e2);
    }

    public j e() {
        return this.s;
    }

    public j f() {
        return this.t;
    }

    public int g() {
        return this.l;
    }
}

