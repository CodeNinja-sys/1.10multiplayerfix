/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.client.k;

import com.a.a.d.ov;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import net.minecraft.client.k.b;
import net.minecraft.client.k.cc;
import net.minecraft.client.k.ch;
import net.minecraft.m.cu;
import net.minecraft.s.f;
import net.minecraft.s.n;

public class dd
extends cc {
    private final n a;

    public dd(n n2) {
        this.a = n2;
        this.r = Collections.synchronizedList(ov.a());
    }

    public n f() {
        return this.a;
    }

    @Override
    public void ct_() {
        this.a.d();
        super.ct_();
    }

    public void a(String string, int n2, int n3, int n4) {
        super.a(this.u, string, n2, n3, n4);
    }

    public void a(String string, int n2, int n3, int n4, boolean bl2) {
        if (bl2) {
            super.b(this.u, string, n2, n3, n4);
        } else {
            this.u.a(string, n2, n3, n4);
        }
    }

    @Override
    public void a_(int n2, int n3, int n4, int n5, int n6, int n7) {
        this.a.a(n2, n3, n4, n5, n6, n7);
        super.a_(n2, n3, n4, n5, n6, n7);
    }

    @Override
    public void b(int n2, int n3, int n4, int n5, int n6, int n7) {
        super.b(n2, n3, n4, n5, n6, n7);
    }

    @Override
    public void m() {
        super.m();
    }

    @Override
    public boolean cq_() {
        return super.cq_();
    }

    @Override
    public void b(int n2) {
        super.b(n2);
    }

    @Override
    public void a(int n2, int n3, float f2) {
        this.a.a(n2, n3, f2);
    }

    @Override
    public void a(cu cu2, int n2, int n3) {
        super.a(cu2, n2, n3);
    }

    @Override
    public void a(String string, int n2, int n3) {
        super.a(string, n2, n3);
    }

    @Override
    public void a(List list, int n2, int n3) {
        super.a(list, n2, n3);
    }

    @Override
    public void bY_() {
        this.a.g();
        super.bY_();
    }

    public int g() {
        return this.u.a;
    }

    public int a(String string) {
        return this.u.a(string);
    }

    public void b(String string, int n2, int n3, int n4) {
        this.u.a(string, (float)n2, (float)n3, n4);
    }

    public List a(String string, int n2) {
        return this.u.c(string, n2);
    }

    @Override
    public final void a(ch ch2) {
        this.a.a(((b)ch2).e());
    }

    public void h() {
        this.r.clear();
    }

    public void a(f f2) {
        this.r.add(f2.b());
    }

    public List i() {
        ArrayList arrayList = ov.c(this.r.size());
        for (ch ch2 : this.r) {
            arrayList.add(((b)ch2).e());
        }
        return arrayList;
    }

    public void b(f f2) {
        this.r.remove(f2.b());
    }

    @Override
    public void a(int n2, int n3, int n4) {
        this.a.a(n2, n3, n4);
        super.a(n2, n3, n4);
    }

    @Override
    public void cp_() {
        this.a.a();
        super.cp_();
    }

    @Override
    public void l() {
        this.a.w();
        super.l();
    }

    @Override
    public void b(int n2, int n3, int n4) {
        this.a.b(n2, n3, n4);
    }

    @Override
    public void a(int n2, int n3, int n4, long l2) {
        this.a.a(n2, n3, n4, l2);
    }

    @Override
    public void a(char c2, int n2) {
        this.a.a(c2, n2);
    }

    @Override
    public void a(boolean bl2, int n2) {
        this.a.a(bl2, n2);
    }

    @Override
    public void cs_() {
        this.a.h();
        super.cs_();
    }
}

