/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.client.i;

import a.a.a.a.b.as;
import com.a.a.b.cc;
import net.minecraft.client.i.k;
import net.minecraft.q.f.f;
import net.minecraft.q.f.i;
import net.minecraft.u.b.m;
import org.apache.logging.log4j.c;
import org.apache.logging.log4j.d;

public class e
implements f {
    private static final d a = org.apache.logging.log4j.c.c();
    private final net.minecraft.q.f.k b;
    private final as c = new k(this, 8192);
    private final net.minecraft.q.k d;

    public e(net.minecraft.q.k k2) {
        this.b = new i(k2, 0, 0);
        this.d = k2;
    }

    public void a(int n2, int n3) {
        net.minecraft.q.f.k k2 = this.d(n2, n3);
        if (!k2.f()) {
            k2.d();
        }
        this.c.a(m.a(n2, n3));
    }

    @Override
    public net.minecraft.q.f.k b(int n2, int n3) {
        return (net.minecraft.q.f.k)this.c.c(m.a(n2, n3));
    }

    public net.minecraft.q.f.k c(int n2, int n3) {
        net.minecraft.q.f.k k2 = new net.minecraft.q.f.k(this.d, n2, n3);
        this.c.a(m.a(n2, n3), k2);
        k2.c(true);
        return k2;
    }

    @Override
    public net.minecraft.q.f.k d(int n2, int n3) {
        return (net.minecraft.q.f.k)cc.b(this.b(n2, n3), this.b);
    }

    @Override
    public boolean a() {
        long l2 = System.currentTimeMillis();
        for (net.minecraft.q.f.k k2 : this.c.c()) {
            k2.b(System.currentTimeMillis() - l2 > 5L);
        }
        if (System.currentTimeMillis() - l2 > 100L) {
            a.d("Warning: Clientside chunk ticking took {} ms", System.currentTimeMillis() - l2);
        }
        return false;
    }

    @Override
    public String b() {
        return "MultiplayerChunkCache: " + this.c.size() + ", " + this.c.size();
    }
}

