/*
 * Decompiled with CFR 0.150.
 */
import net.minecraft.c.a;
import net.minecraft.q.v;

public class bdn
extends mn {
    @Override
    public String a() {
        return "save-on";
    }

    @Override
    public String a(ala ala2) {
        return "commands.save-on.usage";
    }

    @Override
    public void a(a a2, ala ala2, String[] arrstring) {
        boolean bl2 = false;
        for (int i2 = 0; i2 < a2.d.length; ++i2) {
            if (a2.d[i2] == null) continue;
            v v2 = a2.d[i2];
            if (!((alj)v2).G) continue;
            ((alj)v2).G = false;
            bl2 = true;
        }
        if (!bl2) {
            throw new kx("commands.save-on.alreadyOn", new Object[0]);
        }
        bdn.a(ala2, (fh)this, "commands.save.enabled", new Object[0]);
    }
}

