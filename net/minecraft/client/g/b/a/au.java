/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.client.g.b.a;

import com.a.b.aa;
import com.a.b.t;
import com.a.b.u;
import com.a.b.v;
import com.a.b.w;
import com.a.b.z;
import java.lang.reflect.Type;
import net.minecraft.client.g.b.a.aw;
import net.minecraft.u.bc;

class au
implements v {
    au() {
    }

    public aw a(w w2, Type type, u u2) {
        z z2 = w2.t();
        float[] arrf = this.b(z2);
        int n2 = this.a(z2);
        return new aw(arrf, n2);
    }

    protected int a(z z2) {
        int n2 = bc.a(z2, "rotation", 0);
        if (n2 >= 0 && n2 % 90 == 0 && n2 / 90 <= 3) {
            return n2;
        }
        throw new aa("Invalid rotation " + n2 + " found, only 0/90/180/270 allowed");
    }

    private float[] b(z z2) {
        if (!z2.b("uv")) {
            return null;
        }
        t t2 = bc.l(z2, "uv");
        if (t2.b() != 4) {
            throw new aa("Expected 4 uv values, found: " + t2.b());
        }
        float[] arrf = new float[4];
        for (int i2 = 0; i2 < arrf.length; ++i2) {
            arrf[i2] = bc.d(t2.a(i2), "uv[" + i2 + "]");
        }
        return arrf;
    }

    @Override
    public /* synthetic */ Object b(w w2, Type type, u u2) {
        return this.a(w2, type, u2);
    }
}

