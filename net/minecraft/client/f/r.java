/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.client.f;

import java.io.IOException;
import net.minecraft.client.f.j;
import net.minecraft.client.f.s;
import net.minecraft.client.g.a.p;
import net.minecraft.q.b;
import net.minecraft.u.bp;

public class r
implements j {
    private static final bp a = new bp("textures/colormap/foliage.png");

    @Override
    public void a(s s2) {
        try {
            b.a(p.a(s2, a));
        }
        catch (IOException iOException) {
            // empty catch block
        }
    }
}

