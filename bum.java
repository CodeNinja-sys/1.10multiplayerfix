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
import java.io.FileNotFoundException;
import java.util.List;
import java.util.Map;
import org.lwjgl.util.e.d;

public class bum {
    private final btr a;
    private final akx b;
    private final String c;
    private final List d = ov.a();
    private final Map e = sz.c();
    private final List f = ov.a();
    private d g;
    private int h;
    private int i;
    private float j;
    private float k;

    public bum(bnm bnm2, akx akx2, btr btr2, bpx bpx2) {
        this.b = akx2;
        this.a = btr2;
        this.j = 0.0f;
        this.k = 0.0f;
        this.h = btr2.c;
        this.i = btr2.d;
        this.c = bpx2.toString();
        this.c();
        this.a(bnm2, bpx2);
    }

    public void a(bnm bnm2, bpx bpx2) {
        dbr dbr2;
        block11: {
            ab ab2 = new ab();
            dbr2 = null;
            try {
                int n2;
                t t2;
                dbr2 = this.b.a(bpx2);
                z z2 = ab2.a(org.apache.commons.b.t.b(dbr2.b(), aj.c)).t();
                if (cwe.c(z2, "targets")) {
                    t2 = z2.e("targets");
                    n2 = 0;
                    for (w w2 : t2) {
                        try {
                            this.a(w2);
                        }
                        catch (Exception exception) {
                            csy csy2 = csy.a(exception);
                            csy2.a("targets[" + n2 + "]");
                            throw csy2;
                        }
                        ++n2;
                    }
                }
                if (!cwe.c(z2, "passes")) break block11;
                t2 = z2.e("passes");
                n2 = 0;
                for (w w2 : t2) {
                    try {
                        this.a(bnm2, w2);
                    }
                    catch (Exception exception) {
                        csy csy3 = csy.a(exception);
                        csy3.a("passes[" + n2 + "]");
                        throw csy3;
                    }
                    ++n2;
                }
            }
            catch (Exception exception) {
                try {
                    csy csy4 = csy.a(exception);
                    csy4.b(bpx2.b());
                    throw csy4;
                }
                catch (Throwable throwable) {
                    org.apache.commons.b.t.a(dbr2);
                    throw throwable;
                }
            }
        }
        org.apache.commons.b.t.a(dbr2);
    }

    private void a(w w2) {
        if (cwe.a(w2)) {
            this.a(w2.d(), this.h, this.i);
        } else {
            z z2 = cwe.f(w2, "target");
            String string = cwe.f(z2, "name");
            int n2 = cwe.a(z2, "width", this.h);
            int n3 = cwe.a(z2, "height", this.i);
            if (this.e.containsKey(string)) {
                throw new csy(string + " is already defined");
            }
            this.a(string, n2, n3);
        }
    }

    private void a(bnm bnm2, w w2) {
        t t2;
        Object object;
        z z2;
        block16: {
            z2 = cwe.f(w2, "pass");
            String string = cwe.f(z2, "name");
            String string2 = cwe.f(z2, "intarget");
            String string3 = cwe.f(z2, "outtarget");
            btr btr2 = this.b(string2);
            btr btr3 = this.b(string3);
            if (btr2 == null) {
                throw new csy("Input target '" + string2 + "' does not exist");
            }
            if (btr3 == null) {
                throw new csy("Output target '" + string3 + "' does not exist");
            }
            vv vv2 = this.a(string, btr2, btr3);
            t t3 = cwe.a(z2, "auxtargets", null);
            if (t3 == null) break block16;
            int n2 = 0;
            for (Object object2 : t3) {
                block15: {
                    Object object3;
                    try {
                        btr btr4;
                        block17: {
                            w w3 = cwe.f((w)object2, "auxtarget");
                            object3 = cwe.f(w3, "name");
                            object = cwe.f(w3, "id");
                            btr4 = this.b((String)object);
                            if (btr4 != null) break block17;
                            bpx bpx2 = new bpx("textures/effect/" + (String)object + ".png");
                            dbr dbr2 = null;
                            try {
                                dbr2 = this.b.a(bpx2);
                            }
                            catch (FileNotFoundException fileNotFoundException) {
                                try {
                                    throw new csy("Render target or texture '" + (String)object + "' does not exist");
                                }
                                catch (Throwable throwable) {
                                    org.apache.commons.b.t.a(dbr2);
                                    throw throwable;
                                }
                            }
                            org.apache.commons.b.t.a(dbr2);
                            bnm2.a(bpx2);
                            dfs dfs2 = bnm2.b(bpx2);
                            int n3 = cwe.j(w3, "width");
                            int n4 = cwe.j(w3, "height");
                            boolean bl2 = cwe.h(w3, "bilinear");
                            if (bl2) {
                                cja.b(3553, 10241, 9729);
                                cja.b(3553, 10240, 9729);
                            } else {
                                cja.b(3553, 10241, 9728);
                                cja.b(3553, 10240, 9728);
                            }
                            vv2.a((String)object3, dfs2.aF_(), n3, n4);
                            break block15;
                        }
                        vv2.a((String)object3, btr4, btr4.a, btr4.b);
                    }
                    catch (Exception exception) {
                        object3 = csy.a(exception);
                        ((csy)object3).a("auxtargets[" + n2 + "]");
                        throw object3;
                    }
                }
                ++n2;
            }
        }
        if ((t2 = cwe.a(z2, "uniforms", null)) != null) {
            int n5 = 0;
            for (w w3 : t2) {
                try {
                    this.b(w3);
                }
                catch (Exception exception) {
                    object = csy.a(exception);
                    ((csy)object).a("uniforms[" + n5 + "]");
                    throw object;
                }
                ++n5;
            }
        }
    }

    private void b(w w2) {
        z z2 = cwe.f(w2, "uniform");
        String string = cwe.f(z2, "name");
        axe axe2 = ((vv)this.d.get(this.d.size() - 1)).b().a(string);
        if (axe2 == null) {
            throw new csy("Uniform '" + string + "' does not exist");
        }
        float[] arrf = new float[4];
        int n2 = 0;
        t t2 = cwe.l(z2, "values");
        for (w w3 : t2) {
            try {
                arrf[n2] = cwe.d(w3, "value");
            }
            catch (Exception exception) {
                csy csy2 = csy.a(exception);
                csy2.a("values[" + n2 + "]");
                throw csy2;
            }
            ++n2;
        }
        switch (n2) {
            case 0: {
                break;
            }
            case 1: {
                axe2.a(arrf[0]);
                break;
            }
            case 2: {
                axe2.a(arrf[0], arrf[1]);
                break;
            }
            case 3: {
                axe2.a(arrf[0], arrf[1], arrf[2]);
                break;
            }
            case 4: {
                axe2.a(arrf[0], arrf[1], arrf[2], arrf[3]);
            }
        }
    }

    public btr a(String string) {
        return (btr)this.e.get(string);
    }

    public void a(String string, int n2, int n3) {
        btr btr2 = new btr(n2, n3, true);
        btr2.a(0.0f, 0.0f, 0.0f, 0.0f);
        this.e.put(string, btr2);
        if (n2 == this.h && n3 == this.i) {
            this.f.add(btr2);
        }
    }

    public void a() {
        for (Object object : this.e.values()) {
            ((btr)object).a();
        }
        for (Object object : this.d) {
            ((vv)object).a();
        }
        this.d.clear();
    }

    public vv a(String string, btr btr2, btr btr3) {
        vv vv2 = new vv(this.b, string, btr2, btr3);
        this.d.add(this.d.size(), vv2);
        return vv2;
    }

    private void c() {
        this.g = new d();
        this.g.a();
        this.g.a = 2.0f / (float)this.a.a;
        this.g.f = 2.0f / (float)(-this.a.b);
        this.g.k = -0.0020001999f;
        this.g.p = 1.0f;
        this.g.d = -1.0f;
        this.g.h = 1.0f;
        this.g.l = -1.0001999f;
    }

    public void a(int n2, int n3) {
        this.h = this.a.a;
        this.i = this.a.b;
        this.c();
        for (Object object : this.d) {
            ((vv)object).a(this.g);
        }
        for (Object object : this.f) {
            ((btr)object).a(n2, n3);
        }
    }

    public void a(float f2) {
        if (f2 < this.k) {
            this.j += 1.0f - this.k;
            this.j += f2;
        } else {
            this.j += f2 - this.k;
        }
        this.k = f2;
        while (this.j > 20.0f) {
            this.j -= 20.0f;
        }
        for (vv vv2 : this.d) {
            vv2.a(this.j / 20.0f);
        }
    }

    public final String b() {
        return this.c;
    }

    private btr b(String string) {
        if (string == null) {
            return null;
        }
        if (string.equals("minecraft:main")) {
            return this.a;
        }
        return (btr)this.e.get(string);
    }
}

