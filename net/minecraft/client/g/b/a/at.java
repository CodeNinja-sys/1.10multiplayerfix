/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.client.g.b.a;

import com.a.a.d.ov;
import java.util.List;
import net.minecraft.client.g.b.a.av;
import net.minecraft.m.cu;
import net.minecraft.q.k;
import net.minecraft.u.bp;
import net.minecraft.w.l;

public class at {
    public static final at a = new at();
    private final List b = ov.a();

    private at() {
    }

    public at(List list) {
        for (int i2 = list.size() - 1; i2 >= 0; --i2) {
            this.b.add((av)list.get(i2));
        }
    }

    public bp a(cu cu2, k k2, l l2) {
        if (!this.b.isEmpty()) {
            for (av av2 : this.b) {
                if (!av2.a(cu2, k2, l2)) continue;
                return av2.a();
            }
        }
        return null;
    }
}

