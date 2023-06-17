/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.s;

import com.c.d.b;
import java.util.List;
import net.minecraft.client.f.u;
import net.minecraft.client.f.z;
import net.minecraft.client.h.a;
import net.minecraft.client.k.dd;
import net.minecraft.client.k.de;
import net.minecraft.client.r;
import net.minecraft.m.cu;
import net.minecraft.s.c;
import net.minecraft.s.f;
import net.minecraft.s.k;
import net.minecraft.u.bp;

public class n {
    public static final int f = 8;
    public static final int g = 8;
    public static final int h = 8;
    public static final int i = 8;
    public static final int j = 40;
    public static final int k = 8;
    public static final int l = 8;
    public static final int m = 8;
    public static final int n = 64;
    public static final int o = 64;
    protected r p;
    public int q;
    public int r;
    private final dd a = new dd(this);

    public dd o() {
        return this.a;
    }

    public void d() {
    }

    public void a(r r2, int n2, int n3) {
    }

    public void a(String string, int n2, int n3, int n4) {
        this.a.a(string, n2, n3, n4);
    }

    public void b(String string, int n2, int n3, int n4) {
        this.a(string, n2, n3, n4, true);
    }

    public void a(String string, int n2, int n3, int n4, boolean bl2) {
        this.a.a(string, n2, n3, n4, false);
    }

    public void a(int n2, int n3, int n4, int n5, int n6, int n7) {
        this.a.a_(n2, n3, n4, n5, n6, n7);
    }

    public static void a(int n2, int n3, float f2, float f3, int n4, int n5, int n6, int n7, float f4, float f5) {
        de.a(n2, n3, f2, f3, n4, n5, n6, n7, f4, f5);
    }

    public static void a(int n2, int n3, float f2, float f3, int n4, int n5, float f4, float f5) {
        de.a(n2, n3, f2, f3, n4, n5, f4, f5);
    }

    public void b(int n2, int n3, int n4, int n5, int n6, int n7) {
        this.a.b(n2, n3, n4, n5, n6, n7);
    }

    public void p() {
        this.a.m();
    }

    public boolean q() {
        return this.a.cq_();
    }

    public void c(int n2) {
        this.a.b(n2);
    }

    public void a(int n2, int n3, float f2) {
        for (int i2 = 0; i2 < this.a.i().size(); ++i2) {
            ((f)this.a.i().get(i2)).a(n2, n3);
        }
    }

    public void a(cu cu2, int n2, int n3) {
        this.a.a(cu2, n2, n3);
    }

    public void b(String string, int n2, int n3) {
        this.a.a(string, n2, n3);
    }

    public void a(List list, int n2, int n3) {
        this.a.a(list, n2, n3);
    }

    public static void b(String string, String string2) {
        bp bp2 = net.minecraft.client.h.a.a(string2);
        if (bp2 == null) {
            bp2 = z.a(b.b(string));
        }
        net.minecraft.client.h.a.a(bp2, string2);
        net.minecraft.client.r.z().N().a(bp2);
    }

    public static void d(String string) {
        bp bp2 = new bp(string);
        net.minecraft.client.r.z().N().a(bp2);
    }

    public void g() {
    }

    public int r() {
        return this.a.p;
    }

    public int s() {
        return this.a.q;
    }

    public int t() {
        return this.a.g();
    }

    public int e(String string) {
        return this.a.a(string);
    }

    public void c(String string, int n2, int n3, int n4) {
        this.a.b(string, n2, n3, n4);
    }

    public List a(String string, int n2) {
        return this.a.a(string, n2);
    }

    public void a(f f2) {
    }

    public static f a(int n2, int n3, int n4, String string) {
        return new f(n2, n3, n4, string);
    }

    public static f a(int n2, int n3, int n4, int n5, int n6, String string) {
        return new f(n2, n3, n4, n5, n6, string);
    }

    public void u() {
        this.a.h();
    }

    public void b(f f2) {
        this.a.a(f2);
    }

    public List v() {
        return this.a.i();
    }

    public void c(f f2) {
        this.a.b(f2);
    }

    public k a(int n2, int n3, int n4, int n5, int n6) {
        return new k(n2, n3, n4, n5, n6);
    }

    public void a(int n2, int n3, int n4) {
    }

    public void a() {
    }

    public void w() {
    }

    public void b(int n2, int n3, int n4) {
    }

    public void a(int n2, int n3, int n4, long l2) {
    }

    public void a(char c2, int n2) {
    }

    public void a(boolean bl2, int n2) {
    }

    public static String f(String string) {
        return u.a(string, new Object[0]);
    }

    public static String a(String string, Object ... arrobject) {
        return u.a(string, arrobject);
    }

    public c x() {
        return new c(net.minecraft.client.r.z().g());
    }

    public void h() {
    }
}

