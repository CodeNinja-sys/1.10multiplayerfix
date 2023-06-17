/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.client.f.a;

import com.a.b.aa;
import com.a.b.u;
import com.a.b.w;
import com.a.b.z;
import java.lang.reflect.Type;
import net.minecraft.client.f.a.l;
import net.minecraft.client.f.a.n;
import net.minecraft.u.bc;
import org.apache.commons.c.ao;

public class p
extends n {
    public l a(w w2, Type type, u u2) {
        z z2 = w2.t();
        float[] arrf = new float[256];
        float[] arrf2 = new float[256];
        float[] arrf3 = new float[256];
        float f2 = 1.0f;
        float f3 = 0.0f;
        float f4 = 0.0f;
        if (z2.b("characters")) {
            if (!z2.c("characters").q()) {
                throw new aa("Invalid font->characters: expected object, was " + z2.c("characters"));
            }
            z z3 = z2.f("characters");
            if (z3.b("default")) {
                if (!z3.c("default").q()) {
                    throw new aa("Invalid font->characters->default: expected object, was " + z3.c("default"));
                }
                z z4 = z3.f("default");
                f2 = bc.a(z4, "width", f2);
                ao.a(0.0, 3.4028234663852886E38, f2, "Invalid default width");
                f3 = bc.a(z4, "spacing", f3);
                ao.a(0.0, 3.4028234663852886E38, f3, "Invalid default spacing");
                f4 = bc.a(z4, "left", f3);
                ao.a(0.0, 3.4028234663852886E38, f4, "Invalid default left");
            }
            for (int i2 = 0; i2 < 256; ++i2) {
                w w3 = z3.c(Integer.toString(i2));
                float f5 = f2;
                float f6 = f3;
                float f7 = f4;
                if (w3 != null) {
                    z z5 = bc.f(w3, "characters[" + i2 + "]");
                    f5 = bc.a(z5, "width", f2);
                    ao.a(0.0, 3.4028234663852886E38, f5, "Invalid width");
                    f6 = bc.a(z5, "spacing", f3);
                    ao.a(0.0, 3.4028234663852886E38, f6, "Invalid spacing");
                    f7 = bc.a(z5, "left", f4);
                    ao.a(0.0, 3.4028234663852886E38, f7, "Invalid left");
                }
                arrf[i2] = f5;
                arrf2[i2] = f6;
                arrf3[i2] = f7;
            }
        }
        return new l(arrf, arrf3, arrf2);
    }

    @Override
    public String a() {
        return "font";
    }

    @Override
    public /* synthetic */ Object b(w w2, Type type, u u2) {
        return this.a(w2, type, u2);
    }
}

