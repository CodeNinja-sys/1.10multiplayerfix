/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.x.d.b;

import com.a.a.d.ov;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.UUID;
import net.minecraft.w.b.a.h;
import net.minecraft.w.b.a.i;
import net.minecraft.x.d.a;
import net.minecraft.x.d.b.t;
import net.minecraft.x.p;

public class ch
implements p {
    private int a;
    private final List b = ov.a();

    public ch() {
    }

    public ch(int n2, Collection collection) {
        this.a = n2;
        for (i i2 : collection) {
            this.b.add(new t(this, i2.a().b(), i2.b(), i2.c()));
        }
    }

    @Override
    public void a(net.minecraft.x.a a2) {
        this.a = a2.e();
        int n2 = a2.K();
        for (int i2 = 0; i2 < n2; ++i2) {
            String string = a2.e(64);
            double d2 = a2.P();
            ArrayList arrayList = ov.a();
            int n3 = a2.e();
            for (int i3 = 0; i3 < n3; ++i3) {
                UUID uUID = a2.g();
                arrayList.add(new h(uUID, "Unknown synced attribute modifier", a2.P(), a2.E()));
            }
            this.b.add(new t(this, string, d2, arrayList));
        }
    }

    @Override
    public void b(net.minecraft.x.a a2) {
        a2.d(this.a);
        a2.E(this.b.size());
        for (t t2 : this.b) {
            a2.a(t2.a());
            a2.a(t2.b());
            a2.d(t2.c().size());
            for (h h2 : t2.c()) {
                a2.a(h2.a());
                a2.a(h2.d());
                a2.B(h2.c());
            }
        }
    }

    public void a(a a2) {
        a2.a(this);
    }

    public int a() {
        return this.a;
    }

    public List b() {
        return this.b;
    }
}

