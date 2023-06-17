/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.client.f;

import com.a.a.c.an;
import com.c.a.c.g;
import com.c.a.c.i;
import java.io.File;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import net.minecraft.client.f.aa;
import net.minecraft.client.f.f;
import net.minecraft.client.f.m;
import net.minecraft.client.f.p;
import net.minecraft.client.f.z;
import net.minecraft.client.g.a.c;
import net.minecraft.client.g.a.t;
import net.minecraft.client.g.h;
import net.minecraft.u.bp;

public class e {
    private static final ExecutorService a = new ThreadPoolExecutor(0, 2, 1L, TimeUnit.MINUTES, new LinkedBlockingQueue<Runnable>());
    private final c b;
    private final File c;
    private final i d;
    private final an e;

    public e(c c2, File file, i i2) {
        this.b = c2;
        this.c = file;
        this.d = i2;
        this.e = com.a.a.c.f.a().b(15L, TimeUnit.SECONDS).a(new m(this));
    }

    public bp a(g g2, com.c.a.c.h h2) {
        return this.a(g2, h2, null);
    }

    public bp a(g g2, com.c.a.c.h h2, f f2) {
        bp bp2 = new bp("skins/" + g2.b());
        t t2 = this.b.b(bp2);
        if (t2 != null) {
            if (f2 != null) {
                f2.a(h2, bp2, g2);
            }
        } else {
            File file = new File(this.c, g2.b().length() > 2 ? g2.b().substring(0, 2) : "xx");
            File file2 = new File(file, g2.b());
            net.minecraft.client.g.e e2 = h2 == com.c.a.c.h.a ? new net.minecraft.client.g.e() : null;
            h h3 = new h(file2, g2.a(), z.a(), new aa(this, e2, f2, h2, bp2, g2));
            this.b.a(bp2, h3);
        }
        return bp2;
    }

    public void a(com.c.a.e e2, f f2, boolean bl2) {
        a.submit(new p(this, e2, bl2, f2));
    }

    public Map a(com.c.a.e e2) {
        return (Map)this.e.c(e2);
    }

    static /* synthetic */ i a(e e2) {
        return e2.d;
    }
}

