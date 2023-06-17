/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.w.b;

import com.a.a.d.ov;
import java.util.List;
import net.minecraft.w.f;
import net.minecraft.w.n;

public class v {
    f a;
    List b = ov.a();
    List c = ov.a();

    public v(f f2) {
        this.a = f2;
    }

    public void a() {
        this.b.clear();
        this.c.clear();
    }

    public boolean a(n n2) {
        if (this.b.contains(n2)) {
            return true;
        }
        if (this.c.contains(n2)) {
            return false;
        }
        this.a.aQ.A.a("canSee");
        boolean bl2 = this.a.l(n2);
        this.a.aQ.A.b();
        if (bl2) {
            this.b.add(n2);
        } else {
            this.c.add(n2);
        }
        return bl2;
    }
}

