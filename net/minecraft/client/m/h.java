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
import java.io.FileNotFoundException;
import java.util.List;
import java.util.Map;
import net.minecraft.client.f.an;
import net.minecraft.client.f.s;
import net.minecraft.client.g.a.c;
import net.minecraft.client.g.bd;
import net.minecraft.client.m.b;
import net.minecraft.client.m.e;
import net.minecraft.client.m.f;
import net.minecraft.u.bc;
import net.minecraft.u.bp;
import org.lwjgl.util.e.d;

public class h {
    private final b a;
    private final s b;
    private final String c;
    private final List d = ov.a();
    private final Map e = sz.c();
    private final List f = ov.a();
    private d g;
    private int h;
    private int i;
    private float j;
    private float k;

    public h(c c2, s s2, b b2, bp bp2) {
        this.b = s2;
        this.a = b2;
        this.j = 0.0f;
        this.k = 0.0f;
        this.h = b2.c;
        this.i = b2.d;
        this.c = bp2.toString();
        this.c();
        this.a(c2, bp2);
    }

    public void a(c c2, bp bp2) {
        an an2;
        block11: {
            ab ab2 = new ab();
            an2 = null;
            try {
                try {
                    int n2;
                    t t2;
                    an2 = this.b.a(bp2);
                    z z2 = ab2.a(org.apache.commons.b.t.b(an2.b(), aj.c)).t();
                    if (bc.c(z2, "targets")) {
                        t2 = z2.e("targets");
                        n2 = 0;
                        for (w w2 : t2) {
                            try {
                                this.a(w2);
                            }
                            catch (Exception exception) {
                                net.minecraft.client.e.b b2 = net.minecraft.client.e.b.a(exception);
                                b2.a("targets[" + n2 + "]");
                                throw b2;
                            }
                            ++n2;
                        }
                    }
                    if (!bc.c(z2, "passes")) break block11;
                    t2 = z2.e("passes");
                    n2 = 0;
                    for (w w2 : t2) {
                        try {
                            this.a(c2, w2);
                        }
                        catch (Exception exception) {
                            net.minecraft.client.e.b b3 = net.minecraft.client.e.b.a(exception);
                            b3.a("passes[" + n2 + "]");
                            throw b3;
                        }
                        ++n2;
                    }
                }
                catch (Exception exception) {
                    net.minecraft.client.e.b b4 = net.minecraft.client.e.b.a(exception);
                    b4.b(bp2.b());
                    throw b4;
                }
            }
            catch (Throwable throwable) {
                org.apache.commons.b.t.a(an2);
                throw throwable;
            }
        }
        org.apache.commons.b.t.a(an2);
    }

    private void a(w w2) {
        if (bc.a(w2)) {
            this.a(w2.d(), this.h, this.i);
        } else {
            z z2 = bc.f(w2, "target");
            String string = bc.f(z2, "name");
            int n2 = bc.a(z2, "width", this.h);
            int n3 = bc.a(z2, "height", this.i);
            if (this.e.containsKey(string)) {
                throw new net.minecraft.client.e.b(String.valueOf(string) + " is already defined");
            }
            this.a(string, n2, n3);
        }
    }

    private void a(c c2, w w2) {
        t t2;
        Object object;
        z z2 = bc.f(w2, "pass");
        String string = bc.f(z2, "name");
        String string2 = bc.f(z2, "intarget");
        String string3 = bc.f(z2, "outtarget");
        b b2 = this.b(string2);
        b b3 = this.b(string3);
        if (b2 == null) {
            throw new net.minecraft.client.e.b("Input target '" + string2 + "' does not exist");
        }
        if (b3 == null) {
            throw new net.minecraft.client.e.b("Output target '" + string3 + "' does not exist");
        }
        f f2 = this.a(string, b2, b3);
        t t3 = bc.a(z2, "auxtargets", null);
        if (t3 != null) {
            int n2 = 0;
            for (w w3 : t3) {
                block18: {
                    Object object2;
                    try {
                        z z3 = bc.f(w3, "auxtarget");
                        object2 = bc.f(z3, "name");
                        object = bc.f(z3, "id");
                        b b4 = this.b((String)object);
                        if (b4 == null) {
                            bp bp2 = new bp("textures/effect/" + (String)object + ".png");
                            an an2 = null;
                            try {
                                try {
                                    an2 = this.b.a(bp2);
                                }
                                catch (FileNotFoundException fileNotFoundException) {
                                    throw new net.minecraft.client.e.b("Render target or texture '" + (String)object + "' does not exist");
                                }
                            }
                            catch (Throwable throwable) {
                                org.apache.commons.b.t.a(an2);
                                throw throwable;
                            }
                            org.apache.commons.b.t.a(an2);
                            c2.a(bp2);
                            net.minecraft.client.g.a.t t4 = c2.b(bp2);
                            int n3 = bc.j(z3, "width");
                            int n4 = bc.j(z3, "height");
                            boolean bl2 = bc.h(z3, "bilinear");
                            if (bl2) {
                                bd.b(3553, 10241, 9729);
                                bd.b(3553, 10240, 9729);
                            } else {
                                bd.b(3553, 10241, 9728);
                                bd.b(3553, 10240, 9728);
                            }
                            f2.a((String)object2, t4.e(), n3, n4);
                            break block18;
                        }
                        f2.a((String)object2, b4, b4.a, b4.b);
                    }
                    catch (Exception exception) {
                        object2 = net.minecraft.client.e.b.a(exception);
                        ((net.minecraft.client.e.b)object2).a("auxtargets[" + n2 + "]");
                        throw object2;
                    }
                }
                ++n2;
            }
        }
        if ((t2 = bc.a(z2, "uniforms", null)) != null) {
            int n5 = 0;
            for (Object object3 : t2) {
                try {
                    this.b((w)object3);
                }
                catch (Exception exception) {
                    object = net.minecraft.client.e.b.a(exception);
                    ((net.minecraft.client.e.b)object).a("uniforms[" + n5 + "]");
                    throw object;
                }
                ++n5;
            }
        }
    }

    private void b(w w2) {
        z z2 = bc.f(w2, "uniform");
        String string = bc.f(z2, "name");
        e e2 = ((f)this.d.get(this.d.size() - 1)).b().a(string);
        if (e2 == null) {
            throw new net.minecraft.client.e.b("Uniform '" + string + "' does not exist");
        }
        float[] arrf = new float[4];
        int n2 = 0;
        for (w w3 : bc.l(z2, "values")) {
            try {
                arrf[n2] = bc.d(w3, "value");
            }
            catch (Exception exception) {
                net.minecraft.client.e.b b2 = net.minecraft.client.e.b.a(exception);
                b2.a("values[" + n2 + "]");
                throw b2;
            }
            ++n2;
        }
        switch (n2) {
            default: {
                break;
            }
            case 1: {
                e2.a(arrf[0]);
                break;
            }
            case 2: {
                e2.a(arrf[0], arrf[1]);
                break;
            }
            case 3: {
                e2.a(arrf[0], arrf[1], arrf[2]);
                break;
            }
            case 4: {
                e2.a(arrf[0], arrf[1], arrf[2], arrf[3]);
            }
        }
    }

    public b a(String string) {
        return (b)this.e.get(string);
    }

    public void a(String string, int n2, int n3) {
        b b2 = new b(n2, n3, true);
        b2.a(0.0f, 0.0f, 0.0f, 0.0f);
        this.e.put(string, b2);
        if (n2 == this.h && n3 == this.i) {
            this.f.add(b2);
        }
    }

    public void a() {
        for (Object object : this.e.values()) {
            ((b)object).a();
        }
        for (Object object : this.d) {
            ((f)object).a();
        }
        this.d.clear();
    }

    public f a(String string, b b2, b b3) {
        f f2 = new f(this.b, string, b2, b3);
        this.d.add(this.d.size(), f2);
        return f2;
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
            ((f)object).a(this.g);
        }
        for (Object object : this.f) {
            ((b)object).a(n2, n3);
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
        for (f f3 : this.d) {
            f3.a(this.j / 20.0f);
        }
    }

    public final String b() {
        return this.c;
    }

    private b b(String string) {
        return string == null ? null : (string.equals("minecraft:main") ? this.a : (b)this.e.get(string));
    }
}

