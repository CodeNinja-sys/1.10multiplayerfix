/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.client.k;

import com.a.a.d.sz;
import java.util.Map;
import net.minecraft.client.g.bd;
import net.minecraft.client.k.cv;
import net.minecraft.client.k.de;
import net.minecraft.client.r;
import net.minecraft.q.ap;
import net.minecraft.q.ar;
import net.minecraft.q.q;
import net.minecraft.u.bp;
import net.minecraft.x.d.b.ak;
import net.minecraft.x.d.b.w;

public class cz
extends de {
    private static final bp a = new bp("textures/gui/bars.png");
    private final r b;
    private final Map c = sz.d();

    public cz(r r2) {
        this.b = r2;
    }

    public void a() {
        if (!this.c.isEmpty()) {
            cv cv2 = new cv(this.b);
            int n2 = cv2.a();
            int n3 = 12;
            for (ap ap2 : this.c.values()) {
                int n4 = n2 / 2 - 91;
                bd.c(1.0f, 1.0f, 1.0f, 1.0f);
                this.b.N().a(a);
                this.a(n4, n3, ap2);
                String string = ap2.b().d();
                this.b.m.a(string, (float)(n2 / 2 - this.b.m.a(string) / 2), (float)(n3 - 9), 0xFFFFFF);
                if ((n3 += 10 + this.b.m.a) >= cv2.b() / 3) break;
            }
        }
    }

    private void a(int n2, int n3, q q2) {
        int n4;
        this.a_(n2, n3, 0, q2.d().ordinal() * 5 * 2, 182, 5);
        if (q2.e() != ar.a) {
            this.a_(n2, n3, 0, 80 + (q2.e().ordinal() - 1) * 5 * 2, 182, 5);
        }
        if ((n4 = (int)(q2.c() * 183.0f)) > 0) {
            this.a_(n2, n3, 0, q2.d().ordinal() * 5 * 2 + 5, n4, 5);
            if (q2.e() != ar.a) {
                this.a_(n2, n3, 0, 80 + (q2.e().ordinal() - 1) * 5 * 2 + 5, n4, 5);
            }
        }
    }

    public void a(ak ak2) {
        if (ak2.b() == w.a) {
            this.c.put(ak2.a(), new ap(ak2));
        } else if (ak2.b() == w.b) {
            this.c.remove(ak2.a());
        } else {
            ((ap)this.c.get(ak2.a())).a(ak2);
        }
    }

    public void b() {
        this.c.clear();
    }

    public boolean c() {
        if (!this.c.isEmpty()) {
            for (q q2 : this.c.values()) {
                if (!q2.g()) continue;
                return true;
            }
        }
        return false;
    }

    public boolean d() {
        if (!this.c.isEmpty()) {
            for (q q2 : this.c.values()) {
                if (!q2.f()) continue;
                return true;
            }
        }
        return false;
    }

    public boolean e() {
        if (!this.c.isEmpty()) {
            for (q q2 : this.c.values()) {
                if (!q2.h()) continue;
                return true;
            }
        }
        return false;
    }
}

