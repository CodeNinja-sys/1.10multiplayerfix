/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.client.k.c;

import com.a.a.b.cc;
import com.a.a.d.ov;
import java.util.ArrayList;
import java.util.List;
import net.minecraft.client.k.c.a;
import net.minecraft.client.k.c.b;
import net.minecraft.client.k.c.c;
import net.minecraft.client.k.c.e;
import net.minecraft.client.k.c.f;
import net.minecraft.client.k.c.h;
import net.minecraft.client.k.c.i;

public class j {
    private static final f b = new c(null);
    private static final f c = new e(-1, true);
    private static final f d = new e(1, true);
    private static final f e = new e(1, false);
    public static final f a = new a();
    private final i f;
    private final List g = ov.a();
    private h h = new b();
    private int i = -1;
    private int j;

    public j(i i2) {
        this.f = i2;
    }

    public f a(int n2) {
        int n3 = n2 + this.j * 6;
        return this.j > 0 && n2 == 0 ? c : (n2 == 7 ? (n3 < this.h.a().size() ? d : e) : (n2 == 8 ? b : (n3 >= 0 && n3 < this.h.a().size() ? (f)cc.b((f)this.h.a().get(n3), a) : a)));
    }

    public List a() {
        ArrayList arrayList = ov.a();
        for (int i2 = 0; i2 <= 8; ++i2) {
            arrayList.add(this.a(i2));
        }
        return arrayList;
    }

    public f b() {
        return this.a(this.i);
    }

    public h c() {
        return this.h;
    }

    public void b(int n2) {
        f f2 = this.a(n2);
        if (f2 != a) {
            if (this.i == n2 && f2.cv_()) {
                f2.a(this);
            } else {
                this.i = n2;
            }
        }
    }

    public void d() {
        this.f.a(this);
    }

    public int e() {
        return this.i;
    }

    public void a(h h2) {
        this.g.add(this.f());
        this.h = h2;
        this.i = -1;
        this.j = 0;
    }

    public net.minecraft.client.k.c.a.a f() {
        return new net.minecraft.client.k.c.a.a(this.h, this.a(), this.i);
    }

    static /* synthetic */ void a(j j2, int n2) {
        j2.j = n2;
    }
}

