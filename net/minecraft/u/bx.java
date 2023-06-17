/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.u;

import com.a.a.d.ov;
import java.util.List;
import net.minecraft.client.k.dn;
import net.minecraft.client.r;
import net.minecraft.u.b.b;
import net.minecraft.x.d.a.g;
import org.apache.commons.c.am;

public abstract class bx {
    protected final dn b;
    protected final boolean c;
    protected boolean d;
    protected boolean e;
    protected int f;
    protected List g = ov.a();

    public bx(dn dn2, boolean bl2) {
        this.b = dn2;
        this.c = bl2;
    }

    public void a() {
        if (this.d) {
            this.b.b(0);
            this.b.b(this.b.a(-1, this.b.i(), false) - this.b.i());
            if (this.f >= this.g.size()) {
                this.f = 0;
            }
        } else {
            int n2 = this.b.a(-1, this.b.i(), false);
            this.g.clear();
            this.f = 0;
            String string = this.b.b().substring(0, this.b.i());
            this.a(string);
            if (this.g.isEmpty()) {
                return;
            }
            this.d = true;
            this.b.b(n2 - this.b.i());
        }
        this.b.b((String)this.g.get(this.f++));
    }

    private void a(String string) {
        if (string.length() >= 1) {
            r.z().j.d.a(new g(string, this.b(), this.c));
            this.e = true;
        }
    }

    public abstract b b();

    public void a(String ... arrstring) {
        if (this.e) {
            String string;
            this.d = false;
            this.g.clear();
            String[] arrstring2 = arrstring;
            int n2 = arrstring.length;
            for (int i2 = 0; i2 < n2; ++i2) {
                string = arrstring2[i2];
                if (string.isEmpty()) continue;
                this.g.add(string);
            }
            string = this.b.b().substring(this.b.a(-1, this.b.i(), false));
            String string2 = am.b(arrstring);
            if (!string2.isEmpty() && !string.equalsIgnoreCase(string2)) {
                this.b.b(0);
                this.b.b(this.b.a(-1, this.b.i(), false) - this.b.i());
                this.b.b(string2);
            } else if (!this.g.isEmpty()) {
                this.d = true;
                this.a();
            }
        }
    }

    public void c() {
        this.d = false;
    }

    public void d() {
        this.e = false;
    }
}

