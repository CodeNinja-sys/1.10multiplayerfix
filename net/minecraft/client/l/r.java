/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.client.l;

import com.a.a.b.cc;
import com.a.a.d.sz;
import com.c.a.e;
import java.util.Map;
import net.minecraft.client.f.z;
import net.minecraft.client.l.h;
import net.minecraft.j.d;
import net.minecraft.q.am;
import net.minecraft.u.bp;
import net.minecraft.u.d.a;
import net.minecraft.x.d.b.bj;

public class r {
    private final e b;
    Map a = sz.a(com.c.a.c.h.class);
    private am c;
    private int d;
    private boolean e;
    private String f;
    private a g;
    private int h;
    private int i;
    private long j;
    private long k;
    private long l;

    public r(e e2) {
        this.b = e2;
    }

    public r(bj bj2) {
        this.b = bj2.a();
        this.c = bj2.c();
        this.d = bj2.b();
        this.g = bj2.d();
    }

    public e a() {
        return this.b;
    }

    public am b() {
        return this.c;
    }

    protected void a(am am2) {
        this.c = am2;
    }

    public int c() {
        return this.d;
    }

    protected void a(int n2) {
        this.d = n2;
    }

    public boolean d() {
        return this.f() != null;
    }

    public String e() {
        return this.f == null ? z.b(this.b.a()) : this.f;
    }

    public bp f() {
        this.j();
        return (bp)cc.b((bp)this.a.get((Object)com.c.a.c.h.a), z.a(this.b.a()));
    }

    public bp g() {
        this.j();
        return (bp)this.a.get((Object)com.c.a.c.h.b);
    }

    public bp h() {
        this.j();
        return (bp)this.a.get((Object)com.c.a.c.h.c);
    }

    public d i() {
        return net.minecraft.client.r.z().h.Q().g(this.a().b());
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    protected void j() {
        r r2 = this;
        synchronized (r2) {
            if (!this.e) {
                this.e = true;
                net.minecraft.client.r.z().Y().a(this.b, new h(this), true);
            }
        }
    }

    public void a(a a2) {
        this.g = a2;
    }

    public a k() {
        return this.g;
    }

    public int l() {
        return this.h;
    }

    public void b(int n2) {
        this.h = n2;
    }

    public int m() {
        return this.i;
    }

    public void c(int n2) {
        this.i = n2;
    }

    public long n() {
        return this.j;
    }

    public void a(long l2) {
        this.j = l2;
    }

    public long o() {
        return this.k;
    }

    public void b(long l2) {
        this.k = l2;
    }

    public long p() {
        return this.l;
    }

    public void c(long l2) {
        this.l = l2;
    }

    static /* synthetic */ void a(r r2, String string) {
        r2.f = string;
    }

    static /* synthetic */ String a(r r2) {
        return r2.f;
    }
}

