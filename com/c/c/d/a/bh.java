/*
 * Decompiled with CFR 0.150.
 */
package com.c.c.d.a;

import com.c.c.a.w;
import com.c.c.d.a.aq;
import com.c.c.d.a.bi;
import com.c.c.d.a.bj;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.util.concurrent.locks.ReentrantLock;
import java.util.zip.GZIPOutputStream;
import net.minecraft.s.b;
import net.minecraft.s.f;
import net.minecraft.s.j;
import net.minecraft.s.l;
import net.minecraft.s.n;
import net.minecraft.s.q;
import net.minecraft.s.v;
import org.apache.commons.compress.archivers.a;
import org.apache.commons.compress.c.i;
import org.apache.logging.log4j.c;
import org.apache.logging.log4j.d;
import org.lwjgl.a.g;
import org.lwjgl.opengl.GL11;

public class bh
extends n {
    private static final d a = org.apache.logging.log4j.c.c();
    private static final int b = 0;
    private static final int c = 1;
    private final aq d;
    private final l e;
    private final long s;
    private final int t;
    private final w u;
    private volatile String v = null;
    private volatile String w = null;
    private volatile String x = null;
    private volatile boolean y = false;
    private volatile boolean z = false;
    private volatile boolean A = true;
    private volatile boolean B = false;
    private f C;
    private f D;
    private int E = 0;
    private static final String[] F = new String[]{"", ".", ". .", ". . ."};
    private int G = 0;
    private Long H = null;
    private Long I = null;
    private long J = 0L;
    private static final ReentrantLock K = new ReentrantLock();
    private static final int L = 1024;

    public bh(long l2, int n2, aq aq2, l l3) {
        this.s = l2;
        this.t = n2;
        this.d = aq2;
        this.e = l3;
        this.u = new w();
    }

    @Override
    public void d() {
        org.lwjgl.a.g.a(true);
        this.u();
        this.C = bh.a(1, this.r() / 2 - 100, this.s() - 42, 200, 20, bh.f("gui.back"));
        this.D = bh.a(0, this.r() / 2 - 100, this.s() - 42, 200, 20, bh.f("gui.cancel"));
        this.b(this.D);
        if (!this.B) {
            if (this.d.a != -1) {
                this.d.a(this);
            } else {
                this.j();
            }
        }
    }

    @Override
    public void a(boolean bl2, int n2) {
        if (bl2 && !this.B) {
            this.B = true;
            net.minecraft.s.b.a(this);
            this.j();
        }
    }

    @Override
    public void h() {
        org.lwjgl.a.g.a(false);
    }

    @Override
    public void a(f f2) {
        if (!f2.d()) {
            return;
        }
        if (f2.c() == 1) {
            this.d.a(true, 0);
        } else if (f2.c() == 0) {
            this.y = true;
            net.minecraft.s.b.a(this.d);
        }
    }

    @Override
    public void a(char c2, int n2) {
        if (n2 == 1) {
            if (!this.A) {
                this.a(this.C);
            } else {
                this.a(this.D);
            }
        }
    }

    @Override
    public void a(int n2, int n3, float f2) {
        this.p();
        if (!this.z && this.u.a != 0L && this.u.a.longValue() == this.u.b.longValue()) {
            this.w = bh.f("mco.upload.verifying");
            this.D.b(false);
        }
        this.a(this.w, this.r() / 2, 50, 0xFFFFFF);
        if (this.A) {
            this.e();
        }
        if (this.u.a != 0L && !this.y) {
            this.f();
            this.i();
        }
        if (this.v != null) {
            String[] arrstring = this.v.split("\\\\n");
            for (int i2 = 0; i2 < arrstring.length; ++i2) {
                this.a(arrstring[i2], this.r() / 2, 110 + 12 * i2, 0xFF0000);
            }
        }
        super.a(n2, n3, f2);
    }

    private void e() {
        int n2 = this.e(this.w);
        if (this.E % 10 == 0) {
            ++this.G;
        }
        this.b(F[this.G % F.length], this.r() / 2 + n2 / 2 + 5, 50, 0xFFFFFF);
    }

    private void f() {
        double d2 = this.u.a.doubleValue() / this.u.b.doubleValue() * 100.0;
        if (d2 > 100.0) {
            d2 = 100.0;
        }
        this.x = String.format("%.1f", d2);
        GL11.c(1.0f, 1.0f, 1.0f, 1.0f);
        GL11.l(3553);
        double d3 = this.r() / 2 - 100;
        double d4 = 0.5;
        v v2 = net.minecraft.s.v.b;
        v2.a(7, net.minecraft.s.j.f);
        v2.a(d3 - 0.5, 95.5, 0.0).a(217, 210, 210, 255).c();
        v2.a(d3 + 200.0 * d2 / 100.0 + 0.5, 95.5, 0.0).a(217, 210, 210, 255).c();
        v2.a(d3 + 200.0 * d2 / 100.0 + 0.5, 79.5, 0.0).a(217, 210, 210, 255).c();
        v2.a(d3 - 0.5, 79.5, 0.0).a(217, 210, 210, 255).c();
        v2.a(d3, 95.0, 0.0).a(128, 128, 128, 255).c();
        v2.a(d3 + 200.0 * d2 / 100.0, 95.0, 0.0).a(128, 128, 128, 255).c();
        v2.a(d3 + 200.0 * d2 / 100.0, 80.0, 0.0).a(128, 128, 128, 255).c();
        v2.a(d3, 80.0, 0.0).a(128, 128, 128, 255).c();
        v2.a();
        GL11.k(3553);
        this.a(this.x + " %", this.r() / 2, 84, 0xFFFFFF);
    }

    private void i() {
        if (this.E % net.minecraft.s.q.b == 0) {
            if (this.H != null) {
                long l2 = System.currentTimeMillis() - this.I;
                if (l2 == 0L) {
                    l2 = 1L;
                }
                this.J = 1000L * (this.u.a - this.H) / l2;
                this.c(this.J);
            }
            this.H = this.u.a;
            this.I = System.currentTimeMillis();
        } else {
            this.c(this.J);
        }
    }

    private void c(long l2) {
        if (l2 > 0L) {
            int n2 = this.e(this.x);
            String string = "(" + bh.a(l2) + ")";
            this.b(string, this.r() / 2 + n2 / 2 + 15, 84, 0xFFFFFF);
        }
    }

    public static String a(long l2) {
        int n2 = 1024;
        if (l2 < (long)n2) {
            return l2 + " B";
        }
        int n3 = (int)(Math.log(l2) / Math.log(n2));
        String string = "KMGTPE".charAt(n3 - 1) + "";
        return String.format("%.1f %sB/s", (double)l2 / Math.pow(n2, n3), string);
    }

    @Override
    public void a() {
        super.a();
    }

    @Override
    public void g() {
        super.g();
        ++this.E;
    }

    public static bj b(long l2) {
        if (l2 < 1024L) {
            return bj.a;
        }
        int n2 = (int)(Math.log(l2) / Math.log(1024.0));
        String string = "KMGTPE".charAt(n2 - 1) + "";
        try {
            return bj.valueOf(string + "B");
        }
        catch (Exception exception) {
            return bj.d;
        }
    }

    public static double a(long l2, bj bj2) {
        if (bj2.equals((Object)bj.a)) {
            return l2;
        }
        return (double)l2 / Math.pow(1024.0, bj2.ordinal());
    }

    public static String b(long l2, bj bj2) {
        return String.format("%." + (bj2.equals((Object)bj.d) ? "1" : "0") + "f %s", bh.a(l2, bj2), bj2.name());
    }

    private void j() {
        this.B = true;
        new bi(this).start();
    }

    private void d(long l2) {
        this.w = bh.f("mco.upload.cancelled");
        a.a("Upload was cancelled");
    }

    private boolean a(File file) {
        return file.length() < 0x40000000L;
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    private File b(File file) {
        org.apache.commons.compress.archivers.g.c c2 = null;
        try {
            File file2 = File.createTempFile("realms-upload-file", ".tar.gz");
            c2 = new org.apache.commons.compress.archivers.g.c(new GZIPOutputStream(new FileOutputStream(file2)));
            this.a(c2, file.getAbsolutePath(), "world", true);
            c2.b();
            File file3 = file2;
            return file3;
        }
        finally {
            if (c2 != null) {
                c2.close();
            }
        }
    }

    private void a(org.apache.commons.compress.archivers.g.c c2, String string, String string2, boolean bl2) {
        if (this.y) {
            return;
        }
        File file = new File(string);
        String string3 = bl2 ? string2 : string2 + file.getName();
        org.apache.commons.compress.archivers.g.a a2 = new org.apache.commons.compress.archivers.g.a(file, string3);
        c2.a((a)a2);
        if (file.isFile()) {
            org.apache.commons.compress.c.i.a((InputStream)new FileInputStream(file), c2);
            c2.a();
        } else {
            c2.a();
            File[] arrfile = file.listFiles();
            if (arrfile != null) {
                for (File file2 : arrfile) {
                    this.a(c2, file2.getAbsolutePath(), string3 + "/", false);
                }
            }
        }
    }

    static /* synthetic */ long a(bh bh2) {
        return bh2.s;
    }

    static /* synthetic */ ReentrantLock b() {
        return K;
    }

    static /* synthetic */ String a(bh bh2, String string) {
        bh2.w = string;
        return bh2.w;
    }

    static /* synthetic */ boolean b(bh bh2) {
        return bh2.y;
    }

    static /* synthetic */ void a(bh bh2, long l2) {
        bh2.d(l2);
    }

    static /* synthetic */ l c(bh bh2) {
        return bh2.e;
    }

    static /* synthetic */ File a(bh bh2, File file) {
        return bh2.b(file);
    }

    static /* synthetic */ boolean b(bh bh2, File file) {
        return bh2.a(file);
    }

    static /* synthetic */ String b(bh bh2, String string) {
        bh2.v = string;
        return bh2.v;
    }

    static /* synthetic */ int d(bh bh2) {
        return bh2.t;
    }

    static /* synthetic */ w e(bh bh2) {
        return bh2.u;
    }

    static /* synthetic */ d c() {
        return a;
    }

    static /* synthetic */ boolean a(bh bh2, boolean bl2) {
        bh2.z = bl2;
        return bh2.z;
    }

    static /* synthetic */ f f(bh bh2) {
        return bh2.C;
    }

    static /* synthetic */ boolean b(bh bh2, boolean bl2) {
        bh2.A = bl2;
        return bh2.A;
    }
}

