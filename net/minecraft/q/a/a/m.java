/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.q.a.a;

import com.a.a.d.aad;
import java.util.Set;
import net.minecraft.q.a.a.c;
import net.minecraft.q.a.a.i;
import net.minecraft.q.a.a.q;
import net.minecraft.q.v;
import net.minecraft.w.a.b;
import net.minecraft.w.n;

public class m {
    private final float a;
    private final v b;
    private final c c;
    private final n d;
    private final b e;
    private final net.minecraft.u.n f;
    private final Set g = aad.c();

    public m(float f2, v v2, c c2, n n2, b b2, net.minecraft.u.n n3) {
        this.a = f2;
        this.b = v2;
        this.c = c2;
        this.d = n2;
        this.e = b2;
        this.f = n3;
    }

    public n a() {
        return this.d;
    }

    public n b() {
        return this.e;
    }

    public n c() {
        return this.f == null ? null : this.f.j();
    }

    public boolean a(i i2) {
        return this.g.add(i2);
    }

    public void b(i i2) {
        this.g.remove(i2);
    }

    public c d() {
        return this.c;
    }

    public float e() {
        return this.a;
    }

    public n a(q q2) {
        switch (q2) {
            case a: {
                return this.a();
            }
            case b: {
                return this.c();
            }
            case c: {
                return this.b();
            }
        }
        return null;
    }
}

