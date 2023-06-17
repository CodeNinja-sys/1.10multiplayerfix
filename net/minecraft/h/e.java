/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.h;

import com.a.a.d.ov;
import java.util.List;
import net.minecraft.h.o;
import net.minecraft.h.v;
import net.minecraft.h.y;
import net.minecraft.m.cu;
import net.minecraft.u.d.a;
import net.minecraft.u.d.k;
import net.minecraft.u.d.l;
import net.minecraft.w.a.b;

public class e
implements y {
    private String a;
    private final int b;
    private final cu[] c;
    private List d;
    private boolean e;

    public e(String string, boolean bl2, int n2) {
        this.a = string;
        this.e = bl2;
        this.b = n2;
        this.c = new cu[n2];
    }

    public e(a a2, int n2) {
        this(a2.c(), true, n2);
    }

    public void a(o o2) {
        if (this.d == null) {
            this.d = ov.a();
        }
        this.d.add(o2);
    }

    public void b(o o2) {
        this.d.remove(o2);
    }

    @Override
    public cu a(int n2) {
        return n2 >= 0 && n2 < this.c.length ? this.c[n2] : null;
    }

    @Override
    public cu a(int n2, int n3) {
        cu cu2 = v.a(this.c, n2, n3);
        if (cu2 != null) {
            this.C();
        }
        return cu2;
    }

    public cu a(cu cu2) {
        cu cu3 = cu2.j();
        for (int i2 = 0; i2 < this.b; ++i2) {
            int n2;
            int n3;
            cu cu4 = this.a(i2);
            if (cu4 == null) {
                this.a(i2, cu3);
                this.C();
                return null;
            }
            if (!cu.c(cu4, cu3) || (n3 = Math.min(cu3.b, (n2 = Math.min(this.g(), cu4.b())) - cu4.b)) <= 0) continue;
            cu4.b += n3;
            cu3.b -= n3;
            if (cu3.b > 0) continue;
            this.C();
            return null;
        }
        if (cu3.b != cu2.b) {
            this.C();
        }
        return cu3;
    }

    @Override
    public cu b(int n2) {
        if (this.c[n2] != null) {
            cu cu2 = this.c[n2];
            this.c[n2] = null;
            return cu2;
        }
        return null;
    }

    @Override
    public void a(int n2, cu cu2) {
        this.c[n2] = cu2;
        if (cu2 != null && cu2.b > this.g()) {
            cu2.b = this.g();
        }
        this.C();
    }

    @Override
    public int e() {
        return this.b;
    }

    @Override
    public String X() {
        return this.a;
    }

    @Override
    public boolean bO_() {
        return this.e;
    }

    public void a(String string) {
        this.e = true;
        this.a = string;
    }

    @Override
    public a aK() {
        return this.bO_() ? new k(this.X()) : new l(this.X(), new Object[0]);
    }

    @Override
    public int g() {
        return 64;
    }

    @Override
    public void C() {
        if (this.d != null) {
            for (int i2 = 0; i2 < this.d.size(); ++i2) {
                ((o)this.d.get(i2)).a(this);
            }
        }
    }

    @Override
    public boolean a_(b b2) {
        return true;
    }

    @Override
    public void b(b b2) {
    }

    @Override
    public void c(b b2) {
    }

    @Override
    public boolean b(int n2, cu cu2) {
        return true;
    }

    @Override
    public int c(int n2) {
        return 0;
    }

    @Override
    public void b(int n2, int n3) {
    }

    @Override
    public int i() {
        return 0;
    }

    @Override
    public void j() {
        for (int i2 = 0; i2 < this.c.length; ++i2) {
            this.c[i2] = null;
        }
    }
}

