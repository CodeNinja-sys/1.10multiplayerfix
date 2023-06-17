/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.client.k;

import com.a.a.d.ov;
import java.util.Iterator;
import java.util.List;
import net.minecraft.client.c.ab;
import net.minecraft.client.c.u;
import net.minecraft.client.c.z;
import net.minecraft.client.g.ad;
import net.minecraft.client.g.bc;
import net.minecraft.client.g.bd;
import net.minecraft.client.k.cv;
import net.minecraft.client.k.de;
import net.minecraft.client.k.e;
import net.minecraft.client.r;
import net.minecraft.u.b.n;
import net.minecraft.u.b.s;

public class al
extends de
implements ab {
    private final r a;
    private final List b = ov.a();
    private boolean c;

    public al(r r2) {
        this.a = r2;
    }

    public void a(cv cv2) {
        if (!this.c && this.a.w.P) {
            this.a.U().a(this);
            this.c = true;
        } else if (this.c && !this.a.w.P) {
            this.a.U().b(this);
            this.c = false;
        }
        if (this.c && !this.b.isEmpty()) {
            bd.D();
            bd.l();
            bd.a(ad.l, bc.j, ad.e, bc.n);
            s s2 = new s(this.a.j.aU, this.a.j.aV + (double)this.a.j.ce_(), this.a.j.aW);
            s s3 = new s(0.0, 0.0, -1.0).a(-this.a.j.bb * ((float)Math.PI / 180)).b(-this.a.j.ba * ((float)Math.PI / 180));
            s s4 = new s(0.0, 1.0, 0.0).a(-this.a.j.bb * ((float)Math.PI / 180)).b(-this.a.j.ba * ((float)Math.PI / 180));
            s s5 = s3.c(s4);
            int n2 = 0;
            int n3 = 0;
            Iterator iterator = this.b.iterator();
            while (iterator.hasNext()) {
                e e2 = (e)iterator.next();
                if (e2.b() + 3000L <= r.I()) {
                    iterator.remove();
                    continue;
                }
                n3 = Math.max(n3, this.a.m.a(e2.a()));
            }
            n3 = n3 + this.a.m.a("<") + this.a.m.a(" ") + this.a.m.a(">") + this.a.m.a(" ");
            for (e e2 : this.b) {
                int n4 = 255;
                String string = e2.a();
                s s6 = e2.c().d(s2).a();
                double d2 = -s5.b(s6);
                double d3 = -s3.b(s6);
                boolean bl2 = d3 > 0.5;
                int n5 = n3 / 2;
                int n6 = this.a.m.a;
                int n7 = n6 / 2;
                float f2 = 1.0f;
                int n8 = this.a.m.a(string);
                int n9 = n.c(n.b(255.0, 75.0, (double)((float)(r.I() - e2.b()) / 3000.0f)));
                int n10 = n9 << 16 | n9 << 8 | n9;
                bd.D();
                bd.c((float)cv2.a() - (float)n5 * 1.0f - 2.0f, (float)(cv2.b() - 30) - (float)(n2 * (n6 + 1)) * 1.0f, 0.0f);
                bd.b(1.0f, 1.0f, 1.0f);
                al.a(-n5 - 1, -n7 - 1, n5 + 1, n7 + 1, -872415232);
                bd.l();
                if (!bl2) {
                    if (d2 > 0.0) {
                        this.a.m.a(">", n5 - this.a.m.a(">"), -n7, n10 + -16777216);
                    } else if (d2 < 0.0) {
                        this.a.m.a("<", -n5, -n7, n10 + -16777216);
                    }
                }
                this.a.m.a(string, -n8 / 2, -n7, n10 + -16777216);
                bd.E();
                ++n2;
            }
            bd.k();
            bd.E();
        }
    }

    @Override
    public void a(z z2, u u2) {
        if (u2.c() != null) {
            String string = u2.c().d();
            if (!this.b.isEmpty()) {
                for (e e2 : this.b) {
                    if (!e2.a().equals(string)) continue;
                    e2.a(new s(z2.j(), z2.k(), z2.l()));
                    return;
                }
            }
            this.b.add(new e(this, string, new s(z2.j(), z2.k(), z2.l())));
        }
    }
}

