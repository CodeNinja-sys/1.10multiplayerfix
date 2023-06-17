/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.s;

import com.a.a.d.ov;
import java.util.ArrayList;
import java.util.List;
import net.minecraft.client.g.d.e;
import net.minecraft.client.g.d.f;
import net.minecraft.s.u;

public class t {
    private f a;

    public t(f f2) {
        this.a = f2;
    }

    public t a(f f2) {
        this.a = f2;
        return this;
    }

    public f a() {
        return this.a;
    }

    public void b() {
        this.a.a();
    }

    public int a(int n2) {
        return this.a.b(n2);
    }

    public int c() {
        return this.a.i();
    }

    public boolean d() {
        return this.a.d();
    }

    public boolean b(int n2) {
        return this.a.a(n2);
    }

    public u c(int n2) {
        return new u(this.a.c(n2));
    }

    public t a(u u2) {
        return this.a(this.a.a(u2.a()));
    }

    public int e() {
        return this.a.e();
    }

    public List f() {
        ArrayList arrayList = ov.a();
        for (e e2 : this.a.h()) {
            arrayList.add(new u(e2));
        }
        return arrayList;
    }

    public boolean g() {
        return this.a.b();
    }

    public int h() {
        return this.a.g();
    }

    public int d(int n2) {
        return this.a.d(n2);
    }

    public int i() {
        return this.a.c();
    }

    public int j() {
        return this.a.f();
    }

    public boolean equals(Object object) {
        return this.a.equals(object);
    }

    public int hashCode() {
        return this.a.hashCode();
    }

    public String toString() {
        return this.a.toString();
    }
}

