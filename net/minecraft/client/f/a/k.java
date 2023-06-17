/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.client.f.a;

import com.a.a.d.aad;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import net.minecraft.client.f.a.a;
import net.minecraft.client.f.a.e;

public class k
implements a {
    private final List a;
    private final int b;
    private final int c;
    private final int d;
    private final boolean e;

    public k(List list, int n2, int n3, int n4, boolean bl2) {
        this.a = list;
        this.b = n2;
        this.c = n3;
        this.d = n4;
        this.e = bl2;
    }

    public int a() {
        return this.c;
    }

    public int b() {
        return this.b;
    }

    public int c() {
        return this.a.size();
    }

    public int d() {
        return this.d;
    }

    public boolean e() {
        return this.e;
    }

    private e d(int n2) {
        return (e)this.a.get(n2);
    }

    public int a(int n2) {
        e e2 = this.d(n2);
        return e2.a() ? this.d : e2.b();
    }

    public boolean b(int n2) {
        return !((e)this.a.get(n2)).a();
    }

    public int c(int n2) {
        return ((e)this.a.get(n2)).c();
    }

    public Set f() {
        HashSet hashSet = aad.a();
        for (e e2 : this.a) {
            hashSet.add(e2.c());
        }
        return hashSet;
    }
}

