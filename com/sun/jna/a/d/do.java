/*
 * Decompiled with CFR 0.150.
 */
package com.sun.jna.a.d;

import com.sun.jna.a.a;
import com.sun.jna.a.b;
import com.sun.jna.a.d.ac;
import com.sun.jna.a.d.ad;
import com.sun.jna.a.d.dp;
import com.sun.jna.a.d.dq;
import com.sun.jna.a.d.dz;
import com.sun.jna.a.d.ge;
import com.sun.jna.a.d.gf;
import com.sun.jna.a.d.m;
import com.sun.jna.b.e;
import com.sun.jna.b.h;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class do
extends a {
    private static final int l = 4096;
    private Thread m;
    private gf n;
    private final Map o = new HashMap();
    private final Map p = new HashMap();
    private boolean q = false;
    private static int r;

    private void a(dq dq2) {
        ac ac2 = ac.g;
        ge ge2 = dq2.e;
        ge2.j();
        do {
            b b2 = null;
            File file = new File(dq2.a, ge2.s());
            switch (ge2.b) {
                case 0: {
                    break;
                }
                case 3: {
                    b2 = new b(this, file, 4);
                    break;
                }
                case 1: {
                    b2 = new b(this, file, 1);
                    break;
                }
                case 2: {
                    b2 = new b(this, file, 2);
                    break;
                }
                case 4: {
                    b2 = new b(this, file, 16);
                    break;
                }
                case 5: {
                    b2 = new b(this, file, 32);
                    break;
                }
                default: {
                    System.err.println("Unrecognized file action '" + ge2.b + "'");
                }
            }
            if (b2 == null) continue;
            this.a(b2);
        } while ((ge2 = ge2.t()) != null);
        if (!dq2.a.exists()) {
            this.a(dq2.a);
            return;
        }
        if (!ac2.a(dq2.b, dq2.e, dq2.e.e(), dq2.d, dq2.c, dq2.f, dq2.g, null) && !this.q) {
            int n2 = ac2.f();
            throw new IOException("ReadDirectoryChangesW failed on " + dq2.a + ": '" + ad.a(n2) + "' (" + n2 + ")");
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    private dq c() {
        ac ac2 = ac.g;
        e e2 = new e();
        m m2 = new m();
        h h2 = new h();
        ac2.a(this.n, e2, m2, h2, -1);
        do do_ = this;
        synchronized (do_) {
            return (dq)this.p.get(m2.d());
        }
    }

    private int a(int n2) {
        int n3 = 0;
        if ((n2 & 1) != 0) {
            n3 |= 0x40;
        }
        if ((n2 & 2) != 0) {
            n3 |= 3;
        }
        if ((n2 & 4) != 0) {
            n3 |= 0x10;
        }
        if ((n2 & 0x30) != 0) {
            n3 |= 3;
        }
        if ((n2 & 0x40) != 0) {
            n3 |= 8;
        }
        if ((n2 & 8) != 0) {
            n3 |= 0x20;
        }
        if ((n2 & 0x80) != 0) {
            n3 |= 4;
        }
        if ((n2 & 0x100) != 0) {
            n3 |= 0x100;
        }
        return n3;
    }

    protected synchronized void a(File file, int n2, boolean bl2) {
        File file2 = file;
        if (!file2.isDirectory()) {
            bl2 = false;
            file2 = file.getParentFile();
        }
        while (file2 != null && !file2.exists()) {
            bl2 = true;
            file2 = file2.getParentFile();
        }
        if (file2 == null) {
            throw new FileNotFoundException("No ancestor found for " + file);
        }
        ac ac2 = ac.g;
        int n3 = 7;
        int n4 = 0x42000000;
        gf gf2 = ac2.a(file.getAbsolutePath(), 1, n3, null, 3, n4, null);
        if (dz.T_.equals(gf2)) {
            throw new IOException("Unable to open " + file + " (" + ac2.f() + ")");
        }
        int n5 = this.a(n2);
        dq dq2 = new dq(this, file, gf2, n5, bl2);
        this.o.put(file, dq2);
        this.p.put(gf2, dq2);
        this.n = ac2.a(gf2, this.n, gf2.c(), 0);
        if (dz.T_.equals(this.n)) {
            throw new IOException("Unable to create/use I/O Completion port for " + file + " (" + ac2.f() + ")");
        }
        if (!ac2.a(gf2, dq2.e, dq2.e.e(), bl2, n5, dq2.f, dq2.g, null)) {
            int n6 = ac2.f();
            throw new IOException("ReadDirectoryChangesW failed on " + dq2.a + ", handle " + gf2 + ": '" + ad.a(n6) + "' (" + n6 + ")");
        }
        if (this.m == null) {
            this.m = new dp(this, "W32 File Monitor-" + r++);
            this.m.setDaemon(true);
            this.m.start();
        }
    }

    protected synchronized void a(File file) {
        dq dq2 = (dq)this.o.remove(file);
        if (dq2 != null) {
            this.p.remove(dq2.b);
            ac ac2 = ac.g;
            ac2.b(dq2.b);
        }
    }

    public synchronized void a() {
        this.q = true;
        int n2 = 0;
        Object object = this.o.keySet().toArray();
        while (!this.o.isEmpty()) {
            this.a((File)object[n2++]);
        }
        object = ac.g;
        object.a(this.n, 0, null, null);
        object.b(this.n);
        this.n = null;
        this.m = null;
    }

    static /* synthetic */ dq a(do do_) {
        return do_.c();
    }

    static /* synthetic */ Map b(do do_) {
        return do_.o;
    }

    static /* synthetic */ Thread a(do do_, Thread thread) {
        do_.m = thread;
        return do_.m;
    }

    static /* synthetic */ void a(do do_, dq dq2) {
        do_.a(dq2);
    }
}

