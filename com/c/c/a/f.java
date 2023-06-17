/*
 * Decompiled with CFR 0.150.
 */
package com.c.c.a;

import com.c.c.a.g;
import com.c.c.a.w;
import com.c.c.b.z;
import java.io.File;
import java.util.concurrent.TimeUnit;
import org.apache.a.c.c.n;
import org.apache.logging.log4j.c;
import org.apache.logging.log4j.d;

public class f {
    private static final d a = org.apache.logging.log4j.c.c();
    private static final String b = "/upload";
    private volatile boolean c = false;
    private volatile boolean d = false;
    private n e;
    private int f = -1;
    private String g;
    private org.apache.a.c.a.c h = org.apache.a.c.a.c.q().d((int)TimeUnit.MINUTES.toMillis(10L)).c((int)TimeUnit.SECONDS.toMillis(15L)).a();
    private Thread i;

    public void a(File file, long l2, int n2, z z2, String string, String string2, String string3, w w2) {
        if (this.i != null) {
            return;
        }
        this.i = new g(this, z2, l2, n2, string, string2, string3, w2, file);
        this.i.start();
    }

    public void a() {
        this.c = true;
        if (this.e != null) {
            this.e.cK_();
        }
    }

    public boolean b() {
        return this.d;
    }

    public int c() {
        return this.f;
    }

    public String d() {
        return this.g;
    }

    static /* synthetic */ n a(f f2, n n2) {
        f2.e = n2;
        return f2.e;
    }

    static /* synthetic */ org.apache.a.c.a.c a(f f2) {
        return f2.h;
    }

    static /* synthetic */ n b(f f2) {
        return f2.e;
    }

    static /* synthetic */ d e() {
        return a;
    }

    static /* synthetic */ int a(f f2, int n2) {
        f2.f = n2;
        return f2.f;
    }

    static /* synthetic */ String a(f f2, String string) {
        f2.g = string;
        return f2.g;
    }

    static /* synthetic */ boolean c(f f2) {
        return f2.c;
    }

    static /* synthetic */ boolean a(f f2, boolean bl2) {
        f2.d = bl2;
        return f2.d;
    }
}

