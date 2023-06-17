/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.u.d;

import net.minecraft.u.d.a.a;
import net.minecraft.u.d.d;
import net.minecraft.u.d.o;

public class c {
    private c a;
    private o b;
    private Boolean c;
    private Boolean d;
    private Boolean e;
    private Boolean f;
    private Boolean g;
    private a h;
    private net.minecraft.u.d.a.c i;
    private String j;
    private static final c k = new d();

    public o a() {
        return this.b == null ? this.n().a() : this.b;
    }

    public boolean b() {
        return this.c == null ? this.n().b() : this.c.booleanValue();
    }

    public boolean c() {
        return this.d == null ? this.n().c() : this.d.booleanValue();
    }

    public boolean d() {
        return this.f == null ? this.n().d() : this.f.booleanValue();
    }

    public boolean e() {
        return this.e == null ? this.n().e() : this.e.booleanValue();
    }

    public boolean f() {
        return this.g == null ? this.n().f() : this.g.booleanValue();
    }

    public boolean g() {
        return this.c == null && this.d == null && this.f == null && this.e == null && this.g == null && this.b == null && this.h == null && this.i == null && this.j == null;
    }

    public a h() {
        return this.h == null ? this.n().h() : this.h;
    }

    public net.minecraft.u.d.a.c i() {
        return this.i == null ? this.n().i() : this.i;
    }

    public String j() {
        return this.j == null ? this.n().j() : this.j;
    }

    public c a(o o2) {
        this.b = o2;
        return this;
    }

    public c a(Boolean bl2) {
        this.c = bl2;
        return this;
    }

    public c b(Boolean bl2) {
        this.d = bl2;
        return this;
    }

    public c c(Boolean bl2) {
        this.f = bl2;
        return this;
    }

    public c d(Boolean bl2) {
        this.e = bl2;
        return this;
    }

    public c e(Boolean bl2) {
        this.g = bl2;
        return this;
    }

    public c a(a a2) {
        this.h = a2;
        return this;
    }

    public c a(net.minecraft.u.d.a.c c2) {
        this.i = c2;
        return this;
    }

    public c a(String string) {
        this.j = string;
        return this;
    }

    public c a(c c2) {
        this.a = c2;
        return this;
    }

    public String k() {
        if (this.g()) {
            return this.a != null ? this.a.k() : "";
        }
        StringBuilder stringBuilder = new StringBuilder();
        if (this.a() != null) {
            stringBuilder.append((Object)this.a());
        }
        if (this.b()) {
            stringBuilder.append((Object)o.r);
        }
        if (this.c()) {
            stringBuilder.append((Object)o.u);
        }
        if (this.e()) {
            stringBuilder.append((Object)o.t);
        }
        if (this.f()) {
            stringBuilder.append((Object)o.q);
        }
        if (this.d()) {
            stringBuilder.append((Object)o.s);
        }
        return stringBuilder.toString();
    }

    private c n() {
        return this.a == null ? k : this.a;
    }

    public String toString() {
        return "Style{hasParent=" + (this.a != null) + ", color=" + (Object)((Object)this.b) + ", bold=" + this.c + ", italic=" + this.d + ", underlined=" + this.e + ", obfuscated=" + this.g + ", clickEvent=" + this.h() + ", hoverEvent=" + this.i() + ", insertion=" + this.j() + '}';
    }

    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (!(object instanceof c)) {
            return false;
        }
        c c2 = (c)object;
        if (this.b() != c2.b() || this.a() != c2.a() || this.c() != c2.c() || this.f() != c2.f() || this.d() != c2.d() || this.e() != c2.e() || (this.h() == null ? c2.h() != null : !this.h().equals(c2.h())) || (this.i() == null ? c2.i() != null : !this.i().equals(c2.i())) || !(this.j() != null ? this.j().equals(c2.j()) : c2.j() == null)) {
            boolean bl2 = false;
            return bl2;
        }
        boolean bl3 = true;
        return bl3;
    }

    public int hashCode() {
        int n2 = this.b.hashCode();
        n2 = 31 * n2 + this.c.hashCode();
        n2 = 31 * n2 + this.d.hashCode();
        n2 = 31 * n2 + this.e.hashCode();
        n2 = 31 * n2 + this.f.hashCode();
        n2 = 31 * n2 + this.g.hashCode();
        n2 = 31 * n2 + this.h.hashCode();
        n2 = 31 * n2 + this.i.hashCode();
        n2 = 31 * n2 + this.j.hashCode();
        return n2;
    }

    public c l() {
        c c2 = new c();
        c2.c = this.c;
        c2.d = this.d;
        c2.f = this.f;
        c2.e = this.e;
        c2.g = this.g;
        c2.b = this.b;
        c2.h = this.h;
        c2.i = this.i;
        c2.a = this.a;
        c2.j = this.j;
        return c2;
    }

    public c m() {
        c c2 = new c();
        c2.a(this.b());
        c2.b(this.c());
        c2.c(this.d());
        c2.d(this.e());
        c2.e(this.f());
        c2.a(this.a());
        c2.a(this.h());
        c2.a(this.i());
        c2.a(this.j());
        return c2;
    }

    static /* synthetic */ void a(c c2, Boolean bl2) {
        c2.c = bl2;
    }

    static /* synthetic */ void b(c c2, Boolean bl2) {
        c2.d = bl2;
    }

    static /* synthetic */ void c(c c2, Boolean bl2) {
        c2.e = bl2;
    }

    static /* synthetic */ void d(c c2, Boolean bl2) {
        c2.f = bl2;
    }

    static /* synthetic */ void e(c c2, Boolean bl2) {
        c2.g = bl2;
    }

    static /* synthetic */ void a(c c2, o o2) {
        c2.b = o2;
    }

    static /* synthetic */ void a(c c2, String string) {
        c2.j = string;
    }

    static /* synthetic */ void a(c c2, a a2) {
        c2.h = a2;
    }

    static /* synthetic */ void a(c c2, net.minecraft.u.d.a.c c3) {
        c2.i = c3;
    }

    static /* synthetic */ Boolean b(c c2) {
        return c2.c;
    }

    static /* synthetic */ Boolean c(c c2) {
        return c2.d;
    }

    static /* synthetic */ Boolean d(c c2) {
        return c2.e;
    }

    static /* synthetic */ Boolean e(c c2) {
        return c2.f;
    }

    static /* synthetic */ Boolean f(c c2) {
        return c2.g;
    }

    static /* synthetic */ o g(c c2) {
        return c2.b;
    }

    static /* synthetic */ String h(c c2) {
        return c2.j;
    }

    static /* synthetic */ a i(c c2) {
        return c2.h;
    }

    static /* synthetic */ net.minecraft.u.d.a.c j(c c2) {
        return c2.i;
    }
}

