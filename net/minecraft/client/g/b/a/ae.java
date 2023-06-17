/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.client.g.b.a;

import com.a.b.aa;
import com.a.b.u;
import com.a.b.v;
import com.a.b.w;
import com.a.b.z;
import java.lang.reflect.Type;
import net.minecraft.client.g.b.a.am;
import net.minecraft.client.g.b.a.y;
import net.minecraft.u.bc;
import net.minecraft.u.bp;

public class ae
implements v {
    public am a(w w2, Type type, u u2) {
        z z2 = w2.t();
        String string = this.b(z2);
        y y2 = this.a(z2);
        boolean bl2 = this.d(z2);
        int n2 = this.c(z2);
        return new am(this.a(string), y2, bl2, n2);
    }

    private bp a(String string) {
        bp bp2 = new bp(string);
        bp2 = new bp(bp2.c(), "block/" + bp2.b());
        return bp2;
    }

    private boolean d(z z2) {
        return bc.a(z2, "uvlock", false);
    }

    protected y a(z z2) {
        int n2;
        int n3 = bc.a(z2, "x", 0);
        y y2 = y.a(n3, n2 = bc.a(z2, "y", 0));
        if (y2 == null) {
            throw new aa("Invalid BlockModelRotation x: " + n3 + ", y: " + n2);
        }
        return y2;
    }

    protected String b(z z2) {
        return bc.f(z2, "model");
    }

    protected int c(z z2) {
        int n2 = bc.a(z2, "weight", 1);
        if (n2 < 1) {
            throw new aa("Invalid weight " + n2 + " found, expected integer >= 1");
        }
        return n2;
    }

    @Override
    public /* synthetic */ Object b(w w2, Type type, u u2) {
        return this.a(w2, type, u2);
    }
}

