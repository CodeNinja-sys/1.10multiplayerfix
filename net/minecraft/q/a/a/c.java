/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.q.a.a;

import com.a.a.c.an;
import com.a.b.k;
import com.a.b.r;
import java.io.File;
import java.lang.reflect.Type;
import net.minecraft.q.a.a.a.a;
import net.minecraft.q.a.a.b;
import net.minecraft.q.a.a.b.h;
import net.minecraft.q.a.a.b.o;
import net.minecraft.q.a.a.d;
import net.minecraft.q.a.a.e;
import net.minecraft.q.a.a.f;
import net.minecraft.q.a.a.i;
import net.minecraft.q.a.a.j;
import net.minecraft.q.a.a.n;
import net.minecraft.q.a.a.p;
import net.minecraft.q.a.a.q;
import net.minecraft.q.a.a.s;
import net.minecraft.q.a.a.t;
import net.minecraft.u.bp;

public class c {
    private static final org.apache.logging.log4j.d a = org.apache.logging.log4j.c.c();
    private static final k b = new r().a((Type)((Object)f.class), (Object)new b()).a((Type)((Object)e.class), (Object)new t()).a((Type)((Object)i.class), (Object)new d()).a(s.class, (Object)new net.minecraft.q.a.a.a()).a(o.class, (Object)new h()).a(a.class, (Object)new net.minecraft.q.a.a.a.h()).a(q.class, (Object)new n()).i();
    private final an c = com.a.a.c.f.a().a(new p(this, null));
    private final File d;

    public c(File file) {
        this.d = file;
        this.a();
    }

    public i a(bp bp2) {
        return (i)this.c.c(bp2);
    }

    public void a() {
        this.c.c();
        for (bp bp2 : j.a()) {
            this.a(bp2);
        }
    }

    static /* synthetic */ org.apache.logging.log4j.d b() {
        return a;
    }

    static /* synthetic */ File a(c c2) {
        return c2.d;
    }

    static /* synthetic */ k c() {
        return b;
    }
}

