/*
 * Decompiled with CFR 0.150.
 */
import com.a.a.b.aj;
import com.a.a.d.ov;
import com.a.a.d.sz;
import com.a.b.ab;
import com.a.b.t;
import com.a.b.w;
import com.a.b.z;
import java.util.List;
import java.util.Map;
import org.apache.logging.log4j.c;
import org.apache.logging.log4j.d;

public class afl {
    private static final d a = org.apache.logging.log4j.c.c();
    private static final bmk b = new bmk();
    private static afl c;
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
    private final aar p;
    private final List q;
    private final List r;
    private final bvt s;
    private final bvt t;

    public afl(akx akx2, String string) {
        ab ab2 = new ab();
        bpx bpx2 = new bpx("shaders/program/" + string + ".json");
        this.m = string;
        dbr dbr2 = null;
        try {
            t t2;
            t t3;
            dbr2 = akx2.a(bpx2);
            z z2 = ab2.a(org.apache.commons.b.t.b(dbr2.b(), aj.c)).t();
            String string2 = cwe.f(z2, "vertex");
            String string3 = cwe.f(z2, "fragment");
            t t4 = cwe.a(z2, "samplers", null);
            if (t4 != null) {
                int n2 = 0;
                for (Object object : t4) {
                    try {
                        this.a((w)object);
                    }
                    catch (Exception exception) {
                        csy csy2 = csy.a(exception);
                        csy2.a("samplers[" + n2 + "]");
                        throw csy2;
                    }
                    ++n2;
                }
            }
            if ((t3 = cwe.a(z2, "attributes", null)) != null) {
                int n3 = 0;
                this.q = ov.b(t3.b());
                this.r = ov.b(t3.b());
                for (Object object : t3) {
                    try {
                        this.r.add(cwe.a((w)object, "attribute"));
                    }
                    catch (Exception exception) {
                        csy csy3 = csy.a(exception);
                        csy3.a("attributes[" + n3 + "]");
                        throw csy3;
                    }
                    ++n3;
                }
            } else {
                this.q = null;
                this.r = null;
            }
            if ((t2 = cwe.a(z2, "uniforms", null)) != null) {
                int n4 = 0;
                for (w w2 : t2) {
                    try {
                        this.b(w2);
                    }
                    catch (Exception exception) {
                        csy csy4 = csy.a(exception);
                        csy4.a("uniforms[" + n4 + "]");
                        throw csy4;
                    }
                    ++n4;
                }
            }
            this.p = aar.a(cwe.a(z2, "blend", null));
            this.n = cwe.a(z2, "cull", true);
            this.s = bvt.a(akx2, bov.a, string2);
            this.t = bvt.a(akx2, bov.b, string3);
            this.l = sj.b().c();
            sj.b().b(this);
            this.h();
            if (this.r != null) {
                for (Object object : this.r) {
                    int n5 = cjg.b(this.l, (CharSequence)object);
                    this.q.add(n5);
                }
            }
        }
        catch (Exception exception) {
            csy csy5 = csy.a(exception);
            csy5.b(bpx2.b());
            throw csy5;
        }
        finally {
            org.apache.commons.b.t.a(dbr2);
        }
        this.d();
    }

    public void a() {
        sj.b().a(this);
    }

    public void b() {
        cjg.d(0);
        d = -1;
        c = null;
        e = true;
        for (int i2 = 0; i2 < this.h.size(); ++i2) {
            if (this.f.get(this.g.get(i2)) == null) continue;
            cja.g(cjg.q + i2);
            cja.i(0);
        }
    }

    public void c() {
        this.o = false;
        c = this;
        this.p.a();
        if (this.l != d) {
            cjg.d(this.l);
            d = this.l;
        }
        if (this.n) {
            cja.p();
        } else {
            cja.q();
        }
        for (int i2 = 0; i2 < this.h.size(); ++i2) {
            if (this.f.get(this.g.get(i2)) == null) continue;
            cja.g(cjg.q + i2);
            cja.v();
            axe axe2 = this.f.get(this.g.get(i2));
            int n2 = -1;
            if (axe2 instanceof btr) {
                n2 = ((btr)axe2).g;
            } else if (axe2 instanceof dfs) {
                n2 = ((dfs)((Object)axe2)).aF_();
            } else if (axe2 instanceof Integer) {
                n2 = (Integer)((Object)axe2);
            }
            if (n2 == -1) continue;
            cja.i(n2);
            cjg.f(cjg.a(this.l, (CharSequence)this.g.get(i2)), i2);
        }
        for (axe axe2 : this.i) {
            axe2.b();
        }
    }

    public void d() {
        this.o = true;
    }

    public axe a(String string) {
        if (this.k.containsKey(string)) {
            return (axe)this.k.get(string);
        }
        return null;
    }

    public axe b(String string) {
        if (this.k.containsKey(string)) {
            return (axe)this.k.get(string);
        }
        return b;
    }

    private void h() {
        int n2;
        String string;
        int n3 = 0;
        int n4 = 0;
        while (n3 < this.g.size()) {
            string = (String)this.g.get(n3);
            n2 = cjg.a(this.l, string);
            if (n2 == -1) {
                a.f("Shader {}could not find sampler named {} in the specified shader program.", this.m, string);
                this.f.remove(string);
                this.g.remove(n4);
                --n4;
            } else {
                this.h.add(n2);
            }
            ++n3;
            ++n4;
        }
        for (axe axe2 : this.i) {
            string = axe2.a();
            n2 = cjg.a(this.l, string);
            if (n2 == -1) {
                a.f("Could not find uniform named {} in the specified shader program.", string);
                continue;
            }
            this.j.add(n2);
            axe2.a(n2);
            this.k.put(string, axe2);
        }
    }

    private void a(w w2) {
        z z2 = cwe.f(w2, "sampler");
        String string = cwe.f(z2, "name");
        if (!cwe.a(z2, "file")) {
            this.f.put(string, null);
            this.g.add(string);
            return;
        }
        this.g.add(string);
    }

    public void a(String string, Object object) {
        if (this.f.containsKey(string)) {
            this.f.remove(string);
        }
        this.f.put(string, object);
        this.d();
    }

    private void b(w w2) {
        Object object2;
        z z2 = cwe.f(w2, "uniform");
        String string = cwe.f(z2, "name");
        int n2 = axe.a(cwe.f(z2, "type"));
        int n3 = cwe.j(z2, "count");
        float[] arrf = new float[Math.max(n3, 16)];
        t t2 = cwe.l(z2, "values");
        if (t2.b() != n3 && t2.b() > 1) {
            throw new csy("Invalid amount of values specified (expected " + n3 + ", found " + t2.b() + ")");
        }
        int n4 = 0;
        for (Object object2 : t2) {
            try {
                arrf[n4] = cwe.d((w)object2, "value");
            }
            catch (Exception exception) {
                csy csy2 = csy.a(exception);
                csy2.a("values[" + n4 + "]");
                throw csy2;
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
        object2 = new axe(string, n2 + n5, n3, this);
        if (n2 <= 3) {
            ((axe)object2).a((int)arrf[0], (int)arrf[1], (int)arrf[2], (int)arrf[3]);
        } else if (n2 <= 7) {
            ((axe)object2).b(arrf[0], arrf[1], arrf[2], arrf[3]);
        } else {
            ((axe)object2).a(arrf);
        }
        this.i.add(object2);
    }

    public bvt e() {
        return this.s;
    }

    public bvt f() {
        return this.t;
    }

    public int g() {
        return this.l;
    }

    static {
        d = -1;
        e = true;
    }
}

