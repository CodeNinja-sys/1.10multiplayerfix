/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.j;

import com.a.a.d.aad;
import java.util.Collection;
import java.util.Set;
import net.minecraft.j.b;
import net.minecraft.j.i;
import net.minecraft.j.n;
import net.minecraft.j.r;
import net.minecraft.u.d.o;

public class d
extends i {
    private final r a;
    private final String b;
    private final Set c = aad.a();
    private String d;
    private String e = "";
    private String f = "";
    private boolean g = true;
    private boolean h = true;
    private n i = n.a;
    private n j = n.a;
    private o k = o.v;
    private b l = net.minecraft.j.b.a;

    public d(r r2, String string) {
        this.a = r2;
        this.b = string;
        this.d = string;
    }

    @Override
    public String a() {
        return this.b;
    }

    public String b() {
        return this.d;
    }

    public void a(String string) {
        if (string == null) {
            throw new IllegalArgumentException("Name cannot be null");
        }
        this.d = string;
        this.a.b(this);
    }

    @Override
    public Collection c() {
        return this.c;
    }

    public String d() {
        return this.e;
    }

    public void b(String string) {
        if (string == null) {
            throw new IllegalArgumentException("Prefix cannot be null");
        }
        this.e = string;
        this.a.b(this);
    }

    public String e() {
        return this.f;
    }

    public void c(String string) {
        this.f = string;
        this.a.b(this);
    }

    @Override
    public String d(String string) {
        return String.valueOf(this.d()) + string + this.e();
    }

    public static String a(i i2, String string) {
        return i2 == null ? string : i2.d(string);
    }

    @Override
    public boolean f() {
        return this.g;
    }

    public void a(boolean bl2) {
        this.g = bl2;
        this.a.b(this);
    }

    @Override
    public boolean g() {
        return this.h;
    }

    public void b(boolean bl2) {
        this.h = bl2;
        this.a.b(this);
    }

    @Override
    public n h() {
        return this.i;
    }

    @Override
    public n i() {
        return this.j;
    }

    public void a(n n2) {
        this.i = n2;
        this.a.b(this);
    }

    public void b(n n2) {
        this.j = n2;
        this.a.b(this);
    }

    @Override
    public b j() {
        return this.l;
    }

    public void a(b b2) {
        this.l = b2;
        this.a.b(this);
    }

    public int k() {
        int n2 = 0;
        if (this.f()) {
            n2 |= 1;
        }
        if (this.g()) {
            n2 |= 2;
        }
        return n2;
    }

    public void a(int n2) {
        this.a((n2 & 1) > 0);
        this.b((n2 & 2) > 0);
    }

    public void a(o o2) {
        this.k = o2;
    }

    @Override
    public o l() {
        return this.k;
    }
}

