/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.q.b;

import a.a.a.a.b.as;
import a.a.a.a.b.bl;
import com.a.a.d.ov;
import java.util.List;
import net.minecraft.c.a;
import net.minecraft.q.b.b;
import net.minecraft.q.b.i;
import net.minecraft.q.b.q;

public class ao {
    private final i a;
    private long b;
    private final as c = new bl(4096);
    private final List d = ov.a();

    public ao(i i2) {
        this.a = i2;
    }

    public b a(int n2, int n3) {
        long l2 = (long)(n2 >>= 4) & 0xFFFFFFFFL | ((long)(n3 >>= 4) & 0xFFFFFFFFL) << 32;
        b b2 = (b)this.c.c(l2);
        if (b2 == null) {
            b2 = new b(this, n2, n3);
            this.c.a(l2, b2);
            this.d.add(b2);
        }
        b2.d = net.minecraft.c.a.aI();
        return b2;
    }

    public q a(int n2, int n3, q q2) {
        q q3 = this.a(n2, n3).a(n2, n3);
        return q3 == null ? q2 : q3;
    }

    public void a() {
        long l2 = net.minecraft.c.a.aI();
        long l3 = l2 - this.b;
        if (l3 > 7500L || l3 < 0L) {
            this.b = l2;
            for (int i2 = 0; i2 < this.d.size(); ++i2) {
                b b2 = (b)this.d.get(i2);
                long l4 = l2 - b2.d;
                if (l4 <= 30000L && l4 >= 0L) continue;
                this.d.remove(i2--);
                long l5 = (long)b2.b & 0xFFFFFFFFL | ((long)b2.c & 0xFFFFFFFFL) << 32;
                this.c.a(l5);
            }
        }
    }

    public q[] b(int n2, int n3) {
        return this.a((int)n2, (int)n3).a;
    }

    static /* synthetic */ i a(ao ao2) {
        return ao2.a;
    }
}

